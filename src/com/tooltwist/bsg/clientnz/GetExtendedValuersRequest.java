
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="searchRadius" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="saleDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastListingDateForOTM" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastListingDateForCMA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="salesAdviceSource" type="{http://rpdata.com/bsg/schemas}salesAdviceSourceType" minOccurs="0"/>
 *         &lt;element name="bedrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userAVMValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valueRangePercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="returnAttribSet" type="{http://rpdata.com/bsg/schemas}returnAttribSetType"/>
 *         &lt;element name="filterBedsAndAVM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="propertyVisualOptions" type="{http://rpdata.com/bsg/schemas}propertyVisualOptions" minOccurs="0"/>
 *         &lt;element name="fetchPDF" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "propertyId",
    "searchRadius",
    "saleDate",
    "lastListingDateForOTM",
    "lastListingDateForCMA",
    "salesAdviceSource",
    "bedrooms",
    "userAVMValue",
    "valueRangePercent",
    "returnAttribSet",
    "filterBedsAndAVM",
    "propertyVisualOptions",
    "fetchPDF"
})
@XmlRootElement(name = "getExtendedValuersRequest")
public class GetExtendedValuersRequest
    extends BaseBSGRequest
{

    protected int propertyId;
    @XmlElement(defaultValue = "5")
    protected Integer searchRadius;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar saleDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastListingDateForOTM;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastListingDateForCMA;
    protected SalesAdviceSourceType salesAdviceSource;
    protected Integer bedrooms;
    protected Integer userAVMValue;
    protected Integer valueRangePercent;
    @XmlElement(required = true)
    protected ReturnAttribSetType returnAttribSet;
    protected Boolean filterBedsAndAVM;
    protected PropertyVisualOptions propertyVisualOptions;
    protected Boolean fetchPDF;

    /**
     * Gets the value of the propertyId property.
     * 
     */
    public int getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     * 
     */
    public void setPropertyId(int value) {
        this.propertyId = value;
    }

    /**
     * Gets the value of the searchRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchRadius() {
        return searchRadius;
    }

    /**
     * Sets the value of the searchRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchRadius(Integer value) {
        this.searchRadius = value;
    }

    /**
     * Gets the value of the saleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDate() {
        return saleDate;
    }

    /**
     * Sets the value of the saleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDate(XMLGregorianCalendar value) {
        this.saleDate = value;
    }

    /**
     * Gets the value of the lastListingDateForOTM property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastListingDateForOTM() {
        return lastListingDateForOTM;
    }

    /**
     * Sets the value of the lastListingDateForOTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastListingDateForOTM(XMLGregorianCalendar value) {
        this.lastListingDateForOTM = value;
    }

    /**
     * Gets the value of the lastListingDateForCMA property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastListingDateForCMA() {
        return lastListingDateForCMA;
    }

    /**
     * Sets the value of the lastListingDateForCMA property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastListingDateForCMA(XMLGregorianCalendar value) {
        this.lastListingDateForCMA = value;
    }

    /**
     * Gets the value of the salesAdviceSource property.
     * 
     * @return
     *     possible object is
     *     {@link SalesAdviceSourceType }
     *     
     */
    public SalesAdviceSourceType getSalesAdviceSource() {
        return salesAdviceSource;
    }

    /**
     * Sets the value of the salesAdviceSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesAdviceSourceType }
     *     
     */
    public void setSalesAdviceSource(SalesAdviceSourceType value) {
        this.salesAdviceSource = value;
    }

    /**
     * Gets the value of the bedrooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBedrooms() {
        return bedrooms;
    }

    /**
     * Sets the value of the bedrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBedrooms(Integer value) {
        this.bedrooms = value;
    }

    /**
     * Gets the value of the userAVMValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserAVMValue() {
        return userAVMValue;
    }

    /**
     * Sets the value of the userAVMValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserAVMValue(Integer value) {
        this.userAVMValue = value;
    }

    /**
     * Gets the value of the valueRangePercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueRangePercent() {
        return valueRangePercent;
    }

    /**
     * Sets the value of the valueRangePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueRangePercent(Integer value) {
        this.valueRangePercent = value;
    }

    /**
     * Gets the value of the returnAttribSet property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnAttribSetType }
     *     
     */
    public ReturnAttribSetType getReturnAttribSet() {
        return returnAttribSet;
    }

    /**
     * Sets the value of the returnAttribSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnAttribSetType }
     *     
     */
    public void setReturnAttribSet(ReturnAttribSetType value) {
        this.returnAttribSet = value;
    }

    /**
     * Gets the value of the filterBedsAndAVM property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterBedsAndAVM() {
        return filterBedsAndAVM;
    }

    /**
     * Sets the value of the filterBedsAndAVM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterBedsAndAVM(Boolean value) {
        this.filterBedsAndAVM = value;
    }

    /**
     * Gets the value of the propertyVisualOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyVisualOptions }
     *     
     */
    public PropertyVisualOptions getPropertyVisualOptions() {
        return propertyVisualOptions;
    }

    /**
     * Sets the value of the propertyVisualOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyVisualOptions }
     *     
     */
    public void setPropertyVisualOptions(PropertyVisualOptions value) {
        this.propertyVisualOptions = value;
    }

    /**
     * Gets the value of the fetchPDF property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFetchPDF() {
        return fetchPDF;
    }

    /**
     * Sets the value of the fetchPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFetchPDF(Boolean value) {
        this.fetchPDF = value;
    }

}
