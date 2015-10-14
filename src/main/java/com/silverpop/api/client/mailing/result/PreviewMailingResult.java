package com.silverpop.api.client.mailing.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;


public class PreviewMailingResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    protected boolean success;
    @XStreamAlias("HTMLBody")
    protected String htmlBody;
    @XStreamAlias("AOLBody")
    protected String aolBody;
    @XStreamAlias("TextBody")
    protected String textBody;
    @XStreamAlias("SpamScore")
    protected String spamScore;
    

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getHtmlBody() {
        return htmlBody;
    }

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    public String getAolBody() {
        return aolBody;
    }

    public void setAolBody(String aolBody) {
        this.aolBody = aolBody;
    }

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public String getSpamScore() {
        return spamScore;
    }

    public void setSpamScore(String spamScore) {
        this.spamScore = spamScore;
    }
}
