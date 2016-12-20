package com.silverpop.api.client.command;

import java.util.List;

import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.result.GetProgramsResult;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("GetPrograms")
public class GetProgramsCommand implements ApiCommand {

	@XStreamAlias("INCLUDE_ACTIVE")
	private Boolean includeActive;

	@XStreamAlias("INCLUDE_INACTIVE")
	private Boolean includeInactive;
	
	@XStreamAlias("LIST_ID")
	private String listId;
	
	@XStreamAlias("CREATED_DATE_RANGE")
	private DateRange dateRange;
	
	@XStreamAlias("APPROVED_FOR_SALES")
	private Boolean approvedForSales;
	
	@XStreamAlias("INCLUDE_TAGS")
	private IncludeTags includeTags;
	
	@Override
	public Class<GetProgramsResult> getResultType() {
		return GetProgramsResult.class;
	}

	public GetProgramsCommand(boolean includeActive, boolean includeInactive) {
		super();
		this.includeActive=includeActive;
		this.includeInactive=includeInactive;
	}

	public GetProgramsCommand() {
		super();
	}
	
	public void setIncludeActive(Boolean includeActive) {
		this.includeActive = includeActive;
	}

	public void setIncludeInactive(Boolean includeInactive) {
		this.includeInactive = includeInactive;
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

	public String getListId() {
		return listId;
	}
	public void setListId(String listId) {
		this.listId = listId;			
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
	
	public void setSalesApproval(Boolean isApproved) {
		this.approvedForSales = isApproved;
	}

	public DateRange getDateRange() {
		return dateRange;
	}

	public void setDateRange(DateRange dateRange) {
		this.dateRange = dateRange;
	}

	public Boolean getApprovedForSales() {
		return approvedForSales;
	}

	public void setApprovedForSales(Boolean approvedForSales) {
		this.approvedForSales = approvedForSales;
	}

	public Boolean getIncludeActive() {
		return includeActive;
	}

	public Boolean getIncludeInactive() {
		return includeInactive;
	}

	public void setIncludeTags(IncludeTags includeTags) {
		this.includeTags = includeTags;
	}
}
