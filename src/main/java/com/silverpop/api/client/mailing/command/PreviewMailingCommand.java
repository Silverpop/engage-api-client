package com.silverpop.api.client.mailing.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.silverpop.api.client.ApiResult;

import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.mailing.result.PreviewMailingResult;

@XmlApiProperties("PreviewMailing")
public class PreviewMailingCommand implements ApiCommand {

    @XStreamAlias("MailingId")
    private Long mailingId;

    @XStreamAlias("RecipientEmail")
    private String recipientEmail;

    @Override
    public Class<? extends ApiResult> getResultType() {
        return PreviewMailingResult.class;
    }

    public Long getMailingId() {
        return mailingId;
    }

    public void setMailingId(Long mailingId) {
        this.mailingId = mailingId;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }
}
