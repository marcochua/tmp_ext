
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bsgPhotoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bsgPhotoData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="largeImageDisplayURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mediumImageDisplayURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="smallImageDisplayURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bsgPhotoData", propOrder = {
    "fileLocator",
    "fileType",
    "largeImageDisplayURL",
    "mediumImageDisplayURL",
    "propertyId",
    "scanDate",
    "smallImageDisplayURL"
})
public class BsgPhotoData {

    protected String fileLocator;
    protected String fileType;
    protected String largeImageDisplayURL;
    protected String mediumImageDisplayURL;
    protected int propertyId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scanDate;
    protected String smallImageDisplayURL;

    /**
     * Gets the value of the fileLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileLocator() {
        return fileLocator;
    }

    /**
     * Sets the value of the fileLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileLocator(String value) {
        this.fileLocator = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the largeImageDisplayURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargeImageDisplayURL() {
        return largeImageDisplayURL;
    }

    /**
     * Sets the value of the largeImageDisplayURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargeImageDisplayURL(String value) {
        this.largeImageDisplayURL = value;
    }

    /**
     * Gets the value of the mediumImageDisplayURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumImageDisplayURL() {
        return mediumImageDisplayURL;
    }

    /**
     * Sets the value of the mediumImageDisplayURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumImageDisplayURL(String value) {
        this.mediumImageDisplayURL = value;
    }

    /**
     * Gets the value of the propertyId property.
     * 
     */
    public int getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     * 
     */
    public void setPropertyId(int value) {
        this.propertyId = value;
    }

    /**
     * Gets the value of the scanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScanDate() {
        return scanDate;
    }

    /**
     * Sets the value of the scanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScanDate(XMLGregorianCalendar value) {
        this.scanDate = value;
    }

    /**
     * Gets the value of the smallImageDisplayURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallImageDisplayURL() {
        return smallImageDisplayURL;
    }

    /**
     * Sets the value of the smallImageDisplayURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallImageDisplayURL(String value) {
        this.smallImageDisplayURL = value;
    }

}
