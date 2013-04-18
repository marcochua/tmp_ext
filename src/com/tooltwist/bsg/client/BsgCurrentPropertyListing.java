
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bsgCurrentPropertyListing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgCurrentPropertyListing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyAddress" type="{http://rpdata.com/bsg/schemas}bsgPropertyAddress" minOccurs="0"/>
 *         &lt;element name="publishedPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guidePriceFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="guidePriceTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="listingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "bsgCurrentPropertyListing", propOrder = {
    "propertyId",
    "propertyAddress",
    "publishedPrice",
    "guidePriceFrom",
    "guidePriceTo",
    "listingType",
    "listingDate",
    "propertyAttributes",
    "defaultPhoto"
})
public class BsgCurrentPropertyListing {

    protected Integer propertyId;
    protected BsgPropertyAddress propertyAddress;
    protected String publishedPrice;
    protected Integer guidePriceFrom;
    protected Integer guidePriceTo;
    protected String listingType;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar listingDate;
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
     * Gets the value of the publishedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedPrice() {
        return publishedPrice;
    }

    /**
     * Sets the value of the publishedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedPrice(String value) {
        this.publishedPrice = value;
    }

    /**
     * Gets the value of the guidePriceFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuidePriceFrom() {
        return guidePriceFrom;
    }

    /**
     * Sets the value of the guidePriceFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuidePriceFrom(Integer value) {
        this.guidePriceFrom = value;
    }

    /**
     * Gets the value of the guidePriceTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuidePriceTo() {
        return guidePriceTo;
    }

    /**
     * Sets the value of the guidePriceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuidePriceTo(Integer value) {
        this.guidePriceTo = value;
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
     * Gets the value of the listingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListingDate() {
        return listingDate;
    }

    /**
     * Sets the value of the listingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListingDate(XMLGregorianCalendar value) {
        this.listingDate = value;
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
