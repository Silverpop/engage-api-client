package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 10/15/2015.
 */

public class ExportMailingTemplateResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    protected boolean success;
    @XStreamAlias("FILE_PATH")
    protected String filename;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getFilepath() {
        return filename;
    }

    public void setFilepath(String filename) {
        this.filename = filename;
    }
}
