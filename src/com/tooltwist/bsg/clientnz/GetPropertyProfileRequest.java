
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
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseBSGRequest">
 *       &lt;sequence>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valuationAttributes" type="{http://rpdata.com/bsg/schemas}valuationAttributes" minOccurs="0"/>
 *         &lt;element name="customerDetails" type="{http://rpdata.com/bsg/schemas}bsgCustomerDetails" minOccurs="0"/>
 *         &lt;element name="requesterDetails" type="{http://rpdata.com/bsg/schemas}bsgRequesterDetails" minOccurs="0"/>
 *         &lt;element name="userFields" type="{http://rpdata.com/bsg/schemas}userField" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="customerRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerPromo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "reportName",
    "valuationAttributes",
    "customerDetails",
    "requesterDetails",
    "userFields",
    "customerRef",
    "customerPromo"
})
@XmlRootElement(name = "getPropertyProfileRequest")
public class GetPropertyProfileRequest
    extends BaseBSGRequest
{

    protected int propertyId;
    @XmlElement(required = true)
    protected String reportName;
    protected ValuationAttributes valuationAttributes;
    protected BsgCustomerDetails customerDetails;
    protected BsgRequesterDetails requesterDetails;
    protected List<UserField> userFields;
    @XmlElement(required = true)
    protected String customerRef;
    @XmlElement(required = true)
    protected String customerPromo;

    /**
     * Gets the value of the propertyId property.
     * 
     */
    public int getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     * 
     */
    public void setPropertyId(int value) {
        this.propertyId = value;
    }

    /**
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the valuationAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationAttributes }
     *     
     */
    public ValuationAttributes getValuationAttributes() {
        return valuationAttributes;
    }

    /**
     * Sets the value of the valuationAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationAttributes }
     *     
     */
    public void setValuationAttributes(ValuationAttributes value) {
        this.valuationAttributes = value;
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

    /**
     * Gets the value of the userFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserField }
     * 
     * 
     */
    public List<UserField> getUserFields() {
        if (userFields == null) {
            userFields = new ArrayList<UserField>();
        }
        return this.userFields;
    }

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRef(String value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the customerPromo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPromo() {
        return customerPromo;
    }

    /**
     * Sets the value of the customerPromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPromo(String value) {
        this.customerPromo = value;
    }

}
