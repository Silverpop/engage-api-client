package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.silverpop.api.client.command.elements.ColumnsElementType;
import com.silverpop.api.client.command.elements.SelectionValuesElementType;

/**
 * Created by PeterJLyons on 10/10/2015.
 */
public class GetListMetaDataResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    protected Boolean success;
    @XStreamAlias("ID")
    protected Long id;
    @XStreamAlias("NAME")
    protected String name;
    @XStreamAlias("TYPE")
    protected Integer type;
    @XStreamAlias("SIZE")
    protected Integer size;
    @XStreamAlias("NUM_OPT_OUTS")
    protected Integer numoptouts;
    @XStreamAlias("NUM_UNDELIVERABLE")
    protected Integer numundeliverable;
    @XStreamAlias("LAST_MODIFIED")
    protected String lastmodified;
    @XStreamAlias("LAST_CONFIGURED")
    protected String lastconfigured;
    @XStreamAlias("CREATED")
    protected String created;
    @XStreamAlias("VISIBILITY")
    protected Integer visibility;
    @XStreamAlias("USER_ID")
    protected String userid;
    @XStreamAlias("ORGANIZATION_ID")
    protected String organizationid;
    @XStreamAlias("OPT_IN_FORM_DEFINED")
    protected Boolean optinformdefined;
    @XStreamAlias("OPT_OUT_FORM_DEFINED")
    protected Boolean optoutformdefined;
    @XStreamAlias("PROFILE_FORM_DEFINED")
    protected Boolean profileformdefined;
    @XStreamAlias("OPT_IN_AUTOREPLY_DEFINED")
    protected Boolean optinautoreplydefined;
    @XStreamAlias("PROFILE_AUTOREPLY_DEFINED")
    protected Boolean profileautoreplydefined;
    @XStreamAlias("COLUMNS")
    protected ColumnsElementType columns;
    @XStreamAlias("SELECTION_VALUES")
    protected SelectionValuesElementType selectionvalues;
    @XStreamAlias("KEY_COLUMNS")
    protected ColumnsElementType keycolumns;
    @XStreamAlias("PARENT_DATABASE_ID")
    protected String parentDatabaseId;

    public ColumnsElementType getKeycolumns() {
        return keycolumns;
    }

    public void setKeycolumns(ColumnsElementType keycolumns) {
        this.keycolumns = keycolumns;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getNumoptouts() {
        return numoptouts;
    }

    public void setNumoptouts(Integer numoptouts) {
        this.numoptouts = numoptouts;
    }

    public Integer getNumundeliverable() {
        return numundeliverable;
    }

    public void setNumundeliverable(Integer numundeliverable) {
        this.numundeliverable = numundeliverable;
    }

    public String getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(String lastmodified) {
        this.lastmodified = lastmodified;
    }

    public String getLastconfigured() {
        return lastconfigured;
    }

    public void setLastconfigured(String lastconfigured) {
        this.lastconfigured = lastconfigured;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid;
    }

    public Boolean getOptinformdefined() {
        return optinformdefined;
    }

    public void setOptinformdefined(Boolean optinformdefined) {
        this.optinformdefined = optinformdefined;
    }

    public Boolean getOptoutformdefined() {
        return optoutformdefined;
    }

    public void setOptoutformdefined(Boolean optoutformdefined) {
        this.optoutformdefined = optoutformdefined;
    }

    public Boolean getProfileformdefined() {
        return profileformdefined;
    }

    public void setProfileformdefined(Boolean profileformdefined) {
        this.profileformdefined = profileformdefined;
    }

    public Boolean getOptinautoreplydefined() {
        return optinautoreplydefined;
    }

    public void setOptinautoreplydefined(Boolean optinautoreplydefined) {
        this.optinautoreplydefined = optinautoreplydefined;
    }

    public Boolean getProfileautoreplydefined() {
        return profileautoreplydefined;
    }

    public void setProfileautoreplydefined(Boolean profileautoreplydefined) {
        this.profileautoreplydefined = profileautoreplydefined;
    }

    public ColumnsElementType getColumns() {
        return columns;
    }

    public void setColumns(ColumnsElementType columns) {
        this.columns = columns;
    }

    public SelectionValuesElementType getSelectionvalues() {
        return selectionvalues;
    }

    public void setSelectionvalues(SelectionValuesElementType selectionvalues) {
        this.selectionvalues = selectionvalues;
    }

    public Long getParentDatabaseId() {
        if  (parentDatabaseId == null || parentDatabaseId.length() == 0) return 0L;
        return Long.parseLong(parentDatabaseId);
    }
}
