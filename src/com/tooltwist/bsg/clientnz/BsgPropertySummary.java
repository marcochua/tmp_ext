
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bsgPropertySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgPropertySummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}bsgPropertySummaryBase">
 *       &lt;sequence>
 *         &lt;element name="propertySale" type="{http://rpdata.com/bsg/schemas}bsgPropertySale" minOccurs="0"/>
 *         &lt;element name="reaAttribtes" type="{http://rpdata.com/bsg/schemas}bsgReaAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgPropertySummary", propOrder = {
    "propertySale",
    "reaAttribtes"
})
@XmlSeeAlso({
    BsgPropertySummaryOwner.class,
    BsgPropertyDetail.class
})
public class BsgPropertySummary
    extends BsgPropertySummaryBase
{

    protected BsgPropertySale propertySale;
    protected BsgReaAttributes reaAttribtes;

    /**
     * Gets the value of the propertySale property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertySale }
     *     
     */
    public BsgPropertySale getPropertySale() {
        return propertySale;
    }

    /**
     * Sets the value of the propertySale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertySale }
     *     
     */
    public void setPropertySale(BsgPropertySale value) {
        this.propertySale = value;
    }

    /**
     * Gets the value of the reaAttribtes property.
     * 
     * @return
     *     possible object is
     *     {@link BsgReaAttributes }
     *     
     */
    public BsgReaAttributes getReaAttribtes() {
        return reaAttribtes;
    }

    /**
     * Sets the value of the reaAttribtes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgReaAttributes }
     *     
     */
    public void setReaAttribtes(BsgReaAttributes value) {
        this.reaAttribtes = value;
    }

}
