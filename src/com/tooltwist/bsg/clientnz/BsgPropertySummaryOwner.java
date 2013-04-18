
package com.tooltwist.bsg.clientnz;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bsgPropertySummaryOwner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgPropertySummaryOwner">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}bsgPropertySummary">
 *       &lt;sequence>
 *         &lt;element name="propertyOwners" type="{http://rpdata.com/bsg/schemas}bsgPropertyOwner" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgPropertySummaryOwner", propOrder = {
    "propertyOwners"
})
public class BsgPropertySummaryOwner
    extends BsgPropertySummary
{

    @XmlElement(nillable = true)
    protected List<BsgPropertyOwner> propertyOwners;

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

}
