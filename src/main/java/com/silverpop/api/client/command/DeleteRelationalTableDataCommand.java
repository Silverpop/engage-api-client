package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.DeleteRowsElementType;
import com.silverpop.api.client.result.DeleteRelationalTableDataResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("DeleteRelationalTableData")
public class DeleteRelationalTableDataCommand implements ApiCommand {

    @XStreamAlias("TABLE_ID")
    private String tableId;

    @XStreamAlias("ROWS")
    private DeleteRowsElementType rows;

    @Override
    public Class<? extends ApiResult> getResultType() {
        return DeleteRelationalTableDataResult.class;
    }

    public DeleteRowsElementType getRows() {
        return rows;
    }

    public void setRows(DeleteRowsElementType rows) {
        this.rows = rows;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }
}
