package com.silverpop.api.client.command;

import java.util.ArrayList;
import java.util.List;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.ColumnElementType;
import com.silverpop.api.client.result.RecipientResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XmlApiProperties("RemoveRecipient")
public class RemoveRecipientCommand implements ApiCommand {

    @XStreamAlias("LIST_ID")
    private Integer listId;

    @XStreamAlias("EMAIL")
    private String email;

    @XStreamImplicit(itemFieldName = "COLUMN")
    List<ColumnElementType> columns;

    public RemoveRecipientCommand()
    {
        columns = new ArrayList<ColumnElementType>();
    }

    @Override
    public Class<RecipientResult> getResultType() {
        return RecipientResult.class;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ColumnElementType> getColumns()
    {
        return columns;
    }

    public void setColumns(List<ColumnElementType> columns)
    {
        this.columns = columns;
    }

}

