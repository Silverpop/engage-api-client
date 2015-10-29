package com.silverpop.api.client.authentication;


import java.util.Map;

import com.silverpop.api.client.ApiSession;

public class UnauthenticatedSession implements ApiSession {

    private final String url;

    public UnauthenticatedSession(String url) {
        this.url = url;
	}

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public String getSessionId() {
        return null;
    }

    @Override
    public Map<String, String> getDefaultHeaders() {
        return null;
    }

    @Override
	public boolean isOpen() {
		return true;
	}

	@Override
	public void close() {
	}

	@Override
	public void open() {

	}

    @Override
    public boolean isReAuthenticate() {
        return false;
    }
}
