package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.ExportDCRulesetResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 10/14/2015.
 */
@XmlApiProperties("ExportDCRuleset")
public class ExportDCRulesetCommand implements ApiCommand {

    @XStreamAlias("RULESET_ID")
    protected long rulesetid;
    @XStreamAlias("MOVE_TO_FTP")
    protected String movetoftp;

    @Override
    public Class<? extends ApiResult> getResultType() {
        return ExportDCRulesetResult.class;
    }

    public long getRulesetid() {
        return rulesetid;
    }

    public void setRulesetid(long rulesetid) {
        this.rulesetid = rulesetid;
    }

    public String getMovetoftp() {
        return movetoftp;
    }

    public void setMovetoftp(String movetoftp) {
        this.movetoftp = movetoftp;
    }
}
