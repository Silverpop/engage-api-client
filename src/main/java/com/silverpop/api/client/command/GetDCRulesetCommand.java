package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.silverpop.api.client.result.GetDCRulesetResult;

@XmlApiProperties("GetDCRuleset")
public class GetDCRulesetCommand implements ApiCommand {

    @XStreamAlias("RULESET_ID")
    private String rulesetId;

    @Override
    public Class<? extends ApiResult> getResultType() {
        return GetDCRulesetResult.class;
    }

    public String getRulesetId() {
        return rulesetId;
    }

    public void setRulesetId(String rulesetId) {
        this.rulesetId = rulesetId;
    }
}
