package com.silverpop.api.client.result.elements;

import com.silverpop.api.client.converters.ApiDateConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

import java.util.Date;

@XStreamAlias("SENT_MAILING")
public class GetSentMailingsMailing {

	@XStreamAlias("MailingId")
	private Integer mailingId;

	@XStreamAlias("ReportId")
	private Integer reportId;

	@XStreamAlias("MailingName")
	private String mailingName;

	@XStreamAlias("ListName")
	private String listName;

	@XStreamAlias("ListId")
	private Integer listId;

	@XStreamAlias("UserName")
	private String userName;

	@XStreamAlias("NumSent")
	private Integer numberSent;

	@XStreamAlias("Subject")
	private String subject;

  @XStreamAlias("Visibility")
	private String visibility;

	@XStreamAlias("ScheduledTS")
	private String scheduledts;

	@XStreamAlias("SentTS")
	private String sentts;


    public Integer getMailingId() {
        return mailingId;
    }

    public void setMailingId(Integer mailingId) {
        this.mailingId = mailingId;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public String getMailingName() {
        return mailingName;
    }

    public void setMailingName(String mailingName) {
        this.mailingName = mailingName;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getNumberSent() {
        return numberSent;
    }

    public void setNumberSent(Integer numberSent) {
        this.numberSent = numberSent;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

		public String getVisibility()
		{
			return visibility;
		}

		public void setVisibility(String visibility)
		{
			this.visibility = visibility;
		}

		public String getScheduledTS()
		{
			return scheduledts;
		}

		public void setScheduledTS(String scheduledts)
		{
			this.scheduledts = scheduledts;
		}

		public String getSentTS()
		{
			return sentts;
		}

		public void setSentTS(String sentts)
		{
			this.sentts = sentts;
		}

}
