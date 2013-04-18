
package com.tooltwist.bsg.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genericSearchCriteriaInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genericSearchCriteriaInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseBSGRequest">
 *       &lt;sequence>
 *         &lt;element name="bathrooms" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bedrooms" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="carSpaces" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="landSizeMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="landSizeMin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="propertyTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="floorSizeMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="floorSizeMin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="capitalValueFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="capitalValueTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="buildingAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericSearchCriteriaInput", propOrder = {
    "bathrooms",
    "bedrooms",
    "carSpaces",
    "landSizeMax",
    "landSizeMin",
    "propertyTypes",
    "floorSizeMax",
    "floorSizeMin",
    "capitalValueFrom",
    "capitalValueTo",
    "buildingAge"
})
@XmlSeeAlso({
    RefineMarketComparePropertiesRequest.class
})
public class GenericSearchCriteriaInput
    extends BaseBSGRequest
{

    @XmlElement(nillable = true)
    protected List<Integer> bathrooms;
    @XmlElement(nillable = true)
    protected List<Integer> bedrooms;
    @XmlElement(nillable = true)
    protected List<Integer> carSpaces;
    protected Long landSizeMax;
    protected Long landSizeMin;
    @XmlElement(nillable = true)
    protected List<String> propertyTypes;
    protected Long floorSizeMax;
    protected Long floorSizeMin;
    protected Integer capitalValueFrom;
    protected Integer capitalValueTo;
    protected String buildingAge;

    /**
     * Gets the value of the bathrooms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bathrooms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBathrooms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBathrooms() {
        if (bathrooms == null) {
            bathrooms = new ArrayList<Integer>();
        }
        return this.bathrooms;
    }

    /**
     * Gets the value of the bedrooms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bedrooms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBedrooms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBedrooms() {
        if (bedrooms == null) {
            bedrooms = new ArrayList<Integer>();
        }
        return this.bedrooms;
    }

    /**
     * Gets the value of the carSpaces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carSpaces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarSpaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCarSpaces() {
        if (carSpaces == null) {
            carSpaces = new ArrayList<Integer>();
        }
        return this.carSpaces;
    }

    /**
     * Gets the value of the landSizeMax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLandSizeMax() {
        return landSizeMax;
    }

    /**
     * Sets the value of the landSizeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLandSizeMax(Long value) {
        this.landSizeMax = value;
    }

    /**
     * Gets the value of the landSizeMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLandSizeMin() {
        return landSizeMin;
    }

    /**
     * Sets the value of the landSizeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLandSizeMin(Long value) {
        this.landSizeMin = value;
    }

    /**
     * Gets the value of the propertyTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPropertyTypes() {
        if (propertyTypes == null) {
            propertyTypes = new ArrayList<String>();
        }
        return this.propertyTypes;
    }

    /**
     * Gets the value of the floorSizeMax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFloorSizeMax() {
        return floorSizeMax;
    }

    /**
     * Sets the value of the floorSizeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFloorSizeMax(Long value) {
        this.floorSizeMax = value;
    }

    /**
     * Gets the value of the floorSizeMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFloorSizeMin() {
        return floorSizeMin;
    }

    /**
     * Sets the value of the floorSizeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFloorSizeMin(Long value) {
        this.floorSizeMin = value;
    }

    /**
     * Gets the value of the capitalValueFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapitalValueFrom() {
        return capitalValueFrom;
    }

    /**
     * Sets the value of the capitalValueFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapitalValueFrom(Integer value) {
        this.capitalValueFrom = value;
    }

    /**
     * Gets the value of the capitalValueTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapitalValueTo() {
        return capitalValueTo;
    }

    /**
     * Sets the value of the capitalValueTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapitalValueTo(Integer value) {
        this.capitalValueTo = value;
    }

    /**
     * Gets the value of the buildingAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingAge() {
        return buildingAge;
    }

    /**
     * Sets the value of the buildingAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingAge(String value) {
        this.buildingAge = value;
    }

}
