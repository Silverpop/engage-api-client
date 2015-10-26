

package com.silverpop.api.client.command.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XStreamAlias("MAILING")
public class MultiMailingsElementType {

    @XStreamAlias("MAILING_ID")
    protected Long mailingid;
    @XStreamAlias("REPORT_ID")
    protected Long reportid;

    /**
     * Gets the value of the mailingid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMAILINGID() {
        return mailingid;
    }

    /**
     * Sets the value of the mailingid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMAILINGID(Long value) {
        this.mailingid = value;
    }

    /**
     * Gets the value of the reportid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getREPORTID() {
        return reportid;
    }

    /**
     * Sets the value of the reportid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setREPORTID(Long value) {
        this.reportid = value;
    }

}
