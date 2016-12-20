package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RESULT")
public class OptOutRecipientResult implements ApiResult {

    @XStreamAlias("RecipientId")
    private String recipientId;

    @XStreamAlias("SUCCESS")
    private String success;

    @XStreamAlias("ORGANIZATION_ID")
    private String organizationId;

    public String getRecipientId() {
        return recipientId;
    }

    public boolean isSuccessful() {
        // For some reason, the server side returns a success element of "SUCCESS" instead of true or false.
        // This is a hardcoded workaround that I recommend should be fixed by someone later.

        if (success == "SUCCESS")
        {
            return true;
        } else {
            return false;
        }
    }

    public String getOrganizationId() {
        return organizationId;
    }

}
