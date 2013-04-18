
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bsgReaAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgReaAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reaRecentSale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgReaAttributes", propOrder = {
    "reaId",
    "reaRecentSale"
})
public class BsgReaAttributes {

    protected String reaId;
    protected Boolean reaRecentSale;

    /**
     * Gets the value of the reaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReaId() {
        return reaId;
    }

    /**
     * Sets the value of the reaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReaId(String value) {
        this.reaId = value;
    }

    /**
     * Gets the value of the reaRecentSale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReaRecentSale() {
        return reaRecentSale;
    }

    /**
     * Sets the value of the reaRecentSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReaRecentSale(Boolean value) {
        this.reaRecentSale = value;
    }

}
