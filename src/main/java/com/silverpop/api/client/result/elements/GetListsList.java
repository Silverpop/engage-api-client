package com.silverpop.api.client.result.elements;

import java.util.Date;
import com.silverpop.api.client.converters.ApiDateConverter;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

@XStreamAlias("LIST")
public class GetListsList {

	@XStreamAlias("ID")
	private Integer id;

	@XStreamAlias("NAME")
	private String name;

	@XStreamAlias("TYPE")
	private Integer type;

	@XStreamAlias("SIZE")
	private Integer size;

	@XStreamAlias("NUM_OPT_OUTS")
	private Integer numberOptOuts;

	@XStreamAlias("NUM_UNDELIVERABLE")
	private Integer numberUndeliverable;

	@XStreamAlias("LAST_MODIFIED")
	@XStreamConverter(ApiDateConverter.class)
	private Date lastModified;

	@XStreamAlias("VISIBILITY")
	private Integer visibility;

	@XStreamAlias("PARENT_NAME")
	private String parentName;

	@XStreamAlias("USER_ID")
	private String userId;

	@XStreamAlias("PARENT_FOLDER_ID")
	private Integer parentFolderId;

	@XStreamAlias("IS_FOLDER")
	private Boolean isFolder;

	@XStreamAlias("FLAGGED_FOR_BACKUP")
	private Boolean flaggedForBackup;

	@XStreamAlias("SUPPRESSION_LIST_ID")
	private Integer suppressionListId;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getNumberOptOuts() {
		return numberOptOuts;
	}

	public void setNumberOptOuts(Integer numberOptOuts) {
		this.numberOptOuts = numberOptOuts;
	}

	public Integer getNumberUndeliverable() {
		return numberUndeliverable;
	}

	public void setNumberUndeliverable(Integer numberUndeliverable) {
		this.numberUndeliverable = numberUndeliverable;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Integer getVisibility() {
		return visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getParentFolderId() {
		return parentFolderId;
	}

	public void setParentFolderId(Integer parentFolderId) {
		this.parentFolderId = parentFolderId;
	}

	public Boolean getIsFolder() {
		return isFolder;
	}

	public void setIsFolder(Boolean isFolder) {
		this.isFolder = isFolder;
	}

	public Boolean getFlaggedForBackup() {
		return flaggedForBackup;
	}

	public void setFlaggedForBackup(Boolean flaggedForBackup) {
		this.flaggedForBackup = flaggedForBackup;
	}

	public Integer getSuppressionListId() {
		return suppressionListId;
	}

	public void setSuppressionListId(Integer suppressionListId) {
		this.suppressionListId = suppressionListId;
	}

}
