
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
 *         &lt;element name="faresCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresFSDScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresReportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresRunDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresValueEstimate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresValueHigh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresValueLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "faresCode",
    "faresCondition",
    "faresDescription",
    "faresFSDScore",
    "faresReferenceID",
    "faresReportType",
    "faresRunDate",
    "faresScore",
    "faresValueEstimate",
    "faresValueHigh",
    "faresValueLow",
    "otmProperties",
    "soldProperties",
    "otmPropertiesAddressList",
    "soldPropertiesAddressList"
})
@XmlRootElement(name = "getAVMResponse")
public class GetAVMResponse
    extends BaseBSGResponse
{

    protected Integer propertyId;
    protected String faresCode;
    protected String faresCondition;
    protected String faresDescription;
    protected String faresFSDScore;
    protected String faresReferenceID;
    protected String faresReportType;
    protected String faresRunDate;
    protected String faresScore;
    protected String faresValueEstimate;
    protected String faresValueHigh;
    protected String faresValueLow;
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
     * Gets the value of the faresCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaresCode() {
        return faresCode;
    }

    /**
     * Sets the value of the faresCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaresCode(String value) {
        this.faresCode = value;
    }

    /**
     * Gets the value of the faresCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaresCondition() {
        return faresCondition;
    }

    /**
     * Sets the value of the faresCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaresCondition(String value) {
        this.faresCondition = value;
    }

    /**
     * Gets the value of the faresDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaresDescription() {
        return faresDescription;
    }

    /**
     * Sets the value of the faresDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaresDescription(String value) {
        this.faresDescription = value;
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
     * Gets the value of the faresReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaresReferenceID() {
        return faresReferenceID;
    }

    /**
     * Sets the value of the faresReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaresReferenceID(String value) {
        this.faresReferenceID = value;
    }

    /**
     * Gets the value of the faresReportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaresReportType() {
        return faresReportType;
    }

    /**
     * Sets the value of the faresReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaresReportType(String value) {
        this.faresReportType = value;
    }

    /**
     * Gets the value of the faresRunDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaresRunDate() {
        return faresRunDate;
    }

    /**
     * Sets the value of the faresRunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaresRunDate(String value) {
        this.faresRunDate = value;
    }

    /**
     * Gets the value of the faresScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaresScore() {
        return faresScore;
    }

    /**
     * Sets the value of the faresScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaresScore(String value) {
        this.faresScore = value;
    }

    /**
     * Gets the value of the faresValueEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaresValueEstimate() {
        return faresValueEstimate;
    }

    /**
     * Sets the value of the faresValueEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaresValueEstimate(String value) {
        this.faresValueEstimate = value;
    }

    /**
     * Gets the value of the faresValueHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaresValueHigh() {
        return faresValueHigh;
    }

    /**
     * Sets the value of the faresValueHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaresValueHigh(String value) {
        this.faresValueHigh = value;
    }

    /**
     * Gets the value of the faresValueLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaresValueLow() {
        return faresValueLow;
    }

    /**
     * Sets the value of the faresValueLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaresValueLow(String value) {
        this.faresValueLow = value;
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
