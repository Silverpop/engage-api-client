package com.silverpop.api.client.result;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.result.elements.GetContactScoresModel;

public class GetContactScoresResult implements ApiResult {
	
	@XStreamAlias("MODELS")
	private List<GetContactScoresModel> models;
	
	public List<GetContactScoresModel> getModels() {
		return models;
	}
	
}
