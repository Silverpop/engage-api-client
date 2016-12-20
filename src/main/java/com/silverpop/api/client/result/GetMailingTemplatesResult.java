package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.result.elements.MailingTemplateElementType;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PeterJLyons on 10/12/2015.
 */
@XStreamAlias("RESULT")
public class GetMailingTemplatesResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    protected boolean success;

    @XStreamImplicit(itemFieldName = "MAILING_TEMPLATE")
    protected List<MailingTemplateElementType> mailingtemplates;

    public List<MailingTemplateElementType> getMailingtemplates() {
        if(this.mailingtemplates == null)
        {
            mailingtemplates = new ArrayList<MailingTemplateElementType>();
        }

        return mailingtemplates;
    }

    public boolean isSUCCESS()
    {
        return success;
    }
}
