
package com.tooltwist.bsg.clientnz;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bsgSaleHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgSaleHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="agentAdvice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="legacySaleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transferDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="transferId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transferPrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendors" type="{http://rpdata.com/bsg/schemas}bsgVendor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="settlementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="transferRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transferPriceValueRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="armsLengthTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgSaleHistory", propOrder = {
    "agentAdvice",
    "legacySaleId",
    "propertyId",
    "transferDate",
    "transferId",
    "transferPrice",
    "transferType",
    "vendors",
    "settlementDate",
    "transferRelationship",
    "transferPriceValueRelationship",
    "armsLengthTransaction",
    "source"
})
public class BsgSaleHistory
    extends BaseServiceResponse
{

    protected Boolean agentAdvice;
    protected String legacySaleId;
    protected Integer propertyId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transferDate;
    protected Integer transferId;
    protected Integer transferPrice;
    protected String transferType;
    @XmlElement(nillable = true)
    protected List<BsgVendor> vendors;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar settlementDate;
    protected String transferRelationship;
    protected String transferPriceValueRelationship;
    protected Boolean armsLengthTransaction;
    protected List<String> source;

    /**
     * Gets the value of the agentAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgentAdvice() {
        return agentAdvice;
    }

    /**
     * Sets the value of the agentAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgentAdvice(Boolean value) {
        this.agentAdvice = value;
    }

    /**
     * Gets the value of the legacySaleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacySaleId() {
        return legacySaleId;
    }

    /**
     * Sets the value of the legacySaleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacySaleId(String value) {
        this.legacySaleId = value;
    }

    /**
     * Gets the value of the propertyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPropertyId(Integer value) {
        this.propertyId = value;
    }

    /**
     * Gets the value of the transferDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransferDate() {
        return transferDate;
    }

    /**
     * Sets the value of the transferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransferDate(XMLGregorianCalendar value) {
        this.transferDate = value;
    }

    /**
     * Gets the value of the transferId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransferId() {
        return transferId;
    }

    /**
     * Sets the value of the transferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransferId(Integer value) {
        this.transferId = value;
    }

    /**
     * Gets the value of the transferPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransferPrice() {
        return transferPrice;
    }

    /**
     * Sets the value of the transferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransferPrice(Integer value) {
        this.transferPrice = value;
    }

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferType(String value) {
        this.transferType = value;
    }

    /**
     * Gets the value of the vendors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BsgVendor }
     * 
     * 
     */
    public List<BsgVendor> getVendors() {
        if (vendors == null) {
            vendors = new ArrayList<BsgVendor>();
        }
        return this.vendors;
    }

    /**
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlementDate(XMLGregorianCalendar value) {
        this.settlementDate = value;
    }

    /**
     * Gets the value of the transferRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferRelationship() {
        return transferRelationship;
    }

    /**
     * Sets the value of the transferRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferRelationship(String value) {
        this.transferRelationship = value;
    }

    /**
     * Gets the value of the transferPriceValueRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferPriceValueRelationship() {
        return transferPriceValueRelationship;
    }

    /**
     * Sets the value of the transferPriceValueRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferPriceValueRelationship(String value) {
        this.transferPriceValueRelationship = value;
    }

    /**
     * Gets the value of the armsLengthTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArmsLengthTransaction() {
        return armsLengthTransaction;
    }

    /**
     * Sets the value of the armsLengthTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArmsLengthTransaction(Boolean value) {
        this.armsLengthTransaction = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSource() {
        if (source == null) {
            source = new ArrayList<String>();
        }
        return this.source;
    }

}
