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
 * <p>Java class for ContentAreasElementType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ContentAreasElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CONTENT_AREA" type="{SilverpopApi:EngageService.MailManagement.UserActions}ContentAreaElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XStreamAlias("CONTENT_AREAS")
public class ContentAreasElementType {

    @XStreamImplicit(itemFieldName = "CONTENT_AREA")
    protected List<ContentAreaElementType> contentareas;

    /**
     * Gets the value of the contentareas property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentareas property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONTENTAREAS().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentAreaElementType }
     */
    public List<ContentAreaElementType> getCONTENTAREAS() {
        if (contentareas == null) {
            contentareas = new ArrayList<ContentAreaElementType>();
        }
        return this.contentareas;
    }

}
