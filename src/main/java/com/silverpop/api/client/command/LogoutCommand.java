package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.LogoutResult;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @deprecated Use {@link com.silverpop.api.client.authentication.LogoutCommand} instead.
 */
@Deprecated
@XmlApiProperties("Logout")
public class LogoutCommand implements ApiCommand {

    public LogoutCommand() {}

    @Override
    public Class<LogoutResult> getResultType() {
        return LogoutResult.class;
    }

}