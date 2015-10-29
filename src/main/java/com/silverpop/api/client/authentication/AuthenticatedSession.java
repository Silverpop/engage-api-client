package com.silverpop.api.client.authentication;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.silverpop.api.client.ApiClient;
import com.silverpop.api.client.ApiClientFactory;
import com.silverpop.api.client.ApiException;
import com.silverpop.api.client.ApiResultException;
import com.silverpop.api.client.ApiSession;

public abstract class AuthenticatedSession<R extends LoginResult> implements ApiSession {

    private Log log = LogFactory.getLog(this.getClass());

    private final String url;
    private final LoginCommand loginCommand;
    private final ApiClientFactory clientFactory;

    private boolean reauthenticate;
    private boolean open = false;
    private R loginResult;

    public AuthenticatedSession(ApiClientFactory clientFactory, String url, LoginCommand loginCommand) {
        this.url = url;
        this.loginCommand = loginCommand;
        this.reauthenticate = true;
        this.clientFactory = clientFactory;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean isReAuthenticate() {
        return reauthenticate;
    }

    @Override
    public boolean isOpen() {
        return open;
    }

    @Override
    public void close() {
        if (isOpen()) {
            try {
                executeLogout();
            } catch (ApiResultException e) {
                log.error("Client logout failed:", e);
            }
            open = false;
            loginResult = null;
        }
    }

    @Override
    public void open() {
        if (!isOpen()) {
            try {
                loginResult = executeLogin();
                open = true;
            } catch (ApiResultException e) {
                throw new ApiException("Unable to login: " + e.getErrorResult().getMessage());
            }
        }
    }

    public void disableReauthentication() {
        reauthenticate = false;
    }

    public abstract Map<String,String> getDefaultHeaders();

    protected R getLoginResult() {
        return loginResult;
    }

    protected LoginCommand getLoginCommand() {
        return loginCommand;
    }

    protected R executeLogin() throws ApiResultException {
        ApiClient client = clientFactory.createClient(new UnauthenticatedSession(url));
        return (R) client.executeCommand(this.getLoginCommand());
    }

    private void executeLogout() throws ApiResultException {
        ApiClient client = clientFactory.createClient(this);
        client.executeCommand(new LogoutCommand());
    }
}
