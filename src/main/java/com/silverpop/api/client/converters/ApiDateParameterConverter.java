package com.silverpop.api.client.converters;


import com.thoughtworks.xstream.converters.basic.DateConverter;


public class ApiDateParameterConverter extends DateConverter {
	public static final String DEFAULT_FORMAT = "MM/dd/yyyy hh:mm:ss a";
	public static final String[] ACCEPTABLE_FORMATS = {	};

	public ApiDateParameterConverter() {
		super(DEFAULT_FORMAT, ACCEPTABLE_FORMATS);
	}
}