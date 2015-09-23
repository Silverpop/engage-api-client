package com.silverpop.api.client.authentication.oauth;

import com.silverpop.api.client.authentication.LoginResult;

public class OauthResult implements LoginResult {

    private final String accessToken;
    private final String tokenType;
    private final String refreshToken;
    private final String expiresIn;

    public OauthResult(String accessToken, String tokenType, String refreshToken, String expiresIn) {
        this.expiresIn = expiresIn;
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.refreshToken = refreshToken;
    }

    String getAccessToken() {
        return accessToken;
    }

    String getExpiresIn() {
        return expiresIn;
    }

    String getRefreshToken() {
        return refreshToken;
    }

    String getTokenType() {
        return tokenType;
    }
}
