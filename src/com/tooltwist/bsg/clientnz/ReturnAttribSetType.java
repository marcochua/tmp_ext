
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnAttribSetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="returnAttribSetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHORT"/>
 *     &lt;enumeration value="LONG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "returnAttribSetType")
@XmlEnum
public enum ReturnAttribSetType {

    SHORT,
    LONG;

    public String value() {
        return name();
    }

    public static ReturnAttribSetType fromValue(String v) {
        return valueOf(v);
    }

}
