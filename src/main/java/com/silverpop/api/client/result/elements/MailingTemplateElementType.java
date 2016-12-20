package com.silverpop.api.client.result.elements;

import com.silverpop.api.client.XmlApiProperties;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("MAILING_TEMPLATE")
public class MailingTemplateElementType {

    @XStreamAlias("MAILING_ID")
    protected long mailingid;
    @XStreamAlias("MAILING_NAME")
    protected String mailingname;
    @XStreamAlias("SUBJECT")
    protected String subject;
    @XStreamAlias("LAST_MODIFIED")
    protected String lastmodified;
    @XStreamAlias("VISIBILITY")
    protected String visibility;
    //protected TemplateVisibility visibility;
    @XStreamAlias("USER_ID")
    protected String userid;
    @XStreamAlias("FLAGGED_FOR_BACKUP")
    protected String flaggedforbackup;
    @XStreamAlias("ALLOW_CRM_BLOCK")
    protected String allowcrmblock;

    /**
     * Gets the value of the mailingid property.
     * 
     */
    public long getMAILINGID() {
        return mailingid;
    }

    /**
     * Sets the value of the mailingid property.
     * 
     */
    public void setMAILINGID(long value) {
        this.mailingid = value;
    }

    /**
     * Gets the value of the mailingname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAILINGNAME() {
        return mailingname;
    }

    /**
     * Sets the value of the mailingname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAILINGNAME(String value) {
        this.mailingname = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBJECT() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBJECT(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the lastmodified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTMODIFIED() {
        return lastmodified;
    }

    /**
     * Sets the value of the lastmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTMODIFIED(String value) {
        this.lastmodified = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateVisibility }
     *     
     */
    public String getVISIBILITY() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateVisibility }
     *     
     */
    public void setVISIBILITY(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the flaggedforbackup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGGEDFORBACKUP() {
        return flaggedforbackup;
    }

    /**
     * Sets the value of the flaggedforbackup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGGEDFORBACKUP(String value) {
        this.flaggedforbackup = value;
    }

    /**
     * Gets the value of the allowcrmblock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWCRMBLOCK() {
        return allowcrmblock;
    }

    /**
     * Sets the value of the allowcrmblock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWCRMBLOCK(String value) {
        this.allowcrmblock = value;
    }

}
