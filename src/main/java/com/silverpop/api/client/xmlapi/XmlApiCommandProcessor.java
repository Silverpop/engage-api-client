package com.silverpop.api.client.xmlapi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.silverpop.api.client.AbstractApiCommandProcessor;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResponse;
import com.silverpop.api.client.ApiResult;

public class XmlApiCommandProcessor extends AbstractApiCommandProcessor<XmlApiRequest> {

	private Log log = LogFactory.getLog(this.getClass());


	@Override
	public XmlApiRequest prepareRequest(ApiCommand command) {
		return new XmlApiRequest(command, null);
	}

	@Override
	public ApiResponse processResponse(String response, Class<? extends ApiResult> resultClass) {
		log.info(response);
		return new XmlApiResponse(response, resultClass);
	}


}
