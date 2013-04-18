
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyAddressMatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyAddressMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="singleLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitDesignator" type="{http://rpdata.com/bsg/schemas}unitDesignator" minOccurs="0"/>
 *         &lt;element name="streetDesignator" type="{http://rpdata.com/bsg/schemas}streetDesignator" minOccurs="0"/>
 *         &lt;element name="lotDesignator" type="{http://rpdata.com/bsg/schemas}lotDesignator" minOccurs="0"/>
 *         &lt;element name="streetAddress" type="{http://rpdata.com/bsg/schemas}streetAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyAddressMatch", propOrder = {
    "propertyId",
    "singleLine",
    "unitDesignator",
    "streetDesignator",
    "lotDesignator",
    "streetAddress"
})
public class PropertyAddressMatch {

    protected Integer propertyId;
    protected String singleLine;
    protected UnitDesignator unitDesignator;
    protected StreetDesignator streetDesignator;
    protected LotDesignator lotDesignator;
    protected StreetAddress streetAddress;

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
     * Gets the value of the unitDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link UnitDesignator }
     *     
     */
    public UnitDesignator getUnitDesignator() {
        return unitDesignator;
    }

    /**
     * Sets the value of the unitDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitDesignator }
     *     
     */
    public void setUnitDesignator(UnitDesignator value) {
        this.unitDesignator = value;
    }

    /**
     * Gets the value of the streetDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link StreetDesignator }
     *     
     */
    public StreetDesignator getStreetDesignator() {
        return streetDesignator;
    }

    /**
     * Sets the value of the streetDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetDesignator }
     *     
     */
    public void setStreetDesignator(StreetDesignator value) {
        this.streetDesignator = value;
    }

    /**
     * Gets the value of the lotDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link LotDesignator }
     *     
     */
    public LotDesignator getLotDesignator() {
        return lotDesignator;
    }

    /**
     * Sets the value of the lotDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotDesignator }
     *     
     */
    public void setLotDesignator(LotDesignator value) {
        this.lotDesignator = value;
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddress }
     *     
     */
    public StreetAddress getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddress }
     *     
     */
    public void setStreetAddress(StreetAddress value) {
        this.streetAddress = value;
    }

}
