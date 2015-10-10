package com.silverpop.api.client.result;

import java.util.List;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.result.elements.*;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.Set;


@XStreamAlias("RESULT")
public class GetAggregateTrackingResult implements ApiResult {



    @XStreamAlias("SUCCESS")
    private boolean success;

    @XStreamImplicit(itemFieldName="Mailing")
    protected List<MailingElementType> mailings;

    @XStreamAlias("InboxMonitored")
    protected InboxMonitoredElementType inboxMonitored;

    @XStreamAlias("TopDomains")
    protected TopDomainsElementType topDomains;

    @XStreamAlias("Clicks")
    protected ClicksElementType clicks;

    public List<MailingElementType> getMailings() {
        return mailings;
    }

    public TopDomainsElementType getTopDomains() {
        return topDomains;
    }

    public ClicksElementType getClicks() {
        return clicks;
    }

    public boolean getSuccess() {
        return success;
    }

    public InboxMonitoredElementType getInboxMonitored() {
        return inboxMonitored;
    }
}
