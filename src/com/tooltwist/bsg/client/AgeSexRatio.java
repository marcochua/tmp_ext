
package com.tooltwist.bsg.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ageSexRatio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ageSexRatio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ageGroupEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ageGroupLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ageGroupStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGAFemalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LGAMalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="localityFemalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="localityMalePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ageSexRatio", propOrder = {
    "ageGroupEnd",
    "ageGroupLabel",
    "ageGroupStart",
    "lgaFemalePercentage",
    "lgaMalePercentage",
    "localityFemalePercentage",
    "localityMalePercentage"
})
public class AgeSexRatio {

    protected String ageGroupEnd;
    protected String ageGroupLabel;
    protected String ageGroupStart;
    @XmlElement(name = "LGAFemalePercentage")
    protected BigDecimal lgaFemalePercentage;
    @XmlElement(name = "LGAMalePercentage")
    protected BigDecimal lgaMalePercentage;
    protected BigDecimal localityFemalePercentage;
    protected BigDecimal localityMalePercentage;

    /**
     * Gets the value of the ageGroupEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeGroupEnd() {
        return ageGroupEnd;
    }

    /**
     * Sets the value of the ageGroupEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeGroupEnd(String value) {
        this.ageGroupEnd = value;
    }

    /**
     * Gets the value of the ageGroupLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeGroupLabel() {
        return ageGroupLabel;
    }

    /**
     * Sets the value of the ageGroupLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeGroupLabel(String value) {
        this.ageGroupLabel = value;
    }

    /**
     * Gets the value of the ageGroupStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeGroupStart() {
        return ageGroupStart;
    }

    /**
     * Sets the value of the ageGroupStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeGroupStart(String value) {
        this.ageGroupStart = value;
    }

    /**
     * Gets the value of the lgaFemalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLGAFemalePercentage() {
        return lgaFemalePercentage;
    }

    /**
     * Sets the value of the lgaFemalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLGAFemalePercentage(BigDecimal value) {
        this.lgaFemalePercentage = value;
    }

    /**
     * Gets the value of the lgaMalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLGAMalePercentage() {
        return lgaMalePercentage;
    }

    /**
     * Sets the value of the lgaMalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLGAMalePercentage(BigDecimal value) {
        this.lgaMalePercentage = value;
    }

    /**
     * Gets the value of the localityFemalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLocalityFemalePercentage() {
        return localityFemalePercentage;
    }

    /**
     * Sets the value of the localityFemalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLocalityFemalePercentage(BigDecimal value) {
        this.localityFemalePercentage = value;
    }

    /**
     * Gets the value of the localityMalePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLocalityMalePercentage() {
        return localityMalePercentage;
    }

    /**
     * Sets the value of the localityMalePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLocalityMalePercentage(BigDecimal value) {
        this.localityMalePercentage = value;
    }

}
