package com.silverpop.api.client.xmlapi;


public class UnauthenticatedXmlApiSession extends XmlApiSession {

	public UnauthenticatedXmlApiSession(String url) {
		super(url, null, null);
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
