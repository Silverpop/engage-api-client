package com.silverpop.api.client.mailing.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;

//<Subject>Subject of a Mailing</Subject><TrackingLevel>4</TrackingLevel><Encoding>6</Encoding><ListID>1924132</ListID> <EditorType>1</EditorType></Header>
public class SaveMailingHeader {

	@XStreamAlias("MailingId")
	private Long mailingId;

	@XStreamAlias("MailingName")
	private String mailingName;
	
	@XStreamAlias("FromName")
	private String fromName;
	
	@XStreamAlias("FromAddress")
	private String fromAddress;
	
	@XStreamAlias("ReplyTo")
	private String replyTo;
	
	@XStreamAlias("Visibility")
	private Integer visibility;
	
	@XStreamAlias("FolderPath")
	private String folderPath;

	@XStreamAlias("DirectoryContentID")
	private String directoryContentId;
	
	@XStreamAlias("Subject")
	private String subject;
	
	@XStreamAlias("TrackingLevel")
	private Integer trackingLevel;
	
	@XStreamAlias("Encoding")
	private Integer encoding;

	@XStreamAlias("ListID")
	private Long listId;

	@XStreamAlias("EditorType")
	private Integer editorType;

	@XStreamAlias("TemplateType")
	private String templateType;

	@XStreamAlias("BackgroundColor")
	private String backgroundColor;
	
	@XStreamAlias("LinkColor")
	private String linkColor;
	
	@XStreamAlias("ALinkColor")
	private String aLinkColor;
	
	@XStreamAlias("VLinkColor")
	private String vLinkColor;
	
	@XStreamAlias("MessageAlign")
	private String messageAlignment;
	
	@XStreamAlias("ClickHereMessage")
	private Boolean includeClick;

	@XStreamAlias("AOLBackgroundColor")
	private String aolBackgroundColor;
	
	@XStreamAlias("AOLLinkColor")
	private String aolLinkColor;
	
	@XStreamAlias("AOLALinkColor")
	private String aolAlinkColor;
	
	@XStreamAlias("AOLVLinkColor")
	private String aolVlinkColor;
	
	@XStreamAlias("AOLMessageAlign")
	private String aolMessageAlign;

	@XStreamAlias("PersonalFromName")
	private String personalFromName;
	
	@XStreamAlias("PersonalFromAddress")
	private String personalFromAddress;
	
	@XStreamAlias("PersonalReplyTo")
	private String personalReplyTo;
	
	@XStreamAlias("HasContentScrape")
	private Boolean hasContentScrape;
	
	@XStreamAlias("IsCrmTemplate")
	private Boolean isCrmTemplate;
	
	@XStreamAlias("HasSpCrmBlock")
	private Boolean hasSpCrmBlock;

	public void setMailingId(Long mailingId) {
		this.mailingId = mailingId;
	}

	public void setMailingName(String mailingName) {
		this.mailingName = mailingName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}

	public void setDirectoryContentId(String directoryContentId) {
		this.directoryContentId = directoryContentId;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setTrackingLevel(Integer trackingLevel) {
		this.trackingLevel = trackingLevel;
	}

	public void setEncoding(Integer encoding) {
		this.encoding = encoding;
	}

	public void setListId(Long listId) {
		this.listId = listId;
	}

	public void setEditorType(Integer editorType) {
		this.editorType = editorType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public void setLinkColor(String linkColor) {
		this.linkColor = linkColor;
	}

	public void setAlinkColor(String aLinkColor) {
		this.aLinkColor = aLinkColor;
	}

	public void setVlinkColor(String vLinkColor) {
		this.vLinkColor = vLinkColor;
	}

	public void setMessageAlignment(String messageAlignment) {
		this.messageAlignment = messageAlignment;
	}

	public void setIncludeClick() {
		this.includeClick = Boolean.TRUE;
	}

	public void setAolBackgroundColor(String aolBackgroundColor) {
		this.aolBackgroundColor = aolBackgroundColor;
	}

	public void setAolLinkColor(String aolLinkColor) {
		this.aolLinkColor = aolLinkColor;
	}

	public void setAolAlinkColor(String aolAlinkColor) {
		this.aolAlinkColor = aolAlinkColor;
	}

	public void setAolVlinkColor(String aolVlinkColor) {
		this.aolVlinkColor = aolVlinkColor;
	}

	public void setAolMessageAlign(String aolMessageAlign) {
		this.aolMessageAlign = aolMessageAlign;
	}

	public void setPersonalFromName(String personalFromName) {
		this.personalFromName = personalFromName;
	}

	public void setPersonalFromAddress(String personalFromAddress) {
		this.personalFromAddress = personalFromAddress;
	}

	public void setPersonalReplyTo(String personalReplyTo) {
		this.personalReplyTo = personalReplyTo;
	}

	public void setHasContentScrape() {
		this.hasContentScrape = Boolean.TRUE;
	}

	public void setIsCrmTemplate() {
		this.isCrmTemplate = Boolean.TRUE;
	}

	public void setHasSpCrmBlock() {
		this.hasSpCrmBlock = Boolean.TRUE;
	}
}
