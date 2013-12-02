package com.silverpop.api.client;

import org.apache.commons.httpclient.HttpMethodBase;

public interface ApiCommandProcessor<REQUEST extends ApiRequest> {
	REQUEST prepareRequest(ApiCommand command, ApiSession session);
	HttpMethodBase prepareMethod(String url, REQUEST request);
	ApiResponse processResponse(String response, Class<? extends ApiResult> resultClass);
}
