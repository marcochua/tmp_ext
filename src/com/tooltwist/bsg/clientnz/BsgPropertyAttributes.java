
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bsgPropertyAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgPropertyAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allPropertyAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bedrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carSpaces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="landArea" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="floorArea" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lockUpGarage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyAttributeSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgPropertyAttributes", propOrder = {
    "allPropertyAttributes",
    "bathrooms",
    "bedrooms",
    "carSpaces",
    "landArea",
    "floorArea",
    "lockUpGarage",
    "propertyAttributeSummary"
})
public class BsgPropertyAttributes {

    protected String allPropertyAttributes;
    protected Integer bathrooms;
    protected Integer bedrooms;
    protected Integer carSpaces;
    protected Long landArea;
    protected Integer floorArea;
    protected Integer lockUpGarage;
    protected String propertyAttributeSummary;

    /**
     * Gets the value of the allPropertyAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllPropertyAttributes() {
        return allPropertyAttributes;
    }

    /**
     * Sets the value of the allPropertyAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllPropertyAttributes(String value) {
        this.allPropertyAttributes = value;
    }

    /**
     * Gets the value of the bathrooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBathrooms() {
        return bathrooms;
    }

    /**
     * Sets the value of the bathrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBathrooms(Integer value) {
        this.bathrooms = value;
    }

    /**
     * Gets the value of the bedrooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBedrooms() {
        return bedrooms;
    }

    /**
     * Sets the value of the bedrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBedrooms(Integer value) {
        this.bedrooms = value;
    }

    /**
     * Gets the value of the carSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarSpaces() {
        return carSpaces;
    }

    /**
     * Sets the value of the carSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarSpaces(Integer value) {
        this.carSpaces = value;
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
     * Gets the value of the floorArea property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFloorArea() {
        return floorArea;
    }

    /**
     * Sets the value of the floorArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFloorArea(Integer value) {
        this.floorArea = value;
    }

    /**
     * Gets the value of the lockUpGarage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLockUpGarage() {
        return lockUpGarage;
    }

    /**
     * Sets the value of the lockUpGarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLockUpGarage(Integer value) {
        this.lockUpGarage = value;
    }

    /**
     * Gets the value of the propertyAttributeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyAttributeSummary() {
        return propertyAttributeSummary;
    }

    /**
     * Sets the value of the propertyAttributeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyAttributeSummary(String value) {
        this.propertyAttributeSummary = value;
    }

}
