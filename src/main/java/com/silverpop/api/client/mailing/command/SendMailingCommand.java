package com.silverpop.api.client.mailing.command;


import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.mailing.result.SendMailingResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.silverpop.api.client.XmlApiProperties;


@XmlApiProperties("SendMailing")
public class SendMailingCommand implements ApiCommand {
    @XStreamAlias("MailingId")
    protected long mailingId;

    @XStreamAlias("RecipientEmail")
    protected String email;

    @Override
    public Class<SendMailingResult> getResultType() {
        return SendMailingResult.class;
    }


    public long getMailingId() {
        return mailingId;
    }

    public void setMailingId(long mailingId) {
        this.mailingId = mailingId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
