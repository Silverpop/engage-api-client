package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.GetMessageGroupDetailsResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("GetMessageGroupDetails")
public class GetMessageGroupDetailsCommand implements ApiCommand {

    @XStreamAlias("MESSAGE_GROUP_ID")
    private Long messageGroupId;

    public GetMessageGroupDetailsCommand(long messageGroupId) {
        super();
        this.messageGroupId=messageGroupId;
    }

    @Override
    public Class<? extends ApiResult> getResultType() {
        return GetMessageGroupDetailsResult.class;
    }
}
