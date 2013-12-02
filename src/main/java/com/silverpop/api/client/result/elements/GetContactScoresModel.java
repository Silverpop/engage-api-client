package com.silverpop.api.client.result.elements;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("MODEL")
public class GetContactScoresModel {
	
	@XStreamAlias("ID")
	private Integer id;
	
	@XStreamAlias("NAME")
	private String name;
	
	@XStreamAlias("SCORE_COMPONENETS")
	private List<GetContactScoresModelScoreComponent> scoreComponents;
	
	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public List<GetContactScoresModelScoreComponent> getScoreComponents() {
		return scoreComponents;
	}
}
