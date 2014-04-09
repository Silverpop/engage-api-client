package com.silverpop.api.client.xmlapi;

import com.silverpop.api.client.ApiException;
import com.silverpop.api.client.ApiResultException;
import com.silverpop.api.client.ApiSession;
import com.silverpop.api.client.command.LoginCommand;
import com.silverpop.api.client.command.LogoutCommand;
import com.silverpop.api.client.result.LoginResult;
import com.silverpop.api.client.result.LogoutResult;

public class XmlApiSession implements ApiSession {

	private boolean open;
	private LoginCommand loginCommand;
	private XmlApiClient loginClient;
    private LogoutCommand logoutCommand;
    private XmlApiClient logoutClient;
	private String url;
	private boolean reauthenticate;
	
	private String organizationId;
	private String sessionId;
	private String sessionEncoding;

	public XmlApiSession(String url, LoginCommand loginCommand, XmlApiClient loginClient) {
		this(url, loginCommand, loginClient, true);
	}
	
	public XmlApiSession(String url, LoginCommand loginCommand, XmlApiClient loginClient, boolean reauthenticate) {
		this.url = url;
		this.loginCommand = loginCommand;
		this.loginClient = loginClient;
		this.reauthenticate = reauthenticate;
        this.logoutClient = new XmlApiClient(this);
        this.logoutCommand = new LogoutCommand();
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
			return (LoginResult) loginClient.executeCommand(loginCommand);
		} catch (ApiResultException e) {
			throw new ApiException("Unable to login: " + e.getErrorResult().getMessage());
		}
	}

    private LogoutResult executeLogout(){
        try {
            return (LogoutResult) logoutClient.executeCommand(logoutCommand);
        } catch (ApiResultException e){
            throw new ApiException("Unable to logout: " + e.getErrorResult().getMessage());
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
}
