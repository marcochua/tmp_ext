
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
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseBSGResponse">
 *       &lt;sequence>
 *         &lt;element name="propertySummary" type="{http://rpdata.com/bsg/schemas}bsgPropertySummary" minOccurs="0"/>
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
    "propertySummary"
})
@XmlRootElement(name = "getPropertySummaryResponse")
public class GetPropertySummaryResponse
    extends BaseBSGResponse
{

    protected BsgPropertySummary propertySummary;

    /**
     * Gets the value of the propertySummary property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertySummary }
     *     
     */
    public BsgPropertySummary getPropertySummary() {
        return propertySummary;
    }

    /**
     * Sets the value of the propertySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertySummary }
     *     
     */
    public void setPropertySummary(BsgPropertySummary value) {
        this.propertySummary = value;
    }

}
