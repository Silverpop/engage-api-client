package com.silverpop.api.client.authentication.oauth;

import org.apache.commons.lang3.StringUtils;

import com.silverpop.api.client.ApiClient;
import com.silverpop.api.client.authentication.UnauthenticatedSession;

public class OauthClient extends ApiClient<OauthRequest>{

	public OauthClient(String url) {
		super(new OauthCommandProcessor(), new UnauthenticatedSession(StringUtils.substringBeforeLast(url, "/") + "/oauth/token"));
	}
}
