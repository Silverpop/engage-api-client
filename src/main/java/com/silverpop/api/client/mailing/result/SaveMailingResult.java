package com.silverpop.api.client.mailing.result;

import com.silverpop.api.client.ApiResult;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class SaveMailingResult implements ApiResult {

	@XStreamAlias("MailingID")
	private String mailingId;

	public String getMailingId() {
		return mailingId;
	}

	public void setMailingId(String mailingId) {
		this.mailingId = mailingId;
	}
}
