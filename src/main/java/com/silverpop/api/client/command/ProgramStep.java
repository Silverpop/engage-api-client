package com.silverpop.api.client.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class ProgramStep {

	@XStreamAlias("NAME")
	private String stepName;

	@XStreamAlias("ID")
	private String stepId;

	public String getStepName() {
		return stepName;
	}

	public String getTrackId() {
		return stepId;
	}

}
