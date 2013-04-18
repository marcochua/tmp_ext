
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salesByPriceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salesByPriceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}propertyStatisticsRequest">
 *       &lt;sequence>
 *         &lt;element name="categoryMjr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "salesByPriceRequest", propOrder = {
    "categoryMjr",
    "yearFrom"
})
@XmlSeeAlso({
    GetSalesByPriceRequest.class,
    GetSalesByPriceChartURLRequest.class
})
public class SalesByPriceRequest
    extends PropertyStatisticsRequest
{

    protected String categoryMjr;
    protected Integer yearFrom;

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
