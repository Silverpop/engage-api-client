package com.silverpop.api.client.mailing.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class SaveMailingMessageBodies {

	@XStreamAlias("HTMLBody")
	private String htmlBody;

	@XStreamAlias("TextBody")
	private String textBody;

	@XStreamAlias("AOLBody")
	private String aolBody;

	public String getHtmlBody() {
		return htmlBody;
	}

	public void setHtmlBody(String htmlBody) {
		this.htmlBody = htmlBody;
	}

	public void setTextBody(String textBody) {
		this.textBody = textBody;
	}

	public void setAolBody(String aolBody) {
		this.aolBody = aolBody;
	}
}
