package com.silverpop.api.client.result;

import java.util.ArrayList;
import java.util.List;

import com.silverpop.api.client.result.elements.GetContactScoresModelScoreComponent;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.result.elements.GetContactScoresModel;

public class GetContactScoresResult implements ApiResult {

    @XStreamAlias("MODELS")
    private List<GetContactScoresModel> models = new ArrayList<GetContactScoresModel>();

    public List<GetContactScoresModel> getModels() {
        return models;
    }

    public void setModels(List<GetContactScoresModel> models) {
        this.models = models;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (GetContactScoresModel model : models) {
            stringBuffer.append(model + "\n");
        }
        return stringBuffer.toString();
    }
}
