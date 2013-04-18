
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
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}governmentStatisticsRequest">
 *       &lt;sequence>
 *         &lt;element name="lineSpacing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "lineSpacing"
})
@XmlRootElement(name = "getStatisticsForRegionRequest")
public class GetStatisticsForRegionRequest
    extends GovernmentStatisticsRequest
{

    protected Integer lineSpacing;

    /**
     * Gets the value of the lineSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineSpacing() {
        return lineSpacing;
    }

    /**
     * Sets the value of the lineSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineSpacing(Integer value) {
        this.lineSpacing = value;
    }

}
