
package com.tooltwist.bsg.clientnz;

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
 *         &lt;element name="hybridCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hybridCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hybridDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hybridFSDScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hybridScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hybridReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hybridReportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hybridRunDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hybridValueEstimate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hybridValueHigh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hybridValueLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soldProperties" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otmProperties" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
    "hybridCode",
    "hybridCondition",
    "hybridDescription",
    "hybridFSDScore",
    "hybridScore",
    "hybridReferenceID",
    "hybridReportType",
    "hybridRunDate",
    "hybridValueEstimate",
    "hybridValueHigh",
    "hybridValueLow",
    "soldProperties",
    "otmProperties",
    "otmPropertiesAddressList",
    "soldPropertiesAddressList"
})
@XmlRootElement(name = "getHybridAVMResponse")
public class GetHybridAVMResponse
    extends BaseBSGResponse
{

    protected Integer propertyId;
    protected String hybridCode;
    protected String hybridCondition;
    protected String hybridDescription;
    protected String hybridFSDScore;
    protected String hybridScore;
    protected String hybridReferenceID;
    protected String hybridReportType;
    protected String hybridRunDate;
    protected String hybridValueEstimate;
    protected String hybridValueHigh;
    protected String hybridValueLow;
    @XmlElement(nillable = true)
    protected List<Integer> soldProperties;
    @XmlElement(nillable = true)
    protected List<Integer> otmProperties;
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
     * Gets the value of the hybridCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHybridCode() {
        return hybridCode;
    }

    /**
     * Sets the value of the hybridCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHybridCode(String value) {
        this.hybridCode = value;
    }

    /**
     * Gets the value of the hybridCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHybridCondition() {
        return hybridCondition;
    }

    /**
     * Sets the value of the hybridCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHybridCondition(String value) {
        this.hybridCondition = value;
    }

    /**
     * Gets the value of the hybridDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHybridDescription() {
        return hybridDescription;
    }

    /**
     * Sets the value of the hybridDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHybridDescription(String value) {
        this.hybridDescription = value;
    }

    /**
     * Gets the value of the hybridFSDScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHybridFSDScore() {
        return hybridFSDScore;
    }

    /**
     * Sets the value of the hybridFSDScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHybridFSDScore(String value) {
        this.hybridFSDScore = value;
    }

    /**
     * Gets the value of the hybridScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHybridScore() {
        return hybridScore;
    }

    /**
     * Sets the value of the hybridScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHybridScore(String value) {
        this.hybridScore = value;
    }

    /**
     * Gets the value of the hybridReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHybridReferenceID() {
        return hybridReferenceID;
    }

    /**
     * Sets the value of the hybridReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHybridReferenceID(String value) {
        this.hybridReferenceID = value;
    }

    /**
     * Gets the value of the hybridReportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHybridReportType() {
        return hybridReportType;
    }

    /**
     * Sets the value of the hybridReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHybridReportType(String value) {
        this.hybridReportType = value;
    }

    /**
     * Gets the value of the hybridRunDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHybridRunDate() {
        return hybridRunDate;
    }

    /**
     * Sets the value of the hybridRunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHybridRunDate(String value) {
        this.hybridRunDate = value;
    }

    /**
     * Gets the value of the hybridValueEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHybridValueEstimate() {
        return hybridValueEstimate;
    }

    /**
     * Sets the value of the hybridValueEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHybridValueEstimate(String value) {
        this.hybridValueEstimate = value;
    }

    /**
     * Gets the value of the hybridValueHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHybridValueHigh() {
        return hybridValueHigh;
    }

    /**
     * Sets the value of the hybridValueHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHybridValueHigh(String value) {
        this.hybridValueHigh = value;
    }

    /**
     * Gets the value of the hybridValueLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHybridValueLow() {
        return hybridValueLow;
    }

    /**
     * Sets the value of the hybridValueLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHybridValueLow(String value) {
        this.hybridValueLow = value;
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
