//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.25 at 11:03:15 AM EDT 
//


package com.silverpop.api.client.command.elements;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MapFieldElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapFieldElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LIST_FIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TABLE_FIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XStreamAlias("MAP_FIELD")
public class MapFieldElementType {

    @XStreamAlias("LIST_FIELD")
    protected String listfield;
    @XStreamAlias("TABLE_FIELD")
    protected String tablefield;

    /**
     * Gets the value of the listfield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLISTFIELD() {
        return listfield;
    }

    /**
     * Sets the value of the listfield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLISTFIELD(String value) {
        this.listfield = value;
    }

    /**
     * Gets the value of the tablefield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABLEFIELD() {
        return tablefield;
    }

    /**
     * Sets the value of the tablefield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABLEFIELD(String value) {
        this.tablefield = value;
    }

}
