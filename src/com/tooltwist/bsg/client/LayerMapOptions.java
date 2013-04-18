
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for layerMapOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="layerMapOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseMapOptions">
 *       &lt;sequence>
 *         &lt;element name="showParks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showPerimeter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showPropertyLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showPropertyMeasurements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showPropertyNumbers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showRails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showRoadNames" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showWater" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "layerMapOptions", propOrder = {
    "showParks",
    "showPerimeter",
    "showPropertyLots",
    "showPropertyMeasurements",
    "showPropertyNumbers",
    "showRails",
    "showRoadNames",
    "showRoads",
    "showWater"
})
public class LayerMapOptions
    extends BaseMapOptions
{

    protected Boolean showParks;
    protected Boolean showPerimeter;
    protected Boolean showPropertyLots;
    protected Boolean showPropertyMeasurements;
    protected Boolean showPropertyNumbers;
    protected Boolean showRails;
    protected Boolean showRoadNames;
    protected Boolean showRoads;
    protected Boolean showWater;

    /**
     * Gets the value of the showParks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowParks() {
        return showParks;
    }

    /**
     * Sets the value of the showParks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowParks(Boolean value) {
        this.showParks = value;
    }

    /**
     * Gets the value of the showPerimeter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPerimeter() {
        return showPerimeter;
    }

    /**
     * Sets the value of the showPerimeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPerimeter(Boolean value) {
        this.showPerimeter = value;
    }

    /**
     * Gets the value of the showPropertyLots property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPropertyLots() {
        return showPropertyLots;
    }

    /**
     * Sets the value of the showPropertyLots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPropertyLots(Boolean value) {
        this.showPropertyLots = value;
    }

    /**
     * Gets the value of the showPropertyMeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPropertyMeasurements() {
        return showPropertyMeasurements;
    }

    /**
     * Sets the value of the showPropertyMeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPropertyMeasurements(Boolean value) {
        this.showPropertyMeasurements = value;
    }

    /**
     * Gets the value of the showPropertyNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPropertyNumbers() {
        return showPropertyNumbers;
    }

    /**
     * Sets the value of the showPropertyNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPropertyNumbers(Boolean value) {
        this.showPropertyNumbers = value;
    }

    /**
     * Gets the value of the showRails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowRails() {
        return showRails;
    }

    /**
     * Sets the value of the showRails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowRails(Boolean value) {
        this.showRails = value;
    }

    /**
     * Gets the value of the showRoadNames property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowRoadNames() {
        return showRoadNames;
    }

    /**
     * Sets the value of the showRoadNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowRoadNames(Boolean value) {
        this.showRoadNames = value;
    }

    /**
     * Gets the value of the showRoads property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowRoads() {
        return showRoads;
    }

    /**
     * Sets the value of the showRoads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowRoads(Boolean value) {
        this.showRoads = value;
    }

    /**
     * Gets the value of the showWater property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowWater() {
        return showWater;
    }

    /**
     * Sets the value of the showWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowWater(Boolean value) {
        this.showWater = value;
    }

}
