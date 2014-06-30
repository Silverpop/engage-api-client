package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.DeleteJobResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("DeleteJob")
public class DeleteJobCommand implements ApiCommand {

    @XStreamAlias("JOB_ID")
    private String jobId;
    
	@Override
	public Class<? extends ApiResult> getResultType() {
		return DeleteJobResult.class;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
}
