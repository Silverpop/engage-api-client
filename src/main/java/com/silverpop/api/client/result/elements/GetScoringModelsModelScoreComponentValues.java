package com.silverpop.api.client.result.elements;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("VALUES")
public class GetScoringModelsModelScoreComponentValues {

	@XStreamImplicit(itemFieldName="VALUE")
	public List<String> values;

	public String get(int index) {
		return values.get(index);
	}
}
