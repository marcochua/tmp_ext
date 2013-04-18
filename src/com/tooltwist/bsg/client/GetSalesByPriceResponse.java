
package com.tooltwist.bsg.client;

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
 *         &lt;element name="salesByPrice" type="{http://rpdata.com/bsg/schemas}salesByPrice" maxOccurs="unbounded" minOccurs="0"/>
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
    "salesByPrice"
})
@XmlRootElement(name = "getSalesByPriceResponse")
public class GetSalesByPriceResponse
    extends BaseBSGResponse
{

    @XmlElement(nillable = true)
    protected List<SalesByPrice> salesByPrice;

    /**
     * Gets the value of the salesByPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesByPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesByPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesByPrice }
     * 
     * 
     */
    public List<SalesByPrice> getSalesByPrice() {
        if (salesByPrice == null) {
            salesByPrice = new ArrayList<SalesByPrice>();
        }
        return this.salesByPrice;
    }

}
