//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.07 at 05:42:14 PM CEST 
//


package generated_e57;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}intensity_field"/>
 *         &lt;element ref="{}is_intensity_invalid_field"/>
 *         &lt;element ref="{}intensity_scaled_integer"/>
 *         &lt;element ref="{}color_red_field"/>
 *         &lt;element ref="{}color_green_field"/>
 *         &lt;element ref="{}color_blue_field"/>
 *         &lt;element ref="{}is_color_invalid_field"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intensityField",
    "isIntensityInvalidField",
    "intensityScaledInteger",
    "colorRedField",
    "colorGreenField",
    "colorBlueField",
    "isColorInvalidField"
})
@XmlRootElement(name = "intensity_color_fields")
public class IntensityColorFields {

    @XmlElement(name = "intensity_field")
    protected boolean intensityField;
    @XmlElement(name = "is_intensity_invalid_field")
    protected boolean isIntensityInvalidField;
    @XmlElement(name = "intensity_scaled_integer", required = true)
    protected BigDecimal intensityScaledInteger;
    @XmlElement(name = "color_red_field")
    protected boolean colorRedField;
    @XmlElement(name = "color_green_field")
    protected boolean colorGreenField;
    @XmlElement(name = "color_blue_field")
    protected boolean colorBlueField;
    @XmlElement(name = "is_color_invalid_field")
    protected boolean isColorInvalidField;

    /**
     * Gets the value of the intensityField property.
     * 
     */
    public boolean isIntensityField() {
        return intensityField;
    }

    /**
     * Sets the value of the intensityField property.
     * 
     */
    public void setIntensityField(boolean value) {
        this.intensityField = value;
    }

    /**
     * Gets the value of the isIntensityInvalidField property.
     * 
     */
    public boolean isIsIntensityInvalidField() {
        return isIntensityInvalidField;
    }

    /**
     * Sets the value of the isIntensityInvalidField property.
     * 
     */
    public void setIsIntensityInvalidField(boolean value) {
        this.isIntensityInvalidField = value;
    }

    /**
     * Gets the value of the intensityScaledInteger property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntensityScaledInteger() {
        return intensityScaledInteger;
    }

    /**
     * Sets the value of the intensityScaledInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntensityScaledInteger(BigDecimal value) {
        this.intensityScaledInteger = value;
    }

    /**
     * Gets the value of the colorRedField property.
     * 
     */
    public boolean isColorRedField() {
        return colorRedField;
    }

    /**
     * Sets the value of the colorRedField property.
     * 
     */
    public void setColorRedField(boolean value) {
        this.colorRedField = value;
    }

    /**
     * Gets the value of the colorGreenField property.
     * 
     */
    public boolean isColorGreenField() {
        return colorGreenField;
    }

    /**
     * Sets the value of the colorGreenField property.
     * 
     */
    public void setColorGreenField(boolean value) {
        this.colorGreenField = value;
    }

    /**
     * Gets the value of the colorBlueField property.
     * 
     */
    public boolean isColorBlueField() {
        return colorBlueField;
    }

    /**
     * Sets the value of the colorBlueField property.
     * 
     */
    public void setColorBlueField(boolean value) {
        this.colorBlueField = value;
    }

    /**
     * Gets the value of the isColorInvalidField property.
     * 
     */
    public boolean isIsColorInvalidField() {
        return isColorInvalidField;
    }

    /**
     * Sets the value of the isColorInvalidField property.
     * 
     */
    public void setIsColorInvalidField(boolean value) {
        this.isColorInvalidField = value;
    }

}
