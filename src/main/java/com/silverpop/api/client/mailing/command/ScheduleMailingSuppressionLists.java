package com.silverpop.api.client.mailing.command;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class ScheduleMailingSuppressionLists {

	@XStreamImplicit(itemFieldName="SUPPRESSION_LIST_ID")
	private List<String> suppressionListIds;
	
	public ScheduleMailingSuppressionLists() {
		suppressionListIds = new ArrayList<String>();
	}
	
	public void addListId(String listId) {
		suppressionListIds.add(listId);
	}
}
