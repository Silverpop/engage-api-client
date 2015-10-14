package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RESULT")
public class CreateContactListResult implements ApiResult {

	@XStreamAlias("CONTACT_LIST_ID")
	private long ContactListId;

	@XStreamAlias("SUCCESS")
	private boolean success;

	public long getContactListId() {
		return ContactListId;
	}

	public boolean getSuccess() {
		return success;
	}

}
