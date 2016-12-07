package com.silverpop.api.client.command;

import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.LoginResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @deprecated Use {@link com.silverpop.api.client.authentication.oauth.OauthCommand} instead.
 */
@Deprecated
@XmlApiProperties("Login")
public class LoginCommand implements com.silverpop.api.client.authentication.LoginCommand {

	@XStreamAlias("USERNAME")
	private String username;

	@XStreamAlias("PASSWORD")
	private String password;

	public LoginCommand() {}

	public LoginCommand(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public Class<LoginResult> getResultType() {
		return LoginResult.class;
	}

	public String getUsername() {
		return username;
	}

    public String getPassword() {
		return password;
	}
}