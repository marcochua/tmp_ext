
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
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fetchPropertyAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fetchPropertyVisuals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fetchPropertyLandTitle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fetchPropertyImprovements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fetchPropertyOwnership" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fetchPropertySalesHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fetchPropertyOTMHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fetchPropertyOTMRentalHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fetchPropertyComparableSales" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fetchPropertyComparableOTMs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fetchPropertyMarketComparisons" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="propertyVisualOptions" type="{http://rpdata.com/bsg/schemas}propertyVisualOptions" minOccurs="0"/>
 *         &lt;element name="fetchPDF" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "propertyId",
    "fetchPropertyAddress",
    "fetchPropertyVisuals",
    "fetchPropertyLandTitle",
    "fetchPropertyImprovements",
    "fetchPropertyOwnership",
    "fetchPropertySalesHistory",
    "fetchPropertyOTMHistory",
    "fetchPropertyOTMRentalHistory",
    "fetchPropertyComparableSales",
    "fetchPropertyComparableOTMs",
    "fetchPropertyMarketComparisons",
    "propertyVisualOptions",
    "fetchPDF"
})
@XmlRootElement(name = "getValuersRequest")
public class GetValuersRequest
    extends BaseBSGRequest
{

    protected int propertyId;
    protected Boolean fetchPropertyAddress;
    protected Boolean fetchPropertyVisuals;
    protected Boolean fetchPropertyLandTitle;
    protected Boolean fetchPropertyImprovements;
    protected Boolean fetchPropertyOwnership;
    protected Boolean fetchPropertySalesHistory;
    protected Boolean fetchPropertyOTMHistory;
    protected Boolean fetchPropertyOTMRentalHistory;
    protected Boolean fetchPropertyComparableSales;
    protected Boolean fetchPropertyComparableOTMs;
    protected Boolean fetchPropertyMarketComparisons;
    protected PropertyVisualOptions propertyVisualOptions;
    protected Boolean fetchPDF;

    /**
     * Gets the value of the propertyId property.
     * 
     */
    public int getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     * 
     */
    public void setPropertyId(int value) {
        this.propertyId = value;
    }

    /**
     * Gets the value of the fetchPropertyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertyAddress() {
        return fetchPropertyAddress;
    }

    /**
     * Sets the value of the fetchPropertyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertyAddress(Boolean value) {
        this.fetchPropertyAddress = value;
    }

    /**
     * Gets the value of the fetchPropertyVisuals property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertyVisuals() {
        return fetchPropertyVisuals;
    }

    /**
     * Sets the value of the fetchPropertyVisuals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertyVisuals(Boolean value) {
        this.fetchPropertyVisuals = value;
    }

    /**
     * Gets the value of the fetchPropertyLandTitle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertyLandTitle() {
        return fetchPropertyLandTitle;
    }

    /**
     * Sets the value of the fetchPropertyLandTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertyLandTitle(Boolean value) {
        this.fetchPropertyLandTitle = value;
    }

    /**
     * Gets the value of the fetchPropertyImprovements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertyImprovements() {
        return fetchPropertyImprovements;
    }

    /**
     * Sets the value of the fetchPropertyImprovements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertyImprovements(Boolean value) {
        this.fetchPropertyImprovements = value;
    }

    /**
     * Gets the value of the fetchPropertyOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertyOwnership() {
        return fetchPropertyOwnership;
    }

    /**
     * Sets the value of the fetchPropertyOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertyOwnership(Boolean value) {
        this.fetchPropertyOwnership = value;
    }

    /**
     * Gets the value of the fetchPropertySalesHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertySalesHistory() {
        return fetchPropertySalesHistory;
    }

    /**
     * Sets the value of the fetchPropertySalesHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertySalesHistory(Boolean value) {
        this.fetchPropertySalesHistory = value;
    }

    /**
     * Gets the value of the fetchPropertyOTMHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertyOTMHistory() {
        return fetchPropertyOTMHistory;
    }

    /**
     * Sets the value of the fetchPropertyOTMHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertyOTMHistory(Boolean value) {
        this.fetchPropertyOTMHistory = value;
    }

    /**
     * Gets the value of the fetchPropertyOTMRentalHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertyOTMRentalHistory() {
        return fetchPropertyOTMRentalHistory;
    }

    /**
     * Sets the value of the fetchPropertyOTMRentalHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertyOTMRentalHistory(Boolean value) {
        this.fetchPropertyOTMRentalHistory = value;
    }

    /**
     * Gets the value of the fetchPropertyComparableSales property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertyComparableSales() {
        return fetchPropertyComparableSales;
    }

    /**
     * Sets the value of the fetchPropertyComparableSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertyComparableSales(Boolean value) {
        this.fetchPropertyComparableSales = value;
    }

    /**
     * Gets the value of the fetchPropertyComparableOTMs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertyComparableOTMs() {
        return fetchPropertyComparableOTMs;
    }

    /**
     * Sets the value of the fetchPropertyComparableOTMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertyComparableOTMs(Boolean value) {
        this.fetchPropertyComparableOTMs = value;
    }

    /**
     * Gets the value of the fetchPropertyMarketComparisons property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertyMarketComparisons() {
        return fetchPropertyMarketComparisons;
    }

    /**
     * Sets the value of the fetchPropertyMarketComparisons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertyMarketComparisons(Boolean value) {
        this.fetchPropertyMarketComparisons = value;
    }

    /**
     * Gets the value of the propertyVisualOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyVisualOptions }
     *     
     */
    public PropertyVisualOptions getPropertyVisualOptions() {
        return propertyVisualOptions;
    }

    /**
     * Sets the value of the propertyVisualOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyVisualOptions }
     *     
     */
    public void setPropertyVisualOptions(PropertyVisualOptions value) {
        this.propertyVisualOptions = value;
    }

    /**
     * Gets the value of the fetchPDF property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPDF() {
        return fetchPDF;
    }

    /**
     * Sets the value of the fetchPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPDF(Boolean value) {
        this.fetchPDF = value;
    }

}
