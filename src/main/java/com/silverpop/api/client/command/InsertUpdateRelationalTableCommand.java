package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.RowsElementType;
import com.silverpop.api.client.result.InsertUpdateRelationalTableResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlApiProperties("InsertUpdateRelationalTable")
public class InsertUpdateRelationalTableCommand implements ApiCommand {

    @XStreamAlias("TABLE_ID")
    protected long tableid;
    @XStreamAlias("ROWS")
    protected RowsElementType rows;

    public InsertUpdateRelationalTableCommand()
    {
        this.rows = new RowsElementType();
    }

    @Override
    public Class<InsertUpdateRelationalTableResult> getResultType() {
        return InsertUpdateRelationalTableResult.class;
    }

    public long getTableid() {
        return tableid;
    }

    public void setTableid(long tableid) {
        this.tableid = tableid;
    }

    public RowsElementType getRows() {
        return rows;
    }

    public void setRows(RowsElementType rows) {
        this.rows = rows;
    }
}

