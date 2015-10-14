package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.DeleteRowsElementType;
import com.silverpop.api.client.result.ListRecipientMailingsResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("ListRecipientMailings")
public class ListRecipientMailingsCommand implements ApiCommand {

    @XStreamAlias("LIST_ID")
    private long tableId;

    @XStreamAlias("RECIPIENT_ID")
    private long rows;

    @Override
    public Class<? extends ApiResult> getResultType() {
        return ListRecipientMailingsResult.class;
    }

    public long getRows() {
        return rows;
    }

    public void setRows(long rows) {
        this.rows = rows;
    }

    public long getTableId() {
        return tableId;
    }

    public void setTableId(long tableId) {
        this.tableId = tableId;
    }
}
