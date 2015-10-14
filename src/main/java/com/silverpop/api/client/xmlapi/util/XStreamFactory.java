package com.silverpop.api.client.xmlapi.util;

import java.io.Writer;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.mapper.wrapper.ApiMapperWrapper;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.thoughtworks.xstream.mapper.MapperWrapper;

public class XStreamFactory {

    private final Class<? extends ApiResult> apiResponseType;

    @Deprecated
    public XStreamFactory() {
        this(null);
    }

    public XStreamFactory(Class<? extends ApiResult> apiResponseType) {
        this.apiResponseType = apiResponseType;
    }

    public XStream createXStream() {
		return new XStream(
			new XppDriver() {
				@Override
				public HierarchicalStreamWriter createWriter(Writer out) {
                    return new XmlApiPrintWriter(out, new XmlFriendlyNameCoder("__", "_"));
				}
			});
	}



	public XStream createXStream(ReflectionProvider reflectionProvider) {
        return new XStream(reflectionProvider, new DomDriver("UTF-8", new XmlFriendlyNameCoder("__","_"))) {
			@Override
			protected MapperWrapper wrapMapper(MapperWrapper next) {
                return new ApiMapperWrapper(next, apiResponseType);
			}
		};
	}
}
