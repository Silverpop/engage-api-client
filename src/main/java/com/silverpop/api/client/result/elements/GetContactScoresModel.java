package com.silverpop.api.client.result.elements;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("MODEL")
public class GetContactScoresModel {

    @XStreamAlias("ID")
    private Integer id;

    @XStreamAlias("NAME")
    private String name;

    @XStreamAlias("SCORE_COMPONENTS")
    private List<GetContactScoresModelScoreComponent> scoreComponents;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<GetContactScoresModelScoreComponent> getScoreComponents() {
        return scoreComponents;
    }

    public void setScoreComponents(List<GetContactScoresModelScoreComponent> scoreComponents) {
        this.scoreComponents = scoreComponents;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.getName() + ": ");
        for (GetContactScoresModelScoreComponent score : scoreComponents) {
            stringBuffer.append(score + ", ");
        }
        return stringBuffer.substring(0, stringBuffer.length() - 2);
    }
}
