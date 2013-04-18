
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bsgPropertyProfileRequestDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgPropertyProfileRequestDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerEstimate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfBedrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfBathrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfCarSpaces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgPropertyProfileRequestDetails", propOrder = {
    "customerEstimate",
    "numberOfBedrooms",
    "numberOfBathrooms",
    "numberOfCarSpaces"
})
public class BsgPropertyProfileRequestDetails {

    protected Integer customerEstimate;
    protected Integer numberOfBedrooms;
    protected Integer numberOfBathrooms;
    protected Integer numberOfCarSpaces;

    /**
     * Gets the value of the customerEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerEstimate() {
        return customerEstimate;
    }

    /**
     * Sets the value of the customerEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerEstimate(Integer value) {
        this.customerEstimate = value;
    }

    /**
     * Gets the value of the numberOfBedrooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    /**
     * Sets the value of the numberOfBedrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBedrooms(Integer value) {
        this.numberOfBedrooms = value;
    }

    /**
     * Gets the value of the numberOfBathrooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    /**
     * Sets the value of the numberOfBathrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBathrooms(Integer value) {
        this.numberOfBathrooms = value;
    }

    /**
     * Gets the value of the numberOfCarSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfCarSpaces() {
        return numberOfCarSpaces;
    }

    /**
     * Sets the value of the numberOfCarSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfCarSpaces(Integer value) {
        this.numberOfCarSpaces = value;
    }

}
