package com.silverpop.api.client.xmlapi;

import java.util.HashMap;
import java.util.Map;

import com.silverpop.api.client.ApiAnnotationUtility;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiRequest;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.ApiSession;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.EncodedApiCommand;
import com.silverpop.api.client.xmlapi.request.XmlApiRequestBody;
import com.silverpop.api.client.xmlapi.request.XmlApiRequestEnvelope;
import com.silverpop.api.client.xmlapi.util.XStreamFactory;

import com.thoughtworks.xstream.XStream;

public class XmlApiRequest implements ApiRequest {

	public static final String XML_PARAMETER = "xml";

	private ApiCommand apiCommand;
    private XStreamFactory xStreamFactory;
	private ApiAnnotationUtility<XmlApiProperties> annotationUtility;
    private String encoding;
    Map<String,String> headers = new HashMap<String, String>();

    public XmlApiRequest(ApiCommand apiCommand) {
        this(apiCommand, new XStreamFactory(apiCommand.getResultType()), new ApiAnnotationUtility<XmlApiProperties>(XmlApiProperties.class));
    }

    /**
     * @deprecated
     * It is no longer necessary to pass a {@link ApiSession} in the constructor.
     * Please use {@link #XmlApiRequest(ApiCommand apiCommand)} instead.
     * This constructor will be removed in a future release.
     */
    @Deprecated
	public XmlApiRequest(ApiCommand apiCommand, ApiSession apiSessionIsNotUsed) {
		this(apiCommand, new XStreamFactory(apiCommand.getResultType()), new ApiAnnotationUtility<XmlApiProperties>(XmlApiProperties.class));
	}

    XmlApiRequest(ApiCommand apiCommand, XStreamFactory xStreamFactory, ApiAnnotationUtility<XmlApiProperties> annotationUtility) {
        setCommandAndEncoding(apiCommand);
        this.xStreamFactory = xStreamFactory;
        this.annotationUtility = annotationUtility;
    }

	@Override
	public Map<String,String> getHeaders() {
        if (!EncodedApiCommand.NO_ENCODING.equals(encoding)) {
            headers.put("Content-Type", "application/x-www-form-urlencoded; charset=" + encoding);
        }
        return headers;
	}

    @Override
    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

	@Override
	public Class<? extends ApiResult> getResultType() {
		return apiCommand.getResultType();
	}
	
	@Override
	public Map<String, String> getParameters() {
		Map<String,String> requestParameters = new HashMap<String,String>();
		requestParameters.put(XML_PARAMETER, marshallCommand());
		
		return requestParameters;
	}

	public String marshallCommand() {
		XStream xStream = initializeXStream();
		XmlApiRequestEnvelope envelope = new XmlApiRequestEnvelope(apiCommand);
        String xml = xStream.toXML(envelope);
        if(!EncodedApiCommand.NO_ENCODING.equals(encoding)) {
            xml = String.format("<?xml version=\"1.0\" encoding=\"%s\" ?>\n%s", encoding, xml);
        }
		return xml;
	}

    private void setCommandAndEncoding(ApiCommand apiCommand) {
   		if(apiCommand instanceof EncodedApiCommand) {
   			EncodedApiCommand encodedCommand = (EncodedApiCommand) apiCommand;
   			this.apiCommand = encodedCommand.getCommand();
   			this.encoding = encodedCommand.getEncoding();
   		} else {
   			this.apiCommand = apiCommand;
   			this.encoding = EncodedApiCommand.NO_ENCODING;
   		}
   	}

	private XStream initializeXStream() {
		XStream xStream = xStreamFactory.createXStream();
		
		xStream.processAnnotations(XmlApiRequestEnvelope.class);
		
		XmlApiProperties apiProperties = annotationUtility.getApiProperties(apiCommand);
				
		xStream.aliasField(apiProperties.value(), XmlApiRequestBody.class, "apiCommand");
		xStream.processAnnotations(apiCommand.getClass());
		xStream.aliasSystemAttribute(null, "class");
		return xStream;
	}
}
