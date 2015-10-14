package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.ColumnElementType;
import com.silverpop.api.client.result.SelectRecipientDataResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XmlApiProperties("SelectRecipientData")
public class SelectRecipientDataCommand implements ApiCommand {

	@XStreamAlias("LIST_ID")
	private Integer listId;

    @XStreamAlias("EMAIL")
	private String email;

    @XStreamAlias("RECIPIENT_ID")
    private Long recipientId;

    @XStreamAlias("ENCODED_RECIPIENT_ID")
    private String encodedRecipientId;

    @XStreamAlias("VISITOR_KEY")
    private String visitorKey;

    @XStreamImplicit(itemFieldName="COLUMNS")
    private List<ColumnElementType> columns;


	@Override
	public Class<? extends ApiResult> getResultType() {
		return SelectRecipientDataResult.class;
	}

    public List<ColumnElementType> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumnElementType> columns) {
        this.columns = columns;
    }

    public String getEmail() {
        return email;
    }

    public Integer getListId() {
        return listId;
    }

    public String getEncodedRecipientId() {
        return encodedRecipientId;
    }

    public String getVisitorKey() {
        return visitorKey;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    public void setEncodedRecipientId(String encodedRecipientId) {
        this.encodedRecipientId = encodedRecipientId;
    }

    public void setVisitorKey(String visitorKey) {
        this.visitorKey = visitorKey;
    }
}
