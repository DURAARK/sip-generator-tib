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
 *         &lt;element ref="{}range_minimum"/>
 *         &lt;element ref="{}range_maximum"/>
 *         &lt;element ref="{}elevation_minimum"/>
 *         &lt;element ref="{}elevation_maximum"/>
 *         &lt;element ref="{}azimuth_minimum"/>
 *         &lt;element ref="{}azimuth_maximum"/>
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
    "rangeMinimum",
    "rangeMaximum",
    "elevationMinimum",
    "elevationMaximum",
    "azimuthMinimum",
    "azimuthMaximum"
})
@XmlRootElement(name = "sphericalbounds")
public class Sphericalbounds {

    @XmlElement(name = "range_minimum", required = true)
    protected BigDecimal rangeMinimum;
    @XmlElement(name = "range_maximum", required = true)
    protected BigDecimal rangeMaximum;
    @XmlElement(name = "elevation_minimum", required = true)
    protected BigDecimal elevationMinimum;
    @XmlElement(name = "elevation_maximum", required = true)
    protected BigDecimal elevationMaximum;
    @XmlElement(name = "azimuth_minimum")
    protected byte azimuthMinimum;
    @XmlElement(name = "azimuth_maximum")
    protected double azimuthMaximum;

    /**
     * Gets the value of the rangeMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRangeMinimum() {
        return rangeMinimum;
    }

    /**
     * Sets the value of the rangeMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRangeMinimum(BigDecimal value) {
        this.rangeMinimum = value;
    }

    /**
     * Gets the value of the rangeMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRangeMaximum() {
        return rangeMaximum;
    }

    /**
     * Sets the value of the rangeMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRangeMaximum(BigDecimal value) {
        this.rangeMaximum = value;
    }

    /**
     * Gets the value of the elevationMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElevationMinimum() {
        return elevationMinimum;
    }

    /**
     * Sets the value of the elevationMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElevationMinimum(BigDecimal value) {
        this.elevationMinimum = value;
    }

    /**
     * Gets the value of the elevationMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElevationMaximum() {
        return elevationMaximum;
    }

    /**
     * Sets the value of the elevationMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElevationMaximum(BigDecimal value) {
        this.elevationMaximum = value;
    }

    /**
     * Gets the value of the azimuthMinimum property.
     * 
     */
    public byte getAzimuthMinimum() {
        return azimuthMinimum;
    }

    /**
     * Sets the value of the azimuthMinimum property.
     * 
     */
    public void setAzimuthMinimum(byte value) {
        this.azimuthMinimum = value;
    }

    /**
     * Gets the value of the azimuthMaximum property.
     * 
     */
    public double getAzimuthMaximum() {
        return azimuthMaximum;
    }

    /**
     * Sets the value of the azimuthMaximum property.
     * 
     */
    public void setAzimuthMaximum(double value) {
        this.azimuthMaximum = value;
    }

}