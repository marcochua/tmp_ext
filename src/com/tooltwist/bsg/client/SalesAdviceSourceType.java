
package com.tooltwist.bsg.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salesAdviceSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="salesAdviceSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="VG"/>
 *     &lt;enumeration value="AA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "salesAdviceSourceType")
@XmlEnum
public enum SalesAdviceSourceType {

    ALL,
    VG,
    AA;

    public String value() {
        return name();
    }

    public static SalesAdviceSourceType fromValue(String v) {
        return valueOf(v);
    }

}
