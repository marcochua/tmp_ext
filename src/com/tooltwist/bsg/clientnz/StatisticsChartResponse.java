
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statisticsChartResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statisticsChartResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpdata.com/bsg/schemas}baseBSGResponse">
 *       &lt;sequence>
 *         &lt;element name="chartURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statisticsChartResponse", propOrder = {
    "chartURL"
})
public class StatisticsChartResponse
    extends BaseBSGResponse
{

    protected String chartURL;

    /**
     * Gets the value of the chartURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChartURL() {
        return chartURL;
    }

    /**
     * Sets the value of the chartURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChartURL(String value) {
        this.chartURL = value;
    }

}
