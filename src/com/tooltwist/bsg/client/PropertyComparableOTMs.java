
package com.tooltwist.bsg.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyComparableOTMs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyComparableOTMs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparableOTMs" type="{http://rpdata.com/bsg/schemas}comparableOTM" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyComparableOTMs", propOrder = {
    "comparableOTMs"
})
public class PropertyComparableOTMs {

    @XmlElement(nillable = true)
    protected List<ComparableOTM> comparableOTMs;

    /**
     * Gets the value of the comparableOTMs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparableOTMs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparableOTMs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComparableOTM }
     * 
     * 
     */
    public List<ComparableOTM> getComparableOTMs() {
        if (comparableOTMs == null) {
            comparableOTMs = new ArrayList<ComparableOTM>();
        }
        return this.comparableOTMs;
    }

}
