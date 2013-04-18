
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
 *         &lt;element name="propertyAddress" type="{http://rpdata.com/bsg/schemas}propertyAddress" minOccurs="0"/>
 *         &lt;element name="propertyVisuals" type="{http://rpdata.com/bsg/schemas}propertyVisuals" minOccurs="0"/>
 *         &lt;element name="propertyLandTitle" type="{http://rpdata.com/bsg/schemas}propertyLandTitle" minOccurs="0"/>
 *         &lt;element name="propertyImprovements" type="{http://rpdata.com/bsg/schemas}propertyImprovements" minOccurs="0"/>
 *         &lt;element name="propertyOwnership" type="{http://rpdata.com/bsg/schemas}propertyOwnership" minOccurs="0"/>
 *         &lt;element name="propertySalesHistory" type="{http://rpdata.com/bsg/schemas}propertySalesHistory" minOccurs="0"/>
 *         &lt;element name="propertyComparableSales" type="{http://rpdata.com/bsg/schemas}propertyComparableSales" minOccurs="0"/>
 *         &lt;element name="propertyComparableOTMs" type="{http://rpdata.com/bsg/schemas}propertyComparableOTMs" minOccurs="0"/>
 *         &lt;element name="propertyMarketComparisons" type="{http://rpdata.com/bsg/schemas}propertyMarketComparisons" minOccurs="0"/>
 *         &lt;element name="propertyOTMHistory" type="{http://rpdata.com/bsg/schemas}propertyOTMHistory" minOccurs="0"/>
 *         &lt;element name="propertyOTMRentalHistory" type="{http://rpdata.com/bsg/schemas}propertyOTMRentalHistory" minOccurs="0"/>
 *         &lt;element name="pdf" type="{http://rpdata.com/bsg/schemas}base64Document" minOccurs="0"/>
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
    "propertyAddress",
    "propertyVisuals",
    "propertyLandTitle",
    "propertyImprovements",
    "propertyOwnership",
    "propertySalesHistory",
    "propertyComparableSales",
    "propertyComparableOTMs",
    "propertyMarketComparisons",
    "propertyOTMHistory",
    "propertyOTMRentalHistory",
    "pdf"
})
@XmlRootElement(name = "getValuersResponse")
public class GetValuersResponse
    extends BaseBSGResponse
{

    protected PropertyAddress propertyAddress;
    protected PropertyVisuals propertyVisuals;
    protected PropertyLandTitle propertyLandTitle;
    protected PropertyImprovements propertyImprovements;
    protected PropertyOwnership propertyOwnership;
    protected PropertySalesHistory propertySalesHistory;
    protected PropertyComparableSales propertyComparableSales;
    protected PropertyComparableOTMs propertyComparableOTMs;
    protected PropertyMarketComparisons propertyMarketComparisons;
    protected PropertyOTMHistory propertyOTMHistory;
    protected PropertyOTMRentalHistory propertyOTMRentalHistory;
    protected Base64Document pdf;

    /**
     * Gets the value of the propertyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyAddress }
     *     
     */
    public PropertyAddress getPropertyAddress() {
        return propertyAddress;
    }

    /**
     * Sets the value of the propertyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyAddress }
     *     
     */
    public void setPropertyAddress(PropertyAddress value) {
        this.propertyAddress = value;
    }

    /**
     * Gets the value of the propertyVisuals property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyVisuals }
     *     
     */
    public PropertyVisuals getPropertyVisuals() {
        return propertyVisuals;
    }

    /**
     * Sets the value of the propertyVisuals property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyVisuals }
     *     
     */
    public void setPropertyVisuals(PropertyVisuals value) {
        this.propertyVisuals = value;
    }

    /**
     * Gets the value of the propertyLandTitle property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyLandTitle }
     *     
     */
    public PropertyLandTitle getPropertyLandTitle() {
        return propertyLandTitle;
    }

    /**
     * Sets the value of the propertyLandTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyLandTitle }
     *     
     */
    public void setPropertyLandTitle(PropertyLandTitle value) {
        this.propertyLandTitle = value;
    }

    /**
     * Gets the value of the propertyImprovements property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyImprovements }
     *     
     */
    public PropertyImprovements getPropertyImprovements() {
        return propertyImprovements;
    }

    /**
     * Sets the value of the propertyImprovements property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyImprovements }
     *     
     */
    public void setPropertyImprovements(PropertyImprovements value) {
        this.propertyImprovements = value;
    }

    /**
     * Gets the value of the propertyOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyOwnership }
     *     
     */
    public PropertyOwnership getPropertyOwnership() {
        return propertyOwnership;
    }

    /**
     * Sets the value of the propertyOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyOwnership }
     *     
     */
    public void setPropertyOwnership(PropertyOwnership value) {
        this.propertyOwnership = value;
    }

    /**
     * Gets the value of the propertySalesHistory property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySalesHistory }
     *     
     */
    public PropertySalesHistory getPropertySalesHistory() {
        return propertySalesHistory;
    }

    /**
     * Sets the value of the propertySalesHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySalesHistory }
     *     
     */
    public void setPropertySalesHistory(PropertySalesHistory value) {
        this.propertySalesHistory = value;
    }

    /**
     * Gets the value of the propertyComparableSales property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyComparableSales }
     *     
     */
    public PropertyComparableSales getPropertyComparableSales() {
        return propertyComparableSales;
    }

    /**
     * Sets the value of the propertyComparableSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyComparableSales }
     *     
     */
    public void setPropertyComparableSales(PropertyComparableSales value) {
        this.propertyComparableSales = value;
    }

    /**
     * Gets the value of the propertyComparableOTMs property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyComparableOTMs }
     *     
     */
    public PropertyComparableOTMs getPropertyComparableOTMs() {
        return propertyComparableOTMs;
    }

    /**
     * Sets the value of the propertyComparableOTMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyComparableOTMs }
     *     
     */
    public void setPropertyComparableOTMs(PropertyComparableOTMs value) {
        this.propertyComparableOTMs = value;
    }

    /**
     * Gets the value of the propertyMarketComparisons property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyMarketComparisons }
     *     
     */
    public PropertyMarketComparisons getPropertyMarketComparisons() {
        return propertyMarketComparisons;
    }

    /**
     * Sets the value of the propertyMarketComparisons property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyMarketComparisons }
     *     
     */
    public void setPropertyMarketComparisons(PropertyMarketComparisons value) {
        this.propertyMarketComparisons = value;
    }

    /**
     * Gets the value of the propertyOTMHistory property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyOTMHistory }
     *     
     */
    public PropertyOTMHistory getPropertyOTMHistory() {
        return propertyOTMHistory;
    }

    /**
     * Sets the value of the propertyOTMHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyOTMHistory }
     *     
     */
    public void setPropertyOTMHistory(PropertyOTMHistory value) {
        this.propertyOTMHistory = value;
    }

    /**
     * Gets the value of the propertyOTMRentalHistory property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyOTMRentalHistory }
     *     
     */
    public PropertyOTMRentalHistory getPropertyOTMRentalHistory() {
        return propertyOTMRentalHistory;
    }

    /**
     * Sets the value of the propertyOTMRentalHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyOTMRentalHistory }
     *     
     */
    public void setPropertyOTMRentalHistory(PropertyOTMRentalHistory value) {
        this.propertyOTMRentalHistory = value;
    }

    /**
     * Gets the value of the pdf property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Document }
     *     
     */
    public Base64Document getPdf() {
        return pdf;
    }

    /**
     * Sets the value of the pdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Document }
     *     
     */
    public void setPdf(Base64Document value) {
        this.pdf = value;
    }

}
