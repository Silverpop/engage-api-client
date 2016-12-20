package com.silverpop.api.client.authentication;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.LogoutResult;

@XmlApiProperties("Logout")
public class LogoutCommand implements ApiCommand {

    public LogoutCommand() {}

    @Override
    public Class<LogoutResult> getResultType() {
        return LogoutResult.class;
    }

}