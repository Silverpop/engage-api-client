package com.silverpop.api.client.result;

import java.util.ArrayList;
import java.util.List;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.command.elements.RulesetElementType;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class ReplaceDCRulesetResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    protected boolean success;

    @XStreamAlias("RULESET_ID")
    protected long rulesetID;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public long getRulesetID() {
        return rulesetID;
    }

    public void setRulesetID(long rulesetID) {
        this.rulesetID = rulesetID;
    }
}