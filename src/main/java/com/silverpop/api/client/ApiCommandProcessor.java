package com.silverpop.api.client;

import org.apache.commons.httpclient.HttpMethodBase;

public interface ApiCommandProcessor<REQUEST extends ApiRequest> {
    REQUEST prepareRequest(ApiCommand command);
	HttpMethodBase prepareMethod(String url, REQUEST request);
	ApiResponse processResponse(String response, Class<? extends ApiResult> resultClass);

    /**
     * @deprecated The session is not needed to prepare the request. Use {@link #prepareRequest(ApiCommand)} instead.
     */
    @Deprecated
    REQUEST prepareRequest(ApiCommand command, ApiSession session);
}
