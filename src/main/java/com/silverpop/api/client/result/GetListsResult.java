package com.silverpop.api.client.result;

import java.util.List;
import com.silverpop.api.client.ApiResult;

import com.silverpop.api.client.result.elements.ListElementType;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class GetListsResult implements ApiResult {
	
	@XStreamImplicit(itemFieldName="LIST")
	private List<ListElementType> lists;

	
	public List<ListElementType> getLists() {
		return lists;
	}

	public void setLists(List<ListElementType> lists) {
		this.lists = lists;
	}
}
