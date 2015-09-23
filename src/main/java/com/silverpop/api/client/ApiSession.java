package com.silverpop.api.client;

import java.util.Map;

public interface ApiSession {
	String getUrl();

    @Deprecated
	String getSessionId();
    Map<String,String> getDefaultHeaders();

    boolean isOpen();
	boolean isReAuthenticate();
	
	void open();
	void close();
}
