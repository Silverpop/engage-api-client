package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RESULT")
public class ValidateDCRulesetResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    private boolean success;

    @XStreamAlias("MAILING_ID")
    private String mailingId;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMailingId() {
        return mailingId;
    }

    public void setMailingId(String mailingId) {
        this.mailingId = mailingId;
    }
}