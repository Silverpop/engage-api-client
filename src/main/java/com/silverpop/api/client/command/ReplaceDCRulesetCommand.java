package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.ContentAreasElementType;
import com.silverpop.api.client.command.elements.RulesElementType;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.silverpop.api.client.result.ReplaceDCRulesetResult;

@XmlApiProperties("ReplaceDCRuleset")
public class ReplaceDCRulesetCommand implements ApiCommand {

    @XStreamAlias("RULESET_ID")
    protected String rulesetID;
    @XStreamAlias("CONTENT_AREAS")
    protected ContentAreasElementType contentareas;
    @XStreamAlias("RULES")
    protected RulesElementType rules;

    public String getRulesetID() {
        return rulesetID;
    }

    public void setRulesetID(String rulesetID) {
        this.rulesetID = rulesetID;
    }

    /**
     * Gets the value of the contentareas property.
     *
     * @return
     *     possible object is
     *     {@link ContentAreasElementType }
     *
     */
    public ContentAreasElementType getCONTENTAREAS() {
        return contentareas;
    }

    /**
     * Sets the value of the contentareas property.
     *
     * @param value
     *     allowed object is
     *     {@link ContentAreasElementType }
     *
     */
    public void setCONTENTAREAS(ContentAreasElementType value) {
        this.contentareas = value;
    }

    /**
     * Gets the value of the rules property.
     *
     * @return
     *     possible object is
     *     {@link RulesElementType }
     *
     */
    public RulesElementType getRULES() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     *
     * @param value
     *     allowed object is
     *     {@link RulesElementType }
     *
     */
    public void setRULES(RulesElementType value) {
        this.rules = value;
    }

    @Override
    public Class<? extends ApiResult> getResultType() {
        return ReplaceDCRulesetResult.class;
    }
}

