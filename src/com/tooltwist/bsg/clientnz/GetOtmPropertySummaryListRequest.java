
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
 *         &lt;element name="propertyIdInput" type="{http://rpdata.com/bsg/schemas}propertyIdInput" minOccurs="0"/>
 *         &lt;element name="sortType" type="{http://rpdata.com/bsg/schemas}sortType" minOccurs="0"/>
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
    "propertyIdInput",
    "sortType"
})
@XmlRootElement(name = "getOtmPropertySummaryListRequest")
public class GetOtmPropertySummaryListRequest
    extends BaseBSGRequest
{

    protected PropertyIdInput propertyIdInput;
    protected SortType sortType;

    /**
     * Gets the value of the propertyIdInput property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyIdInput }
     *     
     */
    public PropertyIdInput getPropertyIdInput() {
        return propertyIdInput;
    }

    /**
     * Sets the value of the propertyIdInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyIdInput }
     *     
     */
    public void setPropertyIdInput(PropertyIdInput value) {
        this.propertyIdInput = value;
    }

    /**
     * Gets the value of the sortType property.
     * 
     * @return
     *     possible object is
     *     {@link SortType }
     *     
     */
    public SortType getSortType() {
        return sortType;
    }

    /**
     * Sets the value of the sortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortType }
     *     
     */
    public void setSortType(SortType value) {
        this.sortType = value;
    }

}
