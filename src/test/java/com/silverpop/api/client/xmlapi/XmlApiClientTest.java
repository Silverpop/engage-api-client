package com.silverpop.api.client.xmlapi;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import java.util.Map;

import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.methods.GetMethod;
import org.junit.Test;

import com.silverpop.api.client.ApiClient;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiCommandProcessor;
import com.silverpop.api.client.ApiErrorResult;
import com.silverpop.api.client.ApiRequest;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.ApiResultException;
import com.silverpop.api.client.ApiSession;
import com.silverpop.api.client.command.LoginCommand;
import com.silverpop.api.client.command.LogoutCommand;
import com.silverpop.api.client.xmlapi.util.XmlApiClientFactory;

public class XmlApiClientTest {

    private XmlApiClient client = null;

    @Test(expected = ApiResultException.class)
    public void logoutWhenSessionIsExpired() throws ApiResultException {
        //GIVEN
        XmlApiClientFactory factory = new XmlApiClientFactory() {
            @Override
            public XmlApiClient createClient(XmlApiSession session) {
                return client;
            }
        };

        XmlApiSession session = new XmlApiSession("", new LoginCommand(), factory) {
            @Override
            public boolean isOpen() {
                return true;
            }
        };

        client = new XmlApiClient(session) {
            @Override
            protected ApiResult validateSessionAndExecuteCommand(ApiCommand command, Map<String, String> requestHeaders) throws ApiResultException {
                session.open();
                ApiErrorResult result = mock(ApiErrorResult.class);
                when(result.isSessionLost()).thenReturn(true);
                ApiResultException exception = new ApiResultException("", result);
                throw exception;
            }
        };

        LogoutCommand command = new LogoutCommand();

        //WHEN
        try {
            client.executeCommand(command);
        } catch (StackOverflowError e) {
            //THEN
            fail(e.getClass().toString() + " should not occur");
        }
    }
}
