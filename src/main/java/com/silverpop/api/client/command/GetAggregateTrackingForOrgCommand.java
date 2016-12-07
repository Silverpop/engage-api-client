package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.GetAggregateTrackingResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("GetAggregateTrackingForOrg")
public class GetAggregateTrackingForOrgCommand implements ApiCommand {

    @XStreamAlias("DATE_START")
    protected String datestart;
    @XStreamAlias("DATE_END")
    protected String dateend;
    @XStreamAlias("OPTIONALUSER")
    protected String optionaluser;
    @XStreamAlias("PRIVATE")
    protected String _private;
    @XStreamAlias("SHARED")
    protected String shared;
    @XStreamAlias("SCHEDULED")
    protected String scheduled;
    @XStreamAlias("SENT")
    protected String sent;
    @XStreamAlias("SENDING")
    protected String sending;
    @XStreamAlias("OPTIN_CONFIRMATION")
    protected String optinconfirmation;
    @XStreamAlias("PROFILE_CONFIRMATION")
    protected String profileconfirmation;
    @XStreamAlias("AUTOMATED")
    protected String automated;
    @XStreamAlias("CAMPAIGN_ACTIVE")
    protected String campaignactive;
    @XStreamAlias("CAMPAIGN_COMPLETED")
    protected String campaigncompleted;
    @XStreamAlias("CAMPAIGN_CANCELLED")
    protected String campaigncancelled;
    @XStreamAlias("TOP_DOMAIN")
    protected String topdomain;
    @XStreamAlias("INBOX_MONITORING")
    protected String inboxmonitoring;
    @XStreamAlias("PER_CLICK")
    protected String perclick;
    @XStreamAlias("EXCLUDE_TEST_MAILINGS")
    protected String excludetestmailings;

    public String getDatestart() {
        return datestart;
    }

    public void setDatestart(String datestart) {
        this.datestart = datestart;
    }

    public String getDateend() {
        return dateend;
    }

    public void setDateend(String dateend) {
        this.dateend = dateend;
    }

    public String getOptionaluser() {
        return optionaluser;
    }

    public void setOptionaluser(String optionaluser) {
        this.optionaluser = optionaluser;
    }

    public String get_private() {
        return _private;
    }

    public void set_private(String _private) {
        this._private = _private;
    }

    public String getShared() {
        return shared;
    }

    public void setShared(String shared) {
        this.shared = shared;
    }

    public String getScheduled() {
        return scheduled;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public String getSending() {
        return sending;
    }

    public void setSending(String sending) {
        this.sending = sending;
    }

    public String getOptinconfirmation() {
        return optinconfirmation;
    }

    public void setOptinconfirmation(String optinconfirmation) {
        this.optinconfirmation = optinconfirmation;
    }

    public String getProfileconfirmation() {
        return profileconfirmation;
    }

    public void setProfileconfirmation(String profileconfirmation) {
        this.profileconfirmation = profileconfirmation;
    }

    public String getAutomated() {
        return automated;
    }

    public void setAutomated(String automated) {
        this.automated = automated;
    }

    public String getCampaignactive() {
        return campaignactive;
    }

    public void setCampaignactive(String campaignactive) {
        this.campaignactive = campaignactive;
    }

    public String getCampaigncompleted() {
        return campaigncompleted;
    }

    public void setCampaigncompleted(String campaigncompleted) {
        this.campaigncompleted = campaigncompleted;
    }

    public String getCampaigncancelled() {
        return campaigncancelled;
    }

    public void setCampaigncancelled(String campaigncancelled) {
        this.campaigncancelled = campaigncancelled;
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

    public String getExcludetestmailings() {
        return excludetestmailings;
    }

    public void setExcludetestmailings(String excludetestmailings) {
        this.excludetestmailings = excludetestmailings;
    }





    @Override
    public Class<? extends ApiResult> getResultType() {
        return GetAggregateTrackingResult.class;
    }
}
