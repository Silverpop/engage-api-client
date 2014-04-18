package com.silverpop.api.client.xmlapi;

import com.silverpop.api.client.ApiException;
import com.silverpop.api.client.ApiResultException;
import com.silverpop.api.client.ApiSession;
import com.silverpop.api.client.command.LoginCommand;
import com.silverpop.api.client.command.LogoutCommand;
import com.silverpop.api.client.result.LoginResult;
import com.silverpop.api.client.xmlapi.util.XmlApiClientFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class XmlApiSession implements ApiSession {

    private Log log = LogFactory.getLog(this.getClass());

	private boolean open;
	private LoginCommand loginCommand;
	private XmlApiClientFactory clientFactory;
	private String url;

    private String sessionId;
    private String sessionEncoding;
    private String organizationId;
    private boolean reauthenticate;


    /**
     * @deprecated
     * It is no longer necessary to pass a client in the constructor.
     * Please use XmlApiSession(String url, LoginCommand loginCommand) instead.
     * This constructor will be removed in a future release.
     */
    @Deprecated
    public XmlApiSession(String url, LoginCommand loginCommand, XmlApiClient loginClient) {
        this(url, loginCommand);
    }

    /**
     * @deprecated
     * It is no longer necessary to pass a client in the constructor.
     * Please use XmlApiSession(String url, LoginCommand loginCommand) instead.
     * If you want to disable reauthentication, call #disableReauthentication() on your session.
     * This constructor will be removed in a future release.
     */
    @Deprecated
    public XmlApiSession(String url, LoginCommand loginCommand, XmlApiClient loginClient, boolean reauthenticate) {
        this(url, loginCommand);
        this.reauthenticate = reauthenticate;
    }

	public XmlApiSession(String url, LoginCommand loginCommand) {
		this(url, loginCommand, new XmlApiClientFactory());
	}

	public XmlApiSession(String url, LoginCommand loginCommand, XmlApiClientFactory clientFactory) {
		this.url = url;
		this.loginCommand = loginCommand;
		this.clientFactory = clientFactory;
        this.reauthenticate = true;
        clearState();
	}

	private void clearState() {
		sessionId = "";
		organizationId = "";
		sessionEncoding = "";
		open = false;
	}

	@Override
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
            executeLogout();
        }
        clearState();
    }

	@Override
	public void open() {
		if(!isOpen()) {
			LoginResult result = executeLogin();
			setSessionValues(result);
			open = true;
		}
	}

    private LoginResult executeLogin() {
		try {
            XmlApiClient client = clientFactory.createClient(url);
			return (LoginResult) client.executeCommand(loginCommand);
		} catch (ApiResultException e) {
			throw new ApiException("Unable to login: " + e.getErrorResult().getMessage());
		}
	}

    private void executeLogout() {
        try {
            XmlApiClient client = clientFactory.createClient(this);
            client.executeCommand(new LogoutCommand());
        } catch (ApiResultException e) {
            log.error("Client logout failed for session: " + sessionId, e);
        }
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
		return loginCommand == null ? null : loginCommand.getUsername();
	}

    public void disableReauthentication() {
        reauthenticate = false;
    }
}
