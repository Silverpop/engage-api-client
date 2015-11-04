package com.silverpop.api.client.command;

import java.util.List;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.ColumnElementType;
import com.silverpop.api.client.command.elements.TablesElementType;
import com.silverpop.api.client.result.ForwardToFriendResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("ForwardToFriend")
public class ForwardToFriendCommand implements ApiCommand {

    @XStreamAlias("SENDER_EMAIL")
    protected String senderemail;
    @XStreamAlias("rs")
    protected String rs;
    @XStreamAlias("r")
    protected Long r;
    @XStreamAlias("m")
    protected long m;
    @XStreamAlias("RECIPIENTS")
    protected String recipients;
    @XStreamAlias("MESSAGE")
    protected String message;

    public String getSenderemail() {
        return senderemail;
    }

    public void setSenderemail(String senderemail) {
        this.senderemail = senderemail;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public Long getR() {
        return r;
    }

    public void setR(Long r) {
        this.r = r;
    }

    public long getM() {
        return m;
    }

    public void setM(long m) {
        this.m = m;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    @Override
    public Class<? extends ApiResult> getResultType() {
        return ForwardToFriendResult.class;
    }

}
