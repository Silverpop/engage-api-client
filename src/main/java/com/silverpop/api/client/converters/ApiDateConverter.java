package com.silverpop.api.client.converters;

import com.thoughtworks.xstream.converters.basic.DateConverter;

public class ApiDateConverter extends DateConverter {
	public static final String DEFAULT_FORMAT = "MM/dd/yy hh:mm a";
	public static final String[] ACCEPTABLE_FORMATS = {
            "yyyy-MM-dd HH:mm:ss.SSS"
    };

	public ApiDateConverter() {
		super(DEFAULT_FORMAT, ACCEPTABLE_FORMATS);
	}

    public Object fromString(String str) {
        if (str != null && str.equals("Never"))
            return null;
        return super.fromString(str);
    }
}