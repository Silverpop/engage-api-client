package com.silverpop.api.client.result;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import com.silverpop.api.client.ApiResult;

public class GetProgramsByContactResult implements ApiResult {
	
	@XStreamAlias("PROGRAMS")
	private ArrayList<XmlApiProgram> xmlApiProgramCollection;
	
	public ArrayList<XmlApiProgram> getPrograms() {
		return xmlApiProgramCollection;
	}
	
	public List<String> getProgramNames() {
		List<String> programNames = new ArrayList<String>();
		for(XmlApiProgram program : xmlApiProgramCollection) {
			programNames.add(program.getProgramName());
		}
		return programNames;
	}
	
	public List<String> getProgramIds() {
		List<String> programIds = new ArrayList<String>();
		for(XmlApiProgram program : xmlApiProgramCollection) {
			programIds.add(program.getProgramId());
		}
		return programIds;
	}
	
	public List<String> getProgramTracks() {
		List<String> programTracks = new ArrayList<String>();
		for(XmlApiProgram program : xmlApiProgramCollection) {
			if(program.getTrackName() != null && !program.getTrackName().isEmpty()) {
				String programTrack = program.getTrackName();
				programTracks.add(programTrack);				
			}
		}
		return programTracks;
	}
	
	public List<String> getProgramSteps() {
		List<String> programSteps = new ArrayList<String>();
		for(XmlApiProgram program : xmlApiProgramCollection) {
			if (program.getStepName() != null && !program.getStepName().isEmpty()) {
				String programStep = program.getStepName();
				programSteps.add(programStep);
			}
		}
		return programSteps;
	}


}
