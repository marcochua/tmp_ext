
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyMapOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyMapOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}layerMapOptions">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://rpdata.com/bsg/schemas}propertyMapOptionType" minOccurs="0"/>
 *         &lt;element name="showLotAreas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showLotPlan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showZoning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showSaleDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showSaleTheme12Month" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showForSale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showEasements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyMapOption", propOrder = {
    "name",
    "type",
    "showLotAreas",
    "showLotPlan",
    "showZoning",
    "showSaleDetails",
    "showSaleTheme12Month",
    "showForSale",
    "showEasements"
})
public class PropertyMapOption
    extends LayerMapOptions
{

    protected String name;
    protected PropertyMapOptionType type;
    protected Boolean showLotAreas;
    protected Boolean showLotPlan;
    protected Boolean showZoning;
    protected Boolean showSaleDetails;
    protected Boolean showSaleTheme12Month;
    protected Boolean showForSale;
    protected Boolean showEasements;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyMapOptionType }
     *     
     */
    public PropertyMapOptionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyMapOptionType }
     *     
     */
    public void setType(PropertyMapOptionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the showLotAreas property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowLotAreas() {
        return showLotAreas;
    }

    /**
     * Sets the value of the showLotAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLotAreas(Boolean value) {
        this.showLotAreas = value;
    }

    /**
     * Gets the value of the showLotPlan property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowLotPlan() {
        return showLotPlan;
    }

    /**
     * Sets the value of the showLotPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLotPlan(Boolean value) {
        this.showLotPlan = value;
    }

    /**
     * Gets the value of the showZoning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowZoning() {
        return showZoning;
    }

    /**
     * Sets the value of the showZoning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowZoning(Boolean value) {
        this.showZoning = value;
    }

    /**
     * Gets the value of the showSaleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSaleDetails() {
        return showSaleDetails;
    }

    /**
     * Sets the value of the showSaleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSaleDetails(Boolean value) {
        this.showSaleDetails = value;
    }

    /**
     * Gets the value of the showSaleTheme12Month property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSaleTheme12Month() {
        return showSaleTheme12Month;
    }

    /**
     * Sets the value of the showSaleTheme12Month property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSaleTheme12Month(Boolean value) {
        this.showSaleTheme12Month = value;
    }

    /**
     * Gets the value of the showForSale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowForSale() {
        return showForSale;
    }

    /**
     * Sets the value of the showForSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowForSale(Boolean value) {
        this.showForSale = value;
    }

    /**
     * Gets the value of the showEasements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowEasements() {
        return showEasements;
    }

    /**
     * Sets the value of the showEasements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowEasements(Boolean value) {
        this.showEasements = value;
    }

}
