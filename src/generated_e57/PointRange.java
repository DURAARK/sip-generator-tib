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
 *         &lt;element ref="{}point_range_minimum"/>
 *         &lt;element ref="{}point_range_maximum"/>
 *         &lt;element ref="{}point_range_scaled_integer"/>
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
    "pointRangeMinimum",
    "pointRangeMaximum",
    "pointRangeScaledInteger"
})
@XmlRootElement(name = "point_range")
public class PointRange {

    @XmlElement(name = "point_range_minimum", required = true)
    protected BigDecimal pointRangeMinimum;
    @XmlElement(name = "point_range_maximum", required = true)
    protected BigDecimal pointRangeMaximum;
    @XmlElement(name = "point_range_scaled_integer")
    protected double pointRangeScaledInteger;

    /**
     * Gets the value of the pointRangeMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointRangeMinimum() {
        return pointRangeMinimum;
    }

    /**
     * Sets the value of the pointRangeMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointRangeMinimum(BigDecimal value) {
        this.pointRangeMinimum = value;
    }

    /**
     * Gets the value of the pointRangeMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointRangeMaximum() {
        return pointRangeMaximum;
    }

    /**
     * Sets the value of the pointRangeMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointRangeMaximum(BigDecimal value) {
        this.pointRangeMaximum = value;
    }

    /**
     * Gets the value of the pointRangeScaledInteger property.
     * 
     */
    public double getPointRangeScaledInteger() {
        return pointRangeScaledInteger;
    }

    /**
     * Sets the value of the pointRangeScaledInteger property.
     * 
     */
    public void setPointRangeScaledInteger(double value) {
        this.pointRangeScaledInteger = value;
    }

}