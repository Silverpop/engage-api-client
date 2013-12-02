package com.silverpop.api.client.result;

import java.util.Collection;
import java.util.Set;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.result.elements.GetListsList;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class GetListsResult implements ApiResult {
	
	@XStreamImplicit(itemFieldName="LIST")
	private Set<GetListsList> lists;

	
	public Collection<GetListsList> getLists() {
		return lists;
	}

	public void setLists(Set<GetListsList> lists) {
		this.lists = lists;
	}
}
