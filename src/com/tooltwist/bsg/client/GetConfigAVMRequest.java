
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseBSGRequest">
 *       &lt;sequence>
 *         &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bedrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carSpaces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="floorAreaM2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="landAreaM2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="saleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="salePrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valuationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="yearBuilt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="craftsmanshipQuality" type="{http://rpdata.com/bsg/schemas}craftsmanshipQuality" minOccurs="0"/>
 *         &lt;element name="customAVMName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "bathrooms",
    "bedrooms",
    "carSpaces",
    "floorAreaM2",
    "landAreaM2",
    "propertyId",
    "saleDate",
    "salePrice",
    "valuationDate",
    "yearBuilt",
    "craftsmanshipQuality",
    "customAVMName"
})
@XmlRootElement(name = "getConfigAVMRequest")
public class GetConfigAVMRequest
    extends BaseBSGRequest
{

    protected Integer bathrooms;
    protected Integer bedrooms;
    protected Integer carSpaces;
    protected Long floorAreaM2;
    protected Long landAreaM2;
    protected int propertyId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar saleDate;
    protected Integer salePrice;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valuationDate;
    protected Integer yearBuilt;
    protected CraftsmanshipQuality craftsmanshipQuality;
    @XmlElement(required = true)
    protected String customAVMName;

    /**
     * Gets the value of the bathrooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBathrooms() {
        return bathrooms;
    }

    /**
     * Sets the value of the bathrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBathrooms(Integer value) {
        this.bathrooms = value;
    }

    /**
     * Gets the value of the bedrooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBedrooms() {
        return bedrooms;
    }

    /**
     * Sets the value of the bedrooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBedrooms(Integer value) {
        this.bedrooms = value;
    }

    /**
     * Gets the value of the carSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarSpaces() {
        return carSpaces;
    }

    /**
     * Sets the value of the carSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarSpaces(Integer value) {
        this.carSpaces = value;
    }

    /**
     * Gets the value of the floorAreaM2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFloorAreaM2() {
        return floorAreaM2;
    }

    /**
     * Sets the value of the floorAreaM2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFloorAreaM2(Long value) {
        this.floorAreaM2 = value;
    }

    /**
     * Gets the value of the landAreaM2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLandAreaM2() {
        return landAreaM2;
    }

    /**
     * Sets the value of the landAreaM2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLandAreaM2(Long value) {
        this.landAreaM2 = value;
    }

    /**
     * Gets the value of the propertyId property.
     * 
     */
    public int getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     * 
     */
    public void setPropertyId(int value) {
        this.propertyId = value;
    }

    /**
     * Gets the value of the saleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaleDate() {
        return saleDate;
    }

    /**
     * Sets the value of the saleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaleDate(XMLGregorianCalendar value) {
        this.saleDate = value;
    }

    /**
     * Gets the value of the salePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalePrice() {
        return salePrice;
    }

    /**
     * Sets the value of the salePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalePrice(Integer value) {
        this.salePrice = value;
    }

    /**
     * Gets the value of the valuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValuationDate() {
        return valuationDate;
    }

    /**
     * Sets the value of the valuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValuationDate(XMLGregorianCalendar value) {
        this.valuationDate = value;
    }

    /**
     * Gets the value of the yearBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearBuilt() {
        return yearBuilt;
    }

    /**
     * Sets the value of the yearBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearBuilt(Integer value) {
        this.yearBuilt = value;
    }

    /**
     * Gets the value of the craftsmanshipQuality property.
     * 
     * @return
     *     possible object is
     *     {@link CraftsmanshipQuality }
     *     
     */
    public CraftsmanshipQuality getCraftsmanshipQuality() {
        return craftsmanshipQuality;
    }

    /**
     * Sets the value of the craftsmanshipQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link CraftsmanshipQuality }
     *     
     */
    public void setCraftsmanshipQuality(CraftsmanshipQuality value) {
        this.craftsmanshipQuality = value;
    }

    /**
     * Gets the value of the customAVMName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAVMName() {
        return customAVMName;
    }

    /**
     * Sets the value of the customAVMName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAVMName(String value) {
        this.customAVMName = value;
    }

}
