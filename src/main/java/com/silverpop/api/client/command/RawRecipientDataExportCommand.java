package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.ColumnsElementType;
import com.silverpop.api.client.command.elements.MultiMailingsElementType;
import com.silverpop.api.client.result.RawRecipientDataExportResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Created by PeterJLyons on 10/15/2015.
 */
@XmlApiProperties("RawRecipientDataExport")
public class RawRecipientDataExportCommand implements ApiCommand {

        @XStreamAlias("MAILING_ID")
        protected Long mailingid;
        @XStreamAlias("REPORT_ID")
        protected Long reportid;
        @XStreamImplicit(itemFieldName = "MAILING")
        protected List<MultiMailingsElementType> mailings;
        @XStreamAlias("CAMPAIGN_ID")
        protected Long campaignid;
        @XStreamAlias("LIST_ID")
        protected Long listid;
        @XStreamAlias("INCLUDE_CHILDREN")
        protected String includechildren;
        @XStreamAlias("ALL_NON_EXPORTED")
        protected String allnonexported;
        @XStreamAlias("EVENT_DATE_START")
        protected String eventdatestart;
        @XStreamAlias("EVENT_DATE_END")
        protected String eventdateend;
        @XStreamAlias("SEND_DATE_START")
        protected String senddatestart;
        @XStreamAlias("SEND_DATE_END")
        protected String senddateend;
        @XStreamAlias("EXPORT_FORMAT")
        protected Integer exportformat;
        @XStreamAlias("EXPORT_FILE_NAME")
        protected String exportfilename;
        @XStreamAlias("FILE_ENCODING")
        protected ImportListCommand.FileEncoding fileencoding;
        @XStreamAlias("EMAIL")
        protected String email;
        @XStreamAlias("MOVE_TO_FTP")
        protected String movetoftp;
        @XStreamAlias("PRIVATE")
        protected String _private;
        @XStreamAlias("SHARED")
        protected String shared;
        @XStreamAlias("SENT_MAILINGS")
        protected String sentmailings;
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
        @XStreamAlias("CAMPAIGN_SCRAPE_TEMPLATE")
        protected String campaignscrapetemplate;
        @XStreamAlias("INCLUDE_TEST_MAILINGS")
        protected String includetestmailings;
        @XStreamAlias("ALL_EVENT_TYPES")
        protected String alleventtypes;
        @XStreamAlias("SENT")
        protected String sent;
        @XStreamAlias("SUPPRESSED")
        protected String suppressed;
        @XStreamAlias("OPENS")
        protected String opens;
        @XStreamAlias("CLICKS")
        protected String clicks;
        @XStreamAlias("OPTINS")
        protected String optins;
        @XStreamAlias("OPTOUTS")
        protected String optouts;
        @XStreamAlias("FORWARDS")
        protected String forwards;
        @XStreamAlias("ATTACHMENTS")
        protected String attachments;
        @XStreamAlias("CONVERSIONS")
        protected String conversions;
        @XStreamAlias("CLICKSTREAMS")
        protected String clickstreams;
        @XStreamAlias("HARD_BOUNCES")
        protected String hardbounces;
        @XStreamAlias("SOFT_BOUNCES")
        protected String softbounces;
        @XStreamAlias("REPLY_ABUSE")
        protected String replyabuse;
        @XStreamAlias("REPLY_COA")
        protected String replycoa;
        @XStreamAlias("REPLY_OTHER")
        protected String replyother;
        @XStreamAlias("MAIL_BLOCKS")
        protected String mailblocks;
        @XStreamAlias("MAILING_RESTRICTIONS")
        protected String mailingrestrictions;
        @XStreamAlias("SMS_ERROR")
        protected String smserror;
        @XStreamAlias("SMS_REJECT")
        protected String smsreject;
        @XStreamAlias("SMS_OPTOUT")
        protected String smsoptout;
        @XStreamAlias("INCLUDE_SEEDS")
        protected String includeseeds;
        @XStreamAlias("INCLUDE_FORWARDS")
        protected String includeforwards;
        @XStreamAlias("INCLUDE_INBOX_MONITORING")
        protected String includeinboxmonitoring;
        @XStreamAlias("CODED_TYPE_FIELDS")
        protected String codedtypefields;
        @XStreamAlias("EXCLUDE_DELETED")
        protected String excludedeleted;
        @XStreamAlias("COLUMNS")
        protected ColumnsElementType columns;

    public Class<? extends ApiResult> getResultType() {
        return RawRecipientDataExportResult.class;
    }

    public Long getMailingid() {
        return mailingid;
    }

    public void setMailingid(Long mailingid) {
        this.mailingid = mailingid;
    }

    public Long getReportid() {
        return reportid;
    }

    public void setReportid(Long reportid) {
        this.reportid = reportid;
    }

    public List<MultiMailingsElementType> getMailings() {
        return mailings;
    }

    public void setMailings(List<MultiMailingsElementType> mailings) {
        this.mailings = mailings;
    }

    public Long getCampaignid() {
        return campaignid;
    }

    public void setCampaignid(Long campaignid) {
        this.campaignid = campaignid;
    }

    public Long getListid() {
        return listid;
    }

    public void setListid(Long listid) {
        this.listid = listid;
    }

    public String getIncludechildren() {
        return includechildren;
    }

    public void setIncludechildren(String includechildren) {
        this.includechildren = includechildren;
    }

    public String getAllnonexported() {
        return allnonexported;
    }

    public void setAllnonexported(String allnonexported) {
        this.allnonexported = allnonexported;
    }

    public String getEventdatestart() {
        return eventdatestart;
    }

