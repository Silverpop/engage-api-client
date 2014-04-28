package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.Column;
import com.silverpop.api.client.result.DataJobResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

@XmlApiProperties("InsertUpdateRelationalTable")
public class InsertUpdateRelationalTableCommand implements ApiCommand {

    @XStreamAlias("TABLE_ID")
    private Integer id;

    @XStreamImplicit(itemFieldName="COLUMN")
    private List<Column> columns;

	@Override
	public Class<DataJobResult> getResultType() {
		return DataJobResult.class;
	}

}