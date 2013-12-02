package com.silverpop.api.client.command;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class IncludeTags {

	@XStreamImplicit(itemFieldName="TAG")
	private List<String> tags;
	
	public IncludeTags () {
		tags = new ArrayList<String>();
	}
	
	public void add(String tag) {
		tags.add(tag);
	}
	
}
