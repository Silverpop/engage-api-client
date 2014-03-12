package com.silverpop.api.client.xmlapi;

import com.silverpop.api.client.ApiErrorResult;
import com.silverpop.api.client.xmlapi.result.elements.XmlApiErrorResultDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

public class XmlApiErrorResult implements ApiErrorResult {
	
	@XStreamAlias("Request")
	private String requeset;
	
	@XStreamAlias("FaultCode")
	private String faultCode;
	
	@XStreamAlias("FaultString")
	private String faultString;
	
	@XStreamAlias("detail")
	private XmlApiErrorResultDetail detail;

	@XStreamOmitField
	private String responseText;
	
	
	@Override
	public String getMessage() {
		return faultString;
	}

	@Override
	public boolean isSessionLost() {
		return getDetail().getError().getErrorId() == 145 &&  "SP.Admin".equals(getDetail().getError().getErrorClass());
	}

	@Override
	public String getResponseText() {
		return responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	public String getRequeset() {
		return requeset;
	}

	public String getFaultCode() {
		return faultCode;
	}

	public String getFaultString() {
		return faultString;
	}

	public XmlApiErrorResultDetail getDetail() {
		return detail;
	}
}
