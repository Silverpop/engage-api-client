package com.silverpop.api.client.authentication.oauth;

import org.apache.commons.lang3.StringUtils;

import com.silverpop.api.client.ApiErrorResult;
import com.silverpop.api.client.ApiException;
import com.silverpop.api.client.ApiResponse;
import com.silverpop.api.client.ApiResult;

public class OauthResponse implements ApiResponse {

    private static final String ACCESS_TOKEN = "access_token\":\"";
    private static final String TOKEN_TYPE = "token_type\":\"";
    private static final String REFRESH_TOKEN = "refresh_token\":\"";
    private static final String EXPIRES_IN = "expires_in\":\"";

    private static final String ERROR = "error\":\"";
    private static final String ERROR_DESCRIPTION = "error_description\":\"";

    private String responseText;

    protected OauthResponse(String responseText) {
        this.responseText = responseText;
    }

    @Override
    public boolean isSuccessful() {
        return StringUtils.contains(responseText, ACCESS_TOKEN);
    }

    @Override
    public ApiResult buildResult() {
        if (isSuccessful()) {
            return new OauthResult(
                    StringUtils.substringBetween(responseText, ACCESS_TOKEN, "\""),
                    StringUtils.substringBetween(responseText, TOKEN_TYPE, "\""),
                    StringUtils.substringBetween(responseText, REFRESH_TOKEN, "\""),
                    StringUtils.substringBetween(responseText, EXPIRES_IN, "}")
            );
        } else {
            throw new ApiException("The response was unsuccessful.  Call buildErrorResult() to get details.");
        }
    }

    @Override
    public ApiErrorResult buildErrorResult() {
        if (isSuccessful()) {
            throw new ApiException("There is no error associated with this response.  Call buildResult() to get the result.");
        } else {
            return new OauthApiErrorResult();
        }
    }

    private class OauthApiErrorResult implements ApiErrorResult {

        @Override
        public String getMessage() {
            return StringUtils.substringBetween(responseText, "error_description", "\n");
        }

        @Override
        public boolean isSessionLost() {
            return false;
        }

        @Override
        public String getResponseText() {
            return responseText;
        }
    }
}