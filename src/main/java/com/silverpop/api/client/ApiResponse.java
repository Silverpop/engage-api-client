package com.silverpop.api.client;


public interface ApiResponse {
	boolean isSuccessful();
	ApiResult buildResult();
	ApiErrorResult buildErrorResult();
}
