
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
 *         &lt;element name="rismarkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rismarkCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rismarkDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rismarkFSDScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rismarkScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rismarkReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rismarkReportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rismarkRunDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rismarkValueEstimate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rismarkValueHigh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rismarkValueLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "rismarkCode",
    "rismarkCondition",
    "rismarkDescription",
    "rismarkFSDScore",
    "rismarkScore",
    "rismarkReferenceID",
    "rismarkReportType",
    "rismarkRunDate",
    "rismarkValueEstimate",
    "rismarkValueHigh",
    "rismarkValueLow",
    "soldProperties",
    "otmProperties",
    "otmPropertiesAddressList",
    "soldPropertiesAddressList"
})
@XmlRootElement(name = "getRismarkAVMResponse")
public class GetRismarkAVMResponse
    extends BaseBSGResponse
{

    protected Integer propertyId;
    protected String rismarkCode;
    protected String rismarkCondition;
    protected String rismarkDescription;
    protected String rismarkFSDScore;
    protected String rismarkScore;
    protected String rismarkReferenceID;
    protected String rismarkReportType;
    protected String rismarkRunDate;
    protected String rismarkValueEstimate;
    protected String rismarkValueHigh;
    protected String rismarkValueLow;
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
     * Gets the value of the rismarkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRismarkCode() {
        return rismarkCode;
    }

    /**
     * Sets the value of the rismarkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRismarkCode(String value) {
        this.rismarkCode = value;
    }

    /**
     * Gets the value of the rismarkCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRismarkCondition() {
        return rismarkCondition;
    }

    /**
     * Sets the value of the rismarkCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRismarkCondition(String value) {
        this.rismarkCondition = value;
    }

    /**
     * Gets the value of the rismarkDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRismarkDescription() {
        return rismarkDescription;
    }

    /**
     * Sets the value of the rismarkDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRismarkDescription(String value) {
        this.rismarkDescription = value;
    }

    /**
     * Gets the value of the rismarkFSDScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRismarkFSDScore() {
        return rismarkFSDScore;
    }

    /**
     * Sets the value of the rismarkFSDScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRismarkFSDScore(String value) {
        this.rismarkFSDScore = value;
    }

    /**
     * Gets the value of the rismarkScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRismarkScore() {
        return rismarkScore;
    }

    /**
     * Sets the value of the rismarkScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRismarkScore(String value) {
        this.rismarkScore = value;
    }

    /**
     * Gets the value of the rismarkReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRismarkReferenceID() {
        return rismarkReferenceID;
    }

    /**
     * Sets the value of the rismarkReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRismarkReferenceID(String value) {
        this.rismarkReferenceID = value;
    }

    /**
     * Gets the value of the rismarkReportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRismarkReportType() {
        return rismarkReportType;
    }

    /**
     * Sets the value of the rismarkReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRismarkReportType(String value) {
        this.rismarkReportType = value;
    }

    /**
     * Gets the value of the rismarkRunDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRismarkRunDate() {
        return rismarkRunDate;
    }

    /**
     * Sets the value of the rismarkRunDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRismarkRunDate(String value) {
        this.rismarkRunDate = value;
    }

    /**
     * Gets the value of the rismarkValueEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRismarkValueEstimate() {
        return rismarkValueEstimate;
    }

    /**
     * Sets the value of the rismarkValueEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRismarkValueEstimate(String value) {
        this.rismarkValueEstimate = value;
    }

    /**
     * Gets the value of the rismarkValueHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRismarkValueHigh() {
        return rismarkValueHigh;
    }

    /**
     * Sets the value of the rismarkValueHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRismarkValueHigh(String value) {
        this.rismarkValueHigh = value;
    }

    /**
     * Gets the value of the rismarkValueLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRismarkValueLow() {
        return rismarkValueLow;
    }

    /**
     * Sets the value of the rismarkValueLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRismarkValueLow(String value) {
        this.rismarkValueLow = value;
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
