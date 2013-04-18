
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseBSGRequest">
 *       &lt;sequence>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mapOptions" type="{http://rpdata.com/bsg/schemas}layerMapOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "propertyId",
    "mapOptions"
})
@XmlRootElement(name = "getStreetMapRequest")
public class GetStreetMapRequest
    extends BaseBSGRequest
{

    protected Integer propertyId;
    protected LayerMapOptions mapOptions;

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
     * Gets the value of the mapOptions property.
     * 
     * @return
     *     possible object is
     *     {@link LayerMapOptions }
     *     
     */
    public LayerMapOptions getMapOptions() {
        return mapOptions;
    }

    /**
     * Sets the value of the mapOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayerMapOptions }
     *     
     */
    public void setMapOptions(LayerMapOptions value) {
        this.mapOptions = value;
    }

}
