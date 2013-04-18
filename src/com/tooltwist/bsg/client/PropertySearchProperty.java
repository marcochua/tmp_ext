
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for propertySearchProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertySearchProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="propertyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultPhoto" type="{http://rpdata.com/bsg/schemas}bsgPropertyDefaultPhoto" minOccurs="0"/>
 *         &lt;element name="propertyAddress" type="{http://rpdata.com/bsg/schemas}propertyAddress" minOccurs="0"/>
 *         &lt;element name="propertyAttributes" type="{http://rpdata.com/bsg/schemas}propertyAttributes" minOccurs="0"/>
 *         &lt;element name="landTitle" type="{http://rpdata.com/bsg/schemas}landTitle" minOccurs="0"/>
 *         &lt;element name="autoValueEstimate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="autoValueLowEstimate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="autoValueHighEstimate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="autoValueFSDScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="autoValueScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="autoValueRunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertySearchProperty", propOrder = {
    "propertyId",
    "longitude",
    "latitude",
    "propertyType",
    "defaultPhoto",
    "propertyAddress",
    "propertyAttributes",
    "landTitle",
    "autoValueEstimate",
    "autoValueLowEstimate",
    "autoValueHighEstimate",
    "autoValueFSDScore",
    "autoValueScore",
    "autoValueRunDate"
})
@XmlSeeAlso({
    PropertySearchSale.class,
    PropertySearchOTM.class
})
public class PropertySearchProperty {

    protected Integer propertyId;
    protected Double longitude;
    protected Double latitude;
    protected String propertyType;
    protected BsgPropertyDefaultPhoto defaultPhoto;
    protected PropertyAddress propertyAddress;
    protected PropertyAttributes propertyAttributes;
    protected LandTitle landTitle;
    protected Integer autoValueEstimate;
    protected Integer autoValueLowEstimate;
    protected Integer autoValueHighEstimate;
    protected Integer autoValueFSDScore;
    protected Integer autoValueScore;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar autoValueRunDate;

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
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyType(String value) {
        this.propertyType = value;
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
     * Gets the value of the propertyAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyAttributes }
     *     
     */
    public PropertyAttributes getPropertyAttributes() {
        return propertyAttributes;
    }

    /**
     * Sets the value of the propertyAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyAttributes }
     *     
     */
    public void setPropertyAttributes(PropertyAttributes value) {
        this.propertyAttributes = value;
    }

    /**
     * Gets the value of the landTitle property.
     * 
     * @return
     *     possible object is
     *     {@link LandTitle }
     *     
     */
    public LandTitle getLandTitle() {
        return landTitle;
    }

    /**
     * Sets the value of the landTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandTitle }
     *     
     */
    public void setLandTitle(LandTitle value) {
        this.landTitle = value;
    }

    /**
     * Gets the value of the autoValueEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoValueEstimate() {
        return autoValueEstimate;
    }

    /**
     * Sets the value of the autoValueEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoValueEstimate(Integer value) {
        this.autoValueEstimate = value;
    }

    /**
     * Gets the value of the autoValueLowEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoValueLowEstimate() {
        return autoValueLowEstimate;
    }

    /**
     * Sets the value of the autoValueLowEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoValueLowEstimate(Integer value) {
        this.autoValueLowEstimate = value;
    }

    /**
     * Gets the value of the autoValueHighEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoValueHighEstimate() {
        return autoValueHighEstimate;
    }

    /**
     * Sets the value of the autoValueHighEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoValueHighEstimate(Integer value) {
        this.autoValueHighEstimate = value;
    }

    /**
     * Gets the value of the autoValueFSDScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoValueFSDScore() {
        return autoValueFSDScore;
    }

    /**
     * Sets the value of the autoValueFSDScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoValueFSDScore(Integer value) {
        this.autoValueFSDScore = value;
    }

    /**
     * Gets the value of the autoValueScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoValueScore() {
        return autoValueScore;
    }

    /**
     * Sets the value of the autoValueScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoValueScore(Integer value) {
        this.autoValueScore = value;
    }

    /**
     * Gets the value of the autoValueRunDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAutoValueRunDate() {
        return autoValueRunDate;
    }

    /**
     * Sets the value of the autoValueRunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAutoValueRunDate(XMLGregorianCalendar value) {
        this.autoValueRunDate = value;
    }

}
