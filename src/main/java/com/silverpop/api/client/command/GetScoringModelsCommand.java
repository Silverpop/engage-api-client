package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.GetScoringModelsResult;

@XmlApiProperties("GetScoringModels")
public class GetScoringModelsCommand implements ApiCommand {
	@Override
	public Class<? extends ApiResult> getResultType() {
		return GetScoringModelsResult.class;
	}
}
