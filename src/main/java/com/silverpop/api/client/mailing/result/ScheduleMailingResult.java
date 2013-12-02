package com.silverpop.api.client.mailing.result;

import com.silverpop.api.client.ApiResult;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class ScheduleMailingResult implements ApiResult {

	@XStreamAlias("MAILING_ID")
	private String mailingId;

	public String getMailingId() {
		return mailingId;
	}

	void setMailingId(String mailingId) {
		this.mailingId = mailingId;
	}
}
