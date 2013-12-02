package com.silverpop.api.client;

import java.util.Map;


public interface ApiRequest {
	Map<String,String> getParameters();
	Map<String,String> getHeaders();
	Class<? extends ApiResult> getResultType();
}
