package com.silverpop.api.client.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.result.DataJobResult;

@XmlApiProperties("SetColumnValue")
public class SetColumnValueCommand implements ApiCommand{
	
    @XStreamAlias("LIST_ID")
    private int listId;
    
	@XStreamAlias("COLUMN_NAME")
	private String columnName;
	
	@XStreamAlias("ACTION")
	private int action;
	
	@XStreamAlias("COLUMN_VALUE")
	private String columnValue;
	
	@XStreamAlias("EMAIL")
	private String email;

	@Override
	public Class<DataJobResult> getResultType() {
		return DataJobResult.class;
	}

	public int getListId() {
		return listId;
	}

	public void setListId(int listId) {
		this.listId = listId;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public String getColumnValue() {
		return columnValue;
	}

	public void setColumnValue(String columnValue) {
		this.columnValue = columnValue;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
