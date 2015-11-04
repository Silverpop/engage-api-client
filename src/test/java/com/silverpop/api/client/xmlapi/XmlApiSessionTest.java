package com.silverpop.api.client.xmlapi;

import org.mockito.Mock;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.silverpop.api.client.ApiErrorResult;
import com.silverpop.api.client.ApiException;
import com.silverpop.api.client.ApiResultException;
import com.silverpop.api.client.ApiSession;
import com.silverpop.api.client.command.LoginCommand;
import com.silverpop.api.client.command.LogoutCommand;
import com.silverpop.api.client.result.LoginResult;
import com.silverpop.api.client.result.LogoutResult;
import com.silverpop.api.client.xmlapi.util.XmlApiClientFactory;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.Assert.*;

public class XmlApiSessionTest {
	
	public static final String BASE_URL = "http://some.api.url";
	public static final String SESSION_ID = "[SESSION ID]";
	public static final String SESSION_ENCODING = "[SESSION ENCODING]";
	public static final String ORGANIZATION_ID = "[ORG ID]";
	
    @Mock private LoginCommand loginCommand;
	@Mock private XmlApiClient loginClient;
	@Mock private LoginResult loginResult;
    @Mock private XmlApiClient logoutClient;
    @Mock private ApiErrorResult apiErrorResult;
    @Mock private XmlApiClientFactory clientFactory;

	@BeforeMethod
	public void setUp() throws ApiResultException {
		initMocks(this);

		when(loginClient.executeCommand(loginCommand)).thenReturn(loginResult);
		when(loginResult.getSessionId()).thenReturn(SESSION_ID);
		when(loginResult.getSessionEncoding()).thenReturn(SESSION_ENCODING);
		when(loginResult.getOrganizationId()).thenReturn(ORGANIZATION_ID);
        when(clientFactory.createClient(any(ApiSession.class))).thenReturn(loginClient);
        when(logoutClient.executeCommand(any(LogoutCommand.class))).thenReturn(new LogoutResult());
	}
	
	@Test
	public void openLogsInUser() throws ApiResultException {
        XmlApiSession session = new XmlApiSession(BASE_URL, loginCommand, clientFactory);
		assertFalse(session.isOpen());

		session.open();
		
		verify(loginClient).executeCommand(loginCommand);
		assertTrue(session.isOpen());
	}
	
	@Test
	public void openPopulatesSessionObject() throws ApiResultException {
        XmlApiSession session = new XmlApiSession(BASE_URL, loginCommand, clientFactory);
		assertEquals(session.getSessionId(), "");
		assertEquals(session.getOrganizationId(), "");
		assertEquals(session.getSessionEncoding(), "");

		session.open();
		
		assertEquals(session.getSessionId(), SESSION_ID);
		assertEquals(session.getOrganizationId(), ORGANIZATION_ID);
		assertEquals(session.getSessionEncoding(), SESSION_ENCODING);
	}
	

	@Test
	public void openThrowsExceptionWhenCommandFails() throws ApiResultException {
		boolean caught = false;
        XmlApiSession session = new XmlApiSession(BASE_URL, loginCommand, clientFactory);
		when(loginClient.executeCommand(loginCommand)).thenThrow(new ApiResultException("", apiErrorResult));
		when(apiErrorResult.getMessage()).thenReturn("[ERROR MESSAGE]");

		
		try {
			session.open();
		} catch (ApiException e) {
			caught = true;
			assertEquals(e.getMessage(), "Unable to login: [ERROR MESSAGE]");
		}
		assertTrue(caught);
	}

	@Test
	public void closeMarksSessionAsNotOpen() throws ApiResultException {
        XmlApiSession session = new XmlApiSession(BASE_URL, loginCommand, clientFactory);
		
		session.open();

        when(clientFactory.createClient(session)).thenReturn(loginClient);
		session.close();
		assertFalse(session.isOpen());
	}

	@Test
	public void openOnlyExecutesIfSessionIsClosed() throws ApiResultException {
        XmlApiSession session = new XmlApiSession(BASE_URL, loginCommand, clientFactory);

		session.open();
		session.open();
		session.open();
		verify(loginClient, times(1)).executeCommand(loginCommand);

        when(clientFactory.createClient(session)).thenReturn(loginClient);
		session.close();
		session.open();
		verify(loginClient, times(2)).executeCommand(loginCommand);
	}
	
	@Test
	public void isReAuthenticateDisabledViaDisableReauthentication() {
        XmlApiSession session = new XmlApiSession(BASE_URL, loginCommand);
        assertTrue(session.isReAuthenticate());

        session.disableReauthentication();
		assertFalse(session.isReAuthenticate());
	}
	
    @Test
    public void testGetUrl() throws Exception {
        XmlApiSession session = new XmlApiSession(BASE_URL, loginCommand, clientFactory);
        when(clientFactory.createClient(session)).thenReturn(logoutClient);

        assertEquals(session.getUrl(), BASE_URL);

        session.open();
        assertEquals(session.getUrl(), BASE_URL + ";jsessionid=" + SESSION_ID);

        session.close();
        assertEquals(session.getUrl(), BASE_URL);
    }

}
