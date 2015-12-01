package com.silverpop.api.client.result;

import java.util.ArrayList;
import java.util.List;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.command.elements.RulesetElementType;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class GetDCRulesetResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    protected boolean success;

    @XStreamImplicit(itemFieldName = "RULESET")
    protected List<RulesetElementType> rulesets;

    public List<RulesetElementType> getRULESETS() {
        if (rulesets == null) {
            rulesets = new ArrayList<RulesetElementType>();
        }
        return this.rulesets;
    }

    public boolean getSUCCESS()
    {
        return success;
    }
}