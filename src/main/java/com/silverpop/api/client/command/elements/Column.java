package com.silverpop.api.client.command.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 */
@XStreamAlias("COLUMN")
public class Column {

    @XStreamAlias("NAME")
    private String name;

    @XStreamAlias("VALUE")
    private String value;

    @XStreamAlias("DEFAULT_VALUE")
    private String defaultValue;

    @XStreamAlias("TYPE")
    private Integer type;

    public Column() {
    	
    }
    
    public Column(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
