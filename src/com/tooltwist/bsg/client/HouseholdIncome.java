
package com.tooltwist.bsg.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for householdIncome complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="householdIncome">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incomeRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGAPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="localityPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "householdIncome", propOrder = {
    "incomeRange",
    "lgaPercentage",
    "localityPercentage"
})
public class HouseholdIncome {

    protected String incomeRange;
    @XmlElement(name = "LGAPercentage")
    protected BigDecimal lgaPercentage;
    protected BigDecimal localityPercentage;

    /**
     * Gets the value of the incomeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeRange() {
        return incomeRange;
    }

    /**
     * Sets the value of the incomeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeRange(String value) {
        this.incomeRange = value;
    }

    /**
     * Gets the value of the lgaPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLGAPercentage() {
        return lgaPercentage;
    }

    /**
     * Sets the value of the lgaPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLGAPercentage(BigDecimal value) {
        this.lgaPercentage = value;
    }

    /**
     * Gets the value of the localityPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLocalityPercentage() {
        return localityPercentage;
    }

    /**
     * Sets the value of the localityPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLocalityPercentage(BigDecimal value) {
        this.localityPercentage = value;
    }

}
