package com.silverpop.api.client.xmlapi;

import java.util.Scanner;

import org.testng.annotations.Test;

import com.silverpop.api.client.ApiException;
import com.silverpop.api.client.result.LoginResult;

import static org.testng.Assert.*;

public class XmlApiResponseTest {

	public static final String LOGIN_SUCCESS_FILE = "/api/xmlapi_login_success.xml";
	public static final String LOGIN_FAILURE_FILE = "/api/xmlapi_login_failure.xml";

	
	@Test
	public void elementValueReturnedFromGetValue() {
		XmlApiResponse response = new XmlApiResponse(openTestFile(LOGIN_SUCCESS_FILE), LoginResult.class);
		assertTrue(response.isSuccessful());
	}
	
	@Test
	public void isSuccessReturnsTrueOrFalseDependingOnSuccessfulResponse() {
		XmlApiResponse response = new XmlApiResponse(openTestFile(LOGIN_SUCCESS_FILE), LoginResult.class);
		assertTrue(response.isSuccessful());

		response = new XmlApiResponse(openTestFile(LOGIN_FAILURE_FILE), LoginResult.class);
		assertFalse(response.isSuccessful());
	}
	
	@Test
	public void validateResultReturnedFromEvaluate() {
		XmlApiResponse response = new XmlApiResponse(openTestFile(LOGIN_SUCCESS_FILE), LoginResult.class);
		LoginResult login = (LoginResult) response.buildResult();
		
		assertEquals(login.getSessionId(), "9579A5E678CF8F754DDE6C4EFCC4049E");
		assertEquals(login.getOrganizationId(), "5053f806-1335a920d20-6daca699e65990d0e2d42de841d44e31");
	}


	@Test(expectedExceptions=ApiException.class)
	public void exceptionThrownWhenCallingBuildResultOnUnsuccessfulResponse() {
		XmlApiResponse response = new XmlApiResponse(openTestFile(LOGIN_FAILURE_FILE), LoginResult.class);
		response.buildResult();
	}

	@Test
	public void errorResultReturnedOnApiError() {
		XmlApiResponse response = new XmlApiResponse(openTestFile(LOGIN_FAILURE_FILE), LoginResult.class);
		XmlApiErrorResult result = (XmlApiErrorResult) response.buildErrorResult();
		
		assertEquals(result.getFaultString(), "Server Error");
		assertEquals(result.getDetail().getError().getErrorId(), new Integer(50));
		assertEquals(result.getDetail().getError().getErrorClass(), "SP.API");
	}


	@Test(expectedExceptions=ApiException.class)
	public void exceptionThrownWhenCallingBuildErrorResultOnSuccessfulResponse() {
		XmlApiResponse response = new XmlApiResponse(openTestFile(LOGIN_SUCCESS_FILE), LoginResult.class);
		response.buildErrorResult();
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
