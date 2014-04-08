package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;


import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RESULT")
public class DataJobResult implements ApiResult {

	@XStreamAlias("JOB_ID")
	private String jobId;
	
	@XStreamAlias("SUCCESS")
	private boolean successElement;
	
	public String getJobId() {
		return jobId;
	}

	public boolean getSuccessElement() {
		return successElement;
	}
}