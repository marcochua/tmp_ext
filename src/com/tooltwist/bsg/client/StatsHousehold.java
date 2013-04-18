
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statsHousehold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statsHousehold">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="householdStruct" type="{http://rpdata.com/bsg/schemas}householdStruct" minOccurs="0"/>
 *         &lt;element name="householdOccup" type="{http://rpdata.com/bsg/schemas}householdOccup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statsHousehold", propOrder = {
    "householdStruct",
    "householdOccup"
})
public class StatsHousehold {

    protected HouseholdStruct householdStruct;
    protected HouseholdOccup householdOccup;

    /**
     * Gets the value of the householdStruct property.
     * 
     * @return
     *     possible object is
     *     {@link HouseholdStruct }
     *     
     */
    public HouseholdStruct getHouseholdStruct() {
        return householdStruct;
    }

    /**
     * Sets the value of the householdStruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseholdStruct }
     *     
     */
    public void setHouseholdStruct(HouseholdStruct value) {
        this.householdStruct = value;
    }

    /**
     * Gets the value of the householdOccup property.
     * 
     * @return
     *     possible object is
     *     {@link HouseholdOccup }
     *     
     */
    public HouseholdOccup getHouseholdOccup() {
        return householdOccup;
    }

    /**
     * Sets the value of the householdOccup property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseholdOccup }
     *     
     */
    public void setHouseholdOccup(HouseholdOccup value) {
        this.householdOccup = value;
    }

}
