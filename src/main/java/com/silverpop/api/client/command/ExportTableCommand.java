package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.ExportColumns;
import com.silverpop.api.client.result.ExportTableResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("ExportTable")
public class ExportTableCommand implements ApiCommand {

    @XStreamAlias("TABLE_NAME")
    private String tableName;

    @XStreamAlias("TABLE_ID")
    private long tableId;

    @XStreamAlias("TABLE_VISIBILITY")
    private int tableVisibility;

    @XStreamAlias("EMAIL")
    private String email;

    @XStreamAlias("EXPORT_FORMAT")
    private ExportFormat exportFormat;

    @XStreamAlias("ADD_TO_STORED_FILES")
    private Object addToStoredFiles;

    @XStreamAlias("DATE_START")
    private String dateStart;

    @XStreamAlias("DATE_END")
    private String dateEnd;

    @Override
    public Class<? extends ApiResult> getResultType() {
        return ExportTableResult.class;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public ExportFormat getExportFormat() {
        return exportFormat;
    }

    public void setExportFormat(ExportFormat exportFormat) {
        this.exportFormat = exportFormat;
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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public long getTableId() {
        return tableId;
    }

    public void setTableId(long tableId) {
        this.tableId = tableId;
    }

    public int getTableVisibility() {
        return tableVisibility;
    }

    public void setTableVisibility(int tableVisibility) {
        this.tableVisibility = tableVisibility;
    }

    public Object getAddToStoredFiles() {
        return addToStoredFiles;
    }

    public void setAddToStoredFiles(Object addToStoredFiles) {
        this.addToStoredFiles = addToStoredFiles;
    }

    public static enum ExportFormat {
        CSV,
        TAB,
        PIPE
    }
}
