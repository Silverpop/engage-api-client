package com.silverpop.api.client.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.GetContactScoresResult;

@XmlApiProperties("GetContactScores")
public class GetContactScoresCommand implements ApiCommand {
	
	@XStreamAlias("CONTACT_ID")
	private Integer contactId;

	@Override
	public Class<? extends ApiResult> getResultType() {
		return GetContactScoresResult.class;
	}
	
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	
	public Integer getContactId() {
		return contactId;
	}
}
