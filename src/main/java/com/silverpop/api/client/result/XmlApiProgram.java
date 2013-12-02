package com.silverpop.api.client.result;

import com.silverpop.api.client.command.ProgramStep;
import com.silverpop.api.client.command.ProgramTrack;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("PROGRAM")
public class XmlApiProgram {
	@XStreamAlias("NAME")
	String programName;
	
	@XStreamAlias("ID")
	String programId;
	
	@XStreamAlias("TRACK")
	ProgramTrack track;
	
	@XStreamAlias("STEP")
	ProgramStep step;

	public String getProgramName() {
		return programName;
	}
	
	public String getProgramId() {
		return programId;
	}
	
	public String getTrackName() {
		return track.getTrackName();
	}
	
	public String getStepName() {
		return step.getStepName();
	}

}
