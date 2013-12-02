package com.silverpop.api.client.mailing.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("SUBSTITUTION")
public class ScheduleMailingSubstitution {

	@XStreamAlias("NAME")
	private String name;
	
	@XStreamAlias("VALUE")
	private String value;
}
