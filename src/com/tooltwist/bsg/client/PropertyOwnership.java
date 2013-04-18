
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for propertyOwnership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyOwnership">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grandfatherPropertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vendorsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownershipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastSaleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastSaleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastSalePrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastSettlementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "propertyOwnership", propOrder = {
    "grandfatherPropertyId",
    "vendorsName",
    "purchaserName",
    "ownerPhone",
    "ownershipType",
    "lastSaleDate",
    "lastSaleType",
    "lastSalePrice",
    "lastSettlementDate",
    "armsLengthTransaction",
    "salesClassification",
    "dateLastSalesPriceUpdated"
})
public class PropertyOwnership {

    protected Integer grandfatherPropertyId;
    protected String vendorsName;
    protected String purchaserName;
    protected String ownerPhone;
    protected String ownershipType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSaleDate;
    protected String lastSaleType;
    protected Integer lastSalePrice;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSettlementDate;
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
     * Gets the value of the ownerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerPhone() {
        return ownerPhone;
    }

    /**
     * Sets the value of the ownerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerPhone(String value) {
        this.ownerPhone = value;
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
     * Gets the value of the lastSaleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSaleDate() {
        return lastSaleDate;
    }

    /**
     * Sets the value of the lastSaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSaleDate(XMLGregorianCalendar value) {
        this.lastSaleDate = value;
    }

    /**
     * Gets the value of the lastSaleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSaleType() {
        return lastSaleType;
    }

    /**
     * Sets the value of the lastSaleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSaleType(String value) {
        this.lastSaleType = value;
    }

    /**
     * Gets the value of the lastSalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastSalePrice() {
        return lastSalePrice;
    }

    /**
     * Sets the value of the lastSalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastSalePrice(Integer value) {
        this.lastSalePrice = value;
    }

    /**
     * Gets the value of the lastSettlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSettlementDate() {
        return lastSettlementDate;
    }

    /**
     * Sets the value of the lastSettlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSettlementDate(XMLGregorianCalendar value) {
        this.lastSettlementDate = value;
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
