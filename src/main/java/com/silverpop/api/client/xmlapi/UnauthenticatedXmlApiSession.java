package com.silverpop.api.client.xmlapi;


public class UnauthenticatedXmlApiSession extends XmlApiSession {

	public UnauthenticatedXmlApiSession(String url) {
		super(url, null, null, false);
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
}
