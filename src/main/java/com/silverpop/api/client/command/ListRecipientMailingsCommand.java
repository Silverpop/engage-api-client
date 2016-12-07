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
    private long listId;

    @XStreamAlias("RECIPIENT_ID")
    private long recipientId;

    @Override
    public Class<? extends ApiResult> getResultType() {
        return ListRecipientMailingsResult.class;
    }

    public long getListId() {
        return listId;
    }

    public void setListId(long listId) {
        this.listId = listId;
    }

    public long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(long recipientId) {
        this.recipientId = recipientId;
    }
}
