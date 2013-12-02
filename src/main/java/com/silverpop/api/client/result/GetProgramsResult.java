package com.silverpop.api.client.result;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import com.silverpop.api.client.ApiResult;

public class GetProgramsResult implements ApiResult {
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

}
