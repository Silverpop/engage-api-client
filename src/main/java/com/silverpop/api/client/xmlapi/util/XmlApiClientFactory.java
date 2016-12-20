package com.silverpop.api.client.xmlapi.util;

import com.silverpop.api.client.ApiClient;
import com.silverpop.api.client.ApiClientFactory;
import com.silverpop.api.client.ApiSession;
import com.silverpop.api.client.xmlapi.XmlApiClient;
import com.silverpop.api.client.xmlapi.XmlApiSession;

public class XmlApiClientFactory implements ApiClientFactory {

    @Override
    public ApiClient createClient(ApiSession session) {
        return new XmlApiClient(session);
    }

    @Deprecated
    public XmlApiClient createClient(String url) {
        return new XmlApiClient(url);
    }

    @Deprecated
    public XmlApiClient createClient(XmlApiSession session) {
        return (XmlApiClient) this.createClient((ApiSession)session);
    }
}
