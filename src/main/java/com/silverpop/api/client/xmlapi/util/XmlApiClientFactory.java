package com.silverpop.api.client.xmlapi.util;

import com.silverpop.api.client.xmlapi.XmlApiClient;
import com.silverpop.api.client.xmlapi.XmlApiSession;

public class XmlApiClientFactory {

    public XmlApiClient createClient(String url) {
        return new XmlApiClient(url);
    }

    public XmlApiClient createClient(XmlApiSession session) {
        return new XmlApiClient(session);
    }
}
