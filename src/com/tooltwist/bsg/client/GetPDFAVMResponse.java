
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="pdf" type="{http://rpdata.com/bsg/schemas}base64Document" minOccurs="0"/>
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
    "pdf"
})
@XmlRootElement(name = "getPDFAVMResponse")
public class GetPDFAVMResponse
    extends BaseBSGResponse
{

    protected Base64Document pdf;

    /**
     * Gets the value of the pdf property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Document }
     *     
     */
    public Base64Document getPdf() {
        return pdf;
    }

    /**
     * Sets the value of the pdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Document }
     *     
     */
    public void setPdf(Base64Document value) {
        this.pdf = value;
    }

}
