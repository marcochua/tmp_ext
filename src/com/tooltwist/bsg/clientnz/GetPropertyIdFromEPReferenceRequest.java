
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
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseBSGRequest">
 *       &lt;sequence>
 *         &lt;element name="epReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "epReference"
})
@XmlRootElement(name = "getPropertyIdFromEPReferenceRequest")
public class GetPropertyIdFromEPReferenceRequest
    extends BaseBSGRequest
{

    protected String epReference;

    /**
     * Gets the value of the epReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpReference() {
        return epReference;
    }

    /**
     * Sets the value of the epReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpReference(String value) {
        this.epReference = value;
    }

}
