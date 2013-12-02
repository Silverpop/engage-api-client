package com.silverpop.api.client.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class DateRange {
	@XStreamAlias("BEGIN_DATE")
	private String beginDate;

	@XStreamAlias("END_DATE")
	private String endDate;

	public String getBeginDate() {
		return beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;			
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;			
	}

}
