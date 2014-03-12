package com.silverpop.api.client;

import java.util.HashMap;
import java.util.Map;


public class ApiResultException extends Exception {

	private static final long serialVersionUID = 8007839786889449302L;
	private ApiErrorResult errorResult;
	
	public ApiResultException(String msg, ApiErrorResult errorResult) {
		super(msg);
		this.errorResult = errorResult;
	}
	
	public ApiErrorResult getErrorResult() {
		return errorResult;
	}
	
	@Override
	public String toString() {
		Map<String, ? super Object> fieldValues = new HashMap<String, Object>();
		fieldValues.put("msg",     getMessage());
		fieldValues.put("errorResult",    errorResult);
		return getClass().getSimpleName() + "[" + fieldValues + "]";
	}
}
