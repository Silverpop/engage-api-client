package com.silverpop.api.client.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @deprecated Use {@link com.silverpop.api.client.authentication.oauth.OauthResult} instead.
 */
@Deprecated
@XStreamAlias("RESULT")
public class LoginResult implements com.silverpop.api.client.authentication.LoginResult {
	
	@XStreamAlias("SESSIONID")
	private String sessionId;
	
	@XStreamAlias("ORGANIZATION_ID")
	private String organizationId;
	
	@XStreamAlias("SESSION_ENCODING")
	private String sessionEncoding;

	
	public String getSessionId() {
		return sessionId;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public String getSessionEncoding() {
		return sessionEncoding;
	}
	public void setSessionEncoding(String sessionEncoding) {
		this.sessionEncoding = sessionEncoding;
	}
}