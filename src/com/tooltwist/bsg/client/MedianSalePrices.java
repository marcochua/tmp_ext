
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medianSalePrices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medianSalePrices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year1" type="{http://rpdata.com/bsg/schemas}medianSalePricePerYear" minOccurs="0"/>
 *         &lt;element name="year2" type="{http://rpdata.com/bsg/schemas}medianSalePricePerYear" minOccurs="0"/>
 *         &lt;element name="year3" type="{http://rpdata.com/bsg/schemas}medianSalePricePerYear" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medianSalePrices", propOrder = {
    "period",
    "year1",
    "year2",
    "year3"
})
public class MedianSalePrices {

    protected String period;
    protected MedianSalePricePerYear year1;
    protected MedianSalePricePerYear year2;
    protected MedianSalePricePerYear year3;

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the year1 property.
     * 
     * @return
     *     possible object is
     *     {@link MedianSalePricePerYear }
     *     
     */
    public MedianSalePricePerYear getYear1() {
        return year1;
    }

    /**
     * Sets the value of the year1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedianSalePricePerYear }
     *     
     */
    public void setYear1(MedianSalePricePerYear value) {
        this.year1 = value;
    }

    /**
     * Gets the value of the year2 property.
     * 
     * @return
     *     possible object is
     *     {@link MedianSalePricePerYear }
     *     
     */
    public MedianSalePricePerYear getYear2() {
        return year2;
    }

    /**
     * Sets the value of the year2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedianSalePricePerYear }
     *     
     */
    public void setYear2(MedianSalePricePerYear value) {
        this.year2 = value;
    }

    /**
     * Gets the value of the year3 property.
     * 
     * @return
     *     possible object is
     *     {@link MedianSalePricePerYear }
     *     
     */
    public MedianSalePricePerYear getYear3() {
        return year3;
    }

    /**
     * Sets the value of the year3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedianSalePricePerYear }
     *     
     */
    public void setYear3(MedianSalePricePerYear value) {
        this.year3 = value;
    }

}
