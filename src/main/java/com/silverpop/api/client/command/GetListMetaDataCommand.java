package com.silverpop.api.client.command;

import java.util.Collection;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.GetListMetaDataResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * {@link com.silverpop.api.client.ApiCommand} to retrieve metadata of a Silverpop database.
 */
@XmlApiProperties("GetListMetaData")
public class GetListMetaDataCommand implements ApiCommand {

    @XStreamAlias("LIST_ID")
    private Integer listId;

    @XStreamAlias("COLUMNS")
    private Collection<GetListMetaDataResult.GetListMetaDataColumn> columns;

    @Override
    public Class<GetListMetaDataResult> getResultType() {
        return GetListMetaDataResult.class;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public Collection<GetListMetaDataResult.GetListMetaDataColumn> getColumns() {
        return columns;
    }

    public void setColumns(Collection<GetListMetaDataResult.GetListMetaDataColumn> columns) {
        this.columns = columns;
    }
}
