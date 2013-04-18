
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for comparableSale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="comparableSale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="agentAdvice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="propertyCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainPhoto" type="{http://rpdata.com/bsg/schemas}photoData" minOccurs="0"/>
 *         &lt;element name="propertyAddress" type="{http://rpdata.com/bsg/schemas}propertyAddress" minOccurs="0"/>
 *         &lt;element name="lotPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastSaleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastSaleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastSalePrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ratingAssessmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="unimprovedCapitalValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="capitalImprovedValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="landArea" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="propertyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bath" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="landUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaUnderMainRoof" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="builtAbout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainWalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carAccommodationNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="streetMapNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="streetMapReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distanceFromTarget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellingAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellingAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="methodOfSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comparableSale", propOrder = {
    "propertyId",
    "agentAdvice",
    "propertyCategory",
    "mainPhoto",
    "propertyAddress",
    "lotPlan",
    "lastSaleDate",
    "lastSaleType",
    "lastSalePrice",
    "ratingAssessmentDate",
    "unimprovedCapitalValue",
    "capitalImprovedValue",
    "landArea",
    "propertyType",
    "zoning",
    "lga",
    "bed",
    "bath",
    "landUse",
    "areaUnderMainRoof",
    "builtAbout",
    "mainWalls",
    "carAccommodationNumber",
    "streetMapNumber",
    "streetMapReference",
    "distanceFromTarget",
    "attributes",
    "dataSource",
    "sellingAgent",
    "sellingAgency",
    "agencyPhone",
    "methodOfSale"
})
public class ComparableSale {

    protected Integer propertyId;
    protected Boolean agentAdvice;
    protected String propertyCategory;
    protected PhotoData mainPhoto;
    protected PropertyAddress propertyAddress;
    protected String lotPlan;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSaleDate;
    protected String lastSaleType;
    protected Integer lastSalePrice;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ratingAssessmentDate;
    protected Integer unimprovedCapitalValue;
    protected Integer capitalImprovedValue;
    protected Long landArea;
    protected String propertyType;
    protected String zoning;
    protected String lga;
    protected Integer bed;
    protected Integer bath;
    protected String landUse;
    protected Integer areaUnderMainRoof;
    protected String builtAbout;
    protected String mainWalls;
    protected Integer carAccommodationNumber;
    protected Integer streetMapNumber;
    protected String streetMapReference;
    protected Double distanceFromTarget;
    protected String attributes;
    protected String dataSource;
    protected String sellingAgent;
    protected String sellingAgency;
    protected String agencyPhone;
    protected String methodOfSale;

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
     * Gets the value of the propertyCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyCategory() {
        return propertyCategory;
    }

    /**
     * Sets the value of the propertyCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyCategory(String value) {
        this.propertyCategory = value;
    }

    /**
     * Gets the value of the mainPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link PhotoData }
     *     
     */
    public PhotoData getMainPhoto() {
        return mainPhoto;
    }

    /**
     * Sets the value of the mainPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotoData }
     *     
     */
    public void setMainPhoto(PhotoData value) {
        this.mainPhoto = value;
    }

    /**
     * Gets the value of the propertyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyAddress }
     *     
     */
    public PropertyAddress getPropertyAddress() {
        return propertyAddress;
    }

    /**
     * Sets the value of the propertyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyAddress }
     *     
     */
    public void setPropertyAddress(PropertyAddress value) {
        this.propertyAddress = value;
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
     * Gets the value of the lastSaleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSaleDate() {
        return lastSaleDate;
    }

    /**
     * Sets the value of the lastSaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSaleDate(XMLGregorianCalendar value) {
        this.lastSaleDate = value;
    }

    /**
     * Gets the value of the lastSaleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSaleType() {
        return lastSaleType;
    }

    /**
     * Sets the value of the lastSaleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSaleType(String value) {
        this.lastSaleType = value;
    }

    /**
     * Gets the value of the lastSalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastSalePrice() {
        return lastSalePrice;
    }

    /**
     * Sets the value of the lastSalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastSalePrice(Integer value) {
        this.lastSalePrice = value;
    }

    /**
     * Gets the value of the ratingAssessmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRatingAssessmentDate() {
        return ratingAssessmentDate;
    }

    /**
     * Sets the value of the ratingAssessmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRatingAssessmentDate(XMLGregorianCalendar value) {
        this.ratingAssessmentDate = value;
    }

    /**
     * Gets the value of the unimprovedCapitalValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnimprovedCapitalValue() {
        return unimprovedCapitalValue;
    }

    /**
     * Sets the value of the unimprovedCapitalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnimprovedCapitalValue(Integer value) {
        this.unimprovedCapitalValue = value;
    }

    /**
     * Gets the value of the capitalImprovedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapitalImprovedValue() {
        return capitalImprovedValue;
    }

    /**
     * Sets the value of the capitalImprovedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapitalImprovedValue(Integer value) {
        this.capitalImprovedValue = value;
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
     * Gets the value of the zoning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoning() {
        return zoning;
    }

    /**
     * Sets the value of the zoning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoning(String value) {
        this.zoning = value;
    }

    /**
     * Gets the value of the lga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLga() {
        return lga;
    }

    /**
     * Sets the value of the lga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLga(String value) {
        this.lga = value;
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
     * Gets the value of the landUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandUse() {
        return landUse;
    }

    /**
     * Sets the value of the landUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandUse(String value) {
        this.landUse = value;
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
     * Gets the value of the streetMapNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStreetMapNumber() {
        return streetMapNumber;
    }

    /**
     * Sets the value of the streetMapNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStreetMapNumber(Integer value) {
        this.streetMapNumber = value;
    }

    /**
     * Gets the value of the streetMapReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetMapReference() {
        return streetMapReference;
    }

    /**
     * Sets the value of the streetMapReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetMapReference(String value) {
        this.streetMapReference = value;
    }

    /**
     * Gets the value of the distanceFromTarget property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistanceFromTarget() {
        return distanceFromTarget;
    }

    /**
     * Sets the value of the distanceFromTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistanceFromTarget(Double value) {
        this.distanceFromTarget = value;
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
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the sellingAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingAgent() {
        return sellingAgent;
    }

    /**
     * Sets the value of the sellingAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingAgent(String value) {
        this.sellingAgent = value;
    }

    /**
     * Gets the value of the sellingAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingAgency() {
        return sellingAgency;
    }

    /**
     * Sets the value of the sellingAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingAgency(String value) {
        this.sellingAgency = value;
    }

    /**
     * Gets the value of the agencyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyPhone() {
        return agencyPhone;
    }

    /**
     * Sets the value of the agencyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyPhone(String value) {
        this.agencyPhone = value;
    }

    /**
     * Gets the value of the methodOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodOfSale() {
        return methodOfSale;
    }

    /**
     * Sets the value of the methodOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodOfSale(String value) {
        this.methodOfSale = value;
    }

}
