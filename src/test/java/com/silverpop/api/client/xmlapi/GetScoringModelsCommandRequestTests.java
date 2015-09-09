package com.silverpop.api.client.xmlapi;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.command.GetScoringModelsCommand;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

public class GetScoringModelsCommandRequestTests {

	private XmlApiRequest request;
	@Mock private XmlApiSession xmlApiSession;
	
	@BeforeMethod
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		when(xmlApiSession.getSessionEncoding()).thenReturn("[JSESSIONID]");
	}
	
	@Test
	public void getScoringModels(){
		GetScoringModelsCommand command = new GetScoringModelsCommand();
		String actualRequest = printRequestFromCommand(command);
		String expectedRequest = "<Envelope>" + getWhiteSpacing(1) + "<Body>" + getWhiteSpacing(2) 
				+ "<GetScoringModels/>" + getWhiteSpacing(1) + "</Body>" + getWhiteSpacing(0) + "</Envelope>";
		assertEquals(actualRequest, expectedRequest);
	}
	
	private String printRequestFromCommand(ApiCommand command) {
		request = new XmlApiRequest(command);
		return request.marshallCommand();
	}

	private String getWhiteSpacing(int numberIndents){
		String returnedSpaces = "\n";
		for(int i = 0; i < numberIndents; i++){
			returnedSpaces += "  ";
		}
		return returnedSpaces;
	}
}
