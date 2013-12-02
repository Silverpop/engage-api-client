package com.silverpop.api.client.xmlapi.request;

import com.silverpop.api.client.ApiCommand;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Envelope")
public class XmlApiRequestEnvelope {

	@XStreamAlias("Body")
	private XmlApiRequestBody body;

	public XmlApiRequestEnvelope(ApiCommand apiCommand) {
		this.body = new XmlApiRequestBody(apiCommand);
	}

	public XmlApiRequestBody getBody() {
		return body;
	}
}
