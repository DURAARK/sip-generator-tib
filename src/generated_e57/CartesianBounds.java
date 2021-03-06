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
 *         &lt;element ref="{}x_minimum"/>
 *         &lt;element ref="{}x_maximum"/>
 *         &lt;element ref="{}y_minimum"/>
 *         &lt;element ref="{}y_maximum"/>
 *         &lt;element ref="{}z_minimum"/>
 *         &lt;element ref="{}z_maximum"/>
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
    "xMinimum",
    "xMaximum",
    "yMinimum",
    "yMaximum",
    "zMinimum",
    "zMaximum"
})
@XmlRootElement(name = "cartesian_bounds")
public class CartesianBounds {

    @XmlElement(name = "x_minimum", required = true)
    protected BigDecimal xMinimum;
    @XmlElement(name = "x_maximum", required = true)
    protected BigDecimal xMaximum;
    @XmlElement(name = "y_minimum", required = true)
    protected BigDecimal yMinimum;
    @XmlElement(name = "y_maximum", required = true)
    protected BigDecimal yMaximum;
    @XmlElement(name = "z_minimum", required = true)
    protected BigDecimal zMinimum;
    @XmlElement(name = "z_maximum", required = true)
    protected BigDecimal zMaximum;

    /**
     * Gets the value of the xMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXMinimum() {
        return xMinimum;
    }

    /**
     * Sets the value of the xMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXMinimum(BigDecimal value) {
        this.xMinimum = value;
    }

    /**
     * Gets the value of the xMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXMaximum() {
        return xMaximum;
    }

    /**
     * Sets the value of the xMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXMaximum(BigDecimal value) {
        this.xMaximum = value;
    }

    /**
     * Gets the value of the yMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYMinimum() {
        return yMinimum;
    }

    /**
     * Sets the value of the yMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYMinimum(BigDecimal value) {
        this.yMinimum = value;
    }

    /**
     * Gets the value of the yMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYMaximum() {
        return yMaximum;
    }

    /**
     * Sets the value of the yMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYMaximum(BigDecimal value) {
        this.yMaximum = value;
    }

    /**
     * Gets the value of the zMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZMinimum() {
        return zMinimum;
    }

    /**
     * Sets the value of the zMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZMinimum(BigDecimal value) {
        this.zMinimum = value;
    }

    /**
     * Gets the value of the zMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZMaximum() {
        return zMaximum;
    }

    /**
     * Sets the value of the zMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZMaximum(BigDecimal value) {
        this.zMaximum = value;
    }

}
