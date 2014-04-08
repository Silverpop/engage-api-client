package com.silverpop.api.client.command;

import java.util.ArrayList;
import java.util.List;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.Column;
import com.silverpop.api.client.result.RecipientResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XmlApiProperties("AddRecipient")
public class UpdateRecipientCommand implements ApiCommand {

    @XStreamAlias("LIST_ID")
    private Integer listId;

    @XStreamAlias("OLD_EMAIL")
    private String oldEmail;

    @XStreamAlias("RECIPIENT_ID")
    private String recipientId;

    @XStreamAlias("ENCODED_RECIPIENT_ID")
    private String encodedRecipientId;

    @XStreamAlias("SEND_AUTOREPLY")
    private Boolean sendAutoreply;

    @XStreamAlias("ALLOW_HTML")
    private Boolean allowHtml;

    @XStreamAlias("VISITOR_KEY")
    private String visitorKey;

    @XStreamImplicit(itemFieldName="COLUMN")
    private List<Column> columns;


    public UpdateRecipientCommand() {
        columns = new ArrayList<Column>();
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

    public String getOldEmail() {
        return oldEmail;
    }

    public void setOldEmail(String oldEmail) {
        this.oldEmail = oldEmail;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getEncodedRecipientId() {
        return encodedRecipientId;
    }

    public void setEncodedRecipientId(String encodedRecipientId) {
        this.encodedRecipientId = encodedRecipientId;
    }

    public Boolean getSendAutoreply() {
        return sendAutoreply;
    }

    public void setSendAutoreply(Boolean sendAutoreply) {
        this.sendAutoreply = sendAutoreply;
    }

    public Boolean getAllowHtml() {
        return allowHtml;
    }

    public void setAllowHtml(Boolean allowHtml) {
        this.allowHtml = allowHtml;
    }

    public String getVisitorKey() {
        return visitorKey;
    }

    public void setVisitorKey(String visitorKey) {
        this.visitorKey = visitorKey;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void addColumn(final Column column) {
        this.columns.add(column);
    }
}
