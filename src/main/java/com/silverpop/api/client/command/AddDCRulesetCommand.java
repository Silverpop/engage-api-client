package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.ContentAreasElementType;
import com.silverpop.api.client.command.elements.RulesElementType;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.silverpop.api.client.result.AddDCRulesetResult;

@XmlApiProperties("AddDCRuleset")
public class AddDCRulesetCommand implements ApiCommand {

    @XStreamAlias("LIST_ID")
    protected long listid;
    @XStreamAlias("RULESET_NAME")
    protected String rulesetname;
    @XStreamAlias("MAILING_ID")
    protected Long mailingid;
    @XStreamAlias("CONTENT_AREAS")
    protected ContentAreasElementType contentareas;
    @XStreamAlias("RULES")
    protected RulesElementType rules;

    /**
     * Gets the value of the listid property.
     *
     */
    public long getLISTID() {
        return listid;
    }

    /**
     * Sets the value of the listid property.
     *
     */
    public void setLISTID(long value) {
        this.listid = value;
    }

    /**
     * Gets the value of the rulesetname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRULESETNAME() {
        return rulesetname;
    }

    /**
     * Sets the value of the rulesetname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRULESETNAME(String value) {
        this.rulesetname = value;
    }

    /**
     * Gets the value of the mailingid property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getMAILINGID() {
        return mailingid;
    }

    /**
     * Sets the value of the mailingid property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setMAILINGID(Long value) {
        this.mailingid = value;
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
        return AddDCRulesetResult.class;
    }
}
