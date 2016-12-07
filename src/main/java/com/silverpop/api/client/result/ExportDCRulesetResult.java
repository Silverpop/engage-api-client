package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 10/14/2015.
 */
@XStreamAlias("RESULT")
public class ExportDCRulesetResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    protected boolean success;
    @XStreamAlias("JOB_ID")
    protected Long jobid;
    @XStreamAlias("FILE_NAME")
    protected String filename;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Long getJobid() {
        return jobid;
    }

    public void setJobid(Long jobid) {
        this.jobid = jobid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
