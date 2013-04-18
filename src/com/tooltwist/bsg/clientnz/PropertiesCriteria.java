
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertiesCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertiesCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasAVM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="avmSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoValueLowFSDScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="autoValueHighFSDScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mappingDetailsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertiesCriteria", propOrder = {
    "hasAVM",
    "avmSource",
    "autoValueLowFSDScore",
    "autoValueHighFSDScore",
    "mappingDetailsOnly",
    "pageNumber",
    "pageSize"
})
public class PropertiesCriteria {

    protected Boolean hasAVM;
    protected String avmSource;
    protected Integer autoValueLowFSDScore;
    protected Integer autoValueHighFSDScore;
    protected Boolean mappingDetailsOnly;
    protected Integer pageNumber;
    protected Integer pageSize;

    /**
     * Gets the value of the hasAVM property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAVM() {
        return hasAVM;
    }

    /**
     * Sets the value of the hasAVM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAVM(Boolean value) {
        this.hasAVM = value;
    }

    /**
     * Gets the value of the avmSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvmSource() {
        return avmSource;
    }

    /**
     * Sets the value of the avmSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvmSource(String value) {
        this.avmSource = value;
    }

    /**
     * Gets the value of the autoValueLowFSDScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoValueLowFSDScore() {
        return autoValueLowFSDScore;
    }

    /**
     * Sets the value of the autoValueLowFSDScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoValueLowFSDScore(Integer value) {
        this.autoValueLowFSDScore = value;
    }

    /**
     * Gets the value of the autoValueHighFSDScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoValueHighFSDScore() {
        return autoValueHighFSDScore;
    }

    /**
     * Sets the value of the autoValueHighFSDScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoValueHighFSDScore(Integer value) {
        this.autoValueHighFSDScore = value;
    }

    /**
     * Gets the value of the mappingDetailsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMappingDetailsOnly() {
        return mappingDetailsOnly;
    }

    /**
     * Sets the value of the mappingDetailsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMappingDetailsOnly(Boolean value) {
        this.mappingDetailsOnly = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

}
