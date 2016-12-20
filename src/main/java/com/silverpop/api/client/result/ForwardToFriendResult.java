package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("FTF_RESULT")
public class ForwardToFriendResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    public boolean success;

    @XStreamAlias("FTF_VALUE")
    public int value;

    @XStreamAlias("ORGANIZATION_ID")
    public String organizationId;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
