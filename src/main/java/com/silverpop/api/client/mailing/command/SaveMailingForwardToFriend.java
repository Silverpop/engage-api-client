package com.silverpop.api.client.mailing.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class SaveMailingForwardToFriend {
	
	@XStreamAlias("ForwardType")
	private Integer forwardType;

	public SaveMailingForwardToFriend(Integer forwardType) {
		super();
		this.forwardType = forwardType;
	}

	public Integer getForwardType() {
		return forwardType;
	}
}
