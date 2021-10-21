package com.silverpop.api.client;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.silverpop.api.client.authentication.LogoutCommand;
import com.silverpop.api.client.xmlapi.NoResponseApiErrorResult;

public abstract class ApiClient<REQUEST extends ApiRequest> {

    private Log log = LogFactory.getLog(this.getClass());

	private ApiCommandProcessor<REQUEST> commandProcessor;
    protected ApiSession session;

    private final HttpClient httpClient;


    public ApiSession getSession() {
   		return session;
   	}


	protected ApiClient(ApiCommandProcessor<REQUEST> commandProcessor, ApiSession session) {
		this(commandProcessor, new HttpClient(new MultiThreadedHttpConnectionManager()), session);
	}

    /**
     * Constructor.
     * @param commandProcessor can not be {@code null}.
     * @param httpClient this should be configured with a {@code MultiThreadedHttpConnectionManager}, otherwise the ApiClient constructed will not be thread-safe.
     * @param session can not be {@code null}.
     */
	protected ApiClient(ApiCommandProcessor<REQUEST> commandProcessor, HttpClient httpClient, ApiSession session) {
		this.commandProcessor = commandProcessor;
		this.httpClient = httpClient;
		this.session = session;
	}

	public ApiResult executeCommand(ApiCommand command) throws ApiResultException {
		return executeCommand(command, null);
	}

    public ApiResult executeCommand(ApiCommand command, Map<String,String> requestHeaders) throws ApiResultException {
        try {
            return validateSessionAndExecuteCommand(command, requestHeaders);
        } catch(ApiResultException e) {
			if(retryCommand(e.getErrorResult(), command)) {
                getSession().close();
                return validateSessionAndExecuteCommand(command, requestHeaders);
            } else {
                throw e;
            }
        }
    }

	private boolean retryCommand(ApiErrorResult errorResult, ApiCommand apiCommand) {
        return errorResult.isSessionLost() && getSession().isReAuthenticate() && !(apiCommand instanceof LogoutCommand);
	}

	private ApiResult validateSessionAndExecuteCommand(ApiCommand command, Map<String,String> requestHeaders) throws ApiResultException {
		ensureSessionIsOpen();

		REQUEST request = commandProcessor.prepareRequest(command);
        addAdditionalHeadersToRequest(request, requestHeaders);
        addAdditionalHeadersToRequest(request, getSession().getDefaultHeaders());

        HttpMethodBase method = commandProcessor.prepareMethod(getSession().getUrl(), request);
		String in = executeMethod(method);

		ApiResponse response = commandProcessor.processResponse(in, request.getResultType());
		
		return extractResult(command.getClass().getName(), response);
	}

    private void addAdditionalHeadersToRequest(REQUEST request, Map<String,String> requestHeaders) {
        if (requestHeaders != null) {
            for (String key : requestHeaders.keySet()) {
                request.addHeader(key, requestHeaders.get(key));
            }
        }
    }

	private void ensureSessionIsOpen() {
		if(!getSession().isOpen()) {
			getSession().open();
		}
	}

	private String executeMethod(HttpMethodBase method) throws ApiResultException {
		try {
            log.info("executing method:" + method);
			int responseCode = httpClient.executeMethod(method);

			String responseBody = method.getResponseBodyAsString();
			if (responseBody != null && !responseBody.isEmpty()) {
				return responseBody;
			} else {
				StringBuilder buffer = new StringBuilder();
				buffer.append("No response body was returned!\nResponse Headers-\n");
				Header[] headers = method.getResponseHeaders();
				for (Header header : headers) {
					buffer.append(header.getName()).append(": ").append(header.getValue()).append("\n");
				}
                buffer.append("HTTP-Response-Code: ").append(responseCode).append("\n");
				buffer.append("Content length reported as: ").append(method.getResponseContentLength());
                log.info(buffer.toString());
                throw new ApiResultException("Error executing API: " + buffer.toString(), new NoResponseApiErrorResult());
			}
		} catch(IOException e) {
			throw new ApiException("Error executing API: ", e);
		} finally {
            method.releaseConnection();
        }
    }

	private ApiResult extractResult(String requestName, ApiResponse response) throws ApiResultException {
		if(response.isSuccessful()) {
			return response.buildResult();
		} else {
            log.debug("Got Error Response");
			String msg = String.format("API call '%s' unsuccessful.", requestName);
			throw new ApiResultException(msg, response.buildErrorResult());
		}
	}
}
