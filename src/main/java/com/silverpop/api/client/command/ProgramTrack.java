package com.silverpop.api.client.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class ProgramTrack {
	
	@XStreamAlias("NAME")
	private String trackName;

	@XStreamAlias("ID")
	private String trackId;

	public String getTrackName() {
		return trackName;
	}

	public String getTrackId() {
		return trackId;
	}

	
}
