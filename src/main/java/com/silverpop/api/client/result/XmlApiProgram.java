package com.silverpop.api.client.result;

import com.silverpop.api.client.command.ProgramStep;
import com.silverpop.api.client.command.ProgramTrack;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("PROGRAM")
public class XmlApiProgram {
	@XStreamAlias("NAME")
	private String programName;
	
	@XStreamAlias("ID")
	private String programId;
	
	@XStreamAlias("TRACK")
	private ProgramTrack track;
	
	@XStreamAlias("STEP")
	private ProgramStep step;

	@XStreamAlias("LIST_ID")
	private Long listId;

	@XStreamAlias("NOTES")
	private String notes;

	@XStreamAlias("STATE")
	private String state;

	@XStreamAlias("TIME_ZONE")
	private String timeZone;

	@XStreamAlias("CREATED")
	private String createdTs;

	@XStreamAlias("LAST_MODIFIED")
	private String lastModifiedTs;

	@XStreamAlias("STAT_DATE")
	private String startDate;

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

	public Long getListId() {
		return listId;
	}

	public String getNotes() {
		return notes;
	}

	public String getState() {
		return state;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public String getCreatedTs() {
		return createdTs;
	}

	public String getLastModifiedTs() {
		return lastModifiedTs;
	}

	public String getStartDate() {
		return startDate;
	}
}
