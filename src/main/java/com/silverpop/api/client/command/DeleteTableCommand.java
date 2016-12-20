package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.DeleteTableResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("DeleteTable")
public class DeleteTableCommand implements ApiCommand {

    @XStreamAlias("TABLE_NAME")
    private String tableName;

    @XStreamAlias("TABLE_ID")
    private String tableID;

    @XStreamAlias("TALBE_VISIBILITY")
    private int tableVisibility;

    @XStreamAlias("EMAIL")
    private String email;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableID() {
        return tableID;
    }

    public void setTableID(String tableID) {
        this.tableID = tableID;
    }

    public int getTableVisibility() {
        return tableVisibility;
    }

    public void setTableVisibility(int tableVisibility) {
        this.tableVisibility = tableVisibility;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public Class<? extends ApiResult> getResultType() {
        return DeleteTableResult.class;
    }

}
