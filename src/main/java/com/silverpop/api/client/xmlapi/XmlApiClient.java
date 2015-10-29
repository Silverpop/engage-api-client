package com.silverpop.api.client.xmlapi;

import com.silverpop.api.client.ApiClient;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiSession;
import com.silverpop.api.client.command.LoginCommand;

public class XmlApiClient extends ApiClient<XmlApiRequest> {

	public XmlApiClient(ApiSession session) {
		super(new XmlApiCommandProcessor(), session);
	}

	@Deprecated
	public XmlApiClient(String url, String username, String password) {
		this(new XmlApiSession(url, new LoginCommand(username, password)));
	}

	@Deprecated
	public XmlApiClient(String url) {
		this(new UnauthenticatedXmlApiSession(url));
	}

	@Deprecated
	public XmlApiClient(XmlApiSession session) {
		super(new XmlApiCommandProcessor(), session);
	}

	@Deprecated
	public String getJSessionId() {
		return session.getSessionId();
	}

	public String getCommandString(ApiCommand command) {
		XmlApiRequest request = new XmlApiRequest(command);
		return request.marshallCommand();
	}
}
