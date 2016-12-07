package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.BehaviorElementType;
import com.silverpop.api.client.command.elements.CriteriaElementType;
import com.silverpop.api.client.result.CreateQueryResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("CreateQuery")
public class CreateQueryCommand implements ApiCommand
{

    @XStreamAlias("QUERY_NAME")
    protected String queryname;

    @XStreamAlias("PARENT_LIST_ID")
    protected long parentlistid;

    @XStreamAlias("VISIBILITY")
    protected int visibility;

    @XStreamAlias("PARENT_FOLDER_ID")
    protected Long parentfolderid;

    @XStreamAlias("ALLOW_FIELD_CHANGE")
    protected int allowfieldchange;

    @XStreamAlias("SELECT_COLUMNS")
    protected String selectcolumns;

    @XStreamAlias("CRITERIA")
    protected CriteriaElementType criteria;

    @XStreamAlias("BEHAVIOR")
    protected BehaviorElementType behavior;

    public String getQueryname() {
        return queryname;
    }

    public void setQueryname(String queryname) {
        this.queryname = queryname;
    }

    public long getParentlistid() {
        return parentlistid;
    }

    public void setParentlistid(long parentlistid) {
        this.parentlistid = parentlistid;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Long getParentfolderid() {
        return parentfolderid;
    }

    public void setParentfolderid(Long parentfolderid) {
        this.parentfolderid = parentfolderid;
    }

    public int isAllowfieldchange() {
        return allowfieldchange;
    }

    public void setAllowfieldchange(int allowfieldchange) {
        this.allowfieldchange = allowfieldchange;
    }

    public String getSelectcolumns() {
        return selectcolumns;
    }

    public void setSelectcolumns(String selectcolumns) {
        this.selectcolumns = selectcolumns;
    }

    public CriteriaElementType getCriteria() {
        return criteria;
    }

    public void setCriteria(CriteriaElementType criteria) {
        this.criteria = criteria;
    }

    public BehaviorElementType getBehavior() {
        return behavior;
    }

    public void setBehavior(BehaviorElementType behavior) {
        this.behavior = behavior;
    }

    public Class<CreateQueryResult> getResultType() {
        return CreateQueryResult.class;
    }

}
