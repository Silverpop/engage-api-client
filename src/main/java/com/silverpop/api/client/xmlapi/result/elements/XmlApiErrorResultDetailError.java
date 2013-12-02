package com.silverpop.api.client.xmlapi.result.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class XmlApiErrorResultDetailError {

	@XStreamAlias("errorid")
	private Integer errorId;
	
	@XStreamAlias("module")
	private String module;
	
	@XStreamAlias("class")
	private String errorClass;
	
	@XStreamAlias("method")
	private String method;

	
	public Integer getErrorId() {
		return errorId;
	}

	public String getModule() {
		return module;
	}

	public String getErrorClass() {
		return errorClass;
	}

	public String getMethod() {
		return method;
	}
}
