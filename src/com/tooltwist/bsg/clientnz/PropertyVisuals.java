
package com.tooltwist.bsg.clientnz;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyVisuals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyVisuals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mainPhoto" type="{http://rpdata.com/bsg/schemas}photoData" minOccurs="0"/>
 *         &lt;element name="propertyPhotos" type="{http://rpdata.com/bsg/schemas}photoData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="propertyMapImages" type="{http://rpdata.com/bsg/schemas}propertyMapImage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="floorPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaMap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyVisuals", propOrder = {
    "mainPhoto",
    "propertyPhotos",
    "propertyMapImages",
    "longitude",
    "latitude",
    "floorPlan",
    "areaMap"
})
public class PropertyVisuals {

    protected PhotoData mainPhoto;
    @XmlElement(nillable = true)
    protected List<PhotoData> propertyPhotos;
    @XmlElement(nillable = true)
    protected List<PropertyMapImage> propertyMapImages;
    protected Double longitude;
    protected Double latitude;
    protected String floorPlan;
    protected String areaMap;

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
     * Gets the value of the propertyPhotos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyPhotos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyPhotos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhotoData }
     * 
     * 
     */
    public List<PhotoData> getPropertyPhotos() {
        if (propertyPhotos == null) {
            propertyPhotos = new ArrayList<PhotoData>();
        }
        return this.propertyPhotos;
    }

    /**
     * Gets the value of the propertyMapImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyMapImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyMapImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyMapImage }
     * 
     * 
     */
    public List<PropertyMapImage> getPropertyMapImages() {
        if (propertyMapImages == null) {
            propertyMapImages = new ArrayList<PropertyMapImage>();
        }
        return this.propertyMapImages;
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
     * Gets the value of the floorPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorPlan() {
        return floorPlan;
    }

    /**
     * Sets the value of the floorPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorPlan(String value) {
        this.floorPlan = value;
    }

    /**
     * Gets the value of the areaMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaMap() {
        return areaMap;
    }

    /**
     * Sets the value of the areaMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaMap(String value) {
        this.areaMap = value;
    }

}
