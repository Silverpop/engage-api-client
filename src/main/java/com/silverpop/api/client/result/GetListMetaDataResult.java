package com.silverpop.api.client.result;

import java.util.ArrayList;
import java.util.List;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 *  {@link com.silverpop.api.client.ApiResult} describing database fields.
 */
public class GetListMetaDataResult implements ApiResult {

    @XStreamAlias("COLUMNS")
    private List<GetListMetaDataColumn> columns = new ArrayList<GetListMetaDataColumn>();

    @XStreamAlias("ID")
    private String id;

    public List<GetListMetaDataColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<GetListMetaDataColumn> columns) {
        this.columns = columns;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     */
    @XStreamAlias("COLUMN")
    public static class GetListMetaDataColumn {

        @XStreamAlias("NAME")
        private String name;

        @XStreamAlias("DEFAULT_VALUE")
        private String defaultValue;

        @XStreamAlias("TYPE")
        private Integer type;

        @XStreamAlias("SELECTION_VALUES")
        private GetListMetaDataColumnSelectionValues selectionValues;

        public GetListMetaDataColumn() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public GetListMetaDataColumnSelectionValues getSelectionValues() {
            return selectionValues;
        }

        public void setSelectionValues(GetListMetaDataColumnSelectionValues selectionValues) {
            this.selectionValues = selectionValues;
        }
    }

    /**
     */
    @XStreamAlias("SELECTION_VALUES")
    public static class GetListMetaDataColumnSelectionValues {


        @XStreamImplicit(itemFieldName="VALUE")
        public List<String> values;

        public String get(int index) {
            return values.get(index);
        }

        public List<String> getValues() {
            return values;
        }

        public void setValues(List<String> values) {
            this.values = values;
        }
    }
}
