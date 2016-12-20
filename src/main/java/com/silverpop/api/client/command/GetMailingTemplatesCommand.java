package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.GetMailingTemplatesResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 10/12/2015.
 */
@XmlApiProperties("GetMailingTemplates")
public class GetMailingTemplatesCommand implements ApiCommand {

    @XStreamAlias("VISIBILITY")
    protected int visibility;
    @XStreamAlias("LAST_MODIFIED_START_DATE")
    protected String lastmodifiedstartdate;
    @XStreamAlias("LAST_MODIFIED_END_DATE")
    protected String lastmodifiedenddate;

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public String getLastmodifiedstartdate() {
        return lastmodifiedstartdate;
    }

    public void setLastmodifiedstartdate(String lastmodifiedstartdate) {
        this.lastmodifiedstartdate = lastmodifiedstartdate;
    }

    public String getLastmodifiedenddate() {
        return lastmodifiedenddate;
    }

    public void setLastmodifiedenddate(String lastmodifiedenddate) {
        this.lastmodifiedenddate = lastmodifiedenddate;
    }

    @Override
    public Class<? extends ApiResult> getResultType() {
        return GetMailingTemplatesResult.class;
    }
}
