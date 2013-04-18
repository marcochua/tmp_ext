
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bsgRecentSalePropertySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgRecentSalePropertySummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyAddress" type="{http://rpdata.com/bsg/schemas}bsgPropertyAddress" minOccurs="0"/>
 *         &lt;element name="salePrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saleDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="saleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyAttributes" type="{http://rpdata.com/bsg/schemas}bsgPropertyAttributes" minOccurs="0"/>
 *         &lt;element name="defaultPhoto" type="{http://rpdata.com/bsg/schemas}bsgPropertyDefaultPhoto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgRecentSalePropertySummary", propOrder = {
    "propertyId",
    "propertyAddress",
    "salePrice",
    "saleDate",
    "saleType",
    "propertyAttributes",
    "defaultPhoto"
})
public class BsgRecentSalePropertySummary {

    protected Integer propertyId;
    protected BsgPropertyAddress propertyAddress;
    protected Integer salePrice;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleDate;
    protected String saleType;
    protected BsgPropertyAttributes propertyAttributes;
    protected BsgPropertyDefaultPhoto defaultPhoto;

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
     * Gets the value of the propertyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertyAddress }
     *     
     */
    public BsgPropertyAddress getPropertyAddress() {
        return propertyAddress;
    }

    /**
     * Sets the value of the propertyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertyAddress }
     *     
     */
    public void setPropertyAddress(BsgPropertyAddress value) {
        this.propertyAddress = value;
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
     * Gets the value of the propertyAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertyAttributes }
     *     
     */
    public BsgPropertyAttributes getPropertyAttributes() {
        return propertyAttributes;
    }

    /**
     * Sets the value of the propertyAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertyAttributes }
     *     
     */
    public void setPropertyAttributes(BsgPropertyAttributes value) {
        this.propertyAttributes = value;
    }

    /**
     * Gets the value of the defaultPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertyDefaultPhoto }
     *     
     */
    public BsgPropertyDefaultPhoto getDefaultPhoto() {
        return defaultPhoto;
    }

    /**
     * Sets the value of the defaultPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertyDefaultPhoto }
     *     
     */
    public void setDefaultPhoto(BsgPropertyDefaultPhoto value) {
        this.defaultPhoto = value;
    }

}
