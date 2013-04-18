
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
 *         &lt;element name="propertyAttributeDefinitions" type="{http://rpdata.com/bsg/schemas}bsgPropertyAttributeDefinition" maxOccurs="unbounded" minOccurs="0"/>
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
    "propertyAttributeDefinitions"
})
@XmlRootElement(name = "getAvailableAttributesForPropertyIdsResponse")
public class GetAvailableAttributesForPropertyIdsResponse
    extends BaseBSGResponse
{

    @XmlElement(nillable = true)
    protected List<BsgPropertyAttributeDefinition> propertyAttributeDefinitions;

    /**
     * Gets the value of the propertyAttributeDefinitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyAttributeDefinitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyAttributeDefinitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgPropertyAttributeDefinition }
     * 
     * 
     */
    public List<BsgPropertyAttributeDefinition> getPropertyAttributeDefinitions() {
        if (propertyAttributeDefinitions == null) {
            propertyAttributeDefinitions = new ArrayList<BsgPropertyAttributeDefinition>();
        }
        return this.propertyAttributeDefinitions;
    }

}