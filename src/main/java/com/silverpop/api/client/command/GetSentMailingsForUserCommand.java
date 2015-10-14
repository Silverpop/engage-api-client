package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.GetSentMailingsForUserResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("GetSentMailingsForUser")
public class GetSentMailingsForUserCommand implements ApiCommand {


	@XStreamAlias("DATE_START")
	private String startDate;

	@XStreamAlias("DATE_END")
	private String endDate;

  @XStreamAlias("OPTIONALUSER")
  protected String optionaluser;

	@XStreamAlias("PRIVATE")
	protected String _private;

	@XStreamAlias("SHARED")
	protected String shared;

	@XStreamAlias("SCHEDULED")
	protected String scheduled;

	@XStreamAlias("SENT")
	protected String sent;

	@XStreamAlias("SENDING")
	protected String sending;

	@XStreamAlias("OPTIN_CONFIRMATION")
	protected String optinconfirmation;

	@XStreamAlias("PROFILE_CONFIRMATION")
	protected String profileconfirmation;

	@XStreamAlias("AUTOMATED")
	protected String automated;

	@XStreamAlias("CAMPAIGN_ACTIVE")
	protected String campaignactive;

	@XStreamAlias("CAMPAIGN_COMPLETED")
	protected String campaigncompleted;

	@XStreamAlias("CAMPAIGN_CANCELLED")
	protected String campaigncancelled;

	@XStreamAlias("CAMPAIGN_SCRAPE_TEMPLATE")
	protected String campaignscrapetemplate;

	@XStreamAlias("INCLUDE_TAGS")
	protected String includetags;

	@XStreamAlias("EXCLUDE_ZERO_SENT")
	protected String excludezerosent;

	@XStreamAlias("MAILING_COUNT_ONLY")
	protected String mailingcountonly;

	@XStreamAlias("EXCLUDE_TEST_MAILINGS")
	protected String excludetestmailings;



	@Override
	public Class<? extends ApiResult> getResultType() {
		return GetSentMailingsForUserResult.class;
	}


	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

  public String getOptionaluser()
  {
    return optionaluser;
  }

  public void setOptionaluser(String optionaluser)
  {
    this.optionaluser = optionaluser;
  }

	public String getPrivate()
	{
		return _private;
	}

	public void setPrivate(String _private)
	{
		this._private = _private;
	}

	public String getShared()
	{
		return shared;
	}

	public void setShared(String shared)
	{
		this.shared = shared;
	}

	public String getScheduled()
	{
		return scheduled;
	}

	public void setScheduled(String scheduled)
	{
		this.scheduled = scheduled;
	}

	public String getSent()
	{
		return sent;
	}

	public void setSent(String sent)
	{
		this.sent = sent;
	}

	public String getSending()
	{
		return sending;
	}

	public void setSending(String sending)
	{
		this.sending = sending;
	}

	public String getOptInConfirmation()
	{
		return optinconfirmation;
	}

	public void setOptInConfirmation(String optinconfirmation)
	{
		this.optinconfirmation = optinconfirmation;
	}

	public String getProfileConfirmation()
	{
		return profileconfirmation;
	}

	public void setProfileConfirmation(String profileconfirmation)
	{
		this.profileconfirmation = profileconfirmation;
	}

	public String getAutomated()
	{
		return automated;
	}

	public void setAutomated(String automated)
	{
		this.automated = automated;
	}

	public String getCampaignActive()
	{
		return campaignactive;
	}

	public void setCampaignActive(String campaignactive)
	{
		this.campaignactive = campaignactive;
	}

	public String getCampaignCompleted()
	{
		return campaigncompleted;
	}

	public void setCampaignCompleted(String campaigncompleted)
	{
		this.campaigncompleted = campaigncompleted;
	}

	public String getCampaignCancelled()
	{
		return campaigncancelled;
	}

	public void setCampaignCancelled(String campaigncancelled)
	{
		this.campaigncancelled = campaigncancelled;
	}

	public String getIncludeTags()
	{
		return includetags;
	}

	public void setIncludeTags(String includetags)
	{
		this.includetags = includetags;
	}

	public String getExcludeZeroSent()
	{
		return excludezerosent;
	}

	public void setExcludeZeroSent(String excludezerosent)
	{
		this.excludezerosent = excludezerosent;
	}

	public String getMailingCountOnly()
	{
		return mailingcountonly;
	}

	public void setMailingCountOnly(String mailingcountonly)
	{
		this.mailingcountonly = mailingcountonly;
	}

	public String getExcludeTestMailings()
	{
		return excludetestmailings;
	}

	public void setExcludeTestMailings(String excludetestmailings)
	{
		this.excludetestmailings = excludetestmailings;
	}
}
