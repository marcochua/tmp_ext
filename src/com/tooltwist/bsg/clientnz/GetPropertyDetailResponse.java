
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
 *         &lt;element name="property" type="{http://rpdata.com/bsg/schemas}bsgPropertyDetail" minOccurs="0"/>
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
    "property"
})
@XmlRootElement(name = "getPropertyDetailResponse")
public class GetPropertyDetailResponse
    extends BaseBSGResponse
{

    protected BsgPropertyDetail property;

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertyDetail }
     *     
     */
    public BsgPropertyDetail getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertyDetail }
     *     
     */
    public void setProperty(BsgPropertyDetail value) {
        this.property = value;
    }

}
