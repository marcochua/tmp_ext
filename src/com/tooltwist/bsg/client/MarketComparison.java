
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for marketComparison complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="marketComparison">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainPhoto" type="{http://rpdata.com/bsg/schemas}photoData" minOccurs="0"/>
 *         &lt;element name="propertyAddress" type="{http://rpdata.com/bsg/schemas}propertyAddress" minOccurs="0"/>
 *         &lt;element name="firstAdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstAdPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastAdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastAdPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="daysOnTheMarket" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="actualSalePrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="actualSaleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualSaleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="percentFirstToLastListPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="percentLastToActualSalePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="percentTotalChange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellingAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellingAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="methodOfSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bedroom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bathroom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carspace" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="landArea" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="distanceFromTarget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marketComparison", propOrder = {
    "propertyId",
    "propertyCategory",
    "mainPhoto",
    "propertyAddress",
    "firstAdDate",
    "firstAdPrice",
    "lastAdDate",
    "lastAdPrice",
    "daysOnTheMarket",
    "actualSalePrice",
    "actualSaleType",
    "actualSaleDate",
    "percentFirstToLastListPrice",
    "percentLastToActualSalePrice",
    "percentTotalChange",
    "attributes",
    "sellingAgent",
    "sellingAgency",
    "agencyPhone",
    "methodOfSale",
    "bedroom",
    "bathroom",
    "carspace",
    "landArea",
    "distanceFromTarget"
})
public class MarketComparison {

    protected Integer propertyId;
    protected String propertyCategory;
    protected PhotoData mainPhoto;
    protected PropertyAddress propertyAddress;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstAdDate;
    protected Integer firstAdPrice;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAdDate;
    protected Integer lastAdPrice;
    protected Integer daysOnTheMarket;
    protected Integer actualSalePrice;
    protected String actualSaleType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualSaleDate;
    protected Double percentFirstToLastListPrice;
    protected Double percentLastToActualSalePrice;
    protected Double percentTotalChange;
    protected String attributes;
    protected String sellingAgent;
    protected String sellingAgency;
    protected String agencyPhone;
    protected String methodOfSale;
    protected Integer bedroom;
    protected Integer bathroom;
    protected Integer carspace;
    protected Long landArea;
    protected Double distanceFromTarget;

    /**
     * Gets the value of the propertyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPropertyId(Integer value) {
        this.propertyId = value;
    }

    /**
     * Gets the value of the propertyCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyCategory() {
        return propertyCategory;
    }

    /**
     * Sets the value of the propertyCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyCategory(String value) {
        this.propertyCategory = value;
    }

    /**
     * Gets the value of the mainPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link PhotoData }
     *     
     */
    public PhotoData getMainPhoto() {
        return mainPhoto;
    }

    /**
     * Sets the value of the mainPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotoData }
     *     
     */
    public void setMainPhoto(PhotoData value) {
        this.mainPhoto = value;
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
     * Gets the value of the firstAdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstAdDate() {
        return firstAdDate;
    }

    /**
     * Sets the value of the firstAdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstAdDate(XMLGregorianCalendar value) {
        this.firstAdDate = value;
    }

    /**
     * Gets the value of the firstAdPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstAdPrice() {
        return firstAdPrice;
    }

    /**
     * Sets the value of the firstAdPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstAdPrice(Integer value) {
        this.firstAdPrice = value;
    }

    /**
     * Gets the value of the lastAdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAdDate() {
        return lastAdDate;
    }

    /**
     * Sets the value of the lastAdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAdDate(XMLGregorianCalendar value) {
        this.lastAdDate = value;
    }

    /**
     * Gets the value of the lastAdPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastAdPrice() {
        return lastAdPrice;
    }

    /**
     * Sets the value of the lastAdPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastAdPrice(Integer value) {
        this.lastAdPrice = value;
    }

    /**
     * Gets the value of the daysOnTheMarket property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysOnTheMarket() {
        return daysOnTheMarket;
    }

    /**
     * Sets the value of the daysOnTheMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysOnTheMarket(Integer value) {
        this.daysOnTheMarket = value;
    }

    /**
     * Gets the value of the actualSalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualSalePrice() {
        return actualSalePrice;
    }

    /**
     * Sets the value of the actualSalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualSalePrice(Integer value) {
        this.actualSalePrice = value;
    }

    /**
     * Gets the value of the actualSaleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualSaleType() {
        return actualSaleType;
    }

    /**
     * Sets the value of the actualSaleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualSaleType(String value) {
        this.actualSaleType = value;
    }

    /**
     * Gets the value of the actualSaleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualSaleDate() {
        return actualSaleDate;
    }

    /**
     * Sets the value of the actualSaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualSaleDate(XMLGregorianCalendar value) {
        this.actualSaleDate = value;
    }

    /**
     * Gets the value of the percentFirstToLastListPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentFirstToLastListPrice() {
        return percentFirstToLastListPrice;
    }

    /**
     * Sets the value of the percentFirstToLastListPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentFirstToLastListPrice(Double value) {
        this.percentFirstToLastListPrice = value;
    }

    /**
     * Gets the value of the percentLastToActualSalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentLastToActualSalePrice() {
        return percentLastToActualSalePrice;
    }

    /**
     * Sets the value of the percentLastToActualSalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentLastToActualSalePrice(Double value) {
        this.percentLastToActualSalePrice = value;
    }

    /**
     * Gets the value of the percentTotalChange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentTotalChange() {
        return percentTotalChange;
    }

    /**
     * Sets the value of the percentTotalChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentTotalChange(Double value) {
        this.percentTotalChange = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributes(String value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the sellingAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingAgent() {
        return sellingAgent;
    }

    /**
     * Sets the value of the sellingAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingAgent(String value) {
        this.sellingAgent = value;
    }

    /**
     * Gets the value of the sellingAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingAgency() {
        return sellingAgency;
    }

    /**
     * Sets the value of the sellingAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingAgency(String value) {
        this.sellingAgency = value;
    }

    /**
     * Gets the value of the agencyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyPhone() {
        return agencyPhone;
    }

    /**
     * Sets the value of the agencyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyPhone(String value) {
        this.agencyPhone = value;
    }

    /**
     * Gets the value of the methodOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodOfSale() {
        return methodOfSale;
    }

    /**
     * Sets the value of the methodOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodOfSale(String value) {
        this.methodOfSale = value;
    }

    /**
     * Gets the value of the bedroom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBedroom() {
        return bedroom;
    }

    /**
     * Sets the value of the bedroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBedroom(Integer value) {
        this.bedroom = value;
    }

    /**
     * Gets the value of the bathroom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBathroom() {
        return bathroom;
    }

    /**
     * Sets the value of the bathroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBathroom(Integer value) {
        this.bathroom = value;
    }

    /**
     * Gets the value of the carspace property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarspace() {
        return carspace;
    }

    /**
     * Sets the value of the carspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarspace(Integer value) {
        this.carspace = value;
    }

    /**
     * Gets the value of the landArea property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLandArea() {
        return landArea;
    }

    /**
     * Sets the value of the landArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLandArea(Long value) {
        this.landArea = value;
    }

    /**
     * Gets the value of the distanceFromTarget property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistanceFromTarget() {
        return distanceFromTarget;
    }

    /**
     * Sets the value of the distanceFromTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistanceFromTarget(Double value) {
        this.distanceFromTarget = value;
    }

}
