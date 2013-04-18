
package com.tooltwist.bsg.clientnz;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="propertyIdInput" type="{http://rpdata.com/bsg/schemas}propertyIdInput" minOccurs="0"/>
 *         &lt;element name="propertySearchCriteriaInput" type="{http://rpdata.com/bsg/schemas}propertySearchCriteriaInput" minOccurs="0"/>
 *         &lt;element name="sortType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "propertySearchCriteriaInput",
    "sortType",
    "attributeFilterList"
})
@XmlRootElement(name = "refinePropertiesRequest")
public class RefinePropertiesRequest
    extends BaseBSGRequest
{

    protected PropertyIdInput propertyIdInput;
    protected PropertySearchCriteriaInput propertySearchCriteriaInput;
    protected Integer sortType;
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
     * Gets the value of the propertySearchCriteriaInput property.
     * 
     * @return
     *     possible object is
     *     {@link PropertySearchCriteriaInput }
     *     
     */
    public PropertySearchCriteriaInput getPropertySearchCriteriaInput() {
        return propertySearchCriteriaInput;
    }

    /**
     * Sets the value of the propertySearchCriteriaInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySearchCriteriaInput }
     *     
     */
    public void setPropertySearchCriteriaInput(PropertySearchCriteriaInput value) {
        this.propertySearchCriteriaInput = value;
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
