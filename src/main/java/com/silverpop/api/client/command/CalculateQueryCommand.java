package com.silverpop.api.client.command;

import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.result.DataJobResult;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("CalculateQuery")
public class CalculateQueryCommand implements ApiCommand {

	@XStreamAlias("QUERY_ID")
	private Integer queryId;
	
	@XStreamAlias("EMAIL")
	private String email;
	
	@Override
	public Class<DataJobResult> getResultType() {
		return DataJobResult.class;
	}

	public Integer getQueryId() {
		return queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
