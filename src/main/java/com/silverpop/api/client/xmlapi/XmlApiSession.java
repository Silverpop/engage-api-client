package com.silverpop.api.client.xmlapi;

import java.util.Map;

import com.silverpop.api.client.ApiResultException;
import com.silverpop.api.client.authentication.AuthenticatedSession;
import com.silverpop.api.client.command.LoginCommand;
import com.silverpop.api.client.result.LoginResult;
import com.silverpop.api.client.xmlapi.util.XmlApiClientFactory;

/**
 * @deprecated Use {@link com.silverpop.api.client.authentication.oauth.OauthSession} instead.
 */
@Deprecated
public class XmlApiSession extends AuthenticatedSession<LoginResult> {

    private String sessionId;
    private String sessionEncoding;
    private String organizationId;


    /**
     * @deprecated It is no longer necessary to pass a client in the constructor.
     *             Please use XmlApiSession(String url, LoginCommand loginCommand) instead.
     *             This constructor will be removed in a future release.
     */
    @Deprecated
    public XmlApiSession(String url, LoginCommand loginCommand, XmlApiClient loginClient) {
        this(url, loginCommand);
    }

    /**
     * @deprecated It is no longer necessary to pass a client in the constructor.
     *             Please use XmlApiSession(String url, LoginCommand loginCommand) instead.
     *             If you want to disable reauthentication, call #disableReauthentication() on your session.
     *             This constructor will be removed in a future release.
     */
    @Deprecated
    public XmlApiSession(String url, LoginCommand loginCommand, XmlApiClient loginClient, boolean reauthenticate) {
        this(url, loginCommand);
        if (!reauthenticate) {
            this.disableReauthentication();
        }
    }

    public XmlApiSession(String url, LoginCommand loginCommand) {
        this(url, loginCommand, new XmlApiClientFactory());
    }

    public XmlApiSession(String url, LoginCommand loginCommand, XmlApiClientFactory clientFactory) {
        super(clientFactory, url, loginCommand);
        clearState();
    }


    public XmlApiSession(String url, String sessionId) {
        this(url, new LoginCommand());
        this.sessionId = sessionId;
    }


    private void clearState() {
        sessionId = "";
        organizationId = "";
        sessionEncoding = "";
    }

    @Override
    public String getUrl() {
        return this.isOpen() ? super.getUrl() + ";jsessionid=" + sessionId : super.getUrl();
    }

    @Override
    public void close() {
        super.close();
        clearState();
    }

    @Override
    protected LoginResult executeLogin() throws ApiResultException {
        LoginResult result = super.executeLogin();
        setSessionValues(result);
        return result;
    }

    @Override
    public Map<String, String> getDefaultHeaders() {
        return null;
    }

    private void setSessionValues(LoginResult result) {
        sessionId = result.getSessionId();
        organizationId = result.getOrganizationId();
        sessionEncoding = result.getSessionEncoding();
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public String getSessionEncoding() {
        return sessionEncoding;
    }

    public String getUserName() {
        return this.getLoginCommand() instanceof LoginCommand ? null : ((LoginCommand) this.getLoginCommand()).getUsername();
    }
}
