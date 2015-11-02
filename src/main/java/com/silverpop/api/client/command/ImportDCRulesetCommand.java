package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.ImportDCRulesetResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by PeterJLyons on 10/15/2015.
 */
@XmlApiProperties("ImportDCRuleset")
public class ImportDCRulesetCommand implements ApiCommand {

    @XStreamAlias("FILE_NAME")
    protected String filename;
    @XStreamAlias("LIST_ID")
    protected long listid;
    @XStreamAlias("MAILING_ID")
    protected long mailingid;
    @XStreamAlias("RULESET_ID")
    protected long rulesetid;

    public Class<? extends ApiResult> getResultType() {
        return ImportDCRulesetResult.class;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public long getListid() {
        return listid;
    }

    public void setListid(long listid) {
        this.listid = listid;
    }

    public long getMailingid() {
        return mailingid;
    }

    public void setMailingid(long mailingid) {
        this.mailingid = mailingid;
    }

    public long getRulesetid() {
        return rulesetid;
    }

    public void setRulesetid(long rulesetid) {
        this.rulesetid = rulesetid;
    }
}
