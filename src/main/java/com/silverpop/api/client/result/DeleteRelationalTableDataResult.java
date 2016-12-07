package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.result.elements.FailuresElementType;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RESULT")
public class DeleteRelationalTableDataResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    private boolean successElement;

    @XStreamAlias("FAILURES")
    private FailuresElementType failures;

    public boolean isSuccessElement() {
        return successElement;
    }

    public void setSuccessElement(boolean successElement) {
        this.successElement = successElement;
    }

    public FailuresElementType getFailures() {
        return failures;
    }

    public void setFailures(FailuresElementType failures) {
        this.failures = failures;
    }
}
