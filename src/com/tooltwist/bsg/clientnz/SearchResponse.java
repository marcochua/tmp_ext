
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
 *         &lt;element name="propertySearchPropertiesResult" type="{http://rpdata.com/bsg/schemas}propertySearchPropertiesResult" minOccurs="0"/>
 *         &lt;element name="propertySearchSalesResult" type="{http://rpdata.com/bsg/schemas}propertySearchSalesResult" minOccurs="0"/>
 *         &lt;element name="propertySearchRecentSalesResult" type="{http://rpdata.com/bsg/schemas}propertySearchSalesResult" minOccurs="0"/>
 *         &lt;element name="propertySearchOTMResult" type="{http://rpdata.com/bsg/schemas}propertySearchOTMResult" minOccurs="0"/>
 *         &lt;element name="propertySearchOTMRentalResult" type="{http://rpdata.com/bsg/schemas}propertySearchOTMResult" minOccurs="0"/>
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
    "propertySearchPropertiesResult",
    "propertySearchSalesResult",
    "propertySearchRecentSalesResult",
    "propertySearchOTMResult",
    "propertySearchOTMRentalResult"
})
@XmlRootElement(name = "searchResponse")
public class SearchResponse
    extends BaseBSGResponse
{

    protected PropertySearchPropertiesResult propertySearchPropertiesResult;
    protected PropertySearchSalesResult propertySearchSalesResult;
    protected PropertySearchSalesResult propertySearchRecentSalesResult;
    protected PropertySearchOTMResult propertySearchOTMResult;
    protected PropertySearchOTMResult propertySearchOTMRentalResult;

    /**
     * Gets the value of the propertySearchPropertiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySearchPropertiesResult }
     *     
     */
    public PropertySearchPropertiesResult getPropertySearchPropertiesResult() {
        return propertySearchPropertiesResult;
    }

    /**
     * Sets the value of the propertySearchPropertiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySearchPropertiesResult }
     *     
     */
    public void setPropertySearchPropertiesResult(PropertySearchPropertiesResult value) {
        this.propertySearchPropertiesResult = value;
    }

    /**
     * Gets the value of the propertySearchSalesResult property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySearchSalesResult }
     *     
     */
    public PropertySearchSalesResult getPropertySearchSalesResult() {
        return propertySearchSalesResult;
    }

    /**
     * Sets the value of the propertySearchSalesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySearchSalesResult }
     *     
     */
    public void setPropertySearchSalesResult(PropertySearchSalesResult value) {
        this.propertySearchSalesResult = value;
    }

    /**
     * Gets the value of the propertySearchRecentSalesResult property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySearchSalesResult }
     *     
     */
    public PropertySearchSalesResult getPropertySearchRecentSalesResult() {
        return propertySearchRecentSalesResult;
    }

    /**
     * Sets the value of the propertySearchRecentSalesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySearchSalesResult }
     *     
     */
    public void setPropertySearchRecentSalesResult(PropertySearchSalesResult value) {
        this.propertySearchRecentSalesResult = value;
    }

    /**
     * Gets the value of the propertySearchOTMResult property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySearchOTMResult }
     *     
     */
    public PropertySearchOTMResult getPropertySearchOTMResult() {
        return propertySearchOTMResult;
    }

    /**
     * Sets the value of the propertySearchOTMResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySearchOTMResult }
     *     
     */
    public void setPropertySearchOTMResult(PropertySearchOTMResult value) {
        this.propertySearchOTMResult = value;
    }

    /**
     * Gets the value of the propertySearchOTMRentalResult property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySearchOTMResult }
     *     
     */
    public PropertySearchOTMResult getPropertySearchOTMRentalResult() {
        return propertySearchOTMRentalResult;
    }

    /**
     * Sets the value of the propertySearchOTMRentalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySearchOTMResult }
     *     
     */
    public void setPropertySearchOTMRentalResult(PropertySearchOTMResult value) {
        this.propertySearchOTMRentalResult = value;
    }

}
