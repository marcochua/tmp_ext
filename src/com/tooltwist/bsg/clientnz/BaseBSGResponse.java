
package com.tooltwist.bsg.clientnz;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseBSGResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseBSGResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="disclaimers" type="{http://rpdata.com/bsg/schemas}bsgDisclaimer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseBSGResponse", propOrder = {
    "disclaimers"
})
@XmlSeeAlso({
    PropertyIdResponse.class,
    PropertyAddressListResponse.class,
    StatisticsChartResponse.class,
    RefineMarketComparePropertiesResponse.class,
    GetMarketComparePropertySummaryListResponse.class
})
public abstract class BaseBSGResponse
    extends BaseServiceResponse
{

    @XmlElement(nillable = true)
    protected List<BsgDisclaimer> disclaimers;

    /**
     * Gets the value of the disclaimers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclaimers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclaimers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgDisclaimer }
     * 
     * 
     */
    public List<BsgDisclaimer> getDisclaimers() {
        if (disclaimers == null) {
            disclaimers = new ArrayList<BsgDisclaimer>();
        }
        return this.disclaimers;
    }

}
