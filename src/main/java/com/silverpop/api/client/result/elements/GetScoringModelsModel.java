package com.silverpop.api.client.result.elements;

import java.util.Date;
import java.util.List;

import com.silverpop.api.client.converters.ApiDateConverter;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

@XStreamAlias("MODEL")
public class GetScoringModelsModel {

    @XStreamAlias("ID")
    private Integer id;

    @XStreamAlias("NAME")
    private String name;

    @XStreamAlias("DESCRIPTION")
    private String description;

    @XStreamAlias("CREATED")
    @XStreamConverter(ApiDateConverter.class)
    private Date created;

    @XStreamAlias("LAST_MODIFIED")
    @XStreamConverter(ApiDateConverter.class)
    private Date lastModified;

    @XStreamAlias("SCORE_COMPONENT_TYPES")
    private List<GetScoringModelsModelScoreComponent> scoreComponents;

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

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setCreated(Date created){
        this.created = created;
    }

    public Date getCreated(){
        return created;
    }

    public void setLastModified(Date lastModified){
        this.lastModified = lastModified;
    }

    public Date getLastModified(){
        return lastModified;
    }

    public List<GetScoringModelsModelScoreComponent> getScoreComponents() {
        return scoreComponents;
    }
}
