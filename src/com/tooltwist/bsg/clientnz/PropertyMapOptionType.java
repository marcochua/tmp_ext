
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyMapOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="propertyMapOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AERIAL"/>
 *     &lt;enumeration value="CADASTRAL"/>
 *     &lt;enumeration value="AUSWAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "propertyMapOptionType")
@XmlEnum
public enum PropertyMapOptionType {

    AERIAL,
    CADASTRAL,
    AUSWAY;

    public String value() {
        return name();
    }

    public static PropertyMapOptionType fromValue(String v) {
        return valueOf(v);
    }

}
