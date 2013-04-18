
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bsgOtmPropertySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgOtmPropertySummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}bsgPropertySummaryBase">
 *       &lt;sequence>
 *         &lt;element name="actualTransferPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="actualTransferType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="currentListingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="currentListingPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="daysOtm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="listingAgentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listingAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listingStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="listingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percentFirstToLastListPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="percentLastToActualSalePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="percentTotalChange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startListingPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgOtmPropertySummary", propOrder = {
    "actualTransferPrice",
    "actualTransferType",
    "currentListingDate",
    "currentListingPrice",
    "daysOtm",
    "listingAgentName",
    "listingAgencyName",
    "listingDescription",
    "listingStartDate",
    "listingType",
    "percentFirstToLastListPrice",
    "percentLastToActualSalePrice",
    "percentTotalChange",
    "startListingPrice"
})
public class BsgOtmPropertySummary
    extends BsgPropertySummaryBase
{

    protected Integer actualTransferPrice;
    protected Integer actualTransferType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentListingDate;
    protected Integer currentListingPrice;
    protected Integer daysOtm;
    protected String listingAgentName;
    protected String listingAgencyName;
    protected String listingDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar listingStartDate;
    protected String listingType;
    protected Double percentFirstToLastListPrice;
    protected Double percentLastToActualSalePrice;
    protected Integer percentTotalChange;
    protected Integer startListingPrice;

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
     *     {@link Integer }
     *     
     */
    public Integer getActualTransferType() {
        return actualTransferType;
    }

    /**
     * Sets the value of the actualTransferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualTransferType(Integer value) {
        this.actualTransferType = value;
    }

    /**
     * Gets the value of the currentListingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentListingDate() {
        return currentListingDate;
    }

    /**
     * Sets the value of the currentListingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentListingDate(XMLGregorianCalendar value) {
        this.currentListingDate = value;
    }

    /**
     * Gets the value of the currentListingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentListingPrice() {
        return currentListingPrice;
    }

    /**
     * Sets the value of the currentListingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentListingPrice(Integer value) {
        this.currentListingPrice = value;
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
     * Gets the value of the listingStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListingStartDate() {
        return listingStartDate;
    }

    /**
     * Sets the value of the listingStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListingStartDate(XMLGregorianCalendar value) {
        this.listingStartDate = value;
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
     *     {@link Integer }
     *     
     */
    public Integer getPercentTotalChange() {
        return percentTotalChange;
    }

    /**
     * Sets the value of the percentTotalChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentTotalChange(Integer value) {
        this.percentTotalChange = value;
    }

    /**
     * Gets the value of the startListingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartListingPrice() {
        return startListingPrice;
    }

    /**
     * Sets the value of the startListingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartListingPrice(Integer value) {
        this.startListingPrice = value;
    }

}
