//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.07 at 05:42:14 PM CEST 
//


package generated_e57;

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
 *         &lt;element ref="{}color_red_minimum"/>
 *         &lt;element ref="{}color_red_maximum"/>
 *         &lt;element ref="{}color_green_minimum"/>
 *         &lt;element ref="{}color_green_maximum"/>
 *         &lt;element ref="{}color_blue_minimum"/>
 *         &lt;element ref="{}color_blue_maximum"/>
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
    "colorRedMinimum",
    "colorRedMaximum",
    "colorGreenMinimum",
    "colorGreenMaximum",
    "colorBlueMinimum",
    "colorBlueMaximum"
})
@XmlRootElement(name = "color_limits")
public class ColorLimits {

    @XmlElement(name = "color_red_minimum")
    protected byte colorRedMinimum;
    @XmlElement(name = "color_red_maximum")
    protected short colorRedMaximum;
    @XmlElement(name = "color_green_minimum")
    protected byte colorGreenMinimum;
    @XmlElement(name = "color_green_maximum")
    protected short colorGreenMaximum;
    @XmlElement(name = "color_blue_minimum")
    protected byte colorBlueMinimum;
    @XmlElement(name = "color_blue_maximum")
    protected short colorBlueMaximum;

    /**
     * Gets the value of the colorRedMinimum property.
     * 
     */
    public byte getColorRedMinimum() {
        return colorRedMinimum;
    }

    /**
     * Sets the value of the colorRedMinimum property.
     * 
     */
    public void setColorRedMinimum(byte value) {
        this.colorRedMinimum = value;
    }

    /**
     * Gets the value of the colorRedMaximum property.
     * 
     */
    public short getColorRedMaximum() {
        return colorRedMaximum;
    }

    /**
     * Sets the value of the colorRedMaximum property.
     * 
     */
    public void setColorRedMaximum(short value) {
        this.colorRedMaximum = value;
    }

    /**
     * Gets the value of the colorGreenMinimum property.
     * 
     */
    public byte getColorGreenMinimum() {
        return colorGreenMinimum;
    }

    /**
     * Sets the value of the colorGreenMinimum property.
     * 
     */
    public void setColorGreenMinimum(byte value) {
        this.colorGreenMinimum = value;
    }

    /**
     * Gets the value of the colorGreenMaximum property.
     * 
     */
    public short getColorGreenMaximum() {
        return colorGreenMaximum;
    }

    /**
     * Sets the value of the colorGreenMaximum property.
     * 
     */
    public void setColorGreenMaximum(short value) {
        this.colorGreenMaximum = value;
    }

    /**
     * Gets the value of the colorBlueMinimum property.
     * 
     */
    public byte getColorBlueMinimum() {
        return colorBlueMinimum;
    }

    /**
     * Sets the value of the colorBlueMinimum property.
     * 
     */
    public void setColorBlueMinimum(byte value) {
        this.colorBlueMinimum = value;
    }

    /**
     * Gets the value of the colorBlueMaximum property.
     * 
     */
    public short getColorBlueMaximum() {
        return colorBlueMaximum;
    }

    /**
     * Sets the value of the colorBlueMaximum property.
     * 
     */
    public void setColorBlueMaximum(short value) {
        this.colorBlueMaximum = value;
    }

}