
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bsgPropertyDescriptors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgPropertyDescriptors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalPropertyRef" type="{http://rpdata.com/bsg/schemas}bsgLegacyExternalPropertyReference" minOccurs="0"/>
 *         &lt;element name="landUsePrimary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="landUseSecondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lgaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lotPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="realPropertyDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ucv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ucvDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoneDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capitalValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valuationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgPropertyDescriptors", propOrder = {
    "accessControl",
    "externalPropertyRef",
    "landUsePrimary",
    "landUseSecondary",
    "lgaName",
    "lotPlan",
    "ownerName",
    "propertyType",
    "propertyTypeCode",
    "propertyTypeName",
    "categoryTypeName",
    "realPropertyDescriptor",
    "ucv",
    "ucvDate",
    "zone",
    "zoneDescription",
    "age",
    "capitalValue",
    "valuationDate"
})
public class BsgPropertyDescriptors {

    protected String accessControl;
    protected BsgLegacyExternalPropertyReference externalPropertyRef;
    protected String landUsePrimary;
    protected String landUseSecondary;
    protected String lgaName;
    protected String lotPlan;
    protected String ownerName;
    protected Integer propertyType;
    protected String propertyTypeCode;
    protected String propertyTypeName;
    protected String categoryTypeName;
    protected String realPropertyDescriptor;
    protected Integer ucv;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ucvDate;
    protected String zone;
    protected String zoneDescription;
    protected String age;
    protected Integer capitalValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valuationDate;

    /**
     * Gets the value of the accessControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessControl() {
        return accessControl;
    }

    /**
     * Sets the value of the accessControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessControl(String value) {
        this.accessControl = value;
    }

    /**
     * Gets the value of the externalPropertyRef property.
     * 
     * @return
     *     possible object is
     *     {@link BsgLegacyExternalPropertyReference }
     *     
     */
    public BsgLegacyExternalPropertyReference getExternalPropertyRef() {
        return externalPropertyRef;
    }

    /**
     * Sets the value of the externalPropertyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgLegacyExternalPropertyReference }
     *     
     */
    public void setExternalPropertyRef(BsgLegacyExternalPropertyReference value) {
        this.externalPropertyRef = value;
    }

    /**
     * Gets the value of the landUsePrimary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandUsePrimary() {
        return landUsePrimary;
    }

    /**
     * Sets the value of the landUsePrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandUsePrimary(String value) {
        this.landUsePrimary = value;
    }

    /**
     * Gets the value of the landUseSecondary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandUseSecondary() {
        return landUseSecondary;
    }

    /**
     * Sets the value of the landUseSecondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandUseSecondary(String value) {
        this.landUseSecondary = value;
    }

    /**
     * Gets the value of the lgaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgaName() {
        return lgaName;
    }

    /**
     * Sets the value of the lgaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgaName(String value) {
        this.lgaName = value;
    }

    /**
     * Gets the value of the lotPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotPlan() {
        return lotPlan;
    }

    /**
     * Sets the value of the lotPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotPlan(String value) {
        this.lotPlan = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPropertyType(Integer value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the propertyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyTypeCode() {
        return propertyTypeCode;
    }

    /**
     * Sets the value of the propertyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyTypeCode(String value) {
        this.propertyTypeCode = value;
    }

    /**
     * Gets the value of the propertyTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyTypeName() {
        return propertyTypeName;
    }

    /**
     * Sets the value of the propertyTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyTypeName(String value) {
        this.propertyTypeName = value;
    }

    /**
     * Gets the value of the categoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryTypeName() {
        return categoryTypeName;
    }

    /**
     * Sets the value of the categoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryTypeName(String value) {
        this.categoryTypeName = value;
    }

    /**
     * Gets the value of the realPropertyDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealPropertyDescriptor() {
        return realPropertyDescriptor;
    }

    /**
     * Sets the value of the realPropertyDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealPropertyDescriptor(String value) {
        this.realPropertyDescriptor = value;
    }

    /**
     * Gets the value of the ucv property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUcv() {
        return ucv;
    }

    /**
     * Sets the value of the ucv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUcv(Integer value) {
        this.ucv = value;
    }

    /**
     * Gets the value of the ucvDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUcvDate() {
        return ucvDate;
    }

    /**
     * Sets the value of the ucvDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUcvDate(XMLGregorianCalendar value) {
        this.ucvDate = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Gets the value of the zoneDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneDescription() {
        return zoneDescription;
    }

    /**
     * Sets the value of the zoneDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneDescription(String value) {
        this.zoneDescription = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge(String value) {
        this.age = value;
    }

    /**
     * Gets the value of the capitalValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapitalValue() {
        return capitalValue;
    }

    /**
     * Sets the value of the capitalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapitalValue(Integer value) {
        this.capitalValue = value;
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

}
