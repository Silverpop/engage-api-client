package com.silverpop.api.client;

public interface ApiErrorResult extends ApiResult {
	String getMessage();
	boolean isSessionInvalidOrExpired();
	String getResponseText();
}
