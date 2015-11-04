package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 10/15/2015.
 */
public class ImportListResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    protected boolean success;

    @XStreamAlias("JOB_ID")
    protected long jobId;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }
}
