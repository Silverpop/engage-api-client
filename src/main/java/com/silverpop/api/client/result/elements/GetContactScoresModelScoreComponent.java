package com.silverpop.api.client.result.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("SCORE_COMPONENT")
public class GetContactScoresModelScoreComponent {

    @XStreamAlias("KEY")
    private String key;

    @XStreamAlias("VALUE")
    private String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }
}
