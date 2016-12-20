package com.silverpop.api.client.command;

import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.ApiCommand;

import com.silverpop.api.client.result.ImportListResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("ImportList")
public class ImportListCommand implements ApiCommand {

    @XStreamAlias("MAP_FILE")
    private String mapFile;
    
	@XStreamAlias("SOURCE_FILE")
	private String sourceFile;

	@XStreamAlias("FILE_ENCODING")
	private FileEncoding fileEncoding;

	@Override
	public Class<ImportListResult> getResultType() {
		return ImportListResult.class;
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

	public FileEncoding getFileEncoding() {
		return fileEncoding;
	}

	public void setFileEncoding(FileEncoding fileEncoding) {
		this.fileEncoding = fileEncoding;
	}


	public enum FileEncoding {
		UTF_8("UTF-8"),
		ISO_8859_1("ISO-8859-1");
		private String value;

		FileEncoding(String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		public static FileEncoding fromValue(String v) {
			for (FileEncoding c: FileEncoding.values()) {
				if (c.value.equals(v)) {
					return c;
				}
			}
			throw new IllegalArgumentException(v);
		}
	}
}
