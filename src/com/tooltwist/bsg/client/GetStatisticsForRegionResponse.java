
package com.tooltwist.bsg.client;

import java.math.BigDecimal;
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
 *         &lt;element name="childcare" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="currentYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="demographicsParagraph" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="householdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medianSalePrice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mortgageRepaymentRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberParks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ownerOccupiedCurrentCensus" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ownerOccupiedPreviousCensus" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="parkAreaPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="populationCurrentCensus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="populationPreviousCensus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="predominantAgeGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="predominantOccupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prevYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="school" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "childcare",
    "currentYear",
    "demographicsParagraph",
    "householdType",
    "lgaName",
    "localityName",
    "medianSalePrice",
    "mortgageRepaymentRange",
    "numberParks",
    "ownerOccupiedCurrentCensus",
    "ownerOccupiedPreviousCensus",
    "parkAreaPercentage",
    "populationCurrentCensus",
    "populationPreviousCensus",
    "predominantAgeGroup",
    "predominantOccupation",
    "prevYear",
    "school",
    "size"
})
@XmlRootElement(name = "getStatisticsForRegionResponse")
public class GetStatisticsForRegionResponse
    extends BaseBSGResponse
{

    protected Integer childcare;
    protected Integer currentYear;
    protected String demographicsParagraph;
    protected String householdType;
    @XmlElement(name = "LGAName")
    protected String lgaName;
    protected String localityName;
    protected Integer medianSalePrice;
    protected String mortgageRepaymentRange;
    protected Integer numberParks;
    protected BigDecimal ownerOccupiedCurrentCensus;
    protected BigDecimal ownerOccupiedPreviousCensus;
    protected BigDecimal parkAreaPercentage;
    protected Long populationCurrentCensus;
    protected Long populationPreviousCensus;
    protected String predominantAgeGroup;
    protected String predominantOccupation;
    protected Integer prevYear;
    protected Integer school;
    protected Integer size;

    /**
     * Gets the value of the childcare property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildcare() {
        return childcare;
    }

    /**
     * Sets the value of the childcare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildcare(Integer value) {
        this.childcare = value;
    }

    /**
     * Gets the value of the currentYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentYear() {
        return currentYear;
    }

    /**
     * Sets the value of the currentYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentYear(Integer value) {
        this.currentYear = value;
    }

    /**
     * Gets the value of the demographicsParagraph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemographicsParagraph() {
        return demographicsParagraph;
    }

    /**
     * Sets the value of the demographicsParagraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemographicsParagraph(String value) {
        this.demographicsParagraph = value;
    }

    /**
     * Gets the value of the householdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdType() {
        return householdType;
    }

    /**
     * Sets the value of the householdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdType(String value) {
        this.householdType = value;
    }

    /**
     * Gets the value of the lgaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGAName() {
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
    public void setLGAName(String value) {
        this.lgaName = value;
    }

    /**
     * Gets the value of the localityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Sets the value of the localityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalityName(String value) {
        this.localityName = value;
    }

    /**
     * Gets the value of the medianSalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMedianSalePrice() {
        return medianSalePrice;
    }

    /**
     * Sets the value of the medianSalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMedianSalePrice(Integer value) {
        this.medianSalePrice = value;
    }

    /**
     * Gets the value of the mortgageRepaymentRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageRepaymentRange() {
        return mortgageRepaymentRange;
    }

    /**
     * Sets the value of the mortgageRepaymentRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageRepaymentRange(String value) {
        this.mortgageRepaymentRange = value;
    }

    /**
     * Gets the value of the numberParks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberParks() {
        return numberParks;
    }

    /**
     * Sets the value of the numberParks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberParks(Integer value) {
        this.numberParks = value;
    }

    /**
     * Gets the value of the ownerOccupiedCurrentCensus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnerOccupiedCurrentCensus() {
        return ownerOccupiedCurrentCensus;
    }

    /**
     * Sets the value of the ownerOccupiedCurrentCensus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwnerOccupiedCurrentCensus(BigDecimal value) {
        this.ownerOccupiedCurrentCensus = value;
    }

    /**
     * Gets the value of the ownerOccupiedPreviousCensus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnerOccupiedPreviousCensus() {
        return ownerOccupiedPreviousCensus;
    }

    /**
     * Sets the value of the ownerOccupiedPreviousCensus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwnerOccupiedPreviousCensus(BigDecimal value) {
        this.ownerOccupiedPreviousCensus = value;
    }

    /**
     * Gets the value of the parkAreaPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParkAreaPercentage() {
        return parkAreaPercentage;
    }

    /**
     * Sets the value of the parkAreaPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParkAreaPercentage(BigDecimal value) {
        this.parkAreaPercentage = value;
    }

    /**
     * Gets the value of the populationCurrentCensus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPopulationCurrentCensus() {
        return populationCurrentCensus;
    }

    /**
     * Sets the value of the populationCurrentCensus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPopulationCurrentCensus(Long value) {
        this.populationCurrentCensus = value;
    }

    /**
     * Gets the value of the populationPreviousCensus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPopulationPreviousCensus() {
        return populationPreviousCensus;
    }

    /**
     * Sets the value of the populationPreviousCensus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPopulationPreviousCensus(Long value) {
        this.populationPreviousCensus = value;
    }

    /**
     * Gets the value of the predominantAgeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredominantAgeGroup() {
        return predominantAgeGroup;
    }

    /**
     * Sets the value of the predominantAgeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredominantAgeGroup(String value) {
        this.predominantAgeGroup = value;
    }

    /**
     * Gets the value of the predominantOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredominantOccupation() {
        return predominantOccupation;
    }

    /**
     * Sets the value of the predominantOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredominantOccupation(String value) {
        this.predominantOccupation = value;
    }

    /**
     * Gets the value of the prevYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrevYear() {
        return prevYear;
    }

    /**
     * Sets the value of the prevYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrevYear(Integer value) {
        this.prevYear = value;
    }

    /**
     * Gets the value of the school property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSchool() {
        return school;
    }

    /**
     * Sets the value of the school property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSchool(Integer value) {
        this.school = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSize(Integer value) {
        this.size = value;
    }

}
