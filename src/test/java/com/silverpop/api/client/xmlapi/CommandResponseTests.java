package com.silverpop.api.client.xmlapi;

import java.util.Scanner;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiException;
import com.silverpop.api.client.ApiResponse;
import com.silverpop.api.client.command.GetScoringModelsCommand;
import com.silverpop.api.client.command.LoginCommand;
import com.silverpop.api.client.result.GetScoringModelsResult;
import com.silverpop.api.client.result.LoginResult;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class CommandResponseTests {

	public static final String LOGIN_SUCCESS_FILE = "/api/xmlapi_login_success.xml";
	public static final String GET_SCORING_MODELS_SUCCESS_FILE = "/api/get_scoring_models_success.xml";

	private XmlApiCommandProcessor commandProcessor;
	
	@BeforeMethod
	public void setUp() {
		commandProcessor = new XmlApiCommandProcessor();
	}
	

	@Test
	public void testLoginResult() {
	    //Some test
		LoginCommand command = new LoginCommand("","");
		ApiResponse response = processResponse(LOGIN_SUCCESS_FILE, command);
		LoginResult result = (LoginResult) response.buildResult();
		
		assertEquals(result.getSessionId(), "9579A5E678CF8F754DDE6C4EFCC4049E");
		assertEquals(result.getOrganizationId(), "5053f806-1335a920d20-6daca699e65990d0e2d42de841d44e31");
		assertEquals(result.getSessionEncoding(), "");
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
		String testResult = openTestFile(file);
		
		return commandProcessor.processResponse(testResult, request.getResultType());
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
