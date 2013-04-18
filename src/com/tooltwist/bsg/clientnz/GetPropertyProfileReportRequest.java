
package com.tooltwist.bsg.clientnz;

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
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseBSGRequest">
 *       &lt;sequence>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="runDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="propertyDetails" type="{http://rpdata.com/bsg/schemas}bsgPropertyProfileRequestDetails" minOccurs="0"/>
 *         &lt;element name="customerDetails" type="{http://rpdata.com/bsg/schemas}bsgCustomerDetails" minOccurs="0"/>
 *         &lt;element name="requesterDetails" type="{http://rpdata.com/bsg/schemas}bsgRequesterDetails" minOccurs="0"/>
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
    "runDate",
    "propertyDetails",
    "customerDetails",
    "requesterDetails"
})
@XmlRootElement(name = "getPropertyProfileReportRequest")
public class GetPropertyProfileReportRequest
    extends BaseBSGRequest
{

    protected Integer propertyId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar runDate;
    protected BsgPropertyProfileRequestDetails propertyDetails;
    protected BsgCustomerDetails customerDetails;
    protected BsgRequesterDetails requesterDetails;

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
     * Gets the value of the runDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRunDate() {
        return runDate;
    }

    /**
     * Sets the value of the runDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRunDate(XMLGregorianCalendar value) {
        this.runDate = value;
    }

    /**
     * Gets the value of the propertyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertyProfileRequestDetails }
     *     
     */
    public BsgPropertyProfileRequestDetails getPropertyDetails() {
        return propertyDetails;
    }

    /**
     * Sets the value of the propertyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertyProfileRequestDetails }
     *     
     */
    public void setPropertyDetails(BsgPropertyProfileRequestDetails value) {
        this.propertyDetails = value;
    }

    /**
     * Gets the value of the customerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BsgCustomerDetails }
     *     
     */
    public BsgCustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    /**
     * Sets the value of the customerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgCustomerDetails }
     *     
     */
    public void setCustomerDetails(BsgCustomerDetails value) {
        this.customerDetails = value;
    }

    /**
     * Gets the value of the requesterDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BsgRequesterDetails }
     *     
     */
    public BsgRequesterDetails getRequesterDetails() {
        return requesterDetails;
    }

    /**
     * Sets the value of the requesterDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgRequesterDetails }
     *     
     */
    public void setRequesterDetails(BsgRequesterDetails value) {
        this.requesterDetails = value;
    }

}
