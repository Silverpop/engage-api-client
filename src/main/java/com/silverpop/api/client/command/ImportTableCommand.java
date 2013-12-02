package com.silverpop.api.client.command;

import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.result.DataJobResult;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("ImportTable")
public class ImportTableCommand implements ApiCommand {

    @XStreamAlias("MAP_FILE")
    private String mapFile;
    
	@XStreamAlias("SOURCE_FILE")
	private String sourceFile;

	@Override
	public Class<DataJobResult> getResultType() {
		return DataJobResult.class;
	}

	public String getMapFile() {
		return mapFile;
	}

	public void setMapFile(String mapFile) {
		this.mapFile = mapFile;
	}

	public String getSourceFile() {
		return sourceFile;
	}

	public void setSourceFile(String sourceFile) {
		this.sourceFile = sourceFile;
	}
}