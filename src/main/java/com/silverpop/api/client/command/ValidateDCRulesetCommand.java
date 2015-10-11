package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.silverpop.api.client.result.ValidateDCRulesetResult;



@XmlApiProperties("ValidateDCRuleset")
public class ValidateDCRulesetCommand implements ApiCommand {

    @XStreamAlias("MAILING_ID")
    protected long mailingId;


    public long getMailingId() {
        return mailingId;
    }

    public void setMailingId(long mailingId) {
        this.mailingId = mailingId;
    }

    @Override
    public Class<ValidateDCRulesetResult> getResultType() {
        return ValidateDCRulesetResult.class;
    }
}