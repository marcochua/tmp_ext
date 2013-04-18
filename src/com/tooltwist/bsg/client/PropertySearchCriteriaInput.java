
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for propertySearchCriteriaInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertySearchCriteriaInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}genericSearchCriteriaInput">
 *       &lt;sequence>
 *         &lt;element name="lastSalePriceFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastSalePriceTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reaRecentSale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="saleDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="saleDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertySearchCriteriaInput", propOrder = {
    "lastSalePriceFrom",
    "lastSalePriceTo",
    "reaRecentSale",
    "saleDateFrom",
    "saleDateTo"
})
public class PropertySearchCriteriaInput
    extends GenericSearchCriteriaInput
{

    protected Integer lastSalePriceFrom;
    protected Integer lastSalePriceTo;
    protected Boolean reaRecentSale;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar saleDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar saleDateTo;

    /**
     * Gets the value of the lastSalePriceFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastSalePriceFrom() {
        return lastSalePriceFrom;
    }

    /**
     * Sets the value of the lastSalePriceFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastSalePriceFrom(Integer value) {
        this.lastSalePriceFrom = value;
    }

    /**
     * Gets the value of the lastSalePriceTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastSalePriceTo() {
        return lastSalePriceTo;
    }

    /**
     * Sets the value of the lastSalePriceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastSalePriceTo(Integer value) {
        this.lastSalePriceTo = value;
    }

    /**
     * Gets the value of the reaRecentSale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReaRecentSale() {
        return reaRecentSale;
    }

    /**
     * Sets the value of the reaRecentSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReaRecentSale(Boolean value) {
        this.reaRecentSale = value;
    }

    /**
     * Gets the value of the saleDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDateFrom() {
        return saleDateFrom;
    }

    /**
     * Sets the value of the saleDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDateFrom(XMLGregorianCalendar value) {
        this.saleDateFrom = value;
    }

    /**
     * Gets the value of the saleDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDateTo() {
        return saleDateTo;
    }

    /**
     * Sets the value of the saleDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDateTo(XMLGregorianCalendar value) {
        this.saleDateTo = value;
    }

}
