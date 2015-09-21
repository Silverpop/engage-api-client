package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RESULT")
public class CreateQueryResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    private boolean success;

    @XStreamAlias("LIST_ID")
    private long listId;

    public long getContactListId() {
        return listId;
    }

    public boolean getSuccess() {
        return success;
    }

}
