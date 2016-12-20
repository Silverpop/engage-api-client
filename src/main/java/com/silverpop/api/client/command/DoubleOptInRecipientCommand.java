package com.silverpop.api.client.command;

import java.util.ArrayList;
import java.util.List;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.ColumnElementType;
import com.silverpop.api.client.command.elements.ExpressionElementType;
import com.silverpop.api.client.command.elements.TablesElementType;
import com.silverpop.api.client.result.RecipientResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XmlApiProperties("DoubleOptInRecipient")
public class DoubleOptInRecipientCommand implements ApiCommand {

    @XStreamAlias("LIST_ID")
    protected long listid;
    @XStreamAlias("SEND_AUTOREPLY")
    protected boolean sendautoreply;
    @XStreamAlias("ALLOW_HTML")
    protected boolean allowhtml;
    @XStreamImplicit(itemFieldName = "COLUMN")
    protected List<ColumnElementType> columnElementTypes;
    @XStreamAlias("TABLES")
    protected TablesElementType tables;


    public long getListid() {
        return listid;
    }

    public void setListid(long listid) {
        this.listid = listid;
    }

    public boolean isSendautoreply() {
        return sendautoreply;
    }

    public void setSendautoreply(boolean sendautoreply) {
        this.sendautoreply = sendautoreply;
    }

    public boolean isAllowhtml() {
        return allowhtml;
    }

    public void setAllowhtml(boolean allowhtml) {
        this.allowhtml = allowhtml;
    }

    public List<ColumnElementType> getColumns() {
        if (columnElementTypes == null) {
            columnElementTypes = new ArrayList<ColumnElementType>();
        }

        return columnElementTypes;
    }

    public void setColumns(List<ColumnElementType> columns) {
        this.columnElementTypes = columns;
    }

    public TablesElementType getTables() {
        return tables;
    }

    public void setTables(TablesElementType tables) {
        this.tables = tables;
    }



    @Override
    public Class<? extends ApiResult> getResultType() {
        return RecipientResult.class;
    }

}
