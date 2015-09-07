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

import java.util.ArrayList;
import java.util.List;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.command.elements.Column;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *  {@link com.silverpop.api.client.ApiResult} describing database fields.
 */
public class GetListMetaDataResult implements ApiResult {

    @XStreamAlias("COLUMNS")
    private List<Column> columns = new ArrayList<Column>();

    @XStreamAlias("ID")
    private String id;

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
