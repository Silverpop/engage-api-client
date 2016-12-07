package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.ColumnsElementType;
import com.silverpop.api.client.command.elements.DomainsElementType;
import com.silverpop.api.client.command.elements.SitesElementType;
import com.silverpop.api.client.result.WebTrackingDataExportResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 10/16/2015.
 */
@XmlApiProperties("WebTrackingDataExport")
public class WebTrackingDataExportCommand implements ApiCommand {

    @XStreamAlias("EVENT_DATE_START")
    protected String eventdatestart;
    @XStreamAlias("EVENT_DATE_END")
    protected String eventdateend;
    @XStreamAlias("DOMAINS")
    protected DomainsElementType domains;
    @XStreamAlias("SITES")
    protected SitesElementType sites;
    @XStreamAlias("DATABASE_ID")
    protected Long databaseid;
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
    @XStreamAlias("ALL_EVENT_TYPES")
    protected String alleventtypes;
    @XStreamAlias("INCLUDE_SITE_VISIT_EVENTS")
    protected String includesitevisitevents;
    @XStreamAlias("INCLUDE_PAGE_VIEW_EVENTS")
    protected String includepageviewevents;
    @XStreamAlias("INCLUDE_CLICK_EVENTS")
    protected String includeclickevents;
    @XStreamAlias("INCLUDE_FORM_SUBMIT_EVENTS")
    protected String includeformsubmitevents;
    @XStreamAlias("INCLUDE_DOWNLOAD_EVENTS")
    protected String includedownloadevents;
    @XStreamAlias("INCLUDE_MEDIA_EVENTS")
    protected String includemediaevents;
    @XStreamAlias("INCLUDE_SHARE_TO_SOCIAL_EVENTS")
    protected String includesharetosocialevents;
    @XStreamAlias("INCLUDE_CUSTOM_EVENTS")
    protected String includecustomevents;
    @XStreamAlias("COLUMNS")
    protected ColumnsElementType columns;

    public Class<? extends ApiResult> getResultType() {
        return WebTrackingDataExportResult.class;
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

    public DomainsElementType getDomains() {
        return domains;
    }

    public void setDomains(DomainsElementType domains) {
        this.domains = domains;
    }

    public SitesElementType getSites() {
        return sites;
    }

    public void setSites(SitesElementType sites) {
        this.sites = sites;
    }

    public Long getDatabaseid() {
        return databaseid;
    }

    public void setDatabaseid(Long databaseid) {
        this.databaseid = databaseid;
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

    public String getAlleventtypes() {
        return alleventtypes;
    }

    public void setAlleventtypes(String alleventtypes) {
        this.alleventtypes = alleventtypes;
    }

    public String getIncludesitevisitevents() {
        return includesitevisitevents;
    }

    public void setIncludesitevisitevents(String includesitevisitevents) {
        this.includesitevisitevents = includesitevisitevents;
    }

    public String getIncludepageviewevents() {
        return includepageviewevents;
    }

    public void setIncludepageviewevents(String includepageviewevents) {
        this.includepageviewevents = includepageviewevents;
    }

    public String getIncludeclickevents() {
        return includeclickevents;
    }

    public void setIncludeclickevents(String includeclickevents) {
        this.includeclickevents = includeclickevents;
    }

    public String getIncludeformsubmitevents() {
        return includeformsubmitevents;
    }

    public void setIncludeformsubmitevents(String includeformsubmitevents) {
        this.includeformsubmitevents = includeformsubmitevents;
    }

    public String getIncludedownloadevents() {
        return includedownloadevents;
    }

    public void setIncludedownloadevents(String includedownloadevents) {
        this.includedownloadevents = includedownloadevents;
    }

    public String getIncludemediaevents() {
        return includemediaevents;
    }

    public void setIncludemediaevents(String includemediaevents) {
        this.includemediaevents = includemediaevents;
    }

    public String getIncludesharetosocialevents() {
        return includesharetosocialevents;
    }

    public void setIncludesharetosocialevents(String includesharetosocialevents) {
        this.includesharetosocialevents = includesharetosocialevents;
    }

    public String getIncludecustomevents() {
        return includecustomevents;
    }

    public void setIncludecustomevents(String includecustomevents) {
        this.includecustomevents = includecustomevents;
    }

    public ColumnsElementType getColumns() {
        return columns;
    }

    public void setColumns(ColumnsElementType columns) {
        this.columns = columns;
    }
}
