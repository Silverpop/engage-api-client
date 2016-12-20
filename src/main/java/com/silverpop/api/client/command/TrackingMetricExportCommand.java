package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.MetricsExportFormat;
import com.silverpop.api.client.result.TrackingMetricExportResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 10/15/2015.
 */
@XmlApiProperties("TrackingMetricExport")
public class TrackingMetricExportCommand implements ApiCommand {

    @XStreamAlias("MAILING_ID")
    protected Long mailingid;
    @XStreamAlias("REPORT_ID")
    protected Long reportid;
    @XStreamAlias("EXPORT_FORMAT")
    protected MetricsExportFormat exportformat;
    @XStreamAlias("LIST_ID")
    protected Long listid;
    @XStreamAlias("EMAIL")
    protected String email;
    @XStreamAlias("SEND_DATE_START")
    protected String senddatestart;
    @XStreamAlias("SEND_DATE_END")
    protected String senddateend;
    @XStreamAlias("MOVE_TO_FTP")
    protected String movetoftp;
    @XStreamAlias("ALL_AGGREGATE_METRICS")
    protected String allaggregatemetrics;
    @XStreamAlias("AGGREGATE_SUMMARY")
    protected String aggregatesummary;
    @XStreamAlias("ALL_METRICS_FORWARDS")
    protected String allmetricsforwards;
    @XStreamAlias("AGGREGATE_CLICKS")
    protected String aggregateclicks;
    @XStreamAlias("AGGREGATE_CLICKSTREAMS")
    protected String aggregateclickstreams;
    @XStreamAlias("AGGREGATE_CONVERSIONS")
    protected String aggregateconversions;
    @XStreamAlias("AGGREGATE_ATTACHMENTS")
    protected String aggregateattachments;
    @XStreamAlias("AGGREGATE_MEDIA")
    protected String aggregatemedia;
    @XStreamAlias("AGGREGATE_SUPPRESSIONS ")
    protected String aggregatesuppressions0020;
    @XStreamAlias("MAIL_TRACK_INTERVAL")
    protected String mailtrackinterval;
    @XStreamAlias("TOP_DOMAINS")
    protected String topdomains;
    @XStreamAlias("EXCLUDE_IM_FROM_METRICS")
    protected String excludeimfrommetrics;

    public Class<? extends ApiResult> getResultType() {
        return TrackingMetricExportResult.class;
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

    public MetricsExportFormat getExportformat() {
        return exportformat;
    }

    public void setExportformat(MetricsExportFormat exportformat) {
        this.exportformat = exportformat;
    }

    public Long getListid() {
        return listid;
    }

    public void setListid(Long listid) {
        this.listid = listid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getMovetoftp() {
        return movetoftp;
    }

    public void setMovetoftp(String movetoftp) {
        this.movetoftp = movetoftp;
    }

    public String getAllaggregatemetrics() {
        return allaggregatemetrics;
    }

    public void setAllaggregatemetrics(String allaggregatemetrics) {
        this.allaggregatemetrics = allaggregatemetrics;
    }

    public String getAggregatesummary() {
        return aggregatesummary;
    }

    public void setAggregatesummary(String aggregatesummary) {
        this.aggregatesummary = aggregatesummary;
    }

    public String getAllmetricsforwards() {
        return allmetricsforwards;
    }

    public void setAllmetricsforwards(String allmetricsforwards) {
        this.allmetricsforwards = allmetricsforwards;
    }

    public String getAggregateclicks() {
        return aggregateclicks;
    }

    public void setAggregateclicks(String aggregateclicks) {
        this.aggregateclicks = aggregateclicks;
    }

    public String getAggregateclickstreams() {
        return aggregateclickstreams;
    }

    public void setAggregateclickstreams(String aggregateclickstreams) {
        this.aggregateclickstreams = aggregateclickstreams;
    }

    public String getAggregateconversions() {
        return aggregateconversions;
    }

    public void setAggregateconversions(String aggregateconversions) {
        this.aggregateconversions = aggregateconversions;
    }

    public String getAggregateattachments() {
        return aggregateattachments;
    }

    public void setAggregateattachments(String aggregateattachments) {
        this.aggregateattachments = aggregateattachments;
    }

    public String getAggregatemedia() {
        return aggregatemedia;
    }

    public void setAggregatemedia(String aggregatemedia) {
        this.aggregatemedia = aggregatemedia;
    }

    public String getAggregatesuppressions0020() {
        return aggregatesuppressions0020;
    }

    public void setAggregatesuppressions0020(String aggregatesuppressions0020) {
        this.aggregatesuppressions0020 = aggregatesuppressions0020;
    }

    public String getMailtrackinterval() {
        return mailtrackinterval;
    }

    public void setMailtrackinterval(String mailtrackinterval) {
        this.mailtrackinterval = mailtrackinterval;
    }

    public String getTopdomains() {
        return topdomains;
    }

    public void setTopdomains(String topdomains) {
        this.topdomains = topdomains;
    }

    public String getExcludeimfrommetrics() {
        return excludeimfrommetrics;
    }

    public void setExcludeimfrommetrics(String excludeimfrommetrics) {
        this.excludeimfrommetrics = excludeimfrommetrics;
    }
}
