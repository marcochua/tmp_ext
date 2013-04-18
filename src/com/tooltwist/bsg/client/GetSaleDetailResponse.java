
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
 *         &lt;element name="soldProperty" type="{http://rpdata.com/bsg/schemas}bsgSalesPropertySummary" minOccurs="0"/>
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
    "soldProperty"
})
@XmlRootElement(name = "getSaleDetailResponse")
public class GetSaleDetailResponse
    extends BaseBSGResponse
{

    protected BsgSalesPropertySummary soldProperty;

    /**
     * Gets the value of the soldProperty property.
     * 
     * @return
     *     possible object is
     *     {@link BsgSalesPropertySummary }
     *     
     */
    public BsgSalesPropertySummary getSoldProperty() {
        return soldProperty;
    }

    /**
     * Sets the value of the soldProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgSalesPropertySummary }
     *     
     */
    public void setSoldProperty(BsgSalesPropertySummary value) {
        this.soldProperty = value;
    }

}
