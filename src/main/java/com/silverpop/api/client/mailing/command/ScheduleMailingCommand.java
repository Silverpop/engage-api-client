package com.silverpop.api.client.mailing.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.silverpop.api.client.ApiResult;

import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.converters.ApiDateParameterConverter;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.mailing.result.ScheduleMailingResult;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlApiProperties("ScheduleMailing")
public class ScheduleMailingCommand implements ApiCommand {

	@XStreamAlias("TEMPLATE_ID")
	private Long mailingId;
	
	@XStreamAlias("LIST_ID")
	private Integer listId;
	
	@XStreamAlias("MAILING_NAME")
	private String mailingName;
	
	@XStreamAlias("SEND_HTML")
    private Boolean sendHTML;

	@XStreamAlias("SEND_AOL")
    private Boolean sendAOL;

	@XStreamAlias("SEND_TEXT")
    private Boolean sendText;

	@XStreamAlias("SUBJECT")
    private String subject;

	@XStreamAlias("FROM_NAME")
    private String fromName;

	@XStreamAlias("FROM_ADDRESS")
    private String fromAddress;

	@XStreamAlias("REPLY_TO")
    private String replyTo;

	@XStreamAlias("VISIBILITY")
    private Integer visibility;

    @XStreamAlias("PARENT_FOLDER_PATH")
    private String parentFolderPath;

    @XStreamAlias("CREATE_PARENT_FOLDER")
    private Boolean createParentFolder;

	@XStreamAlias("SCHEDULED")
    @XStreamConverter(ApiDateParameterConverter.class)
    private Date schedule;

    @XStreamAlias("SCHEDULED_IN_GMT")
    private Boolean isGmt;

	@XStreamAlias("INBOX_MONITOR")
    private Boolean useMonitoring;

	@XStreamAlias("SUBSTITUTIONS")
	private List<ScheduleMailingSubstitution> substitutions;
	
	@XStreamAlias("SUPPRESSION_LISTS")
	private ScheduleMailingSuppressionLists suppressionLists;

    @XStreamAlias("PUBLISH_TO_SOCIALS")
    private List<AuthorizedSocialNetwork> authorizedSocialNetworks;
	
	@Override
	public Class<? extends ApiResult> getResultType() {
		return ScheduleMailingResult.class;
	}
	
	
	public void addSuppressionList(String suppressionListId) {
		if(suppressionLists == null) {
			suppressionLists = new ScheduleMailingSuppressionLists();
		}
		suppressionLists.addListId(suppressionListId);
	}


	public void addSubstitution(ScheduleMailingSubstitution substitution) {
		if(substitutions == null) {
			substitutions = new ArrayList<ScheduleMailingSubstitution>();
		}
		substitutions.add(substitution);
	}


	public Long getMailingId() {
		return mailingId;
	}


	public void setMailingId(Long mailingId) {
		this.mailingId = mailingId;
	}


	public Integer getListId() {
		return listId;
	}


	public void setListId(Integer listId) {
		this.listId = listId;
	}


	public String getMailingName() {
		return mailingName;
	}


	public void setMailingName(String mailingName) {
		this.mailingName = mailingName;
	}


	public Boolean getSendHTML() {
		return sendHTML == null ? false : sendHTML;
	}


	public void setSendHTML() {
		this.sendHTML = Boolean.TRUE;
	}


	public Boolean getSendAOL() {
		return sendAOL == null ? false : sendAOL;
	}


	public void setSendAOL() {
		this.sendAOL = Boolean.TRUE;
	}


	public Boolean getSendText() {
		return sendText == null ? false : sendText;
	}


	public void setSendText() {
		this.sendText = Boolean.TRUE;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getFromName() {
		return fromName;
	}


	public void setFromName(String fromName) {
		this.fromName = fromName;
	}


	public String getFromAddress() {
		return fromAddress;
	}


	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}


	public String getReplyTo() {
		return replyTo;
	}


	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}


	public Integer getVisibility() {
		return visibility;
	}


	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}


    public String getParentFolderPath() {
        return parentFolderPath;
    }

    public void setParentFolderPath(String parentFolderPath) {
        this.parentFolderPath = parentFolderPath;
    }

    public Boolean getCreateParentFolder() {
        return createParentFolder;
    }

    public void setCreateParentFolder(Boolean createParentFolder) {
        this.createParentFolder = createParentFolder;
    }

    public Date getSchedule() {
		return schedule;
	}


	public void setSchedule(Date schedule) {
		this.schedule = schedule;
	}

    public Boolean getIsScheduledInGMT() {
        return isGmt;
    }


    public void setIsScheduledInGMT(Boolean isGmt) {
        this.isGmt = isGmt;
    }

	public Boolean getUseMonitoring() {
		return useMonitoring;
	}


	public void setUseMonitoring(Boolean useMonitoring) {
		this.useMonitoring = useMonitoring;
	}


	public List<ScheduleMailingSubstitution> getSubstitutions() {
		return substitutions;
	}


	public void setSubstitutions(List<ScheduleMailingSubstitution> substitutions) {
		this.substitutions = substitutions;
	}


	public ScheduleMailingSuppressionLists getSuppressionLists() {
		return suppressionLists;
	}


	public void setSuppressionLists(ScheduleMailingSuppressionLists suppressionLists) {
		this.suppressionLists = suppressionLists;
	}


    public List<AuthorizedSocialNetwork> getAuthorizedSocialNetworks(){
        return  authorizedSocialNetworks;
    }

    public void setAuthorizedSocialNetworks(List<AuthorizedSocialNetwork> authorizedSocialNetworks){
         this.authorizedSocialNetworks = authorizedSocialNetworks;
    }
}
