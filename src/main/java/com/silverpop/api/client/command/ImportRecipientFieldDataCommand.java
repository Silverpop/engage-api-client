package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.ImportListResult;
import com.silverpop.api.client.result.ImportRecipientFieldDataResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 11/2/2015.
 */
@XmlApiProperties("ImportRecipientFieldData")
public class ImportRecipientFieldDataCommand implements ApiCommand {

    @XStreamAlias("LIST_ID")
    protected long listid;
    @XStreamAlias("COLUMN")
    protected String column;
    @XStreamAlias("SOURCE_FILE")
    protected String sourcefile;
    @XStreamAlias("COMPLETION_EMAIL")
    protected String completionemail;
    @XStreamAlias("ERROR_EMAIL")
    protected String erroremail;
    @XStreamAlias("FILE_ENCODING")
    protected ImportListCommand.FileEncoding fileencoding;


    public long getListid() {
        return listid;
    }

    public void setListid(long listid) {
        this.listid = listid;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getSourcefile() {
        return sourcefile;
    }

    public void setSourcefile(String sourcefile) {
        this.sourcefile = sourcefile;
    }

    public String getCompletionemail() {
        return completionemail;
    }

    public void setCompletionemail(String completionemail) {
        this.completionemail = completionemail;
    }

    public String getErroremail() {
        return erroremail;
    }

    public void setErroremail(String erroremail) {
        this.erroremail = erroremail;
    }

    public ImportListCommand.FileEncoding getFileencoding() {
        return fileencoding;
    }

    public void setFileencoding(ImportListCommand.FileEncoding fileencoding) {
        this.fileencoding = fileencoding;
    }

    @Override
    public Class<? extends ApiResult> getResultType() {
        return ImportRecipientFieldDataResult.class;
    }
}
