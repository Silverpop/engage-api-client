package com.silverpop.api.client.xmlapi.result.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class XmlApiErrorResultDetail {
	
	@XStreamAlias("error")
	public XmlApiErrorResultDetailError error;

	public XmlApiErrorResultDetailError getError() {
		return error;
	}
}