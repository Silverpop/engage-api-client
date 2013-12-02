package com.silverpop.api.client.xmlapi.request;

import com.silverpop.api.client.ApiCommand;


public class XmlApiRequestBody {

	private ApiCommand apiCommand;
	
	public XmlApiRequestBody(ApiCommand apiCommand) {
		this.apiCommand = apiCommand;
	}

	public ApiCommand getApiCommand() {
		return apiCommand;
	}
	
	public void setApiCommand(ApiCommand apiCommand) {
		this.apiCommand = apiCommand;
	}
}
