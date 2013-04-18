
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valuationAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valuationAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bedrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carspaces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estimatedValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertySaleDetails" type="{http://rpdata.com/bsg/schemas}propertySaleDetails" minOccurs="0"/>
 *         &lt;element name="yearBuilt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="floorAreaM2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="landAreaM2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="craftsmanshipQuality" type="{http://rpdata.com/bsg/schemas}craftsmanshipQuality" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valuationAttributes", propOrder = {
    "bedrooms",
    "bathrooms",
    "carspaces",
    "estimatedValue",
    "propertySaleDetails",
    "yearBuilt",
    "floorAreaM2",
    "landAreaM2",
    "craftsmanshipQuality"
})
public class ValuationAttributes {

    protected Integer bedrooms;
    protected Integer bathrooms;
    protected Integer carspaces;
    protected Integer estimatedValue;
    protected PropertySaleDetails propertySaleDetails;
    protected Integer yearBuilt;
    protected Integer floorAreaM2;
    protected Integer landAreaM2;
    protected CraftsmanshipQuality craftsmanshipQuality;

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
     * Gets the value of the carspaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarspaces() {
        return carspaces;
    }

    /**
     * Sets the value of the carspaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarspaces(Integer value) {
        this.carspaces = value;
    }

    /**
     * Gets the value of the estimatedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstimatedValue() {
        return estimatedValue;
    }

    /**
     * Sets the value of the estimatedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstimatedValue(Integer value) {
        this.estimatedValue = value;
    }

    /**
     * Gets the value of the propertySaleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySaleDetails }
     *     
     */
    public PropertySaleDetails getPropertySaleDetails() {
        return propertySaleDetails;
    }

    /**
     * Sets the value of the propertySaleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySaleDetails }
     *     
     */
    public void setPropertySaleDetails(PropertySaleDetails value) {
        this.propertySaleDetails = value;
    }

    /**
     * Gets the value of the yearBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearBuilt() {
        return yearBuilt;
    }

    /**
     * Sets the value of the yearBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearBuilt(Integer value) {
        this.yearBuilt = value;
    }

    /**
     * Gets the value of the floorAreaM2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFloorAreaM2() {
        return floorAreaM2;
    }

    /**
     * Sets the value of the floorAreaM2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFloorAreaM2(Integer value) {
        this.floorAreaM2 = value;
    }

    /**
     * Gets the value of the landAreaM2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLandAreaM2() {
        return landAreaM2;
    }

    /**
     * Sets the value of the landAreaM2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLandAreaM2(Integer value) {
        this.landAreaM2 = value;
    }

    /**
     * Gets the value of the craftsmanshipQuality property.
     * 
     * @return
     *     possible object is
     *     {@link CraftsmanshipQuality }
     *     
     */
    public CraftsmanshipQuality getCraftsmanshipQuality() {
        return craftsmanshipQuality;
    }

    /**
     * Sets the value of the craftsmanshipQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link CraftsmanshipQuality }
     *     
     */
    public void setCraftsmanshipQuality(CraftsmanshipQuality value) {
        this.craftsmanshipQuality = value;
    }

}
