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
 *         &lt;element ref="{}cartesian_fields"/>
 *         &lt;element ref="{}spherical_fields"/>
 *         &lt;element ref="{}point_range"/>
 *         &lt;element ref="{}angles"/>
 *         &lt;element ref="{}index_fields"/>
 *         &lt;element ref="{}time_fields"/>
 *         &lt;element ref="{}intensity_color_fields"/>
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
    "cartesianFields",
    "sphericalFields",
    "pointRange",
    "angles",
    "indexFields",
    "timeFields",
    "intensityColorFields"
})
@XmlRootElement(name = "point_fields")
public class PointFields {

    @XmlElement(name = "cartesian_fields", required = true)
    protected CartesianFields cartesianFields;
    @XmlElement(name = "spherical_fields", required = true)
    protected SphericalFields sphericalFields;
    @XmlElement(name = "point_range", required = true)
    protected PointRange pointRange;
    @XmlElement(required = true)
    protected Angles angles;
    @XmlElement(name = "index_fields", required = true)
    protected IndexFields indexFields;
    @XmlElement(name = "time_fields", required = true)
    protected TimeFields timeFields;
    @XmlElement(name = "intensity_color_fields", required = true)
    protected IntensityColorFields intensityColorFields;

    /**
     * Gets the value of the cartesianFields property.
     * 
     * @return
     *     possible object is
     *     {@link CartesianFields }
     *     
     */
    public CartesianFields getCartesianFields() {
        return cartesianFields;
    }

    /**
     * Sets the value of the cartesianFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CartesianFields }
     *     
     */
    public void setCartesianFields(CartesianFields value) {
        this.cartesianFields = value;
    }

    /**
     * Gets the value of the sphericalFields property.
     * 
     * @return
     *     possible object is
     *     {@link SphericalFields }
     *     
     */
    public SphericalFields getSphericalFields() {
        return sphericalFields;
    }

    /**
     * Sets the value of the sphericalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link SphericalFields }
     *     
     */
    public void setSphericalFields(SphericalFields value) {
        this.sphericalFields = value;
    }

    /**
     * Gets the value of the pointRange property.
     * 
     * @return
     *     possible object is
     *     {@link PointRange }
     *     
     */
    public PointRange getPointRange() {
        return pointRange;
    }

    /**
     * Sets the value of the pointRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRange }
     *     
     */
    public void setPointRange(PointRange value) {
        this.pointRange = value;
    }

    /**
     * Gets the value of the angles property.
     * 
     * @return
     *     possible object is
     *     {@link Angles }
     *     
     */
    public Angles getAngles() {
        return angles;
    }

    /**
     * Sets the value of the angles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Angles }
     *     
     */
    public void setAngles(Angles value) {
        this.angles = value;
    }

    /**
     * Gets the value of the indexFields property.
     * 
     * @return
     *     possible object is
     *     {@link IndexFields }
     *     
     */
    public IndexFields getIndexFields() {
        return indexFields;
    }

    /**
     * Sets the value of the indexFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexFields }
     *     
     */
    public void setIndexFields(IndexFields value) {
        this.indexFields = value;
    }

    /**
     * Gets the value of the timeFields property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFields }
     *     
     */
    public TimeFields getTimeFields() {
        return timeFields;
    }

    /**
     * Sets the value of the timeFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFields }
     *     
     */
    public void setTimeFields(TimeFields value) {
        this.timeFields = value;
    }

    /**
     * Gets the value of the intensityColorFields property.
     * 
     * @return
     *     possible object is
     *     {@link IntensityColorFields }
     *     
     */
    public IntensityColorFields getIntensityColorFields() {
        return intensityColorFields;
    }

    /**
     * Sets the value of the intensityColorFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntensityColorFields }
     *     
     */
    public void setIntensityColorFields(IntensityColorFields value) {
        this.intensityColorFields = value;
    }

}
