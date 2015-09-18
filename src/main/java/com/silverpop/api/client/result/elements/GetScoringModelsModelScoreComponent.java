package com.silverpop.api.client.result.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("SCORE_COMPONENT_TYPE")
public class GetScoringModelsModelScoreComponent {

	
	@XStreamAlias("KEY")
	private String key;

	@XStreamAlias("DESCRIPTION")
	private String description;

    @XStreamAlias("VALUES")
    private GetScoringModelsModelScoreComponentValues values;

	public String getKey() {
		return key;
	}

	public String getDescription() {
		return description;
	}

	public GetScoringModelsModelScoreComponentValues getValues() {
		return values;
	}
}
