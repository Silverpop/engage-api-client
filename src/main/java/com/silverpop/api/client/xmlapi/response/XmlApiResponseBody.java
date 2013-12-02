package com.silverpop.api.client.xmlapi.response;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.xmlapi.XmlApiErrorResult;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * do not change the field names without making corresponding changes to the ApiResultReflectionProvider
 * 
 * @author msales
 *
 */
public class XmlApiResponseBody {

	@XStreamAlias("RESULT")
	private ApiResult apiResult;

	@XStreamAlias("Fault")
	private XmlApiErrorResult apiFault; 	

	public ApiResult getResult() {
		return apiResult;
	}

	public XmlApiErrorResult getFault() {
		return apiFault;
	}
}
