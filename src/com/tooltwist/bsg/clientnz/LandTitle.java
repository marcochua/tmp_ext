
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for landTitle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landTitle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="landUsePrimary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="landUseSecondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoneDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="realPropertyDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lotPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landTitle", propOrder = {
    "landUsePrimary",
    "landUseSecondary",
    "zone",
    "zoneDescription",
    "realPropertyDescriptor",
    "lotPlan"
})
public class LandTitle {

    protected String landUsePrimary;
    protected String landUseSecondary;
    protected String zone;
    protected String zoneDescription;
    protected String realPropertyDescriptor;
    protected String lotPlan;

    /**
     * Gets the value of the landUsePrimary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandUsePrimary() {
        return landUsePrimary;
    }

    /**
     * Sets the value of the landUsePrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandUsePrimary(String value) {
        this.landUsePrimary = value;
    }

    /**
     * Gets the value of the landUseSecondary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandUseSecondary() {
        return landUseSecondary;
    }

    /**
     * Sets the value of the landUseSecondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandUseSecondary(String value) {
        this.landUseSecondary = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Gets the value of the zoneDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneDescription() {
        return zoneDescription;
    }

    /**
     * Sets the value of the zoneDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneDescription(String value) {
        this.zoneDescription = value;
    }

    /**
     * Gets the value of the realPropertyDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealPropertyDescriptor() {
        return realPropertyDescriptor;
    }

    /**
     * Sets the value of the realPropertyDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealPropertyDescriptor(String value) {
        this.realPropertyDescriptor = value;
    }

    /**
     * Gets the value of the lotPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotPlan() {
        return lotPlan;
    }

    /**
     * Sets the value of the lotPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotPlan(String value) {
        this.lotPlan = value;
    }

}
