package com.silverpop.api.client.mailing.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ClickThrough")
public class SaveMailingClickThrough {

	@XStreamAlias("ClickThroughName")
	private String clickThroughName;
	
	@XStreamAlias("ClickThroughType")
	private Integer clickThroughType;

	@XStreamAlias("ClickThroughURL")
	private String clickThroughUrl;


	public SaveMailingClickThrough(String clickThroughName, Integer clickThroughType, String clickThroughUrl) {
		this.clickThroughName = clickThroughName;
		this.clickThroughType = clickThroughType;
		this.clickThroughUrl = clickThroughUrl;
	}

	public String getClickThroughName() {
		return clickThroughName;
	}

	public void setClickThroughName(String clickThroughName) {
		this.clickThroughName = clickThroughName;
	}

	public Integer getClickThroughType() {
		return clickThroughType;
	}

	public void setClickThroughType(Integer clickThroughType) {
		this.clickThroughType = clickThroughType;
	}

	public String getClickThroughUrl() {
		return clickThroughUrl;
	}

	public void setClickThroughUrl(String clickThroughUrl) {
		this.clickThroughUrl = clickThroughUrl;
	}
}
