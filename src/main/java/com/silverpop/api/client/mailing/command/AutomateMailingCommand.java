package com.silverpop.api.client.mailing.command;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.silverpop.api.client.ApiResult;

import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.mailing.result.AutomateMailingResult;

@XmlApiProperties("PrivateAutomateMailingToCampaign")
public class AutomateMailingCommand implements ApiCommand {

	@XStreamAlias("MAILING_ID")
	private Long mailingId;
	
	@XStreamAlias("CAMPAIGN_ID")
	private Integer campaignId;
	
	@XStreamAlias("STATE")
	private String state;
	
	@Override
	public Class<? extends ApiResult> getResultType() {
		return AutomateMailingResult.class;
	}

    public Long getMailingId() {
        return mailingId;
    }

    public void setMailingId(Long mailingId) {
        this.mailingId = mailingId;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
