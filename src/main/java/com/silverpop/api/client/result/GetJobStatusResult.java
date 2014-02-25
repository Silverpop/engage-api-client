package com.silverpop.api.client.result;

import java.util.List;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.result.elements.GetJobStatusParameter;
import com.silverpop.api.client.result.elements.GetJobStatusParameters;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class GetJobStatusResult implements ApiResult {

    @XStreamAlias("JOB_ID")
    private String jobId;

    @XStreamAlias("SUCCESS")
    private boolean successElement;

    @XStreamAlias("JOB_STATUS")
    private String jobStatus;

    @XStreamAlias("JOB_DESCRIPTION")
    private String jobDescription;

    @XStreamAlias("PARAMETERS")
    private GetJobStatusParameters parameters;


    public String getJobId() {
        return jobId;
    }

    public boolean isSuccessElement() {
        return successElement;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public String getJobDescription() {
        return jobDescription;
    }
    
    public List<GetJobStatusParameter> getParameters() {
        return parameters.getParameters();
    }

}
