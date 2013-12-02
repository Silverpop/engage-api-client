package com.silverpop.api.client;

public class ApiException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ApiException(String message) {
		super(message);
	}

	public ApiException(String message, Exception e) {
		super(message, e);
	}
}
