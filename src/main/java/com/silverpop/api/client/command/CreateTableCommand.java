package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.TableColumnsElementType;
import com.silverpop.api.client.result.CreateTableResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("CreateTable")
public class CreateTableCommand implements ApiCommand
{
    @XStreamAlias("TABLE_NAME")
    protected String tablename;
    @XStreamAlias("COLUMNS")
    protected TableColumnsElementType columns;

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public TableColumnsElementType getColumns() {
        return columns;
    }

    public void setColumns(TableColumnsElementType columns) {
        this.columns = columns;
    }

    @Override
    public Class<CreateTableResult> getResultType() {
        return CreateTableResult.class;
    }


}
