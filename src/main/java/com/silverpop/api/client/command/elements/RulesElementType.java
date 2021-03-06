//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.25 at 11:03:15 AM EDT 
//

package com.silverpop.api.client.command.elements;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * <p>Java class for RulesElementType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RulesElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RULE" type="{SilverpopApi:EngageService.MailManagement.UserActions}RuleElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XStreamAlias("RULES")
public class RulesElementType {

    @XStreamImplicit(itemFieldName = "RULE")
    protected List<RuleElementType> rules;

    /**
     * Gets the value of the rules property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rules property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRULES().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleElementType }
     */
    public List<RuleElementType> getRULES() {
        if (rules == null) {
            rules = new ArrayList<RuleElementType>();
        }
        return this.rules;
    }

}
