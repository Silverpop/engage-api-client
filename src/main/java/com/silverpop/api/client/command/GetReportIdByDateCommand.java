package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.GetReportIdByDateResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 10/8/2015.
 */
@XmlApiProperties("GetReportIdByDate")
public class GetReportIdByDateCommand implements ApiCommand {

    @XStreamAlias("DATE_START")
    private String startDate;

    @XStreamAlias("DATE_END")
    private String endDate;

    @XStreamAlias("MAILING_ID")
    private long mailingId;

    @Override
    public Class<GetReportIdByDateResult> getResultType() {
        return GetReportIdByDateResult.class;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public long getMailingId() {
        return mailingId;
    }

    public void setMailingId(long mailingId) {
        this.mailingId = mailingId;
    }
}
