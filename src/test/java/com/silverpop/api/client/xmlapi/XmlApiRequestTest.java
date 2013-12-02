package com.silverpop.api.client.xmlapi;

import static org.testng.Assert.*;

import static org.mockito.Mockito.when;

import java.util.Map;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.silverpop.api.client.ApiAnnotationUtility;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.xmlapi.XmlApiSession;
import com.silverpop.api.client.xmlapi.util.XStreamFactory;
import com.silverpop.api.client.xmlapi.XmlApiRequest;

public class XmlApiRequestTest {

	public static final String JSESSION_ID = "[JSESSIONID]";
	
	private XmlApiRequest request;
	private XStreamFactory xStreamFactory;
	private XmlApiCommandImpl apiCommand ;
	private ApiAnnotationUtility<XmlApiProperties> annotationUtility;
	@Mock XmlApiSession apiSession;
	
	@XmlApiProperties("XmlApiCommand")
	private class XmlApiCommandImpl implements com.silverpop.api.client.ApiCommand {
		@Override
		public Class<? extends ApiResult> getResultType() {
			return ApiResult.class;
		}
	}
	
	@BeforeMethod
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		xStreamFactory = new XStreamFactory();
		annotationUtility = new ApiAnnotationUtility<XmlApiProperties>(XmlApiProperties.class);
		apiCommand = new XmlApiCommandImpl();
		
		when(apiSession.getSessionId()).thenReturn(JSESSION_ID);
		
		request = new com.silverpop.api.client.xmlapi.XmlApiRequest(apiCommand, apiSession, xStreamFactory, annotationUtility);
	}
	
	@Test
	public void getHeadersReturnsEmptyMap() {
		assertEquals(request.getHeaders().size(), 0);
	}
	
	@Test
	public void getParametersReturnsTwoParametersNamedXmlAndJsessionId() {
		Map<String,String> parameters = request.getParameters();
		
		assertTrue(parameters.containsKey(XmlApiRequest.SESSION_PARAMETER));
		assertTrue(parameters.containsKey(XmlApiRequest.XML_PARAMETER));
	}
	
	@Test
	public void marshallRequestWrapsCommandInEnvelopeAndBody() {
		Map<String,String> parameters = request.getParameters();
		String xml = parameters.get(XmlApiRequest.XML_PARAMETER);
		
		assertTrue(xml.contains("<Envelope>") && xml.contains("</Envelope>"));
		assertTrue(xml.contains("<Body>") && xml.contains("</Body>"));
		assertTrue(xml.contains("<XmlApiCommand>") && xml.contains("</XmlApiCommand>"));
	}
	
	@Test
	public void jsessionIdParameterIsFromSession() {
		Map<String,String> parameters = request.getParameters();
		
		assertEquals(parameters.get(XmlApiRequest.SESSION_PARAMETER), JSESSION_ID);
	}
}
