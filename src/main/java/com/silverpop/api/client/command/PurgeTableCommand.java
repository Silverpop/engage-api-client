package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.TableColumnsElementType;
import com.silverpop.api.client.result.PurgeTableResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("PurgeTable")
public class PurgeTableCommand implements ApiCommand
{
    @XStreamAlias("TABLE_NAME")
    protected String tablename;
    @XStreamAlias("TABLE_ID")
    protected long tableId;
    @XStreamAlias("TABLE_VISIBILITY")
    protected int visibility;
    @XStreamAlias("DELETE_BEFORE")
    protected String deleteBefore;
    @XStreamAlias("EMAIL")
    protected String email;


    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public long getTableId() {
        return tableId;
    }

    public void setTableId(long tableId) {
        this.tableId = tableId;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public String getDeleteBefore() {
        return deleteBefore;
    }

    public void setDeleteBefore(String deleteBefore) {
        this.deleteBefore = deleteBefore;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Class<PurgeTableResult> getResultType() {
        return PurgeTableResult.class;
    }


}
