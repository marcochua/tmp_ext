
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseMapOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseMapOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mapSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoomSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseMapOptions", propOrder = {
    "mapSize",
    "zoomSize"
})
@XmlSeeAlso({
    LayerMapOptions.class
})
public abstract class BaseMapOptions {

    protected String mapSize;
    protected String zoomSize;

    /**
     * Gets the value of the mapSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapSize() {
        return mapSize;
    }

    /**
     * Sets the value of the mapSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapSize(String value) {
        this.mapSize = value;
    }

    /**
     * Gets the value of the zoomSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoomSize() {
        return zoomSize;
    }

    /**
     * Sets the value of the zoomSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoomSize(String value) {
        this.zoomSize = value;
    }

}
