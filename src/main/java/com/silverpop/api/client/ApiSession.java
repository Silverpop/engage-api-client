package com.silverpop.api.client;

public interface ApiSession {
	String getUrl();
	String getSessionId();
	
	boolean isOpen();
	boolean isReAuthenticate();
	
	void open();
	void close();
}
