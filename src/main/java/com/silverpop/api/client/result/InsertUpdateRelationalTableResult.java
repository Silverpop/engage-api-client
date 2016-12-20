package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.result.elements.FailuresElementType;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

public class InsertUpdateRelationalTableResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    protected boolean success;

    @XStreamImplicit(itemFieldName = "FAILURES")
    List<FailuresElementType> failures;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<FailuresElementType> getFailures() {
        if(this.failures == null)
        {
            failures = new ArrayList<FailuresElementType>();
        }
        return failures;
    }

    public void setFailures(List<FailuresElementType> failures) {
        this.failures = failures;
    }
}
