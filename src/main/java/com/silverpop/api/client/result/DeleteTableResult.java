package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RESULT")
public class DeleteTableResult implements ApiResult {


    @XStreamAlias("SUCCESS")
    private boolean successElement;

    @XStreamAlias("JOB_ID")
    private Long jobId;


    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public boolean isSuccessElement() {
        return successElement;
    }

    public void setSuccessElement(boolean successElement) {
        this.successElement = successElement;
    }
}
