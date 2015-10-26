package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 10/16/2015.
 */
public class WebTrackingDataExportResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    protected boolean success;
    @XStreamAlias("JOB_ID")
    protected long jobId;
    @XStreamAlias("FILE_PATH")
    protected String filePath;

    public boolean isSuccess() {
        return success;
    }

    public long getJobId() {
        return jobId;
    }

    public String getFilePath() {
        return filePath;
    }
}
