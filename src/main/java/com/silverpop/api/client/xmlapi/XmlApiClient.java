package com.silverpop.api.client.xmlapi;

import com.silverpop.api.client.ApiClient;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.command.LoginCommand;

public class XmlApiClient extends ApiClient<XmlApiRequest>{

	public XmlApiClient(String url, String username, String password) {
		this(new XmlApiSession(url, new LoginCommand(username, password)));
	}

	public XmlApiClient(String url) {
		this(new UnauthenticatedXmlApiSession(url));
	}
	
	public XmlApiClient(XmlApiSession session) {
		super(new XmlApiCommandProcessor(), session);
	}
	
	public String getJSessionId() {
		return session.getSessionId();
	}
	
	public String getCommandString(ApiCommand command) {
		XmlApiRequest request = new XmlApiRequest(command, getSession());
		return request.marshallCommand();
	}
}
