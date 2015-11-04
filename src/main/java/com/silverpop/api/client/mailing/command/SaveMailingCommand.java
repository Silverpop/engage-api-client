package com.silverpop.api.client.mailing.command;

import java.util.ArrayList;
import java.util.Collection;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.mailing.result.SaveMailingResult;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("SaveMailing")
public class SaveMailingCommand implements ApiCommand {

	@XStreamAlias("Header")
	private SaveMailingHeader header;
	
	@XStreamAlias("MessageBodies")
	private SaveMailingMessageBodies messageBodies;
	
	@XStreamAlias("ClickThroughs")
	private Collection<SaveMailingClickThrough> clickThroughs;
	
	@XStreamAlias("ForwardToFriend")
	private SaveMailingForwardToFriend forwardToFriend;
	
	
	@Override
	public Class<SaveMailingResult> getResultType() {
		return SaveMailingResult.class;
	}

	public SaveMailingHeader getHeader() {
		return header;
	}
	
	public void setHeader(SaveMailingHeader header) {
		this.header = header;
	}
	
	public SaveMailingMessageBodies getMessageBodies() {
		return messageBodies;
	}

	public void setMessageBodies(SaveMailingMessageBodies messageBodies) {
		this.messageBodies = messageBodies;
	}
	
	public void setClickThroughs(Collection<SaveMailingClickThrough> clickThroughs) {
		this.clickThroughs = clickThroughs;
	}

	public void setForwardToFriend(Integer forwardType) {
		this.forwardToFriend = new SaveMailingForwardToFriend(forwardType);
	}
}
