package com.silverpop.api.client.mailing.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.silverpop.api.client.ApiResult;


public class AutomateMailingResult implements ApiResult {

	@XStreamAlias("MAILING_ID")
	private String mailingId;

	public String getMailingId() {
		return mailingId;
	}

	void setMailingId(String mailingId) {
		this.mailingId = mailingId;
	}
}
