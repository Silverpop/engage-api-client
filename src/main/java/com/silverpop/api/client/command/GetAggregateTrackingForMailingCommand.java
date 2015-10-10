package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.GetAggregateTrackingResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("GetAggregateTrackingForMailing")
public class GetAggregateTrackingForMailingCommand implements ApiCommand {

    @XStreamAlias("MAILING_ID")
    protected long mailingid;
    @XStreamAlias("REPORT_ID")
    protected long reportid;
    @XStreamAlias("TOP_DOMAIN")
    protected String topdomain;
    @XStreamAlias("INBOX_MONITORING")
    protected String inboxmonitoring;
    @XStreamAlias("PER_CLICK")
    protected String perclick;

    public long getMailingid() {
        return mailingid;
    }

    public void setMailingid(long mailingid) {
        this.mailingid = mailingid;
    }

    public long getReportid() {
        return reportid;
    }

    public void setReportid(long reportid) {
        this.reportid = reportid;
    }

    public String getTopdomain() {
        return topdomain;
    }

    public void setTopdomain(String topdomain) {
        this.topdomain = topdomain;
    }

    public String getInboxmonitoring() {
        return inboxmonitoring;
    }

    public void setInboxmonitoring(String inboxmonitoring) {
        this.inboxmonitoring = inboxmonitoring;
    }

    public String getPerclick() {
        return perclick;
    }

    public void setPerclick(String perclick) {
        this.perclick = perclick;
    }



    @Override
    public Class<? extends ApiResult> getResultType() {
        return GetAggregateTrackingResult.class;
    }
}
