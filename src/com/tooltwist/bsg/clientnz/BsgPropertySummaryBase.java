
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bsgPropertySummaryBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgPropertySummaryBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}applicationMessages">
 *       &lt;sequence>
 *         &lt;element name="authorised" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="distanceFromTargetProp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="legacyExternalPropertyReference" type="{http://rpdata.com/bsg/schemas}bsgLegacyExternalPropertyReference" minOccurs="0"/>
 *         &lt;element name="lowDoc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryPhotoThumbnail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyAccess" type="{http://rpdata.com/bsg/schemas}bsgPropertyAccess" minOccurs="0"/>
 *         &lt;element name="propertyAddress" type="{http://rpdata.com/bsg/schemas}bsgPropertyAddress" minOccurs="0"/>
 *         &lt;element name="propertyAttributes" type="{http://rpdata.com/bsg/schemas}bsgPropertyAttributes" minOccurs="0"/>
 *         &lt;element name="propertyCoords" type="{http://rpdata.com/bsg/schemas}bsgPropertyCoords" minOccurs="0"/>
 *         &lt;element name="propertyDefaultPhoto" type="{http://rpdata.com/bsg/schemas}bsgPropertyDefaultPhoto" minOccurs="0"/>
 *         &lt;element name="propertyDescriptors" type="{http://rpdata.com/bsg/schemas}bsgPropertyDescriptors" minOccurs="0"/>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rowNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgPropertySummaryBase", propOrder = {
    "authorised",
    "distanceFromTargetProp",
    "legacyExternalPropertyReference",
    "lowDoc",
    "ownerName",
    "primaryPhotoThumbnail",
    "propertyAccess",
    "propertyAddress",
    "propertyAttributes",
    "propertyCoords",
    "propertyDefaultPhoto",
    "propertyDescriptors",
    "propertyId",
    "rowNumber"
})
@XmlSeeAlso({
    BsgMarketComparePropertySummary.class
})
public abstract class BsgPropertySummaryBase
    extends ApplicationMessages
{

    protected Boolean authorised;
    protected Double distanceFromTargetProp;
    protected BsgLegacyExternalPropertyReference legacyExternalPropertyReference;
    protected Boolean lowDoc;
    protected String ownerName;
    protected String primaryPhotoThumbnail;
    protected BsgPropertyAccess propertyAccess;
    protected BsgPropertyAddress propertyAddress;
    protected BsgPropertyAttributes propertyAttributes;
    protected BsgPropertyCoords propertyCoords;
    protected BsgPropertyDefaultPhoto propertyDefaultPhoto;
    protected BsgPropertyDescriptors propertyDescriptors;
    protected Integer propertyId;
    protected Integer rowNumber;

    /**
     * Gets the value of the authorised property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorised() {
        return authorised;
    }

    /**
     * Sets the value of the authorised property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorised(Boolean value) {
        this.authorised = value;
    }

    /**
     * Gets the value of the distanceFromTargetProp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistanceFromTargetProp() {
        return distanceFromTargetProp;
    }

    /**
     * Sets the value of the distanceFromTargetProp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistanceFromTargetProp(Double value) {
        this.distanceFromTargetProp = value;
    }

    /**
     * Gets the value of the legacyExternalPropertyReference property.
     * 
     * @return
     *     possible object is
     *     {@link BsgLegacyExternalPropertyReference }
     *     
     */
    public BsgLegacyExternalPropertyReference getLegacyExternalPropertyReference() {
        return legacyExternalPropertyReference;
    }

    /**
     * Sets the value of the legacyExternalPropertyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgLegacyExternalPropertyReference }
     *     
     */
    public void setLegacyExternalPropertyReference(BsgLegacyExternalPropertyReference value) {
        this.legacyExternalPropertyReference = value;
    }

    /**
     * Gets the value of the lowDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowDoc() {
        return lowDoc;
    }

    /**
     * Sets the value of the lowDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowDoc(Boolean value) {
        this.lowDoc = value;
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
     * Gets the value of the primaryPhotoThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPhotoThumbnail() {
        return primaryPhotoThumbnail;
    }

    /**
     * Sets the value of the primaryPhotoThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPhotoThumbnail(String value) {
        this.primaryPhotoThumbnail = value;
    }

    /**
     * Gets the value of the propertyAccess property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertyAccess }
     *     
     */
    public BsgPropertyAccess getPropertyAccess() {
        return propertyAccess;
    }

    /**
     * Sets the value of the propertyAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertyAccess }
     *     
     */
    public void setPropertyAccess(BsgPropertyAccess value) {
        this.propertyAccess = value;
    }

    /**
     * Gets the value of the propertyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertyAddress }
     *     
     */
    public BsgPropertyAddress getPropertyAddress() {
        return propertyAddress;
    }

    /**
     * Sets the value of the propertyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertyAddress }
     *     
     */
    public void setPropertyAddress(BsgPropertyAddress value) {
        this.propertyAddress = value;
    }

    /**
     * Gets the value of the propertyAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertyAttributes }
     *     
     */
    public BsgPropertyAttributes getPropertyAttributes() {
        return propertyAttributes;
    }

    /**
     * Sets the value of the propertyAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertyAttributes }
     *     
     */
    public void setPropertyAttributes(BsgPropertyAttributes value) {
        this.propertyAttributes = value;
    }

    /**
     * Gets the value of the propertyCoords property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertyCoords }
     *     
     */
    public BsgPropertyCoords getPropertyCoords() {
        return propertyCoords;
    }

    /**
     * Sets the value of the propertyCoords property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertyCoords }
     *     
     */
    public void setPropertyCoords(BsgPropertyCoords value) {
        this.propertyCoords = value;
    }

    /**
     * Gets the value of the propertyDefaultPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertyDefaultPhoto }
     *     
     */
    public BsgPropertyDefaultPhoto getPropertyDefaultPhoto() {
        return propertyDefaultPhoto;
    }

    /**
     * Sets the value of the propertyDefaultPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertyDefaultPhoto }
     *     
     */
    public void setPropertyDefaultPhoto(BsgPropertyDefaultPhoto value) {
        this.propertyDefaultPhoto = value;
    }

    /**
     * Gets the value of the propertyDescriptors property.
     * 
     * @return
     *     possible object is
     *     {@link BsgPropertyDescriptors }
     *     
     */
    public BsgPropertyDescriptors getPropertyDescriptors() {
        return propertyDescriptors;
    }

    /**
     * Sets the value of the propertyDescriptors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BsgPropertyDescriptors }
     *     
     */
    public void setPropertyDescriptors(BsgPropertyDescriptors value) {
        this.propertyDescriptors = value;
    }

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
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowNumber(Integer value) {
        this.rowNumber = value;
    }

}
