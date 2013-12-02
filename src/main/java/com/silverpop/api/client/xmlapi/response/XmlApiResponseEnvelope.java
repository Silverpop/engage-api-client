package com.silverpop.api.client.xmlapi.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Envelope")
public class XmlApiResponseEnvelope {

	@XStreamAlias("Body")
	private XmlApiResponseBody body;
		
	public XmlApiResponseBody getBody() {
		return body;
	}

	public void setBody(XmlApiResponseBody body) {
		this.body = body;
	}
}
