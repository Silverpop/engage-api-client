package com.silverpop.api.client.authentication.oauth;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.silverpop.api.client.ApiClient;
import com.silverpop.api.client.ApiClientFactory;
import com.silverpop.api.client.ApiResultException;
import com.silverpop.api.client.authentication.AuthenticatedSession;

public class OauthSession extends AuthenticatedSession<OauthResult> {

    public OauthSession(ApiClientFactory clientFactory, String url, String clientId, String clientSecret, String refreshToken) {
        super(clientFactory, url, new OauthCommand(clientId, clientSecret, refreshToken));
    }

    @Override
    public String getSessionId() {
        return null;
    }

    @Override
    public Map<String, String> getDefaultHeaders() {
        if (this.getLoginResult() == null) {
            return null;
        }
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", StringUtils.capitalize(this.getLoginResult().getTokenType()) + " " + this.getLoginResult().getAccessToken());
        return headers;
    }

    @Override
    protected OauthResult executeLogin() throws ApiResultException {
        ApiClient client = new OauthClient(this.getUrl()); //we can't use API specific client factory
        return (OauthResult) client.executeCommand(this.getLoginCommand());
    }
}
