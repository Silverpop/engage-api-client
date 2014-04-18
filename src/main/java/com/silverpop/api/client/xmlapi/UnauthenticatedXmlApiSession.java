package com.silverpop.api.client.xmlapi;


import com.silverpop.api.client.command.LoginCommand;

public class UnauthenticatedXmlApiSession extends XmlApiSession {

	public UnauthenticatedXmlApiSession(String url) {
		super(url, new LoginCommand());
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
