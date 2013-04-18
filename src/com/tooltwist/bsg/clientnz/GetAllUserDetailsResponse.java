
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
 *         &lt;element name="personalInformation" type="{http://rpdata.com/bsg/schemas}personalInformation" minOccurs="0"/>
 *         &lt;element name="workInformation" type="{http://rpdata.com/bsg/schemas}workInformation" minOccurs="0"/>
 *         &lt;element name="agencyInformation" type="{http://rpdata.com/bsg/schemas}agencyInformation" minOccurs="0"/>
 *         &lt;element name="currentListingPropertySummaryList" type="{http://rpdata.com/bsg/schemas}bsgCurrentPropertyListing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recentSalePropertySummaryList" type="{http://rpdata.com/bsg/schemas}bsgRecentSalePropertySummary" maxOccurs="unbounded" minOccurs="0"/>
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
    "agencyInformation",
    "currentListingPropertySummaryList",
    "recentSalePropertySummaryList"
})
@XmlRootElement(name = "getAllUserDetailsResponse")
public class GetAllUserDetailsResponse
    extends BaseBSGResponse
{

    protected PersonalInformation personalInformation;
    protected WorkInformation workInformation;
    protected AgencyInformation agencyInformation;
    @XmlElement(nillable = true)
    protected List<BsgCurrentPropertyListing> currentListingPropertySummaryList;
    @XmlElement(nillable = true)
    protected List<BsgRecentSalePropertySummary> recentSalePropertySummaryList;

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

    /**
     * Gets the value of the currentListingPropertySummaryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentListingPropertySummaryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentListingPropertySummaryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgCurrentPropertyListing }
     * 
     * 
     */
    public List<BsgCurrentPropertyListing> getCurrentListingPropertySummaryList() {
        if (currentListingPropertySummaryList == null) {
            currentListingPropertySummaryList = new ArrayList<BsgCurrentPropertyListing>();
        }
        return this.currentListingPropertySummaryList;
    }

    /**
     * Gets the value of the recentSalePropertySummaryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recentSalePropertySummaryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecentSalePropertySummaryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgRecentSalePropertySummary }
     * 
     * 
     */
    public List<BsgRecentSalePropertySummary> getRecentSalePropertySummaryList() {
        if (recentSalePropertySummaryList == null) {
            recentSalePropertySummaryList = new ArrayList<BsgRecentSalePropertySummary>();
        }
        return this.recentSalePropertySummaryList;
    }

}
