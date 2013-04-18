
package com.tooltwist.bsg.clientnz;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyOTMRentalHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyOTMRentalHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyOTMRentals" type="{http://rpdata.com/bsg/schemas}propertyOTMRental" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyOTMRentalHistory", propOrder = {
    "propertyOTMRentals"
})
public class PropertyOTMRentalHistory {

    @XmlElement(nillable = true)
    protected List<PropertyOTMRental> propertyOTMRentals;

    /**
     * Gets the value of the propertyOTMRentals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOTMRentals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOTMRentals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyOTMRental }
     * 
     * 
     */
    public List<PropertyOTMRental> getPropertyOTMRentals() {
        if (propertyOTMRentals == null) {
            propertyOTMRentals = new ArrayList<PropertyOTMRental>();
        }
        return this.propertyOTMRentals;
    }

}
