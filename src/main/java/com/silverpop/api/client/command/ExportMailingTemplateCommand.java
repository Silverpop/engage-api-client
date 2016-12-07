package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.ExportMailingTemplateResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 10/15/2015.
 */
@XmlApiProperties("ExportMailingTemplate")
public class ExportMailingTemplateCommand implements ApiCommand {


    @XStreamAlias("TEMPLATE_ID")
    protected long templateId;
    @XStreamAlias("ADD_TO_STORED_FILES")
    private Object addToStoredFiles;

    public Class<? extends ApiResult> getResultType() {
        return ExportMailingTemplateResult.class;
    }

    public long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(long templateId) {
        this.templateId = templateId;
    }

    public boolean isAddToStoredFiles() {
        return addToStoredFiles != null;
    }

    public void setAddToStoredFiles() {
        this.addToStoredFiles = new Object();
    }
}
