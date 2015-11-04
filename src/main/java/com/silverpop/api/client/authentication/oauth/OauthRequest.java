package com.silverpop.api.client.authentication.oauth;

import java.util.HashMap;
import java.util.Map;

import com.silverpop.api.client.ApiRequest;
import com.silverpop.api.client.ApiResult;

public class OauthRequest implements ApiRequest {

    private final OauthCommand apiCommand;
    Map<String, String> headers = new HashMap<String, String>();

    protected OauthRequest(OauthCommand apiCommand) {
        this.apiCommand = apiCommand;
    }

    @Override
    public Map<String, String> getHeaders() {
        return headers;
    }

    @Override
    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    @Override
    public Class<? extends ApiResult> getResultType() {
        return apiCommand.getResultType();
    }

    @Override
    public Map<String, String> getParameters() {
        Map<String, String> requestParameters = new HashMap<String, String>();
        requestParameters.put("grant_type", apiCommand.getGrantType());
        requestParameters.put("client_id", apiCommand.getClientId());
        requestParameters.put("client_secret", apiCommand.getClientSecret());
        requestParameters.put("refresh_token", apiCommand.getRefreshToken());
        return requestParameters;
    }
}
