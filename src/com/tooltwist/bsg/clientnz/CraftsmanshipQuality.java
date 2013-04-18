
package com.tooltwist.bsg.clientnz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for craftsmanshipQuality.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="craftsmanshipQuality">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Much Better"/>
 *     &lt;enumeration value="Better"/>
 *     &lt;enumeration value="Slightly Better"/>
 *     &lt;enumeration value="Average"/>
 *     &lt;enumeration value="Slightly Worse"/>
 *     &lt;enumeration value="Worse"/>
 *     &lt;enumeration value="Much Worse"/>
 *     &lt;enumeration value="No Response"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "craftsmanshipQuality")
@XmlEnum
public enum CraftsmanshipQuality {

    @XmlEnumValue("Much Better")
    MUCH_BETTER("Much Better"),
    @XmlEnumValue("Better")
    BETTER("Better"),
    @XmlEnumValue("Slightly Better")
    SLIGHTLY_BETTER("Slightly Better"),
    @XmlEnumValue("Average")
    AVERAGE("Average"),
    @XmlEnumValue("Slightly Worse")
    SLIGHTLY_WORSE("Slightly Worse"),
    @XmlEnumValue("Worse")
    WORSE("Worse"),
    @XmlEnumValue("Much Worse")
    MUCH_WORSE("Much Worse"),
    @XmlEnumValue("No Response")
    NO_RESPONSE("No Response");
    private final String value;

    CraftsmanshipQuality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CraftsmanshipQuality fromValue(String v) {
        for (CraftsmanshipQuality c: CraftsmanshipQuality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
