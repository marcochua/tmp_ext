
package com.tooltwist.bsg.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseBSGResponse">
 *       &lt;sequence>
 *         &lt;element name="propertyAddressMatch" type="{http://rpdata.com/bsg/schemas}propertyAddressMatch" minOccurs="0"/>
 *         &lt;element name="matchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suggestions" type="{http://rpdata.com/bsg/schemas}propertyAddressMatch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "propertyAddressMatch",
    "matchCode",
    "suggestions"
})
@XmlRootElement(name = "getPropertyMatchResponse")
public class GetPropertyMatchResponse
    extends BaseBSGResponse
{

    protected PropertyAddressMatch propertyAddressMatch;
    protected String matchCode;
    protected List<PropertyAddressMatch> suggestions;

    /**
     * Gets the value of the propertyAddressMatch property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyAddressMatch }
     *     
     */
    public PropertyAddressMatch getPropertyAddressMatch() {
        return propertyAddressMatch;
    }

    /**
     * Sets the value of the propertyAddressMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyAddressMatch }
     *     
     */
    public void setPropertyAddressMatch(PropertyAddressMatch value) {
        this.propertyAddressMatch = value;
    }

    /**
     * Gets the value of the matchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchCode() {
        return matchCode;
    }

    /**
     * Sets the value of the matchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchCode(String value) {
        this.matchCode = value;
    }

    /**
     * Gets the value of the suggestions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyAddressMatch }
     * 
     * 
     */
    public List<PropertyAddressMatch> getSuggestions() {
        if (suggestions == null) {
            suggestions = new ArrayList<PropertyAddressMatch>();
        }
        return this.suggestions;
    }

}
