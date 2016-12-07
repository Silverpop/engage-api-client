package com.silverpop.api.client.mailing.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;


public class SendMailingResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    protected boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
