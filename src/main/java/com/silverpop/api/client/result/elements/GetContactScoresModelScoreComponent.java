package com.silverpop.api.client.result.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("SCORE_COMPONENT")
public class GetContactScoresModelScoreComponent {
	
	@XStreamAlias("KEY")
	private String key;
	
	@XStreamAlias("VALUE")
	private Integer value;
	
	public String getKey(){
		return key;
	}
	
	public Integer getValue(){
		return value;
	}

}
