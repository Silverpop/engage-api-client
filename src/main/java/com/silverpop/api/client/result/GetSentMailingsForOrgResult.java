package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.result.elements.GetSentMailingsMailing;
import com.silverpop.api.client.result.elements.MailingElementType;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;
import java.util.Set;


@XStreamAlias("RESULT")
public class GetSentMailingsForOrgResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    private boolean success;

    @XStreamImplicit(itemFieldName="Mailing")
    private List<MailingElementType> mailings;


    public boolean getSuccess() {
        return success;
    }

    public List<MailingElementType> getMailings() {
        return mailings;
    }

}
