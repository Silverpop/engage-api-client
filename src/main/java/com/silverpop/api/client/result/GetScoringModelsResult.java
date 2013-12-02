package com.silverpop.api.client.result;

import java.util.List;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.result.elements.GetScoringModelsModel;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class GetScoringModelsResult implements ApiResult {
	
	@XStreamAlias("MODELS")
	private List<GetScoringModelsModel> models;

	public List<GetScoringModelsModel> getModels() {
		return models;
	}
	
	
}
