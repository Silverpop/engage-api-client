package com.silverpop.api.client.mapper.wrapper;

import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class ApiMapperWrapper extends MapperWrapper {

	public ApiMapperWrapper(Mapper wrapped) {
		super(wrapped);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public boolean shouldSerializeMember(Class definedIn, String fieldName) {
		if (definedIn == Object.class) {
			return false;
		}
		return super.shouldSerializeMember(definedIn, fieldName);
	}
}