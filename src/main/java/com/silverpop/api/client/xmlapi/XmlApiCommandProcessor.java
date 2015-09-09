package com.silverpop.api.client.xmlapi;

import java.util.Map;
import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiCommandProcessor;
import com.silverpop.api.client.ApiResponse;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.ApiSession;

public class XmlApiCommandProcessor implements ApiCommandProcessor<XmlApiRequest> {

    private Log log = LogFactory.getLog(this.getClass());

	@Override
	public XmlApiRequest prepareRequest(ApiCommand command) {
		return new XmlApiRequest(command);
	}


	@Override
	public HttpMethodBase prepareMethod(String url, XmlApiRequest request) {
		PostMethod postMethod = new PostMethod(url);
		postMethod = addRequestHeaders(request.getHeaders(), postMethod);
		postMethod = addRequestParameters(request.getParameters(), postMethod);

		return postMethod;
	}
	
	private PostMethod addRequestParameters(Map<String,String> parameters, PostMethod postMethod) {
		for(String parameter: parameters.keySet()) {
			postMethod.addParameter(parameter, parameters.get(parameter));
		}
		return postMethod;
	}
	
	
	private PostMethod addRequestHeaders(Map<String,String> headers, PostMethod postMethod) {
		for(String header: headers.keySet()) {
			postMethod.addRequestHeader(header, headers.get(header));
		}
		return postMethod;
	}

	
	
	@Override
	public ApiResponse processResponse(String response, Class<? extends ApiResult> resultClass) {
        log.info(response);
		return new XmlApiResponse(response, resultClass);
	}

	/**
	 * @deprecated The session is not needed to prepare the request. Use {@link #prepareRequest(ApiCommand)} instead.
     */
	@Override
	@Deprecated
	public XmlApiRequest prepareRequest(ApiCommand command, ApiSession session) {
		return prepareRequest(command);
	}

}
