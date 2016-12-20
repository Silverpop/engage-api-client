package com.silverpop.api.client.command.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 */
@XStreamAlias("COLUMN")
public class ColumnElementType {

    @XStreamAlias("NAME")
    protected String name;

    @XStreamAlias("VALUE")
    protected String value;

    @XStreamAlias("DEFAULT_VALUE")
    protected String defaultValue;

    @XStreamAlias("TYPE")
    protected int type;

    @XStreamAlias("SELECTION_VALUES")
    protected SelectionValuesElementType SelectionValues;

    public ColumnElementType()
    {
        this.SelectionValues = new SelectionValuesElementType();
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public SelectionValuesElementType getSelectionValues() {
        return SelectionValues;
    }

    public void setSelectionValues(SelectionValuesElementType selectionValues) {
        SelectionValues = selectionValues;
    }
}