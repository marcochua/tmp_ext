
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bsgMarketComparePropertySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgMarketComparePropertySummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}bsgPropertySummaryBase">
 *       &lt;sequence>
 *         &lt;element name="actualTransferPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="actualTransferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualTransferDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="daysOtm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="listingAgentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listingAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstAdPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="firstAdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastAdPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastAdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="percentFirstToLastListPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="percentLastToActualSalePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="percentTotalChange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="settlementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgMarketComparePropertySummary", propOrder = {
    "actualTransferPrice",
    "actualTransferType",
    "actualTransferDate",
    "daysOtm",
    "listingAgentName",
    "listingAgencyName",
    "listingDescription",
    "listingType",
    "firstAdPrice",
    "firstAdDate",
    "lastAdPrice",
    "lastAdDate",
    "percentFirstToLastListPrice",
    "percentLastToActualSalePrice",
    "percentTotalChange",
    "settlementDate"
})
public class BsgMarketComparePropertySummary
    extends BsgPropertySummaryBase
{

    protected Integer actualTransferPrice;
    protected String actualTransferType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualTransferDate;
    protected Integer daysOtm;
    protected String listingAgentName;
    protected String listingAgencyName;
    protected String listingDescription;
    protected String listingType;
    protected Integer firstAdPrice;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstAdDate;
    protected Integer lastAdPrice;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAdDate;
    protected Double percentFirstToLastListPrice;
    protected Double percentLastToActualSalePrice;
    protected Double percentTotalChange;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settlementDate;

    /**
     * Gets the value of the actualTransferPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualTransferPrice() {
        return actualTransferPrice;
    }

    /**
     * Sets the value of the actualTransferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualTransferPrice(Integer value) {
        this.actualTransferPrice = value;
    }

    /**
     * Gets the value of the actualTransferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualTransferType() {
        return actualTransferType;
    }

    /**
     * Sets the value of the actualTransferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualTransferType(String value) {
        this.actualTransferType = value;
    }

    /**
     * Gets the value of the actualTransferDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualTransferDate() {
        return actualTransferDate;
    }

    /**
     * Sets the value of the actualTransferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualTransferDate(XMLGregorianCalendar value) {
        this.actualTransferDate = value;
    }

    /**
     * Gets the value of the daysOtm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysOtm() {
        return daysOtm;
    }

    /**
     * Sets the value of the daysOtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysOtm(Integer value) {
        this.daysOtm = value;
    }

    /**
     * Gets the value of the listingAgentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingAgentName() {
        return listingAgentName;
    }

    /**
     * Sets the value of the listingAgentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingAgentName(String value) {
        this.listingAgentName = value;
    }

    /**
     * Gets the value of the listingAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingAgencyName() {
        return listingAgencyName;
    }

    /**
     * Sets the value of the listingAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingAgencyName(String value) {
        this.listingAgencyName = value;
    }

    /**
     * Gets the value of the listingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingDescription() {
        return listingDescription;
    }

    /**
     * Sets the value of the listingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingDescription(String value) {
        this.listingDescription = value;
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingType(String value) {
        this.listingType = value;
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
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlementDate(XMLGregorianCalendar value) {
        this.settlementDate = value;
    }

}
