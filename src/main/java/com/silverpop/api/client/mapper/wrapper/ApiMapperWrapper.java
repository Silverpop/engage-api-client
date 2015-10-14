package com.silverpop.api.client.mapper.wrapper;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.result.LoginResult;
import com.silverpop.api.client.xmlapi.response.XmlApiResponseBody;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class ApiMapperWrapper extends MapperWrapper {

    private final Class<? extends ApiResult> apiResponseType;

    public ApiMapperWrapper(Mapper wrapped) {
        this(wrapped, null);
    }

    public ApiMapperWrapper(Mapper wrapped, Class<? extends ApiResult> apiResponseType) {
		super(wrapped);
        this.apiResponseType = apiResponseType;
    }

	@Override
	@SuppressWarnings("rawtypes")
	public boolean shouldSerializeMember(Class definedIn, String fieldName) {
		if (definedIn == Object.class) {
			return false;
		}
		return super.shouldSerializeMember(definedIn, fieldName);
	}

    @Override
    public Class defaultImplementationOf(Class type) {
        if(apiResponseType != null && ApiResult.class.equals(type)) {
            return apiResponseType;
        } else {
            return super.defaultImplementationOf(type);
        }
    }
}