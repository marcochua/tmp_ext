
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for propertyLandTitle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyLandTitle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="residentialTitleUnitNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="carAccommodationTitleUnitNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="titleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lotPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strataPlanNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="depositedPlanNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="block" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetMapNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="streetMapReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="landDimensions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="landArea" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="planningScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoningType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ratingAssessmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="unimprovedCapitalValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="capitalImprovedValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyLandTitle", propOrder = {
    "residentialTitleUnitNumber",
    "carAccommodationTitleUnitNumber",
    "titleType",
    "lotPlan",
    "volume",
    "folio",
    "strataPlanNumber",
    "depositedPlanNumber",
    "block",
    "section",
    "parish",
    "rpd",
    "streetMapNumber",
    "streetMapReference",
    "landDimensions",
    "landArea",
    "planningScheme",
    "zoningType",
    "lga",
    "ratingAssessmentDate",
    "unimprovedCapitalValue",
    "capitalImprovedValue"
})
public class PropertyLandTitle {

    protected Integer residentialTitleUnitNumber;
    protected Integer carAccommodationTitleUnitNumber;
    protected String titleType;
    protected String lotPlan;
    protected String volume;
    protected String folio;
    protected Integer strataPlanNumber;
    protected Integer depositedPlanNumber;
    protected String block;
    protected String section;
    protected String parish;
    protected String rpd;
    protected Integer streetMapNumber;
    protected String streetMapReference;
    protected String landDimensions;
    protected Long landArea;
    protected String planningScheme;
    protected String zoningType;
    protected String lga;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ratingAssessmentDate;
    protected Integer unimprovedCapitalValue;
    protected Integer capitalImprovedValue;

    /**
     * Gets the value of the residentialTitleUnitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResidentialTitleUnitNumber() {
        return residentialTitleUnitNumber;
    }

    /**
     * Sets the value of the residentialTitleUnitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResidentialTitleUnitNumber(Integer value) {
        this.residentialTitleUnitNumber = value;
    }

    /**
     * Gets the value of the carAccommodationTitleUnitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCarAccommodationTitleUnitNumber() {
        return carAccommodationTitleUnitNumber;
    }

    /**
     * Sets the value of the carAccommodationTitleUnitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCarAccommodationTitleUnitNumber(Integer value) {
        this.carAccommodationTitleUnitNumber = value;
    }

    /**
     * Gets the value of the titleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleType() {
        return titleType;
    }

    /**
     * Sets the value of the titleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleType(String value) {
        this.titleType = value;
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
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Gets the value of the folio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Sets the value of the folio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Gets the value of the strataPlanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStrataPlanNumber() {
        return strataPlanNumber;
    }

    /**
     * Sets the value of the strataPlanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrataPlanNumber(Integer value) {
        this.strataPlanNumber = value;
    }

    /**
     * Gets the value of the depositedPlanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepositedPlanNumber() {
        return depositedPlanNumber;
    }

    /**
     * Sets the value of the depositedPlanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepositedPlanNumber(Integer value) {
        this.depositedPlanNumber = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Gets the value of the parish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParish() {
        return parish;
    }

    /**
     * Sets the value of the parish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParish(String value) {
        this.parish = value;
    }

    /**
     * Gets the value of the rpd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpd() {
        return rpd;
    }

    /**
     * Sets the value of the rpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpd(String value) {
        this.rpd = value;
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
     * Gets the value of the landDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandDimensions() {
        return landDimensions;
    }

    /**
     * Sets the value of the landDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandDimensions(String value) {
        this.landDimensions = value;
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
     * Gets the value of the planningScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanningScheme() {
        return planningScheme;
    }

    /**
     * Sets the value of the planningScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanningScheme(String value) {
        this.planningScheme = value;
    }

    /**
     * Gets the value of the zoningType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoningType() {
        return zoningType;
    }

    /**
     * Sets the value of the zoningType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoningType(String value) {
        this.zoningType = value;
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

}
