package com.silverpop.api.client.authentication.oauth;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.silverpop.api.client.AbstractApiCommandProcessor;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResponse;
import com.silverpop.api.client.ApiResult;

public class OauthCommandProcessor extends AbstractApiCommandProcessor<OauthRequest> {

    private Log log = LogFactory.getLog(this.getClass());

    @Override
    public OauthRequest prepareRequest(ApiCommand command) {
        return new OauthRequest((OauthCommand) command);
    }

    @Override
    public ApiResponse processResponse(String response, Class<? extends ApiResult> resultClass) {
        log.info(response);
        return new OauthResponse(response);
    }
}
