
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for propertySale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertySale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grandfatherPropertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vendorsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownershipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="saleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salePrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="settlementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="armsLengthTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateLastSalesPriceUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertySale", propOrder = {
    "grandfatherPropertyId",
    "vendorsName",
    "purchaserName",
    "ownershipType",
    "saleDate",
    "saleType",
    "salePrice",
    "settlementDate",
    "armsLengthTransaction",
    "salesClassification",
    "dateLastSalesPriceUpdated"
})
public class PropertySale {

    protected Integer grandfatherPropertyId;
    protected String vendorsName;
    protected String purchaserName;
    protected String ownershipType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar saleDate;
    protected String saleType;
    protected Integer salePrice;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settlementDate;
    protected String armsLengthTransaction;
    protected String salesClassification;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastSalesPriceUpdated;

    /**
     * Gets the value of the grandfatherPropertyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrandfatherPropertyId() {
        return grandfatherPropertyId;
    }

    /**
     * Sets the value of the grandfatherPropertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrandfatherPropertyId(Integer value) {
        this.grandfatherPropertyId = value;
    }

    /**
     * Gets the value of the vendorsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorsName() {
        return vendorsName;
    }

    /**
     * Sets the value of the vendorsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorsName(String value) {
        this.vendorsName = value;
    }

    /**
     * Gets the value of the purchaserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserName() {
        return purchaserName;
    }

    /**
     * Sets the value of the purchaserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserName(String value) {
        this.purchaserName = value;
    }

    /**
     * Gets the value of the ownershipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipType() {
        return ownershipType;
    }

    /**
     * Sets the value of the ownershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipType(String value) {
        this.ownershipType = value;
    }

    /**
     * Gets the value of the saleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDate() {
        return saleDate;
    }

    /**
     * Sets the value of the saleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDate(XMLGregorianCalendar value) {
        this.saleDate = value;
    }

    /**
     * Gets the value of the saleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleType() {
        return saleType;
    }

    /**
     * Sets the value of the saleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleType(String value) {
        this.saleType = value;
    }

    /**
     * Gets the value of the salePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalePrice() {
        return salePrice;
    }

    /**
     * Sets the value of the salePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalePrice(Integer value) {
        this.salePrice = value;
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

    /**
     * Gets the value of the armsLengthTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmsLengthTransaction() {
        return armsLengthTransaction;
    }

    /**
     * Sets the value of the armsLengthTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmsLengthTransaction(String value) {
        this.armsLengthTransaction = value;
    }

    /**
     * Gets the value of the salesClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesClassification() {
        return salesClassification;
    }

    /**
     * Sets the value of the salesClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesClassification(String value) {
        this.salesClassification = value;
    }

    /**
     * Gets the value of the dateLastSalesPriceUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastSalesPriceUpdated() {
        return dateLastSalesPriceUpdated;
    }

    /**
     * Sets the value of the dateLastSalesPriceUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastSalesPriceUpdated(XMLGregorianCalendar value) {
        this.dateLastSalesPriceUpdated = value;
    }

}
