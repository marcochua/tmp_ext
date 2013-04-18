
package com.tooltwist.bsg.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statsCapitalGrowthMedianPrices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statsCapitalGrowthMedianPrices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lgaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitalGrowthMedianPrices" type="{http://rpdata.com/bsg/schemas}capitalGrowthMedianPrices" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statsCapitalGrowthMedianPrices", propOrder = {
    "localityName",
    "lgaName",
    "capitalGrowthMedianPrices"
})
public class StatsCapitalGrowthMedianPrices {

    protected String localityName;
    protected String lgaName;
    @XmlElement(nillable = true)
    protected List<CapitalGrowthMedianPrices> capitalGrowthMedianPrices;

    /**
     * Gets the value of the localityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Sets the value of the localityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalityName(String value) {
        this.localityName = value;
    }

    /**
     * Gets the value of the lgaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgaName() {
        return lgaName;
    }

    /**
     * Sets the value of the lgaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgaName(String value) {
        this.lgaName = value;
    }

    /**
     * Gets the value of the capitalGrowthMedianPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capitalGrowthMedianPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapitalGrowthMedianPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapitalGrowthMedianPrices }
     * 
     * 
     */
    public List<CapitalGrowthMedianPrices> getCapitalGrowthMedianPrices() {
        if (capitalGrowthMedianPrices == null) {
            capitalGrowthMedianPrices = new ArrayList<CapitalGrowthMedianPrices>();
        }
        return this.capitalGrowthMedianPrices;
    }

}
