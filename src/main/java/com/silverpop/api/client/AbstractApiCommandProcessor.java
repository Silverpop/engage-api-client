package com.silverpop.api.client;

import java.util.Map;

import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.methods.PostMethod;

public abstract class AbstractApiCommandProcessor<REQUEST extends ApiRequest> implements ApiCommandProcessor<REQUEST> {

    @Override
    public HttpMethodBase prepareMethod(String url, ApiRequest request) {
        PostMethod postMethod = new PostMethod(url);
        postMethod = addRequestHeaders(request.getHeaders(), postMethod);
        postMethod = addRequestParameters(request.getParameters(), postMethod);

        return postMethod;
    }

    protected PostMethod addRequestParameters(Map<String, String> parameters, PostMethod postMethod) {
        for (String parameter : parameters.keySet()) {
            postMethod.addParameter(parameter, parameters.get(parameter));
        }
        return postMethod;
    }


    protected PostMethod addRequestHeaders(Map<String, String> headers, PostMethod postMethod) {
        for (String header : headers.keySet()) {
            postMethod.addRequestHeader(header, headers.get(header));
        }
        return postMethod;
    }

}
