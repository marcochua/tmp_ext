
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
 *         &lt;element name="listings" type="{http://rpdata.com/bsg/schemas}bsgListing" maxOccurs="unbounded" minOccurs="0"/>
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
    "listings"
})
@XmlRootElement(name = "getListingsForPropertyIdResponse")
public class GetListingsForPropertyIdResponse
    extends BaseBSGResponse
{

    @XmlElement(nillable = true)
    protected List<BsgListing> listings;

    /**
     * Gets the value of the listings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgListing }
     * 
     * 
     */
    public List<BsgListing> getListings() {
        if (listings == null) {
            listings = new ArrayList<BsgListing>();
        }
        return this.listings;
    }

}
