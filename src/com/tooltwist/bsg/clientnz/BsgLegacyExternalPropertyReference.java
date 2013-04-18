
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bsgLegacyExternalPropertyReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgLegacyExternalPropertyReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}applicationMessages">
 *       &lt;sequence>
 *         &lt;element name="externalPropertyRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgLegacyExternalPropertyReference", propOrder = {
    "externalPropertyRef",
    "state"
})
public class BsgLegacyExternalPropertyReference
    extends ApplicationMessages
{

    protected String externalPropertyRef;
    protected String state;

    /**
     * Gets the value of the externalPropertyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPropertyRef() {
        return externalPropertyRef;
    }

    /**
     * Sets the value of the externalPropertyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPropertyRef(String value) {
        this.externalPropertyRef = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
