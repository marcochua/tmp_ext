
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for comparableOTM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="comparableOTM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainPhoto" type="{http://rpdata.com/bsg/schemas}photoData" minOccurs="0"/>
 *         &lt;element name="propertyAddress" type="{http://rpdata.com/bsg/schemas}propertyAddress" minOccurs="0"/>
 *         &lt;element name="lotPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="listedSalePrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="listedSalePriceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listedSaleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="landArea" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellingAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellingAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distanceFromTarget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="capitalImprovedValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unimprovedCapitalValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ratingAssessmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="landUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainWalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaUnderMainRoof" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="builtAbout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetMapReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bedroom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bathroom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carspace" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comparableOTM", propOrder = {
    "propertyId",
    "propertyCategory",
    "mainPhoto",
    "propertyAddress",
    "lotPlan",
    "listedDate",
    "listedSalePrice",
    "listedSalePriceDescription",
    "listedSaleType",
    "landArea",
    "attributes",
    "sellingAgent",
    "sellingAgency",
    "agencyPhone",
    "distanceFromTarget",
    "capitalImprovedValue",
    "unimprovedCapitalValue",
    "ratingAssessmentDate",
    "landUse",
    "mainWalls",
    "areaUnderMainRoof",
    "builtAbout",
    "zoning",
    "lga",
    "streetMapReference",
    "bedroom",
    "bathroom",
    "carspace"
})
public class ComparableOTM {

    protected Integer propertyId;
    protected String propertyCategory;
    protected PhotoData mainPhoto;
    protected PropertyAddress propertyAddress;
    protected String lotPlan;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar listedDate;
    protected Integer listedSalePrice;
    protected String listedSalePriceDescription;
    protected String listedSaleType;
    protected Long landArea;
    protected String attributes;
    protected String sellingAgent;
    protected String sellingAgency;
    protected String agencyPhone;
    protected Double distanceFromTarget;
    protected Integer capitalImprovedValue;
    protected Integer unimprovedCapitalValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ratingAssessmentDate;
    protected String landUse;
    protected String mainWalls;
    protected Integer areaUnderMainRoof;
    protected String builtAbout;
    protected String zoning;
    protected String lga;
    protected String streetMapReference;
    protected Integer bedroom;
    protected Integer bathroom;
    protected Integer carspace;

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
     * Gets the value of the listedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListedDate() {
        return listedDate;
    }

    /**
     * Sets the value of the listedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListedDate(XMLGregorianCalendar value) {
        this.listedDate = value;
    }

    /**
     * Gets the value of the listedSalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getListedSalePrice() {
        return listedSalePrice;
    }

    /**
     * Sets the value of the listedSalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setListedSalePrice(Integer value) {
        this.listedSalePrice = value;
    }

    /**
     * Gets the value of the listedSalePriceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListedSalePriceDescription() {
        return listedSalePriceDescription;
    }

    /**
     * Sets the value of the listedSalePriceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListedSalePriceDescription(String value) {
        this.listedSalePriceDescription = value;
    }

    /**
     * Gets the value of the listedSaleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListedSaleType() {
        return listedSaleType;
    }

    /**
     * Sets the value of the listedSaleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListedSaleType(String value) {
        this.listedSaleType = value;
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
     * Gets the value of the bedroom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBedroom() {
        return bedroom;
    }

    /**
     * Sets the value of the bedroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBedroom(Integer value) {
        this.bedroom = value;
    }

    /**
     * Gets the value of the bathroom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBathroom() {
        return bathroom;
    }

    /**
     * Sets the value of the bathroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBathroom(Integer value) {
        this.bathroom = value;
    }

    /**
     * Gets the value of the carspace property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarspace() {
        return carspace;
    }

    /**
     * Sets the value of the carspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarspace(Integer value) {
        this.carspace = value;
    }

}
