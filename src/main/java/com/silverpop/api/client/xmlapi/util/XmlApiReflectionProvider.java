package com.silverpop.api.client.xmlapi.util;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.xmlapi.response.XmlApiResponseBody;

import com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider;

public class XmlApiReflectionProvider extends PureJavaReflectionProvider {

	private Class<? extends ApiResult> apiResponseType;
	
	public XmlApiReflectionProvider(Class<? extends ApiResult> apiResponseType) {
		this.apiResponseType = apiResponseType;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class getFieldType(Object object, String fieldName, Class definedIn) {
		if(object.getClass().equals(XmlApiResponseBody.class) && "apiResult".equals(fieldName)) {
			return apiResponseType;
		} else {
			return super.getFieldType(object, fieldName, definedIn);
		}
	}
}
