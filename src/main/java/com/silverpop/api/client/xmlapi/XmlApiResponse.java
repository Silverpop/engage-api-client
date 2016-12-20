package com.silverpop.api.client.xmlapi;

import java.io.StringReader;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import com.silverpop.api.client.ApiErrorResult;
import com.silverpop.api.client.ApiException;
import com.silverpop.api.client.ApiResponse;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.xmlapi.response.XmlApiResponseEnvelope;
import com.silverpop.api.client.xmlapi.util.XStreamFactory;
import com.silverpop.api.client.xmlapi.util.XmlApiReflectionProvider;

import com.thoughtworks.xstream.XStream;

public class XmlApiResponse implements ApiResponse {


//    private Reader reader;
	private XPath xPath;
//	private Document xml;
	private Class<? extends ApiResult> resultType;
	private XStreamFactory xStreamFactory;
	private String responseText;

	public XmlApiResponse(String responseText, Class<? extends ApiResult> resultType) {
		this(responseText, resultType, new XStreamFactory(resultType));
	}

	XmlApiResponse(String responseText, Class<? extends ApiResult> resultType, XStreamFactory xStreamFactory) {
		this.xPath = XPathFactory.newInstance().newXPath();
//		this.xml = xml;
		this.resultType = resultType;
		this.xStreamFactory = xStreamFactory;
		this.responseText = responseText;
	}
	
	@Override
	public boolean isSuccessful() {
        return responseText.contains("<SUCCESS>true</SUCCESS>") || responseText.contains("<SUCCESS>TRUE</SUCCESS>") || responseText.contains("<SUCCESS>SUCCESS</SUCCESS>");
			//<SUCCESS>SUCCESS</SUCCESS> is for OptOutRecipient returning success instead of true or false.


//        return responseText.contains("<SUCCESS>true</SUCCESS>");
	}

	@Override
	public ApiResult buildResult() {
		if(isSuccessful()) {
			XmlApiResponseEnvelope envelope = processRequest(resultType);
			return envelope.getBody().getResult();
		} else {
			throw new ApiException("The response was unsuccessful.  Call buildErrorResult() to get details.");
		}
	}

	@Override
	public ApiErrorResult buildErrorResult() {
		if(isSuccessful()) {
			throw new ApiException("There is no error associated with this response.  Call buildResult() to get the result.");
		} else {
			XmlApiResponseEnvelope envelope = processRequest(XmlApiErrorResult.class);
			XmlApiErrorResult result = envelope.getBody().getFault();
			result.setResponseText(responseText);
			
			return result;
		}
	}

	private XmlApiResponseEnvelope processRequest(Class<? extends ApiResult> resultClass) {
		XStream xStream = prepareXStream(resultClass);
		return (XmlApiResponseEnvelope) xStream.fromXML(new StringReader(responseText));
	}

	private XStream prepareXStream(Class<? extends ApiResult> resultClass) {
		XmlApiReflectionProvider reflectionProvider = new XmlApiReflectionProvider(resultClass);
		XStream xStream = xStreamFactory.createXStream(reflectionProvider);
		
		xStream.processAnnotations(XmlApiResponseEnvelope.class);		
		xStream.addDefaultImplementation(resultClass, ApiResponse.class);
		xStream.processAnnotations(resultClass);

		return xStream;
	}
	
//	private String getDocumentAsString() {
//		try {
//			Transformer transformer = TransformerFactory.newInstance().newTransformer();
//			StreamResult result = new StreamResult(new StringWriter());
//			DOMSource source = new DOMSource(xml);
//			transformer.transform(source, result);
//			return result.getWriter().toString();
//		} catch(TransformerException e) {
//			throw new ApiException("Unable to convert Document to String", e);
//		}
//	}
}