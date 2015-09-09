package com.silverpop.api.client.xmlapi;

import static org.testng.Assert.*;

import java.util.Scanner;

import com.silverpop.api.client.ApiCommand;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.silverpop.api.client.ApiException;
import com.silverpop.api.client.ApiResponse;
import com.silverpop.api.client.command.GetScoringModelsCommand;
import com.silverpop.api.client.result.GetScoringModelsResult;

public class GetScoringModelsCommandResponseTests {

	public static final String GET_SCORING_MODELS_SUCCESS_FILE = "/api/get_scoring_models_success.xml";

	private XmlApiCommandProcessor commandProcessor;
	
	@BeforeMethod
	public void setUp() {
		commandProcessor = new XmlApiCommandProcessor();
	}
	
	@Test
	public void testGetScoringModelsResult() {
		ApiResponse response = processResponse(GET_SCORING_MODELS_SUCCESS_FILE, new GetScoringModelsCommand());
		GetScoringModelsResult result = (GetScoringModelsResult) response.buildResult();
		
		assertNull(result.getModels().get(0).getScoreComponents().get(0).getValues());
		assertEquals(result.getModels().get(0).getScoreComponents().get(2).getValues().get(0), "Hot");
		
	}
	
	
	private ApiResponse processResponse(String file, ApiCommand command) {
		XmlApiRequest request = new XmlApiRequest(command);
		String is = openTestFile(file);
		
		return commandProcessor.processResponse(is, request.getResultType());
	}
	
	private String openTestFile(String filePath) {
		Scanner s = null;
		try {
            s = new Scanner(this.getClass().getResourceAsStream(filePath)).useDelimiter("\\A") ;
            return s.next();
		} catch (Exception e) {
			throw new ApiException("Unable to build response document", e);
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}
}
