
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for propertySearchOTM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertySearchOTM">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}propertySearchProperty">
 *       &lt;sequence>
 *         &lt;element name="listedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="listedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listedPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="listedPriceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listedPeriodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertySearchOTM", propOrder = {
    "listedDate",
    "listedType",
    "listedPrice",
    "listedPriceDescription",
    "listedPeriodCode"
})
public class PropertySearchOTM
    extends PropertySearchProperty
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar listedDate;
    protected String listedType;
    protected Integer listedPrice;
    protected String listedPriceDescription;
    protected String listedPeriodCode;

    /**
     * Gets the value of the listedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListedDate() {
        return listedDate;
    }

    /**
     * Sets the value of the listedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListedDate(XMLGregorianCalendar value) {
        this.listedDate = value;
    }

    /**
     * Gets the value of the listedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListedType() {
        return listedType;
    }

    /**
     * Sets the value of the listedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListedType(String value) {
        this.listedType = value;
    }

    /**
     * Gets the value of the listedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListedPrice() {
        return listedPrice;
    }

    /**
     * Sets the value of the listedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListedPrice(Integer value) {
        this.listedPrice = value;
    }

    /**
     * Gets the value of the listedPriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListedPriceDescription() {
        return listedPriceDescription;
    }

    /**
     * Sets the value of the listedPriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListedPriceDescription(String value) {
        this.listedPriceDescription = value;
    }

    /**
     * Gets the value of the listedPeriodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListedPeriodCode() {
        return listedPeriodCode;
    }

    /**
     * Sets the value of the listedPeriodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListedPeriodCode(String value) {
        this.listedPeriodCode = value;
    }

}
