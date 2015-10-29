package com.silverpop.api.client;

public interface ApiClientFactory {

    public ApiClient createClient(ApiSession session);
}
