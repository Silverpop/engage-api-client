package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.GetListsResult;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("GetLists")
public class GetListsCommand implements ApiCommand {

	@XStreamAlias("VISIBILITY")
	private Integer visibility = 1;   // Defaults to public

	@XStreamAlias("LIST_TYPE")
	private Integer listType = 0;    // Defaults to Regular lists

	@Override
	public Class<? extends ApiResult> getResultType() {
		return GetListsResult.class;
	}

	public Integer getVisibility() {
		return visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public Integer getListType() {
		return listType;
	}

	public void setListType(Integer listType) {
		this.listType = listType;
	}
}
