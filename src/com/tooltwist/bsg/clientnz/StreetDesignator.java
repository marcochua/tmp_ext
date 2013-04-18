
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for streetDesignator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="streetDesignator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetStartNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="streetStartAlpha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetEndNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="streetEndAlpha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "streetDesignator", propOrder = {
    "singleLine",
    "streetStartNumber",
    "streetStartAlpha",
    "streetEndNumber",
    "streetEndAlpha"
})
public class StreetDesignator {

    protected String singleLine;
    protected Integer streetStartNumber;
    protected String streetStartAlpha;
    protected Integer streetEndNumber;
    protected String streetEndAlpha;

    /**
     * Gets the value of the singleLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleLine() {
        return singleLine;
    }

    /**
     * Sets the value of the singleLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleLine(String value) {
        this.singleLine = value;
    }

    /**
     * Gets the value of the streetStartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStreetStartNumber() {
        return streetStartNumber;
    }

    /**
     * Sets the value of the streetStartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStreetStartNumber(Integer value) {
        this.streetStartNumber = value;
    }

    /**
     * Gets the value of the streetStartAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetStartAlpha() {
        return streetStartAlpha;
    }

    /**
     * Sets the value of the streetStartAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetStartAlpha(String value) {
        this.streetStartAlpha = value;
    }

    /**
     * Gets the value of the streetEndNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStreetEndNumber() {
        return streetEndNumber;
    }

    /**
     * Sets the value of the streetEndNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStreetEndNumber(Integer value) {
        this.streetEndNumber = value;
    }

    /**
     * Gets the value of the streetEndAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetEndAlpha() {
        return streetEndAlpha;
    }

    /**
     * Sets the value of the streetEndAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetEndAlpha(String value) {
        this.streetEndAlpha = value;
    }

}
