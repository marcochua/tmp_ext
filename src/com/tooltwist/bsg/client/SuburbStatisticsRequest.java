
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suburbStatisticsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suburbStatisticsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}propertyStatisticsRequest">
 *       &lt;sequence>
 *         &lt;element name="propertyStatisticsOptions" type="{http://rpdata.com/bsg/schemas}propertyStatisticsOptions" minOccurs="0"/>
 *         &lt;element name="categoryMjr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="yearFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suburbStatisticsRequest", propOrder = {
    "propertyStatisticsOptions",
    "categoryMjr",
    "period",
    "yearFrom"
})
@XmlSeeAlso({
    GetSuburbStatisticsRequest.class
})
public class SuburbStatisticsRequest
    extends PropertyStatisticsRequest
{

    protected PropertyStatisticsOptions propertyStatisticsOptions;
    protected String categoryMjr;
    protected Integer period;
    protected Integer yearFrom;

    /**
     * Gets the value of the propertyStatisticsOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyStatisticsOptions }
     *     
     */
    public PropertyStatisticsOptions getPropertyStatisticsOptions() {
        return propertyStatisticsOptions;
    }

    /**
     * Sets the value of the propertyStatisticsOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyStatisticsOptions }
     *     
     */
    public void setPropertyStatisticsOptions(PropertyStatisticsOptions value) {
        this.propertyStatisticsOptions = value;
    }

    /**
     * Gets the value of the categoryMjr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryMjr() {
        return categoryMjr;
    }

    /**
     * Sets the value of the categoryMjr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryMjr(String value) {
        this.categoryMjr = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriod(Integer value) {
        this.period = value;
    }

    /**
     * Gets the value of the yearFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearFrom() {
        return yearFrom;
    }

    /**
     * Sets the value of the yearFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearFrom(Integer value) {
        this.yearFrom = value;
    }

}