    public void setEventdatestart(String eventdatestart) {
        this.eventdatestart = eventdatestart;
    }

    public String getEventdateend() {
        return eventdateend;
    }

    public void setEventdateend(String eventdateend) {
        this.eventdateend = eventdateend;
    }

    public String getSenddatestart() {
        return senddatestart;
    }

    public void setSenddatestart(String senddatestart) {
        this.senddatestart = senddatestart;
    }

    public String getSenddateend() {
        return senddateend;
    }

    public void setSenddateend(String senddateend) {
        this.senddateend = senddateend;
    }

    public Integer getExportformat() {
        return exportformat;
    }

    public void setExportformat(Integer exportformat) {
        this.exportformat = exportformat;
    }

    public String getExportfilename() {
        return exportfilename;
    }

    public void setExportfilename(String exportfilename) {
        this.exportfilename = exportfilename;
    }

    public ImportListCommand.FileEncoding getFileencoding() {
        return fileencoding;
    }

    public void setFileencoding(ImportListCommand.FileEncoding fileencoding) {
        this.fileencoding = fileencoding;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMovetoftp() {
        return movetoftp;
    }

    public void setMovetoftp(String movetoftp) {
        this.movetoftp = movetoftp;
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

    public String getSentmailings() {
        return sentmailings;
    }

    public void setSentmailings(String sentmailings) {
        this.sentmailings = sentmailings;
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

    public String getCampaignscrapetemplate() {
        return campaignscrapetemplate;
    }

    public void setCampaignscrapetemplate(String campaignscrapetemplate) {
        this.campaignscrapetemplate = campaignscrapetemplate;
    }

    public String getIncludetestmailings() {
        return includetestmailings;
    }

    public void setIncludetestmailings(String includetestmailings) {
        this.includetestmailings = includetestmailings;
    }

    public String getAlleventtypes() {
        return alleventtypes;
    }

    public void setAlleventtypes(String alleventtypes) {
        this.alleventtypes = alleventtypes;
    }

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public String getSuppressed() {
        return suppressed;
    }

    public void setSuppressed(String suppressed) {
        this.suppressed = suppressed;
    }

    public String getOpens() {
        return opens;
    }

    public void setOpens(String opens) {
        this.opens = opens;
    }

    public String getClicks() {
        return clicks;
    }

    public void setClicks(String clicks) {
        this.clicks = clicks;
    }

    public String getOptins() {
        return optins;
    }

    public void setOptins(String optins) {
        this.optins = optins;
    }

    public String getOptouts() {
        return optouts;
    }

    public void setOptouts(String optouts) {
        this.optouts = optouts;
    }

    public String getForwards() {
        return forwards;
    }

    public void setForwards(String forwards) {
        this.forwards = forwards;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public String getConversions() {
        return conversions;
    }

    public void setConversions(String conversions) {
        this.conversions = conversions;
    }

    public String getClickstreams() {
        return clickstreams;
    }

    public void setClickstreams(String clickstreams) {
        this.clickstreams = clickstreams;
    }

    public String getHardbounces() {
        return hardbounces;
    }

    public void setHardbounces(String hardbounces) {
        this.hardbounces = hardbounces;
    }

    public String getSoftbounces() {
        return softbounces;
    }

    public void setSoftbounces(String softbounces) {
        this.softbounces = softbounces;
    }

    public String getReplyabuse() {
        return replyabuse;
    }

    public void setReplyabuse(String replyabuse) {
        this.replyabuse = replyabuse;
    }

    public String getReplycoa() {
        return replycoa;
    }

    public void setReplycoa(String replycoa) {
        this.replycoa = replycoa;
    }

    public String getReplyother() {
        return replyother;
    }

    public void setReplyother(String replyother) {
        this.replyother = replyother;
    }

    public String getMailblocks() {
        return mailblocks;
    }

    public void setMailblocks(String mailblocks) {
        this.mailblocks = mailblocks;
    }

    public String getMailingrestrictions() {
        return mailingrestrictions;
    }

    public void setMailingrestrictions(String mailingrestrictions) {
        this.mailingrestrictions = mailingrestrictions;
    }

    public String getSmserror() {
        return smserror;
    }

    public void setSmserror(String smserror) {
        this.smserror = smserror;
    }

    public String getSmsreject() {
        return smsreject;
    }

    public void setSmsreject(String smsreject) {
        this.smsreject = smsreject;
    }

    public String getSmsoptout() {
        return smsoptout;
    }

    public void setSmsoptout(String smsoptout) {
        this.smsoptout = smsoptout;
    }

    public String getIncludeseeds() {
        return includeseeds;
    }

    public void setIncludeseeds(String includeseeds) {
        this.includeseeds = includeseeds;
    }

    public String getIncludeforwards() {
        return includeforwards;
    }

    public void setIncludeforwards(String includeforwards) {
        this.includeforwards = includeforwards;
    }

    public String getIncludeinboxmonitoring() {
        return includeinboxmonitoring;
    }

    public void setIncludeinboxmonitoring(String includeinboxmonitoring) {
        this.includeinboxmonitoring = includeinboxmonitoring;
    }

    public String getCodedtypefields() {
        return codedtypefields;
    }

    public void setCodedtypefields(String codedtypefields) {
        this.codedtypefields = codedtypefields;
    }

    public String getExcludedeleted() {
        return excludedeleted;
    }

    public void setExcludedeleted(String excludedeleted) {
        this.excludedeleted = excludedeleted;
    }

    public ColumnsElementType getColumns() {
        return columns;
    }

    public void setColumns(ColumnsElementType columns) {
        this.columns = columns;
    }
}
