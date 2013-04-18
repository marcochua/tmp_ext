
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
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="progressPropertyId" type="{http://rpdata.com/bsg/schemas}bsgProgressPropertyId" minOccurs="0"/>
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
    "progressPropertyId"
})
@XmlRootElement(name = "getPropertyIdFromEPReferenceResponse")
public class GetPropertyIdFromEPReferenceResponse
    extends BaseServiceResponse
{

    protected BsgProgressPropertyId progressPropertyId;

    /**
     * Gets the value of the progressPropertyId property.
     * 
     * @return
     *     possible object is
     *     {@link BsgProgressPropertyId }
     *     
     */
    public BsgProgressPropertyId getProgressPropertyId() {
        return progressPropertyId;
    }

    /**
     * Sets the value of the progressPropertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgProgressPropertyId }
     *     
     */
    public void setProgressPropertyId(BsgProgressPropertyId value) {
        this.progressPropertyId = value;
    }

}
