
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
 *         &lt;element name="propertySummaryOwnerList" type="{http://rpdata.com/bsg/schemas}bsgPropertySummaryOwner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numberOfResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfDistinctProperties" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "propertySummaryOwnerList",
    "numberOfResults",
    "numberOfDistinctProperties"
})
@XmlRootElement(name = "getPropertySummaryListByNameSuburbResponse")
public class GetPropertySummaryListByNameSuburbResponse
    extends BaseBSGResponse
{

    @XmlElement(nillable = true)
    protected List<BsgPropertySummaryOwner> propertySummaryOwnerList;
    protected Integer numberOfResults;
    protected Integer numberOfDistinctProperties;

    /**
     * Gets the value of the propertySummaryOwnerList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertySummaryOwnerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertySummaryOwnerList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgPropertySummaryOwner }
     * 
     * 
     */
    public List<BsgPropertySummaryOwner> getPropertySummaryOwnerList() {
        if (propertySummaryOwnerList == null) {
            propertySummaryOwnerList = new ArrayList<BsgPropertySummaryOwner>();
        }
        return this.propertySummaryOwnerList;
    }

    /**
     * Gets the value of the numberOfResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfResults() {
        return numberOfResults;
    }

    /**
     * Sets the value of the numberOfResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfResults(Integer value) {
        this.numberOfResults = value;
    }

    /**
     * Gets the value of the numberOfDistinctProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDistinctProperties() {
        return numberOfDistinctProperties;
    }

    /**
     * Sets the value of the numberOfDistinctProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDistinctProperties(Integer value) {
        this.numberOfDistinctProperties = value;
    }

}
