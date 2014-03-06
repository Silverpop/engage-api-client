package com.silverpop.api.client.xmlapi;

import com.silverpop.api.client.ApiErrorResult;

/**
 * A special ApiErrorResult which can happen when the Silverpop API response does not have
 * any content. In this case the session certainly is expired and should be renewed.
 */
public class NoResponseApiErrorResult implements ApiErrorResult {

    @Override
    public String getMessage() {
        return "Response from API is empty or null.";
    }

    @Override
    public boolean isSessionInvalidOrExpired() {
        return true;
    }

    @Override
    public String getResponseText() {
        return "";
    }

}
