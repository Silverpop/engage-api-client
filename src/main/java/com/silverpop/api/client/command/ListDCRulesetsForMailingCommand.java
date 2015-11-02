package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.ListDCRulesetsForMailingResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("ListDCRulesetsForMailing")
public class ListDCRulesetsForMailingCommand implements ApiCommand {

    @XStreamAlias("MAILING_ID")
    protected long mailingid;

    public long getMailingid() {
        return mailingid;
    }

    public void setMailingid(long mailingid) {
        this.mailingid = mailingid;
    }


    @Override
    public Class<? extends ApiResult> getResultType() {
        return ListDCRulesetsForMailingResult.class;
    }
}
