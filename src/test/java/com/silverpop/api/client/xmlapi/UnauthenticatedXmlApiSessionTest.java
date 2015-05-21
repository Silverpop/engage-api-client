package com.silverpop.api.client.xmlapi;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.silverpop.api.client.ApiResultException;

import static org.testng.Assert.*;

public class UnauthenticatedXmlApiSessionTest {
	
	public static final String URL = "http://some.api.url";
	
	private UnauthenticatedXmlApiSession session;

	@BeforeMethod
	public void setUp() throws ApiResultException {
		session = new UnauthenticatedXmlApiSession(URL);;
	}
	
	@Test
	public void isOpenAlwaysReturnsTrue() throws ApiResultException {
		assertTrue(session.isOpen());

		session.open();
		assertTrue(session.isOpen());

		session.close();
		assertTrue(session.isOpen());
	}
	
	@Test
	public void openDoesNotChangeState() throws ApiResultException {
		assertEquals(session.getSessionId(), "");
		assertEquals(session.getOrganizationId(), "");
		assertEquals(session.getSessionEncoding(), "");

		session.open();
		
		assertEquals(session.getSessionId(), "");
		assertEquals(session.getOrganizationId(), "");
		assertEquals(session.getSessionEncoding(), "");
	}
	
	@Test
	public void isReAuthenticateReturnsFalse() {
		assertFalse(session.isReAuthenticate());
	}

    @Test
    public void getUrlTakesValueFromConstructorWhenOpenOrClosed() {
        assertEquals(session.getUrl(), URL);

        session.open();
        assertEquals(session.getUrl(), URL);

        session.close();
        assertEquals(session.getUrl(), URL);
    }
}
