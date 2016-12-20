package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.result.elements.MailingElementType;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PeterJLyons on 10/15/2015.
 */
public class RawRecipientDataExportResult implements ApiResult {


    @XStreamImplicit(itemFieldName = "MAILING")
    protected List<MailingElementType> mailings;
    @XStreamAlias("SUCCESS")
    protected boolean success;

    public List<MailingElementType> getMailings() {
        if(this.mailings == null)
        {
            this.mailings = new ArrayList<MailingElementType>();
        }

        return mailings;
    }

    public void setMailings(List<MailingElementType> mailings) {
        this.mailings = mailings;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
