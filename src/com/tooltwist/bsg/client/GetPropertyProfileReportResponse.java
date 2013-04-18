
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
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseBSGResponse">
 *       &lt;sequence>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="faresFSDScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresValueHigh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresValueLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faresTrafficLight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdf" type="{http://rpdata.com/bsg/schemas}base64Document" minOccurs="0"/>
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
    "faresValueHigh",
    "faresValueLow",
    "faresResponse",
    "faresTrafficLight",
    "pdf"
})
@XmlRootElement(name = "getPropertyProfileReportResponse")
public class GetPropertyProfileReportResponse
    extends BaseBSGResponse
{

    protected Integer propertyId;
    protected String faresFSDScore;
    protected String faresValueHigh;
    protected String faresValueLow;
    protected String faresResponse;
    protected String faresTrafficLight;
    protected Base64Document pdf;

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
     * Gets the value of the faresResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaresResponse() {
        return faresResponse;
    }

    /**
     * Sets the value of the faresResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaresResponse(String value) {
        this.faresResponse = value;
    }

    /**
     * Gets the value of the faresTrafficLight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaresTrafficLight() {
        return faresTrafficLight;
    }

    /**
     * Sets the value of the faresTrafficLight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaresTrafficLight(String value) {
        this.faresTrafficLight = value;
    }

    /**
     * Gets the value of the pdf property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Document }
     *     
     */
    public Base64Document getPdf() {
        return pdf;
    }

    /**
     * Sets the value of the pdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Document }
     *     
     */
    public void setPdf(Base64Document value) {
        this.pdf = value;
    }

}
