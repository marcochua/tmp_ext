
package com.tooltwist.bsg.clientnz;

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
 *         &lt;element name="personalInformation" type="{http://rpdata.com/bsg/schemas}personalInformation" minOccurs="0"/>
 *         &lt;element name="workInformation" type="{http://rpdata.com/bsg/schemas}workInformation" minOccurs="0"/>
 *         &lt;element name="agencyInformation" type="{http://rpdata.com/bsg/schemas}agencyInformation" minOccurs="0"/>
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
    "personalInformation",
    "workInformation",
    "agencyInformation"
})
@XmlRootElement(name = "getUserDetailsResponse")
public class GetUserDetailsResponse
    extends BaseBSGResponse
{

    protected PersonalInformation personalInformation;
    protected WorkInformation workInformation;
    protected AgencyInformation agencyInformation;

    /**
     * Gets the value of the personalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInformation }
     *     
     */
    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    /**
     * Sets the value of the personalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInformation }
     *     
     */
    public void setPersonalInformation(PersonalInformation value) {
        this.personalInformation = value;
    }

    /**
     * Gets the value of the workInformation property.
     * 
     * @return
     *     possible object is
     *     {@link WorkInformation }
     *     
     */
    public WorkInformation getWorkInformation() {
        return workInformation;
    }

    /**
     * Sets the value of the workInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkInformation }
     *     
     */
    public void setWorkInformation(WorkInformation value) {
        this.workInformation = value;
    }

    /**
     * Gets the value of the agencyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyInformation }
     *     
     */
    public AgencyInformation getAgencyInformation() {
        return agencyInformation;
    }

    /**
     * Sets the value of the agencyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyInformation }
     *     
     */
    public void setAgencyInformation(AgencyInformation value) {
        this.agencyInformation = value;
    }

}
