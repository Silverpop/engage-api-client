package com.silverpop.api.client;/*
 *
 * CONFIDENTIAL AND PROPRIETARY
 * Copyright © 2011 Silverpop Systems, Inc.  All rights reserved.
 * The contents of this material are confidential and proprietary to
 * Silverpop Systems, Inc. Unauthorized use, disclosure, or reproduction
 * is strictly prohibited.
 */

import com.silverpop.api.client.command.GetListsCommand;
import com.silverpop.api.client.result.GetListsResult;
import com.silverpop.api.client.result.elements.GetListsList;
import com.silverpop.api.client.result.elements.ListElementType;
import com.silverpop.api.client.xmlapi.XmlApiClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Collection;

public class ApiRunner {
    static  private Log log = LogFactory.getLog(ApiRunner.class);

    public ApiRunner() {
    }

    static public void main(String[] args) throws Exception {
        log.debug("Hello World");
        XmlApiClient client = new XmlApiClient(args[0],args[1],args[2]);
        log.debug("Got Client");

        GetListsCommand getListsCommand = new GetListsCommand();
        getListsCommand.setVisibility(1);
        getListsCommand.setListType(0);

        GetListsResult result = (GetListsResult)client.executeCommand(getListsCommand);
        log.debug("Got Result");

        Collection<ListElementType> lists = result.getLists();
        for (ListElementType list : lists) {
            log.debug("List name:" +list.getNAME() + " - last mod : " + list.getLASTMODIFIED());
        }
    }
}
