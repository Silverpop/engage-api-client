package com.silverpop.api.client.authentication.oauth;

import com.silverpop.api.client.authentication.LoginCommand;

public class OauthCommand implements LoginCommand {

    private final String clientId;
    private final String clientSecret;
    private final String refreshToken;
    private String grantType = "refresh_token";

    public OauthCommand(String clientId, String clientSecret, String refreshToken) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
    }

    @Override
    public Class<OauthResult> getResultType() {
        return OauthResult.class;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getGrantType() {
        return grantType;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

}