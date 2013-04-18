
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for propertyImprovements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyImprovements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dwellingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeys" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="roof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainWalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bath" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carAccommodationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carAccommodationNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carAccommodationArea" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="builtAbout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionsAbout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="significantRenovationsDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="areaUnderMainRoof" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="externalImprovements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="services" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialFeatures" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="landArea" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="landAreaApprox" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyImprovements", propOrder = {
    "dwellingType",
    "propertyType",
    "currentUse",
    "storeys",
    "roof",
    "mainWalls",
    "bed",
    "bath",
    "carAccommodationType",
    "carAccommodationNumber",
    "carAccommodationArea",
    "builtAbout",
    "additionsAbout",
    "significantRenovationsDate",
    "areaUnderMainRoof",
    "externalImprovements",
    "services",
    "attributes",
    "specialFeatures",
    "landArea",
    "landAreaApprox"
})
public class PropertyImprovements {

    protected String dwellingType;
    protected String propertyType;
    protected String currentUse;
    protected Integer storeys;
    protected String roof;
    protected String mainWalls;
    protected Integer bed;
    protected Integer bath;
    protected String carAccommodationType;
    protected Integer carAccommodationNumber;
    protected Integer carAccommodationArea;
    protected String builtAbout;
    protected String additionsAbout;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar significantRenovationsDate;
    protected Integer areaUnderMainRoof;
    protected String externalImprovements;
    protected String services;
    protected String attributes;
    protected String specialFeatures;
    protected Long landArea;
    protected Long landAreaApprox;

    /**
     * Gets the value of the dwellingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDwellingType() {
        return dwellingType;
    }

    /**
     * Sets the value of the dwellingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDwellingType(String value) {
        this.dwellingType = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyType(String value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the currentUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentUse() {
        return currentUse;
    }

    /**
     * Sets the value of the currentUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentUse(String value) {
        this.currentUse = value;
    }

    /**
     * Gets the value of the storeys property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStoreys() {
        return storeys;
    }

    /**
     * Sets the value of the storeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStoreys(Integer value) {
        this.storeys = value;
    }

    /**
     * Gets the value of the roof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoof() {
        return roof;
    }

    /**
     * Sets the value of the roof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoof(String value) {
        this.roof = value;
    }

    /**
     * Gets the value of the mainWalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainWalls() {
        return mainWalls;
    }

    /**
     * Sets the value of the mainWalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainWalls(String value) {
        this.mainWalls = value;
    }

    /**
     * Gets the value of the bed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBed() {
        return bed;
    }

    /**
     * Sets the value of the bed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBed(Integer value) {
        this.bed = value;
    }

    /**
     * Gets the value of the bath property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBath() {
        return bath;
    }

    /**
     * Sets the value of the bath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBath(Integer value) {
        this.bath = value;
    }

    /**
     * Gets the value of the carAccommodationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarAccommodationType() {
        return carAccommodationType;
    }

    /**
     * Sets the value of the carAccommodationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarAccommodationType(String value) {
        this.carAccommodationType = value;
    }

    /**
     * Gets the value of the carAccommodationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarAccommodationNumber() {
        return carAccommodationNumber;
    }

    /**
     * Sets the value of the carAccommodationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarAccommodationNumber(Integer value) {
        this.carAccommodationNumber = value;
    }

    /**
     * Gets the value of the carAccommodationArea property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarAccommodationArea() {
        return carAccommodationArea;
    }

    /**
     * Sets the value of the carAccommodationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarAccommodationArea(Integer value) {
        this.carAccommodationArea = value;
    }

    /**
     * Gets the value of the builtAbout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuiltAbout() {
        return builtAbout;
    }

    /**
     * Sets the value of the builtAbout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuiltAbout(String value) {
        this.builtAbout = value;
    }

    /**
     * Gets the value of the additionsAbout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionsAbout() {
        return additionsAbout;
    }

    /**
     * Sets the value of the additionsAbout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionsAbout(String value) {
        this.additionsAbout = value;
    }

    /**
     * Gets the value of the significantRenovationsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignificantRenovationsDate() {
        return significantRenovationsDate;
    }

    /**
     * Sets the value of the significantRenovationsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignificantRenovationsDate(XMLGregorianCalendar value) {
        this.significantRenovationsDate = value;
    }

    /**
     * Gets the value of the areaUnderMainRoof property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAreaUnderMainRoof() {
        return areaUnderMainRoof;
    }

    /**
     * Sets the value of the areaUnderMainRoof property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAreaUnderMainRoof(Integer value) {
        this.areaUnderMainRoof = value;
    }

    /**
     * Gets the value of the externalImprovements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalImprovements() {
        return externalImprovements;
    }

    /**
     * Sets the value of the externalImprovements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalImprovements(String value) {
        this.externalImprovements = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices(String value) {
        this.services = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributes(String value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the specialFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialFeatures() {
        return specialFeatures;
    }

    /**
     * Sets the value of the specialFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialFeatures(String value) {
        this.specialFeatures = value;
    }

    /**
     * Gets the value of the landArea property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLandArea() {
        return landArea;
    }

    /**
     * Sets the value of the landArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLandArea(Long value) {
        this.landArea = value;
    }

    /**
     * Gets the value of the landAreaApprox property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLandAreaApprox() {
        return landAreaApprox;
    }

    /**
     * Sets the value of the landAreaApprox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLandAreaApprox(Long value) {
        this.landAreaApprox = value;
    }

}
