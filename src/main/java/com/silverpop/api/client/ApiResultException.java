package com.silverpop.api.client;


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
}
