package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RESULT")
public class RecipientResult implements ApiResult {

	@XStreamAlias("RecipientId")
	private String recipientId;

	@XStreamAlias("SUCCESS")
	private boolean success;

	@XStreamAlias("ORGANIZATION_ID")
	private String organizationId;

	public String getRecipientId() {
		return recipientId;
	}

	public boolean getSuccess() {
		return success;
	}

	public String getOrganizationId() {
		return organizationId;
	}

}
