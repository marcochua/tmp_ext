
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
 *         &lt;element name="listingDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="listingDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="listingPriceFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="listingPriceTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sortType" type="{http://rpdata.com/bsg/schemas}sortType" minOccurs="0"/>
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
    "listingDateFrom",
    "listingDateTo",
    "listingPriceFrom",
    "listingPriceTo",
    "sortType",
    "attributeFilterList"
})
@XmlRootElement(name = "refineOtmPropertiesRequest")
public class RefineOtmPropertiesRequest
    extends GenericSearchCriteriaInput
{

    protected PropertyIdInput propertyIdInput;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar listingDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar listingDateTo;
    protected Integer listingPriceFrom;
    protected Integer listingPriceTo;
    protected SortType sortType;
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
     * Gets the value of the listingDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListingDateFrom() {
        return listingDateFrom;
    }

    /**
     * Sets the value of the listingDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListingDateFrom(XMLGregorianCalendar value) {
        this.listingDateFrom = value;
    }

    /**
     * Gets the value of the listingDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListingDateTo() {
        return listingDateTo;
    }

    /**
     * Sets the value of the listingDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListingDateTo(XMLGregorianCalendar value) {
        this.listingDateTo = value;
    }

    /**
     * Gets the value of the listingPriceFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListingPriceFrom() {
        return listingPriceFrom;
    }

    /**
     * Sets the value of the listingPriceFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListingPriceFrom(Integer value) {
        this.listingPriceFrom = value;
    }

    /**
     * Gets the value of the listingPriceTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListingPriceTo() {
        return listingPriceTo;
    }

    /**
     * Sets the value of the listingPriceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListingPriceTo(Integer value) {
        this.listingPriceTo = value;
    }

    /**
     * Gets the value of the sortType property.
     * 
     * @return
     *     possible object is
     *     {@link SortType }
     *     
     */
    public SortType getSortType() {
        return sortType;
    }

    /**
     * Sets the value of the sortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortType }
     *     
     */
    public void setSortType(SortType value) {
        this.sortType = value;
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
