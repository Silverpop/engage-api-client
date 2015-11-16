package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.ColumnElementType;
import com.silverpop.api.client.result.OptOutRecipientResult;
import com.silverpop.api.client.result.RecipientResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PeterJLyons on 10/8/2015.
 */
@XmlApiProperties("OptOutRecipient")
public class OptOutRecipientCommand implements ApiCommand {


    @XStreamAlias("LIST_ID")
    private long ListId;

    @XStreamAlias("EMAIL")
    private String email;

    @XStreamAlias("MAILING_ID")
    private long mailingId;

    @XStreamAlias("RECIPIENT_ID")
    private String recipientId;

    @XStreamAlias("JOB_ID")
    private String jobId;

    @XStreamImplicit(itemFieldName = "COLUMN")
    List<ColumnElementType> columns;

    @Override
    public Class<OptOutRecipientResult> getResultType() {
        return OptOutRecipientResult.class;
    }

    public long getListId() {
        return ListId;
    }

    public void setListId(long listId) {
        ListId = listId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMailingId() {
        return mailingId;
    }

    public void setMailingId(long mailingId) {
        this.mailingId = mailingId;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public List<ColumnElementType> getColumns() {
        if(this.columns == null)
        {
            this.columns = new ArrayList<ColumnElementType>();
        }

        return columns;
    }

    public void setColumns(List<ColumnElementType> columns) {
        this.columns = columns;
    }
}
