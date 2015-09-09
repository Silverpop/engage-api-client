package com.silverpop.api.client.mailing.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("SUBSTITUTION")
public class ScheduleMailingSubstitution {

	@XStreamAlias("NAME")
	private String name;
	
	@XStreamAlias("VALUE")
	private String value;

    public ScheduleMailingSubstitution() {

    }

    public ScheduleMailingSubstitution(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
