package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;

public class EncodedApiCommand implements ApiCommand {

	public static final String NO_ENCODING = "__NO_ENCODING__";
	
	private String encoding;
	private ApiCommand command;
	
	public EncodedApiCommand(ApiCommand command, String encoding) {
		this.command = command;
		this.encoding = encoding;
	}

	@Override
	public Class<? extends ApiResult> getResultType() {
		return command.getResultType();
	}

	
	public String getEncoding() {
		return encoding;
	}

	public ApiCommand getCommand() {
		return command;
	}
}
