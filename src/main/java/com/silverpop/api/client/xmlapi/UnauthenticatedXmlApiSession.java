package com.silverpop.api.client.xmlapi;


import com.silverpop.api.client.command.LoginCommand;

/**
 * @deprecated Use {@link com.silverpop.api.client.authentication.UnauthenticatedSession} instead.
 */
@Deprecated
public class UnauthenticatedXmlApiSession extends XmlApiSession {

    private String url;

    public UnauthenticatedXmlApiSession(String url) {
		super(url, new LoginCommand());
        this.url = url;
	}

    @Override
    public String getUrl() {
        return url;
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
