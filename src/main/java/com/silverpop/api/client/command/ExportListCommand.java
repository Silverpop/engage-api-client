package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.ExportColumns;
import com.silverpop.api.client.result.ExportListResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("ExportList")
public class ExportListCommand implements ApiCommand {

    @XStreamAlias("LIST_ID")
    private Integer listId;

    @XStreamAlias("EMAIL")
	private String email;
    
    @XStreamAlias("EXPORT_TYPE")
    private ExportType exportType;
    
    @XStreamAlias("EXPORT_FORMAT")
    private ExportFormat exportFormat;
    
    @XStreamAlias("FILE_ENCODING")
	private String fileEncoding;
    
    @XStreamAlias("ADD_TO_STORED_FILES")
    private Object addToStoredFiles;
    
	@XStreamAlias("DATE_START")
	private String dateStart;

	@XStreamAlias("DATE_END")
	private String dateEnd;
	
	@XStreamAlias("USE_CREATED_DATE")
	private Object useCreatedDate;
	
	@XStreamAlias("INCLUDE_LEAD_SOURCE")
	private Boolean includeLeadSource;
			
	@XStreamAlias("LIST_DATE_FORMAT")
	private String listDateFormat;

	@XStreamAlias("EXPORT_COLUMNS")
	private ExportColumns exportColumns;
	
	public ExportListCommand() {
		exportColumns = new ExportColumns();
	}
	
	@Override
	public Class<? extends ApiResult> getResultType() {
		return ExportListResult.class;
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

	public ExportType getExportType() {
		return exportType;
	}

	public void setExportType(ExportType exportType) {
		this.exportType = exportType;
	}

	public ExportFormat getExportFormat() {
		return exportFormat;
	}

	public void setExportFormat(ExportFormat exportFormat) {
		this.exportFormat = exportFormat;
	}

	public String getFileEncoding() {
		return fileEncoding;
	}

	public void setFileEncoding(String fileEncoding) {
		this.fileEncoding = fileEncoding;
	}

	public boolean isAddToStoredFiles() {
		return addToStoredFiles != null;
	}

	public void setAddToStoredFiles() {
		this.addToStoredFiles = new Object();
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public boolean isUseCreatedDate() {
		return useCreatedDate != null;
	}

	public void setUseCreatedDate() {
		this.useCreatedDate = new Object();
	}

	public Boolean getIncludeLeadSource() {
		return includeLeadSource;
	}

	public void setIncludeLeadSource(Boolean includeLeadSource) {
		this.includeLeadSource = includeLeadSource;
	}

	public String getListDateFormat() {
		return listDateFormat;
	}

	public void setListDateFormat(String listDateFormat) {
		this.listDateFormat = listDateFormat;
	}

	public ExportColumns getExportColumns() {
		return exportColumns;
	}

	public void setExportColumns(ExportColumns exportColumns) {
		this.exportColumns = exportColumns;
	}

	public void addExportColumn(String column) {
		this.exportColumns.addColumn(column);
	}
	
	public static enum ExportType {
		ALL, 
		OPT_IN, 
		OPT_OUT, 
		UNDELIVERABLE
	}
	
	public static enum ExportFormat {
		CSV, 
		TAB, 
		PIPE
	}
}
