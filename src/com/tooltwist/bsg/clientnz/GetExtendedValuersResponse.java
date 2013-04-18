
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
 *         &lt;element name="targetPropertyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="propertyAddress" type="{http://rpdata.com/bsg/schemas}propertyAddress" minOccurs="0"/>
 *         &lt;element name="propertyVisuals" type="{http://rpdata.com/bsg/schemas}propertyVisuals" minOccurs="0"/>
 *         &lt;element name="propertyLandTitle" type="{http://rpdata.com/bsg/schemas}propertyLandTitle" minOccurs="0"/>
 *         &lt;element name="propertyImprovements" type="{http://rpdata.com/bsg/schemas}propertyImprovements" minOccurs="0"/>
 *         &lt;element name="propertyOwnership" type="{http://rpdata.com/bsg/schemas}propertyOwnership" minOccurs="0"/>
 *         &lt;element name="propertySalesHistory" type="{http://rpdata.com/bsg/schemas}propertySalesHistory" minOccurs="0"/>
 *         &lt;element name="propertyOTMHistory" type="{http://rpdata.com/bsg/schemas}propertyOTMHistory" minOccurs="0"/>
 *         &lt;element name="propertyOTMRentalHistory" type="{http://rpdata.com/bsg/schemas}propertyOTMRentalHistory" minOccurs="0"/>
 *         &lt;element name="numberOfComparableSales" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyComparableSales" type="{http://rpdata.com/bsg/schemas}propertyComparableSales" minOccurs="0"/>
 *         &lt;element name="numberOfComparableOTMs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyComparableOTMs" type="{http://rpdata.com/bsg/schemas}propertyComparableOTMs" minOccurs="0"/>
 *         &lt;element name="numberOfMarketComparisons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyMarketComparisons" type="{http://rpdata.com/bsg/schemas}propertyMarketComparisons" minOccurs="0"/>
 *         &lt;element name="statsAreaProfile" type="{http://rpdata.com/bsg/schemas}statsAreaProfile" minOccurs="0"/>
 *         &lt;element name="statsMedianSalePrice" type="{http://rpdata.com/bsg/schemas}statsMedianSalePrice" minOccurs="0"/>
 *         &lt;element name="statsRecentMedianSalePrices" type="{http://rpdata.com/bsg/schemas}statsRecentMedianSalePrices" minOccurs="0"/>
 *         &lt;element name="statsSalesPerAnnum" type="{http://rpdata.com/bsg/schemas}statsSalesPerAnnum" minOccurs="0"/>
 *         &lt;element name="statsSaleByPrice" type="{http://rpdata.com/bsg/schemas}statsSaleByPrice" minOccurs="0"/>
 *         &lt;element name="statsCapitalGrowthMedianPrices" type="{http://rpdata.com/bsg/schemas}statsCapitalGrowthMedianPrices" minOccurs="0"/>
 *         &lt;element name="statsHousehold" type="{http://rpdata.com/bsg/schemas}statsHousehold" minOccurs="0"/>
 *         &lt;element name="statsAgeSexRatio" type="{http://rpdata.com/bsg/schemas}statsAgeSexRatio" minOccurs="0"/>
 *         &lt;element name="statsHouseholdIncome" type="{http://rpdata.com/bsg/schemas}statsHouseholdIncome" minOccurs="0"/>
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
    "targetPropertyId",
    "propertyAddress",
    "propertyVisuals",
    "propertyLandTitle",
    "propertyImprovements",
    "propertyOwnership",
    "propertySalesHistory",
    "propertyOTMHistory",
    "propertyOTMRentalHistory",
    "numberOfComparableSales",
    "propertyComparableSales",
    "numberOfComparableOTMs",
    "propertyComparableOTMs",
    "numberOfMarketComparisons",
    "propertyMarketComparisons",
    "statsAreaProfile",
    "statsMedianSalePrice",
    "statsRecentMedianSalePrices",
    "statsSalesPerAnnum",
    "statsSaleByPrice",
    "statsCapitalGrowthMedianPrices",
    "statsHousehold",
    "statsAgeSexRatio",
    "statsHouseholdIncome",
    "pdf"
})
@XmlRootElement(name = "getExtendedValuersResponse")
public class GetExtendedValuersResponse
    extends BaseBSGResponse
{

    protected int targetPropertyId;
    protected PropertyAddress propertyAddress;
    protected PropertyVisuals propertyVisuals;
    protected PropertyLandTitle propertyLandTitle;
    protected PropertyImprovements propertyImprovements;
    protected PropertyOwnership propertyOwnership;
    protected PropertySalesHistory propertySalesHistory;
    protected PropertyOTMHistory propertyOTMHistory;
    protected PropertyOTMRentalHistory propertyOTMRentalHistory;
    protected Integer numberOfComparableSales;
    protected PropertyComparableSales propertyComparableSales;
    protected Integer numberOfComparableOTMs;
    protected PropertyComparableOTMs propertyComparableOTMs;
    protected Integer numberOfMarketComparisons;
    protected PropertyMarketComparisons propertyMarketComparisons;
    protected StatsAreaProfile statsAreaProfile;
    protected StatsMedianSalePrice statsMedianSalePrice;
    protected StatsRecentMedianSalePrices statsRecentMedianSalePrices;
    protected StatsSalesPerAnnum statsSalesPerAnnum;
    protected StatsSaleByPrice statsSaleByPrice;
    protected StatsCapitalGrowthMedianPrices statsCapitalGrowthMedianPrices;
    protected StatsHousehold statsHousehold;
    protected StatsAgeSexRatio statsAgeSexRatio;
    protected StatsHouseholdIncome statsHouseholdIncome;
    protected Base64Document pdf;

    /**
     * Gets the value of the targetPropertyId property.
     * 
     */
    public int getTargetPropertyId() {
        return targetPropertyId;
    }

    /**
     * Sets the value of the targetPropertyId property.
     * 
     */
    public void setTargetPropertyId(int value) {
        this.targetPropertyId = value;
    }

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
     * Gets the value of the numberOfComparableSales property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfComparableSales() {
        return numberOfComparableSales;
    }

    /**
     * Sets the value of the numberOfComparableSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfComparableSales(Integer value) {
        this.numberOfComparableSales = value;
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
     * Gets the value of the numberOfComparableOTMs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfComparableOTMs() {
        return numberOfComparableOTMs;
    }

    /**
     * Sets the value of the numberOfComparableOTMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfComparableOTMs(Integer value) {
        this.numberOfComparableOTMs = value;
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
     * Gets the value of the numberOfMarketComparisons property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfMarketComparisons() {
        return numberOfMarketComparisons;
    }

    /**
     * Sets the value of the numberOfMarketComparisons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfMarketComparisons(Integer value) {
        this.numberOfMarketComparisons = value;
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
     * Gets the value of the statsAreaProfile property.
     * 
     * @return
     *     possible object is
     *     {@link StatsAreaProfile }
     *     
     */
    public StatsAreaProfile getStatsAreaProfile() {
        return statsAreaProfile;
    }

    /**
     * Sets the value of the statsAreaProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsAreaProfile }
     *     
     */
    public void setStatsAreaProfile(StatsAreaProfile value) {
        this.statsAreaProfile = value;
    }

    /**
     * Gets the value of the statsMedianSalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link StatsMedianSalePrice }
     *     
     */
    public StatsMedianSalePrice getStatsMedianSalePrice() {
        return statsMedianSalePrice;
    }

    /**
     * Sets the value of the statsMedianSalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsMedianSalePrice }
     *     
     */
    public void setStatsMedianSalePrice(StatsMedianSalePrice value) {
        this.statsMedianSalePrice = value;
    }

    /**
     * Gets the value of the statsRecentMedianSalePrices property.
     * 
     * @return
     *     possible object is
     *     {@link StatsRecentMedianSalePrices }
     *     
     */
    public StatsRecentMedianSalePrices getStatsRecentMedianSalePrices() {
        return statsRecentMedianSalePrices;
    }

    /**
     * Sets the value of the statsRecentMedianSalePrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsRecentMedianSalePrices }
     *     
     */
    public void setStatsRecentMedianSalePrices(StatsRecentMedianSalePrices value) {
        this.statsRecentMedianSalePrices = value;
    }

    /**
     * Gets the value of the statsSalesPerAnnum property.
     * 
     * @return
     *     possible object is
     *     {@link StatsSalesPerAnnum }
     *     
     */
    public StatsSalesPerAnnum getStatsSalesPerAnnum() {
        return statsSalesPerAnnum;
    }

    /**
     * Sets the value of the statsSalesPerAnnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsSalesPerAnnum }
     *     
     */
    public void setStatsSalesPerAnnum(StatsSalesPerAnnum value) {
        this.statsSalesPerAnnum = value;
    }

    /**
     * Gets the value of the statsSaleByPrice property.
     * 
     * @return
     *     possible object is
     *     {@link StatsSaleByPrice }
     *     
     */
    public StatsSaleByPrice getStatsSaleByPrice() {
        return statsSaleByPrice;
    }

    /**
     * Sets the value of the statsSaleByPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsSaleByPrice }
     *     
     */
    public void setStatsSaleByPrice(StatsSaleByPrice value) {
        this.statsSaleByPrice = value;
    }

    /**
     * Gets the value of the statsCapitalGrowthMedianPrices property.
     * 
     * @return
     *     possible object is
     *     {@link StatsCapitalGrowthMedianPrices }
     *     
     */
    public StatsCapitalGrowthMedianPrices getStatsCapitalGrowthMedianPrices() {
        return statsCapitalGrowthMedianPrices;
    }

    /**
     * Sets the value of the statsCapitalGrowthMedianPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsCapitalGrowthMedianPrices }
     *     
     */
    public void setStatsCapitalGrowthMedianPrices(StatsCapitalGrowthMedianPrices value) {
        this.statsCapitalGrowthMedianPrices = value;
    }

    /**
     * Gets the value of the statsHousehold property.
     * 
     * @return
     *     possible object is
     *     {@link StatsHousehold }
     *     
     */
    public StatsHousehold getStatsHousehold() {
        return statsHousehold;
    }

    /**
     * Sets the value of the statsHousehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsHousehold }
     *     
     */
    public void setStatsHousehold(StatsHousehold value) {
        this.statsHousehold = value;
    }

    /**
     * Gets the value of the statsAgeSexRatio property.
     * 
     * @return
     *     possible object is
     *     {@link StatsAgeSexRatio }
     *     
     */
    public StatsAgeSexRatio getStatsAgeSexRatio() {
        return statsAgeSexRatio;
    }

    /**
     * Sets the value of the statsAgeSexRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsAgeSexRatio }
     *     
     */
    public void setStatsAgeSexRatio(StatsAgeSexRatio value) {
        this.statsAgeSexRatio = value;
    }

    /**
     * Gets the value of the statsHouseholdIncome property.
     * 
     * @return
     *     possible object is
     *     {@link StatsHouseholdIncome }
     *     
     */
    public StatsHouseholdIncome getStatsHouseholdIncome() {
        return statsHouseholdIncome;
    }

    /**
     * Sets the value of the statsHouseholdIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsHouseholdIncome }
     *     
     */
    public void setStatsHouseholdIncome(StatsHouseholdIncome value) {
        this.statsHouseholdIncome = value;
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
