package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 11/2/2015.
 */
@XStreamAlias("RESULT")
public class ImportRecipientFieldDataResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    private boolean success;
    @XStreamAlias("JOB_ID")
    private String jobId;

    public boolean isSuccess()
    {
        return success;
    }

    public String getJobId()
    {
        return jobId;
    }



}
