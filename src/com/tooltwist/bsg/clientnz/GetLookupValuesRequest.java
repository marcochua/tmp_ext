
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
 *         &lt;element name="lookupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "lookupCode"
})
@XmlRootElement(name = "getLookupValuesRequest")
public class GetLookupValuesRequest
    extends BaseBSGRequest
{

    protected String lookupCode;

    /**
     * Gets the value of the lookupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookupCode() {
        return lookupCode;
    }

    /**
     * Sets the value of the lookupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookupCode(String value) {
        this.lookupCode = value;
    }

}
