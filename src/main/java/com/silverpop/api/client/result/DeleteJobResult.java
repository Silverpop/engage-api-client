package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RESULT")
public class DeleteJobResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    private boolean successElement;

	public boolean isSuccessElement() {
		return successElement;
	}

	public void setSuccessElement(boolean successElement) {
		this.successElement = successElement;
	}
}
