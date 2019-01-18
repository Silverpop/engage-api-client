package com.silverpop.api.client;

import static org.mockito.Mockito.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethodBase;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.silverpop.api.client.authentication.LogoutCommand;

public class ApiClientTest {

	private static final Class<? extends ApiResult> API_RESULT_TYPE = ApiResult.class;
	private static final boolean OPEN = true;
	private static final Boolean SUCCESSFUL = true;
	private static final String URL = "some url";
	protected static final String RESPONSE_BODY = "some response body";
	
	@Mock private ApiCommandProcessor<ApiRequest> commandProcessor;
	@Mock private HttpClient httpClient;
	@Mock private ApiSession session;
	@Mock private ApiCommand apiCommand;
	@Mock private LogoutCommand logoutCommand;
	@Mock private ApiRequest apiRequest;
	@Mock private HttpMethodBase httpMethodBase;
	@Mock private ApiResponse apiResponse;
	@Mock private ApiResult apiResult;
	@Mock private ApiErrorResult apiErrorResult;
	
	private ApiClient<ApiRequest> apiClient;
	
	@BeforeMethod
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	
		when(session.getUrl()).thenReturn(URL);
		
		apiClient = new ApiClient<ApiRequest>(commandProcessor, httpClient, session) {};
	}
	
	@Test
	public void testExecuteCommandWhenSessionIsOpenAndResponseIsSuccessful() throws ApiResultException, HttpException, IOException {
		when(session.isOpen()).thenReturn(OPEN);
		when(commandProcessor.prepareRequest(apiCommand)).thenReturn(apiRequest);
		when(commandProcessor.prepareMethod(URL, apiRequest)).thenReturn(httpMethodBase);
		when(httpClient.executeMethod(httpMethodBase)).then(new Answer<Integer>() {
			@Override
			public Integer answer(InvocationOnMock invocation) throws Throwable {
				when(httpMethodBase.getResponseBodyAsString()).thenReturn(RESPONSE_BODY);
				return null;
			}
		});
		doReturn(API_RESULT_TYPE).when(apiRequest).getResultType();
		when(commandProcessor.processResponse(RESPONSE_BODY, API_RESULT_TYPE)).thenReturn(apiResponse);
		when(apiResponse.isSuccessful()).thenReturn(SUCCESSFUL);
		when(apiResponse.buildResult()).thenReturn(apiResult);
		
		assertEquals(apiClient.executeCommand(apiCommand), apiResult);
	}
	
	@Test
	public void testExecuteCommandWhenSessionIsOpenAndResponseIsFailure() throws HttpException, IOException {
		when(session.isOpen()).thenReturn(OPEN);
		when(commandProcessor.prepareRequest(apiCommand)).thenReturn(apiRequest);
		when(commandProcessor.prepareMethod(URL, apiRequest)).thenReturn(httpMethodBase);
		when(httpClient.executeMethod(httpMethodBase)).then(new Answer<Integer>() {
			@Override
			public Integer answer(InvocationOnMock invocation) throws Throwable {
				when(httpMethodBase.getResponseBodyAsString()).thenReturn(RESPONSE_BODY);
				return null;
			}
		});
		doReturn(API_RESULT_TYPE).when(apiRequest).getResultType();
		when(commandProcessor.processResponse(RESPONSE_BODY, API_RESULT_TYPE)).thenReturn(apiResponse);
		when(apiResponse.isSuccessful()).thenReturn(!SUCCESSFUL);
		when(apiResponse.buildErrorResult()).thenReturn(apiErrorResult);
		
		try {
			apiClient.executeCommand(apiCommand);
			fail("Expected ApiResultException");
		} catch(ApiResultException e) {
			assertEquals(e.getErrorResult(), apiErrorResult);
			assertEquals(e.getMessage(), "API call '" + apiCommand.getClass().getName() + "' unsuccessful.");
		}
	}

    @Test
    public void testExecuteCommandWithRetry() throws HttpException, IOException {
        when(session.isOpen()).thenReturn(OPEN);
        when(commandProcessor.prepareRequest(apiCommand)).thenReturn(apiRequest);
        when(commandProcessor.prepareMethod(URL, apiRequest)).thenReturn(httpMethodBase);
        when(httpClient.executeMethod(httpMethodBase)).then(new Answer<Integer>() {
            @Override
            public Integer answer(InvocationOnMock invocation) throws Throwable {
                when(httpMethodBase.getResponseBodyAsString()).thenReturn(RESPONSE_BODY);
                return null;
            }
        });
        doReturn(API_RESULT_TYPE).when(apiRequest).getResultType();
        when(commandProcessor.processResponse(RESPONSE_BODY, API_RESULT_TYPE)).thenReturn(apiResponse);
        when(apiResponse.isSuccessful()).thenReturn(!SUCCESSFUL);
        when(apiResponse.buildErrorResult()).thenReturn(apiErrorResult);
        when(apiErrorResult.isSessionLost()).thenReturn(true);
        when(session.isReAuthenticate()).thenReturn(true);

        try {
            apiClient.executeCommand(apiCommand);
            fail("Expected ApiResultException");
        } catch (com.silverpop.api.client.ApiResultException e) {
            assertEquals(e.getErrorResult(), apiErrorResult);
            assertEquals(e.getMessage(), "API call '" + apiCommand.getClass().getName() + "' unsuccessful.");
            verify(session, atLeastOnce()).close();
        }
    }

    @Test
    public void testExecuteLogoutCommandShouldNotRetry() throws HttpException, IOException {
        when(session.isOpen()).thenReturn(OPEN);
        when(commandProcessor.prepareRequest(logoutCommand)).thenReturn(apiRequest);
        when(commandProcessor.prepareMethod(URL, apiRequest)).thenReturn(httpMethodBase);
        when(httpClient.executeMethod(httpMethodBase)).then(new Answer<Integer>() {
            @Override
            public Integer answer(InvocationOnMock invocation) throws Throwable {
                when(httpMethodBase.getResponseBodyAsString()).thenReturn(RESPONSE_BODY);
                return null;
            }
        });
        doReturn(API_RESULT_TYPE).when(apiRequest).getResultType();
        when(commandProcessor.processResponse(RESPONSE_BODY, API_RESULT_TYPE)).thenReturn(apiResponse);
        when(apiResponse.isSuccessful()).thenReturn(!SUCCESSFUL);
        when(apiResponse.buildErrorResult()).thenReturn(apiErrorResult);
        when(apiErrorResult.isSessionLost()).thenReturn(true);
        when(session.isReAuthenticate()).thenReturn(true);

        try {
            apiClient.executeCommand(logoutCommand);
            fail("Expected ApiResultException");
        } catch (com.silverpop.api.client.ApiResultException e) {
            assertEquals(e.getErrorResult(), apiErrorResult);
            assertEquals(e.getMessage(), "API call '" + logoutCommand.getClass().getName() + "' unsuccessful.");
            verify(session, never()).close();
        }
    }

}