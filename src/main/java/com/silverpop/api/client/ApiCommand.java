package com.silverpop.api.client;

public interface ApiCommand {
	public Class<? extends ApiResult> getResultType();
}
