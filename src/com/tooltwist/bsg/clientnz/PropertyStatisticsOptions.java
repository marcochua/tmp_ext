
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyStatisticsOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyStatisticsOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="showNumberSold12Mths" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showMedianSalePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showMedianPriceChange12Mths" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showMedianPriceChange3Yrs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showMedianPriceChange5Yrs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showMedianPriceChange10Yrs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showMedianAskingRent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showIndicativeGrossRentalYield" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showTotalListings12Mths" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showTotalDwellings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showPercentStockOnMarket12Mths" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showTimeOnMarketDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showTotalSalesValue12Mths" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showAvgHoldPeriodYears" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyStatisticsOptions", propOrder = {
    "showNumberSold12Mths",
    "showMedianSalePrice",
    "showMedianPriceChange12Mths",
    "showMedianPriceChange3Yrs",
    "showMedianPriceChange5Yrs",
    "showMedianPriceChange10Yrs",
    "showMedianAskingRent",
    "showIndicativeGrossRentalYield",
    "showTotalListings12Mths",
    "showTotalDwellings",
    "showPercentStockOnMarket12Mths",
    "showTimeOnMarketDays",
    "showTotalSalesValue12Mths",
    "showAvgHoldPeriodYears"
})
public class PropertyStatisticsOptions {

    protected Boolean showNumberSold12Mths;
    protected Boolean showMedianSalePrice;
    protected Boolean showMedianPriceChange12Mths;
    protected Boolean showMedianPriceChange3Yrs;
    protected Boolean showMedianPriceChange5Yrs;
    protected Boolean showMedianPriceChange10Yrs;
    protected Boolean showMedianAskingRent;
    protected Boolean showIndicativeGrossRentalYield;
    protected Boolean showTotalListings12Mths;
    protected Boolean showTotalDwellings;
    protected Boolean showPercentStockOnMarket12Mths;
    protected Boolean showTimeOnMarketDays;
    protected Boolean showTotalSalesValue12Mths;
    protected Boolean showAvgHoldPeriodYears;

    /**
     * Gets the value of the showNumberSold12Mths property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowNumberSold12Mths() {
        return showNumberSold12Mths;
    }

    /**
     * Sets the value of the showNumberSold12Mths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowNumberSold12Mths(Boolean value) {
        this.showNumberSold12Mths = value;
    }

    /**
     * Gets the value of the showMedianSalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMedianSalePrice() {
        return showMedianSalePrice;
    }

    /**
     * Sets the value of the showMedianSalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMedianSalePrice(Boolean value) {
        this.showMedianSalePrice = value;
    }

    /**
     * Gets the value of the showMedianPriceChange12Mths property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMedianPriceChange12Mths() {
        return showMedianPriceChange12Mths;
    }

    /**
     * Sets the value of the showMedianPriceChange12Mths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMedianPriceChange12Mths(Boolean value) {
        this.showMedianPriceChange12Mths = value;
    }

    /**
     * Gets the value of the showMedianPriceChange3Yrs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMedianPriceChange3Yrs() {
        return showMedianPriceChange3Yrs;
    }

    /**
     * Sets the value of the showMedianPriceChange3Yrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMedianPriceChange3Yrs(Boolean value) {
        this.showMedianPriceChange3Yrs = value;
    }

    /**
     * Gets the value of the showMedianPriceChange5Yrs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMedianPriceChange5Yrs() {
        return showMedianPriceChange5Yrs;
    }

    /**
     * Sets the value of the showMedianPriceChange5Yrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMedianPriceChange5Yrs(Boolean value) {
        this.showMedianPriceChange5Yrs = value;
    }

    /**
     * Gets the value of the showMedianPriceChange10Yrs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMedianPriceChange10Yrs() {
        return showMedianPriceChange10Yrs;
    }

    /**
     * Sets the value of the showMedianPriceChange10Yrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMedianPriceChange10Yrs(Boolean value) {
        this.showMedianPriceChange10Yrs = value;
    }

    /**
     * Gets the value of the showMedianAskingRent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMedianAskingRent() {
        return showMedianAskingRent;
    }

    /**
     * Sets the value of the showMedianAskingRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMedianAskingRent(Boolean value) {
        this.showMedianAskingRent = value;
    }

    /**
     * Gets the value of the showIndicativeGrossRentalYield property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowIndicativeGrossRentalYield() {
        return showIndicativeGrossRentalYield;
    }

    /**
     * Sets the value of the showIndicativeGrossRentalYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowIndicativeGrossRentalYield(Boolean value) {
        this.showIndicativeGrossRentalYield = value;
    }

    /**
     * Gets the value of the showTotalListings12Mths property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowTotalListings12Mths() {
        return showTotalListings12Mths;
    }

    /**
     * Sets the value of the showTotalListings12Mths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTotalListings12Mths(Boolean value) {
        this.showTotalListings12Mths = value;
    }

    /**
     * Gets the value of the showTotalDwellings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowTotalDwellings() {
        return showTotalDwellings;
    }

    /**
     * Sets the value of the showTotalDwellings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTotalDwellings(Boolean value) {
        this.showTotalDwellings = value;
    }

    /**
     * Gets the value of the showPercentStockOnMarket12Mths property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPercentStockOnMarket12Mths() {
        return showPercentStockOnMarket12Mths;
    }

    /**
     * Sets the value of the showPercentStockOnMarket12Mths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPercentStockOnMarket12Mths(Boolean value) {
        this.showPercentStockOnMarket12Mths = value;
    }

    /**
     * Gets the value of the showTimeOnMarketDays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowTimeOnMarketDays() {
        return showTimeOnMarketDays;
    }

    /**
     * Sets the value of the showTimeOnMarketDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTimeOnMarketDays(Boolean value) {
        this.showTimeOnMarketDays = value;
    }

    /**
     * Gets the value of the showTotalSalesValue12Mths property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowTotalSalesValue12Mths() {
        return showTotalSalesValue12Mths;
    }

    /**
     * Sets the value of the showTotalSalesValue12Mths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTotalSalesValue12Mths(Boolean value) {
        this.showTotalSalesValue12Mths = value;
    }

    /**
     * Gets the value of the showAvgHoldPeriodYears property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowAvgHoldPeriodYears() {
        return showAvgHoldPeriodYears;
    }

    /**
     * Sets the value of the showAvgHoldPeriodYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowAvgHoldPeriodYears(Boolean value) {
        this.showAvgHoldPeriodYears = value;
    }

}
