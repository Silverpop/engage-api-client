package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.result.elements.GetSentMailingsMailing;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.Set;


@XStreamAlias("RESULT")
public class GetSentMailingsForListResult implements ApiResult {

	@XStreamAlias("SUCCESS")
	private boolean success;

    @XStreamImplicit(itemFieldName="MAILING")
    private Set<GetSentMailingsMailing> mailings;


	public boolean getSuccess() {
		return success;
	}

    public Set<GetSentMailingsMailing> getMailings() {
        return mailings;
    }

}
