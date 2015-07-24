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
 *         &lt;element ref="{}jpeg_image_size"/>
 *         &lt;element ref="{}png_image_size"/>
 *         &lt;element ref="{}image_mask_size"/>
 *         &lt;element ref="{}image_width"/>
 *         &lt;element ref="{}image_height"/>
 *         &lt;element ref="{}pixel_width"/>
 *         &lt;element ref="{}pixel_height"/>
 *         &lt;element ref="{}radius"/>
 *         &lt;element ref="{}principal_point_y"/>
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
    "jpegImageSize",
    "pngImageSize",
    "imageMaskSize",
    "imageWidth",
    "imageHeight",
    "pixelWidth",
    "pixelHeight",
    "radius",
    "principalPointY"
})
@XmlRootElement(name = "cylindrical_representation")
public class CylindricalRepresentation {

    @XmlElement(name = "jpeg_image_size")
    protected int jpegImageSize;
    @XmlElement(name = "png_image_size")
    protected int pngImageSize;
    @XmlElement(name = "image_mask_size")
    protected byte imageMaskSize;
    @XmlElement(name = "image_width")
    protected short imageWidth;
    @XmlElement(name = "image_height")
    protected short imageHeight;
    @XmlElement(name = "pixel_width", required = true)
    protected BigDecimal pixelWidth;
    @XmlElement(name = "pixel_height", required = true)
    protected BigDecimal pixelHeight;
    @XmlElement(required = true)
    protected BigDecimal radius;
    @XmlElement(name = "principal_point_y", required = true)
    protected BigDecimal principalPointY;

    /**
     * Gets the value of the jpegImageSize property.
     * 
     */
    public int getJpegImageSize() {
        return jpegImageSize;
    }

    /**
     * Sets the value of the jpegImageSize property.
     * 
     */
    public void setJpegImageSize(int value) {
        this.jpegImageSize = value;
    }

    /**
     * Gets the value of the pngImageSize property.
     * 
     */
    public int getPngImageSize() {
        return pngImageSize;
    }

    /**
     * Sets the value of the pngImageSize property.
     * 
     */
    public void setPngImageSize(int value) {
        this.pngImageSize = value;
    }

    /**
     * Gets the value of the imageMaskSize property.
     * 
     */
    public byte getImageMaskSize() {
        return imageMaskSize;
    }

    /**
     * Sets the value of the imageMaskSize property.
     * 
     */
    public void setImageMaskSize(byte value) {
        this.imageMaskSize = value;
    }

    /**
     * Gets the value of the imageWidth property.
     * 
     */
    public short getImageWidth() {
        return imageWidth;
    }

    /**
     * Sets the value of the imageWidth property.
     * 
     */
    public void setImageWidth(short value) {
        this.imageWidth = value;
    }

    /**
     * Gets the value of the imageHeight property.
     * 
     */
    public short getImageHeight() {
        return imageHeight;
    }

    /**
     * Sets the value of the imageHeight property.
     * 
     */
    public void setImageHeight(short value) {
        this.imageHeight = value;
    }

    /**
     * Gets the value of the pixelWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPixelWidth() {
        return pixelWidth;
    }

    /**
     * Sets the value of the pixelWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPixelWidth(BigDecimal value) {
        this.pixelWidth = value;
    }

    /**
     * Gets the value of the pixelHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPixelHeight() {
        return pixelHeight;
    }

    /**
     * Sets the value of the pixelHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPixelHeight(BigDecimal value) {
        this.pixelHeight = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRadius(BigDecimal value) {
        this.radius = value;
    }

    /**
     * Gets the value of the principalPointY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipalPointY() {
        return principalPointY;
    }

    /**
     * Sets the value of the principalPointY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipalPointY(BigDecimal value) {
        this.principalPointY = value;
    }

}
