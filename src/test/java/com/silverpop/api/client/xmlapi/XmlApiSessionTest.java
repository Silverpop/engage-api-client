package com.silverpop.api.client.xmlapi;

import com.silverpop.api.client.command.LoginCommand;
import com.silverpop.api.client.result.LoginResult;
import com.silverpop.api.client.xmlapi.util.XmlApiClientFactory;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

public class XmlApiSessionTest {

    @Test
    public void testGetUrlShouldAppendTheSessionIdToTheUrl() throws Exception {
        String url = "url";
        LoginCommand loginCommand = new LoginCommand();
        XmlApiClientFactory clientFactory = mock(XmlApiClientFactory.class);

        XmlApiClient client = mock(XmlApiClient.class);
        when(clientFactory.createClient(url)).thenReturn(client);

        LoginResult loginResult = mock(LoginResult.class);
        when(client.executeCommand(loginCommand)).thenReturn(loginResult);

        String sessionId = "some session id";
        when(loginResult.getSessionId()).thenReturn(sessionId);

        XmlApiSession xmlApiSession = new XmlApiSession(url, loginCommand, clientFactory);
        xmlApiSession.open();
        String actualUrl = xmlApiSession.getUrl();
        assertEquals(actualUrl, url + ";jsessionid=" + sessionId);
    }
}