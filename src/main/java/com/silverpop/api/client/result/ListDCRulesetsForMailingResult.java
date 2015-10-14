package com.silverpop.api.client.result;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.command.elements.RulesetElementType;
import com.silverpop.api.client.result.elements.GetListsList;

import com.silverpop.api.client.result.elements.ListElementType;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class ListDCRulesetsForMailingResult implements ApiResult {

    @XStreamImplicit(itemFieldName="RULESET")
    private List<RulesetElementType> rulesets;


    public List<RulesetElementType> getRulesets() {
        return rulesets;
    }
}

