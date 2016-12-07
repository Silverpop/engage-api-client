package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 10/12/2015.
 */
public class JoinTableResult implements ApiResult {

    @XStreamAlias("JOB_ID")
    private String jobId;

    @XStreamAlias("SUCCESS")
    private boolean successElement;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public boolean isSuccessElement() {
        return successElement;
    }

    public void setSuccessElement(boolean successElement) {
        this.successElement = successElement;
    }
}
