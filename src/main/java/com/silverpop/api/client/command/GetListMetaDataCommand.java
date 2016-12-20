package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.GetListMetaDataResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 10/8/2015.
 */
@XmlApiProperties("GetListMetaData")
public class GetListMetaDataCommand implements ApiCommand {


    @XStreamAlias("LIST_ID")
    private long ListId;

    @Override
    public Class<GetListMetaDataResult> getResultType() {
        return GetListMetaDataResult.class;
    }

    public long getListId() {
        return ListId;
    }

    public void setListId(long listId) {
        ListId = listId;
    }
}
