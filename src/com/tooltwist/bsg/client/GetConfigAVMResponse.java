
package com.tooltwist.bsg.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseBSGResponse">
 *       &lt;sequence>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="faresFSDScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimateValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueRangeLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueRangeHigh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confidenceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otmProperties" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="soldProperties" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otmPropertiesAddressList" type="{http://rpdata.com/bsg/schemas}comparableAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="soldPropertiesAddressList" type="{http://rpdata.com/bsg/schemas}comparableAddress" maxOccurs="unbounded" minOccurs="0"/>
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
    "faresFSDScore",
    "estimateValue",
    "valueRangeLow",
    "valueRangeHigh",
    "confidenceLevel",
    "otmProperties",
    "soldProperties",
    "otmPropertiesAddressList",
    "soldPropertiesAddressList"
})
@XmlRootElement(name = "getConfigAVMResponse")
public class GetConfigAVMResponse
    extends BaseBSGResponse
{

    protected Integer propertyId;
    protected String faresFSDScore;
    protected String estimateValue;
    protected String valueRangeLow;
    protected String valueRangeHigh;
    protected String confidenceLevel;
    @XmlElement(nillable = true)
    protected List<Integer> otmProperties;
    @XmlElement(nillable = true)
    protected List<Integer> soldProperties;
    @XmlElement(nillable = true)
    protected List<ComparableAddress> otmPropertiesAddressList;
    @XmlElement(nillable = true)
    protected List<ComparableAddress> soldPropertiesAddressList;

    /**
     * Gets the value of the propertyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPropertyId(Integer value) {
        this.propertyId = value;
    }

    /**
     * Gets the value of the faresFSDScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaresFSDScore() {
        return faresFSDScore;
    }

    /**
     * Sets the value of the faresFSDScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaresFSDScore(String value) {
        this.faresFSDScore = value;
    }

    /**
     * Gets the value of the estimateValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimateValue() {
        return estimateValue;
    }

    /**
     * Sets the value of the estimateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimateValue(String value) {
        this.estimateValue = value;
    }

    /**
     * Gets the value of the valueRangeLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueRangeLow() {
        return valueRangeLow;
    }

    /**
     * Sets the value of the valueRangeLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueRangeLow(String value) {
        this.valueRangeLow = value;
    }

    /**
     * Gets the value of the valueRangeHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueRangeHigh() {
        return valueRangeHigh;
    }

    /**
     * Sets the value of the valueRangeHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueRangeHigh(String value) {
        this.valueRangeHigh = value;
    }

    /**
     * Gets the value of the confidenceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidenceLevel() {
        return confidenceLevel;
    }

    /**
     * Sets the value of the confidenceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidenceLevel(String value) {
        this.confidenceLevel = value;
    }

    /**
     * Gets the value of the otmProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otmProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtmProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getOtmProperties() {
        if (otmProperties == null) {
            otmProperties = new ArrayList<Integer>();
        }
        return this.otmProperties;
    }

    /**
     * Gets the value of the soldProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soldProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoldProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSoldProperties() {
        if (soldProperties == null) {
            soldProperties = new ArrayList<Integer>();
        }
        return this.soldProperties;
    }

    /**
     * Gets the value of the otmPropertiesAddressList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otmPropertiesAddressList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtmPropertiesAddressList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComparableAddress }
     * 
     * 
     */
    public List<ComparableAddress> getOtmPropertiesAddressList() {
        if (otmPropertiesAddressList == null) {
            otmPropertiesAddressList = new ArrayList<ComparableAddress>();
        }
        return this.otmPropertiesAddressList;
    }

    /**
     * Gets the value of the soldPropertiesAddressList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soldPropertiesAddressList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoldPropertiesAddressList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComparableAddress }
     * 
     * 
     */
    public List<ComparableAddress> getSoldPropertiesAddressList() {
        if (soldPropertiesAddressList == null) {
            soldPropertiesAddressList = new ArrayList<ComparableAddress>();
        }
        return this.soldPropertiesAddressList;
    }

}
