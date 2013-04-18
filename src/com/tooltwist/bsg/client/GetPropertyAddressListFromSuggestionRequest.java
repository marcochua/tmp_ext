
package com.tooltwist.bsg.client;

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
 *         &lt;element name="searchString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxSuggestionResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="includeUnits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "searchString",
    "maxSuggestionResults",
    "includeUnits"
})
@XmlRootElement(name = "getPropertyAddressListFromSuggestionRequest")
public class GetPropertyAddressListFromSuggestionRequest
    extends BaseBSGRequest
{

    protected String searchString;
    protected int maxSuggestionResults;
    protected Boolean includeUnits;

    /**
     * Gets the value of the searchString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchString() {
        return searchString;
    }

    /**
     * Sets the value of the searchString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchString(String value) {
        this.searchString = value;
    }

    /**
     * Gets the value of the maxSuggestionResults property.
     * 
     */
    public int getMaxSuggestionResults() {
        return maxSuggestionResults;
    }

    /**
     * Sets the value of the maxSuggestionResults property.
     * 
     */
    public void setMaxSuggestionResults(int value) {
        this.maxSuggestionResults = value;
    }

    /**
     * Gets the value of the includeUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeUnits() {
        return includeUnits;
    }

    /**
     * Sets the value of the includeUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeUnits(Boolean value) {
        this.includeUnits = value;
    }

}
