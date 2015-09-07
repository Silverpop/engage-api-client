/**
 * This file Copyright (c) 2015 Magnolia International
 * Ltd.  (http://www.magnolia-cms.com). All rights reserved.
 *
 *
 * This program and the accompanying materials are made
 * available under the terms of the Magnolia Network Agreement
 * which accompanies this distribution, and is available at
 * http://www.magnolia-cms.com/mna.html
 *
 * Any modifications to this file must keep this entire header
 * intact.
 *
 */
package com.silverpop.api.client.command;

import java.util.Collection;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.Column;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * {@link com.silverpop.api.client.ApiCommand} to retrieve metadata of a Silverpop database.
 */
@XmlApiProperties("GetListMetaData")
public class GetListMetaDataCommand implements ApiCommand {

    @XStreamAlias("LIST_ID")
    private Integer listId;

    @XStreamAlias("COLUMNS")
    private Collection<Column> columns;

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

    public Collection<Column> getColumns() {
        return columns;
    }

    public void setColumns(Collection<Column> columns) {
        this.columns = columns;
    }
}
