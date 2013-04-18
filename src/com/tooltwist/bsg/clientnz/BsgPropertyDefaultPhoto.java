
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bsgPropertyDefaultPhoto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgPropertyDefaultPhoto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="largeURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mediumURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thumbnailURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgPropertyDefaultPhoto", propOrder = {
    "largeURL",
    "mediumURL",
    "thumbnailURL"
})
public class BsgPropertyDefaultPhoto {

    protected String largeURL;
    protected String mediumURL;
    protected String thumbnailURL;

    /**
     * Gets the value of the largeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargeURL() {
        return largeURL;
    }

    /**
     * Sets the value of the largeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargeURL(String value) {
        this.largeURL = value;
    }

    /**
     * Gets the value of the mediumURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumURL() {
        return mediumURL;
    }

    /**
     * Sets the value of the mediumURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumURL(String value) {
        this.mediumURL = value;
    }

    /**
     * Gets the value of the thumbnailURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailURL() {
        return thumbnailURL;
    }

    /**
     * Sets the value of the thumbnailURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailURL(String value) {
        this.thumbnailURL = value;
    }

}
