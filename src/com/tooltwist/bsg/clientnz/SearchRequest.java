
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
 *         &lt;element name="featureKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchAreaCriteria" type="{http://rpdata.com/bsg/schemas}searchAreaCriteria" minOccurs="0"/>
 *         &lt;element name="searchRadiusCriteria" type="{http://rpdata.com/bsg/schemas}searchRadiusCriteria" minOccurs="0"/>
 *         &lt;element name="propertyAddressMatch" type="{http://rpdata.com/bsg/schemas}propertyAddressMatch" minOccurs="0"/>
 *         &lt;element name="propertyIdInput" type="{http://rpdata.com/bsg/schemas}propertyIdInput" minOccurs="0"/>
 *         &lt;element name="sortBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fetchProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="propertiesCriteria" type="{http://rpdata.com/bsg/schemas}propertiesCriteria" minOccurs="0"/>
 *         &lt;element name="fetchPropertySales" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="propertySalesCriteria" type="{http://rpdata.com/bsg/schemas}propertySalesCriteria" minOccurs="0"/>
 *         &lt;element name="fetchPropertyRecentSales" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="propertyRecentSalesCriteria" type="{http://rpdata.com/bsg/schemas}propertySalesCriteria" minOccurs="0"/>
 *         &lt;element name="fetchPropertyOTM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="propertyOTMCriteria" type="{http://rpdata.com/bsg/schemas}propertyOTMCriteria" minOccurs="0"/>
 *         &lt;element name="fetchPropertyOTMRental" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="propertyOTMRentalCriteria" type="{http://rpdata.com/bsg/schemas}propertyOTMCriteria" minOccurs="0"/>
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
    "featureKey",
    "searchAreaCriteria",
    "searchRadiusCriteria",
    "propertyAddressMatch",
    "propertyIdInput",
    "sortBy",
    "fetchProperties",
    "propertiesCriteria",
    "fetchPropertySales",
    "propertySalesCriteria",
    "fetchPropertyRecentSales",
    "propertyRecentSalesCriteria",
    "fetchPropertyOTM",
    "propertyOTMCriteria",
    "fetchPropertyOTMRental",
    "propertyOTMRentalCriteria"
})
@XmlRootElement(name = "searchRequest")
public class SearchRequest
    extends BaseBSGRequest
{

    protected String featureKey;
    protected SearchAreaCriteria searchAreaCriteria;
    protected SearchRadiusCriteria searchRadiusCriteria;
    protected PropertyAddressMatch propertyAddressMatch;
    protected PropertyIdInput propertyIdInput;
    protected String sortBy;
    protected Boolean fetchProperties;
    protected PropertiesCriteria propertiesCriteria;
    protected Boolean fetchPropertySales;
    protected PropertySalesCriteria propertySalesCriteria;
    protected Boolean fetchPropertyRecentSales;
    protected PropertySalesCriteria propertyRecentSalesCriteria;
    protected Boolean fetchPropertyOTM;
    protected PropertyOTMCriteria propertyOTMCriteria;
    protected Boolean fetchPropertyOTMRental;
    protected PropertyOTMCriteria propertyOTMRentalCriteria;

    /**
     * Gets the value of the featureKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureKey() {
        return featureKey;
    }

    /**
     * Sets the value of the featureKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureKey(String value) {
        this.featureKey = value;
    }

    /**
     * Gets the value of the searchAreaCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchAreaCriteria }
     *     
     */
    public SearchAreaCriteria getSearchAreaCriteria() {
        return searchAreaCriteria;
    }

    /**
     * Sets the value of the searchAreaCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchAreaCriteria }
     *     
     */
    public void setSearchAreaCriteria(SearchAreaCriteria value) {
        this.searchAreaCriteria = value;
    }

    /**
     * Gets the value of the searchRadiusCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRadiusCriteria }
     *     
     */
    public SearchRadiusCriteria getSearchRadiusCriteria() {
        return searchRadiusCriteria;
    }

    /**
     * Sets the value of the searchRadiusCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRadiusCriteria }
     *     
     */
    public void setSearchRadiusCriteria(SearchRadiusCriteria value) {
        this.searchRadiusCriteria = value;
    }

    /**
     * Gets the value of the propertyAddressMatch property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyAddressMatch }
     *     
     */
    public PropertyAddressMatch getPropertyAddressMatch() {
        return propertyAddressMatch;
    }

    /**
     * Sets the value of the propertyAddressMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyAddressMatch }
     *     
     */
    public void setPropertyAddressMatch(PropertyAddressMatch value) {
        this.propertyAddressMatch = value;
    }

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
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortBy(String value) {
        this.sortBy = value;
    }

    /**
     * Gets the value of the fetchProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchProperties() {
        return fetchProperties;
    }

    /**
     * Sets the value of the fetchProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchProperties(Boolean value) {
        this.fetchProperties = value;
    }

    /**
     * Gets the value of the propertiesCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesCriteria }
     *     
     */
    public PropertiesCriteria getPropertiesCriteria() {
        return propertiesCriteria;
    }

    /**
     * Sets the value of the propertiesCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesCriteria }
     *     
     */
    public void setPropertiesCriteria(PropertiesCriteria value) {
        this.propertiesCriteria = value;
    }

    /**
     * Gets the value of the fetchPropertySales property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertySales() {
        return fetchPropertySales;
    }

    /**
     * Sets the value of the fetchPropertySales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertySales(Boolean value) {
        this.fetchPropertySales = value;
    }

    /**
     * Gets the value of the propertySalesCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySalesCriteria }
     *     
     */
    public PropertySalesCriteria getPropertySalesCriteria() {
        return propertySalesCriteria;
    }

    /**
     * Sets the value of the propertySalesCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySalesCriteria }
     *     
     */
    public void setPropertySalesCriteria(PropertySalesCriteria value) {
        this.propertySalesCriteria = value;
    }

    /**
     * Gets the value of the fetchPropertyRecentSales property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertyRecentSales() {
        return fetchPropertyRecentSales;
    }

    /**
     * Sets the value of the fetchPropertyRecentSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertyRecentSales(Boolean value) {
        this.fetchPropertyRecentSales = value;
    }

    /**
     * Gets the value of the propertyRecentSalesCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySalesCriteria }
     *     
     */
    public PropertySalesCriteria getPropertyRecentSalesCriteria() {
        return propertyRecentSalesCriteria;
    }

    /**
     * Sets the value of the propertyRecentSalesCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySalesCriteria }
     *     
     */
    public void setPropertyRecentSalesCriteria(PropertySalesCriteria value) {
        this.propertyRecentSalesCriteria = value;
    }

    /**
     * Gets the value of the fetchPropertyOTM property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertyOTM() {
        return fetchPropertyOTM;
    }

    /**
     * Sets the value of the fetchPropertyOTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertyOTM(Boolean value) {
        this.fetchPropertyOTM = value;
    }

    /**
     * Gets the value of the propertyOTMCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyOTMCriteria }
     *     
     */
    public PropertyOTMCriteria getPropertyOTMCriteria() {
        return propertyOTMCriteria;
    }

    /**
     * Sets the value of the propertyOTMCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyOTMCriteria }
     *     
     */
    public void setPropertyOTMCriteria(PropertyOTMCriteria value) {
        this.propertyOTMCriteria = value;
    }

    /**
     * Gets the value of the fetchPropertyOTMRental property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPropertyOTMRental() {
        return fetchPropertyOTMRental;
    }

    /**
     * Sets the value of the fetchPropertyOTMRental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPropertyOTMRental(Boolean value) {
        this.fetchPropertyOTMRental = value;
    }

    /**
     * Gets the value of the propertyOTMRentalCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyOTMCriteria }
     *     
     */
    public PropertyOTMCriteria getPropertyOTMRentalCriteria() {
        return propertyOTMRentalCriteria;
    }

    /**
     * Sets the value of the propertyOTMRentalCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyOTMCriteria }
     *     
     */
    public void setPropertyOTMRentalCriteria(PropertyOTMCriteria value) {
        this.propertyOTMRentalCriteria = value;
    }

}
