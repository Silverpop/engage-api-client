package com.silverpop.api.client.result.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("PARAMETERS")
public class GetJobStatusParameter {

    @XStreamAlias("NAME")
    private String name;

    @XStreamAlias("VALUE")
    private String value;

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
