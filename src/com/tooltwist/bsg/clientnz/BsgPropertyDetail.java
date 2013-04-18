
package com.tooltwist.bsg.clientnz;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bsgPropertyDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgPropertyDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}bsgPropertySummary">
 *       &lt;sequence>
 *         &lt;element name="fullPropertyAttributes" type="{http://rpdata.com/bsg/schemas}bsgNameValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listingList" type="{http://rpdata.com/bsg/schemas}bsgListing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="propertyOwners" type="{http://rpdata.com/bsg/schemas}bsgPropertyOwner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="propertyVendors" type="{http://rpdata.com/bsg/schemas}bsgPropertyVendors" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rentalList" type="{http://rpdata.com/bsg/schemas}bsgRentalListing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="salesHistoryList" type="{http://rpdata.com/bsg/schemas}bsgSaleHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statePropertyAttributes" type="{http://rpdata.com/bsg/schemas}bsgNameValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="propertyDetailAdditional" type="{http://rpdata.com/bsg/schemas}bsgPropertyDetailAdditional" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgPropertyDetail", propOrder = {
    "fullPropertyAttributes",
    "listingList",
    "propertyOwners",
    "propertyVendors",
    "rentalList",
    "salesHistoryList",
    "statePropertyAttributes",
    "propertyDetailAdditional"
})
public class BsgPropertyDetail
    extends BsgPropertySummary
{

    @XmlElement(nillable = true)
    protected List<BsgNameValuePair> fullPropertyAttributes;
    @XmlElement(nillable = true)
    protected List<BsgListing> listingList;
    @XmlElement(nillable = true)
    protected List<BsgPropertyOwner> propertyOwners;
    @XmlElement(nillable = true)
    protected List<BsgPropertyVendors> propertyVendors;
    @XmlElement(nillable = true)
    protected List<BsgRentalListing> rentalList;
    @XmlElement(nillable = true)
    protected List<BsgSaleHistory> salesHistoryList;
    @XmlElement(nillable = true)
    protected List<BsgNameValuePair> statePropertyAttributes;
    protected BsgPropertyDetailAdditional propertyDetailAdditional;

    /**
     * Gets the value of the fullPropertyAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullPropertyAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullPropertyAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgNameValuePair }
     * 
     * 
     */
    public List<BsgNameValuePair> getFullPropertyAttributes() {
        if (fullPropertyAttributes == null) {
            fullPropertyAttributes = new ArrayList<BsgNameValuePair>();
        }
        return this.fullPropertyAttributes;
    }

    /**
     * Gets the value of the listingList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listingList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListingList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgListing }
     * 
     * 
     */
    public List<BsgListing> getListingList() {
        if (listingList == null) {
            listingList = new ArrayList<BsgListing>();
        }
        return this.listingList;
    }

    /**
     * Gets the value of the propertyOwners property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOwners property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOwners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgPropertyOwner }
     * 
     * 
     */
    public List<BsgPropertyOwner> getPropertyOwners() {
        if (propertyOwners == null) {
            propertyOwners = new ArrayList<BsgPropertyOwner>();
        }
        return this.propertyOwners;
    }

    /**
     * Gets the value of the propertyVendors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyVendors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyVendors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgPropertyVendors }
     * 
     * 
     */
    public List<BsgPropertyVendors> getPropertyVendors() {
        if (propertyVendors == null) {
            propertyVendors = new ArrayList<BsgPropertyVendors>();
        }
        return this.propertyVendors;
    }

    /**
     * Gets the value of the rentalList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentalList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentalList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgRentalListing }
     * 
     * 
     */
    public List<BsgRentalListing> getRentalList() {
        if (rentalList == null) {
            rentalList = new ArrayList<BsgRentalListing>();
        }
        return this.rentalList;
    }

    /**
     * Gets the value of the salesHistoryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesHistoryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesHistoryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgSaleHistory }
     * 
     * 
     */
    public List<BsgSaleHistory> getSalesHistoryList() {
        if (salesHistoryList == null) {
            salesHistoryList = new ArrayList<BsgSaleHistory>();
        }
        return this.salesHistoryList;
    }

    /**
     * Gets the value of the statePropertyAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statePropertyAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatePropertyAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgNameValuePair }
     * 
     * 
     */
    public List<BsgNameValuePair> getStatePropertyAttributes() {
        if (statePropertyAttributes == null) {
            statePropertyAttributes = new ArrayList<BsgNameValuePair>();
        }
        return this.statePropertyAttributes;
    }

    /**
     * Gets the value of the propertyDetailAdditional property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertyDetailAdditional }
     *     
     */
    public BsgPropertyDetailAdditional getPropertyDetailAdditional() {
        return propertyDetailAdditional;
    }

    /**
     * Sets the value of the propertyDetailAdditional property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertyDetailAdditional }
     *     
     */
    public void setPropertyDetailAdditional(BsgPropertyDetailAdditional value) {
        this.propertyDetailAdditional = value;
    }

}
