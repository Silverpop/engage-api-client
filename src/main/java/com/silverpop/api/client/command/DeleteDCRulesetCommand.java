package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.DeleteDCRulesetResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("DeleteDCRuleset")
public class DeleteDCRulesetCommand implements ApiCommand {

    @XStreamAlias("RULESET_ID")
    private String rulesetId;

    @Override
    public Class<? extends ApiResult> getResultType() {
        return DeleteDCRulesetResult.class;
    }

    public String getRulesetId() {
        return rulesetId;
    }

    public void setRulesetId(String rulesetId) {
        this.rulesetId = rulesetId;
    }
}
