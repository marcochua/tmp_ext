
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for propertyOTM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyOTM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="listedSaleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listedSalePrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="agency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="daysListed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyOTM", propOrder = {
    "listedDate",
    "listedSaleType",
    "listedSalePrice",
    "agency",
    "agent",
    "daysListed"
})
public class PropertyOTM {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar listedDate;
    protected String listedSaleType;
    protected Integer listedSalePrice;
    protected String agency;
    protected String agent;
    protected Integer daysListed;

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
     * Gets the value of the listedSaleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListedSaleType() {
        return listedSaleType;
    }

    /**
     * Sets the value of the listedSaleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListedSaleType(String value) {
        this.listedSaleType = value;
    }

    /**
     * Gets the value of the listedSalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListedSalePrice() {
        return listedSalePrice;
    }

    /**
     * Sets the value of the listedSalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListedSalePrice(Integer value) {
        this.listedSalePrice = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgency(String value) {
        this.agency = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent(String value) {
        this.agent = value;
    }

    /**
     * Gets the value of the daysListed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysListed() {
        return daysListed;
    }

    /**
     * Sets the value of the daysListed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysListed(Integer value) {
        this.daysListed = value;
    }

}
