
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="unitDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unitAlpha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetStartNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="streetStartAlpha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetEndNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="streetEndAlpha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="suburb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "unitDesignator",
    "unit",
    "unitAlpha",
    "streetStartNumber",
    "streetStartAlpha",
    "streetEndNumber",
    "streetEndAlpha",
    "streetDesignator",
    "streetName",
    "suburb",
    "postcode",
    "state"
})
@XmlRootElement(name = "getFuzzyAddressMatchRequest")
public class GetFuzzyAddressMatchRequest
    extends BaseBSGRequest
{

    protected String unitDesignator;
    protected Integer unit;
    protected String unitAlpha;
    protected Integer streetStartNumber;
    protected String streetStartAlpha;
    protected Integer streetEndNumber;
    protected String streetEndAlpha;
    protected String streetDesignator;
    @XmlElement(required = true)
    protected String streetName;
    @XmlElement(required = true)
    protected String suburb;
    @XmlElement(required = true)
    protected String postcode;
    @XmlElement(required = true)
    protected String state;

    /**
     * Gets the value of the unitDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitDesignator() {
        return unitDesignator;
    }

    /**
     * Sets the value of the unitDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitDesignator(String value) {
        this.unitDesignator = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnit(Integer value) {
        this.unit = value;
    }

    /**
     * Gets the value of the unitAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitAlpha() {
        return unitAlpha;
    }

    /**
     * Sets the value of the unitAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitAlpha(String value) {
        this.unitAlpha = value;
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

    /**
     * Gets the value of the streetDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetDesignator() {
        return streetDesignator;
    }

    /**
     * Sets the value of the streetDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetDesignator(String value) {
        this.streetDesignator = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the suburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     * Sets the value of the suburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuburb(String value) {
        this.suburb = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
