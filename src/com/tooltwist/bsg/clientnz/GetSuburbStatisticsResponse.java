
package com.tooltwist.bsg.clientnz;

import java.math.BigDecimal;
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
 *         &lt;element name="numberSold12Mths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="medianSalePrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="medianPriceChange12Mths" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="medianPriceChange3Yrs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="medianPriceChange5Yrs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="medianPriceChange10Yrs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="medianAskingRent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indicativeGrossRentalYield" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalListings12Mths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalDwellings" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="percentStockOnMarket12Mths" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="timeOnMarketDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalSalesValue12Mths" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="avgHoldPeriodYears" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
    "numberSold12Mths",
    "medianSalePrice",
    "medianPriceChange12Mths",
    "medianPriceChange3Yrs",
    "medianPriceChange5Yrs",
    "medianPriceChange10Yrs",
    "medianAskingRent",
    "indicativeGrossRentalYield",
    "totalListings12Mths",
    "totalDwellings",
    "percentStockOnMarket12Mths",
    "timeOnMarketDays",
    "totalSalesValue12Mths",
    "avgHoldPeriodYears"
})
@XmlRootElement(name = "getSuburbStatisticsResponse")
public class GetSuburbStatisticsResponse
    extends BaseBSGResponse
{

    protected Integer numberSold12Mths;
    protected Integer medianSalePrice;
    protected BigDecimal medianPriceChange12Mths;
    protected BigDecimal medianPriceChange3Yrs;
    protected BigDecimal medianPriceChange5Yrs;
    protected BigDecimal medianPriceChange10Yrs;
    protected Integer medianAskingRent;
    protected BigDecimal indicativeGrossRentalYield;
    protected Integer totalListings12Mths;
    protected Integer totalDwellings;
    protected BigDecimal percentStockOnMarket12Mths;
    protected Integer timeOnMarketDays;
    protected BigDecimal totalSalesValue12Mths;
    protected BigDecimal avgHoldPeriodYears;

    /**
     * Gets the value of the numberSold12Mths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberSold12Mths() {
        return numberSold12Mths;
    }

    /**
     * Sets the value of the numberSold12Mths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberSold12Mths(Integer value) {
        this.numberSold12Mths = value;
    }

    /**
     * Gets the value of the medianSalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMedianSalePrice() {
        return medianSalePrice;
    }

    /**
     * Sets the value of the medianSalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMedianSalePrice(Integer value) {
        this.medianSalePrice = value;
    }

    /**
     * Gets the value of the medianPriceChange12Mths property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMedianPriceChange12Mths() {
        return medianPriceChange12Mths;
    }

    /**
     * Sets the value of the medianPriceChange12Mths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMedianPriceChange12Mths(BigDecimal value) {
        this.medianPriceChange12Mths = value;
    }

    /**
     * Gets the value of the medianPriceChange3Yrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMedianPriceChange3Yrs() {
        return medianPriceChange3Yrs;
    }

    /**
     * Sets the value of the medianPriceChange3Yrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMedianPriceChange3Yrs(BigDecimal value) {
        this.medianPriceChange3Yrs = value;
    }

    /**
     * Gets the value of the medianPriceChange5Yrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMedianPriceChange5Yrs() {
        return medianPriceChange5Yrs;
    }

    /**
     * Sets the value of the medianPriceChange5Yrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMedianPriceChange5Yrs(BigDecimal value) {
        this.medianPriceChange5Yrs = value;
    }

    /**
     * Gets the value of the medianPriceChange10Yrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMedianPriceChange10Yrs() {
        return medianPriceChange10Yrs;
    }

    /**
     * Sets the value of the medianPriceChange10Yrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMedianPriceChange10Yrs(BigDecimal value) {
        this.medianPriceChange10Yrs = value;
    }

    /**
     * Gets the value of the medianAskingRent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMedianAskingRent() {
        return medianAskingRent;
    }

    /**
     * Sets the value of the medianAskingRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMedianAskingRent(Integer value) {
        this.medianAskingRent = value;
    }

    /**
     * Gets the value of the indicativeGrossRentalYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndicativeGrossRentalYield() {
        return indicativeGrossRentalYield;
    }

    /**
     * Sets the value of the indicativeGrossRentalYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndicativeGrossRentalYield(BigDecimal value) {
        this.indicativeGrossRentalYield = value;
    }

    /**
     * Gets the value of the totalListings12Mths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalListings12Mths() {
        return totalListings12Mths;
    }

    /**
     * Sets the value of the totalListings12Mths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalListings12Mths(Integer value) {
        this.totalListings12Mths = value;
    }

    /**
     * Gets the value of the totalDwellings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalDwellings() {
        return totalDwellings;
    }

    /**
     * Sets the value of the totalDwellings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalDwellings(Integer value) {
        this.totalDwellings = value;
    }

    /**
     * Gets the value of the percentStockOnMarket12Mths property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentStockOnMarket12Mths() {
        return percentStockOnMarket12Mths;
    }

    /**
     * Sets the value of the percentStockOnMarket12Mths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentStockOnMarket12Mths(BigDecimal value) {
        this.percentStockOnMarket12Mths = value;
    }

    /**
     * Gets the value of the timeOnMarketDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeOnMarketDays() {
        return timeOnMarketDays;
    }

    /**
     * Sets the value of the timeOnMarketDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeOnMarketDays(Integer value) {
        this.timeOnMarketDays = value;
    }

    /**
     * Gets the value of the totalSalesValue12Mths property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSalesValue12Mths() {
        return totalSalesValue12Mths;
    }

    /**
     * Sets the value of the totalSalesValue12Mths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSalesValue12Mths(BigDecimal value) {
        this.totalSalesValue12Mths = value;
    }

    /**
     * Gets the value of the avgHoldPeriodYears property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvgHoldPeriodYears() {
        return avgHoldPeriodYears;
    }

    /**
     * Sets the value of the avgHoldPeriodYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgHoldPeriodYears(BigDecimal value) {
        this.avgHoldPeriodYears = value;
    }

}
