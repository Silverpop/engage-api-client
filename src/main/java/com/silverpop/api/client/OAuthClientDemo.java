package com.silverpop.api.client;

import com.silverpop.api.client.authentication.oauth.OauthClient;
import com.silverpop.api.client.authentication.oauth.OauthSession;
import com.silverpop.api.client.command.GetListsCommand;
import com.silverpop.api.client.result.GetListsResult;
import com.silverpop.api.client.result.elements.ListElementType;
import com.silverpop.api.client.xmlapi.XmlApiClient;
import com.silverpop.api.client.xmlapi.util.XmlApiClientFactory;

import java.util.Collection;

public class OAuthClientDemo {

    public static void main(String[] args) throws Exception {
        System.out.println("IBM Marketing Cloud API OAuth Client Demo");
        if (args.length != 4) {
            System.out.println("Usage: url clientId clientSecret refresh");
        }

        XmlApiClient apiClient = new XmlApiClient(new OauthSession(new XmlApiClientFactory(), args[0], args[1], args[2], args[3]));

        GetListsResult result = (GetListsResult)apiClient.executeCommand(new GetListsCommand());

        Collection<ListElementType> lists = result.getLists();
        for (ListElementType list : lists) {
            System.out.println(list.getNAME());
        }
    }
}
