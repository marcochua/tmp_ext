
package com.tooltwist.bsg.clientnz;

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
 *         &lt;element name="propertyIdResponse" type="{http://rpdata.com/bsg/schemas}propertyIdResponse" minOccurs="0"/>
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
    "propertyIdResponse"
})
@XmlRootElement(name = "refineOtmPropertiesResponse")
public class RefineOtmPropertiesResponse
    extends BaseBSGResponse
{

    protected PropertyIdResponse propertyIdResponse;

    /**
     * Gets the value of the propertyIdResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyIdResponse }
     *     
     */
    public PropertyIdResponse getPropertyIdResponse() {
        return propertyIdResponse;
    }

    /**
     * Sets the value of the propertyIdResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyIdResponse }
     *     
     */
    public void setPropertyIdResponse(PropertyIdResponse value) {
        this.propertyIdResponse = value;
    }

}
