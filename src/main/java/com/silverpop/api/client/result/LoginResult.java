package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RESULT")
public class LoginResult implements ApiResult {
	
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