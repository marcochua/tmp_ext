
package com.tooltwist.bsg.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}genericSearchCriteriaInput">
 *       &lt;sequence>
 *         &lt;element name="propertyIdInput" type="{http://rpdata.com/bsg/schemas}propertyIdInput" minOccurs="0"/>
 *         &lt;element name="lastSalePriceFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastSalePriceTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reaRecentSale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="saleDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="saleDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sortType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="armsLengthTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attributeFilterList" type="{http://rpdata.com/bsg/schemas}bsgPropertyAttributeFilter" maxOccurs="unbounded" minOccurs="0"/>
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
    "propertyIdInput",
    "lastSalePriceFrom",
    "lastSalePriceTo",
    "reaRecentSale",
    "saleDateFrom",
    "saleDateTo",
    "sortType",
    "source",
    "armsLengthTransaction",
    "attributeFilterList"
})
@XmlRootElement(name = "refineSoldPropertiesRequest")
public class RefineSoldPropertiesRequest
    extends GenericSearchCriteriaInput
{

    protected PropertyIdInput propertyIdInput;
    protected Integer lastSalePriceFrom;
    protected Integer lastSalePriceTo;
    protected Boolean reaRecentSale;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar saleDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar saleDateTo;
    protected Integer sortType;
    protected List<String> source;
    protected Boolean armsLengthTransaction;
    protected List<BsgPropertyAttributeFilter> attributeFilterList;

    /**
     * Gets the value of the propertyIdInput property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyIdInput }
     *     
     */
    public PropertyIdInput getPropertyIdInput() {
        return propertyIdInput;
    }

    /**
     * Sets the value of the propertyIdInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyIdInput }
     *     
     */
    public void setPropertyIdInput(PropertyIdInput value) {
        this.propertyIdInput = value;
    }

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

    /**
     * Gets the value of the sortType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortType() {
        return sortType;
    }

    /**
     * Sets the value of the sortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortType(Integer value) {
        this.sortType = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSource() {
        if (source == null) {
            source = new ArrayList<String>();
        }
        return this.source;
    }

    /**
     * Gets the value of the armsLengthTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArmsLengthTransaction() {
        return armsLengthTransaction;
    }

    /**
     * Sets the value of the armsLengthTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArmsLengthTransaction(Boolean value) {
        this.armsLengthTransaction = value;
    }

    /**
     * Gets the value of the attributeFilterList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeFilterList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeFilterList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgPropertyAttributeFilter }
     * 
     * 
     */
    public List<BsgPropertyAttributeFilter> getAttributeFilterList() {
        if (attributeFilterList == null) {
            attributeFilterList = new ArrayList<BsgPropertyAttributeFilter>();
        }
        return this.attributeFilterList;
    }

}
