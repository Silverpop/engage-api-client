package com.silverpop.api.client.command.elements;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("EXPORT_COLUMNS")
public class ExportColumns {

	@XStreamImplicit(itemFieldName="COLUMN")
	private List<String> columns;
	
	public ExportColumns() {
		this.columns = new ArrayList<String>();
	}

	public List<String> getColumns() {
		return columns;
	}

	public void setColumn(List<String> columns) {
		this.columns = columns;
	}
	
	public void addColumn(String column) {
		this.columns.add(column);
	}
}
