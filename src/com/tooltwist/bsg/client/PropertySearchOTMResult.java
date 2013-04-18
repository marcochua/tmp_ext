
package com.tooltwist.bsg.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertySearchOTMResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertySearchOTMResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertySearchOTMs" type="{http://rpdata.com/bsg/schemas}propertySearchOTM" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numberOfResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfDistinctProperties" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertySearchOTMResult", propOrder = {
    "propertySearchOTMs",
    "numberOfResults",
    "numberOfDistinctProperties"
})
public class PropertySearchOTMResult {

    @XmlElement(nillable = true)
    protected List<PropertySearchOTM> propertySearchOTMs;
    protected Integer numberOfResults;
    protected Integer numberOfDistinctProperties;

    /**
     * Gets the value of the propertySearchOTMs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertySearchOTMs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertySearchOTMs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertySearchOTM }
     * 
     * 
     */
    public List<PropertySearchOTM> getPropertySearchOTMs() {
        if (propertySearchOTMs == null) {
            propertySearchOTMs = new ArrayList<PropertySearchOTM>();
        }
        return this.propertySearchOTMs;
    }

    /**
     * Gets the value of the numberOfResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfResults() {
        return numberOfResults;
    }

    /**
     * Sets the value of the numberOfResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfResults(Integer value) {
        this.numberOfResults = value;
    }

    /**
     * Gets the value of the numberOfDistinctProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDistinctProperties() {
        return numberOfDistinctProperties;
    }

    /**
     * Sets the value of the numberOfDistinctProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDistinctProperties(Integer value) {
        this.numberOfDistinctProperties = value;
    }

}
