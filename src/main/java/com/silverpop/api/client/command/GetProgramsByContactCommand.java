package com.silverpop.api.client.command;

import java.util.List;

import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.result.GetProgramsByContactResult;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("GetProgramsByContact")
public class GetProgramsByContactCommand implements ApiCommand {

	@XStreamAlias("CONTACT_ID")
	private String contactId;
	
	@XStreamAlias("VISITOR_KEY")
	private String visitorKey;
	
	@XStreamAlias("INCLUDE_INACTIVE")
	private Boolean includeInactive;
	
	@XStreamAlias("INCLUDE_ACTIVE")
	private Boolean includeActive;
	
	@XStreamAlias("LIST_ID")
	private String listId;
	
	@XStreamAlias("CREATED_DATE_RANGE")
	private DateRange dateRange;
	
	@XStreamAlias("APPROVED_FOR_SALES")
	private Boolean approvedForSales;
	
	@XStreamAlias("INCLUDE_TAGS")
	private IncludeTags includeTags;
	
	@XStreamAlias("INCLUDE_TRACK")
	private String includeTrack;
	
	@XStreamAlias("INCLUDE_STEP")
	private String includeStep;

	@XStreamAlias("INCLUDE_HISTORY")
	private String includeHistory;


	@Override
	public Class<GetProgramsByContactResult> getResultType() {
		return GetProgramsByContactResult.class;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getVisitorKey() {
		return visitorKey;
	}

	public void setVisitorKey(String visitorKey) {
		this.visitorKey = visitorKey;
	}

	public Boolean getIncludeInactive() {
		return includeInactive;
	}

	public void setIncludeInactive(Boolean includeInactive) {
		this.includeInactive = includeInactive;
	}

	public Boolean getIncludeActive() {
		return includeActive;
	}

	public void setIncludeActive(Boolean includeActive) {
		this.includeActive = includeActive;
	}

	public String getListId() {
		return listId;
	}

	public void setListId(String listId) {
		this.listId = listId;
	}

	public DateRange getDateRange() {
		return dateRange;
	}

	public void setDateRange(DateRange dateRange) {
		this.dateRange = dateRange;
	}
	
	public void setBeginDate(String beginDate) {
		ensureDateRange();
		this.dateRange.setBeginDate(beginDate);			
	}

	private void ensureDateRange() {
		if(dateRange == null) {
			dateRange = new DateRange();
		}
	}
	
	public void setEndDate(String endDate) {
		ensureDateRange();
		this.dateRange.setEndDate(endDate);			
	}

	public Boolean getApprovedForSales() {
		return approvedForSales;
	}

	public void setSalesApproval(Boolean isApproved) {
		this.approvedForSales = isApproved;
	}

	public IncludeTags getIncludeTags() {
		return includeTags;
	}
	
	public void addIncludeTags(List<String> tags) {
		if(includeTags == null) {
			includeTags = new IncludeTags();
		}
		for(String tag : tags) {
			includeTags.add(tag);			
		}
	}

	public void setIncludeTags(IncludeTags includeTags) {
		this.includeTags = includeTags;
	}

	public void setIncludeTrack(String includeTrack) {
		this.includeTrack = includeTrack;
	}
	
	public void setIncludeStep(String includeStep) {
		this.includeStep = includeStep;
	}
	
	public void setIncludeHistory(String includeHistory) {
		this.includeHistory = includeHistory;
	}
}
