
package com.tooltwist.bsg.client;

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
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseBSGRequest">
 *       &lt;sequence>
 *         &lt;element name="propertyAddressMatch" type="{http://rpdata.com/bsg/schemas}propertyAddressMatch" minOccurs="0"/>
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
    "propertyAddressMatch"
})
@XmlRootElement(name = "getPropertyMatchRequest")
public class GetPropertyMatchRequest
    extends BaseBSGRequest
{

    protected PropertyAddressMatch propertyAddressMatch;

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

}
