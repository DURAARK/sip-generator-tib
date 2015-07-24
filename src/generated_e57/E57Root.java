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
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{}guid"/>
 *         &lt;element ref="{}version"/>
 *         &lt;element ref="{}creation_datetime"/>
 *         &lt;element ref="{}coordinate_metadata"/>
 *         &lt;element ref="{}scan_count"/>
 *         &lt;element ref="{}image_count"/>
 *         &lt;element ref="{}scan_size"/>
 *         &lt;element ref="{}image_size"/>
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
    "guid",
    "version",
    "creationDatetime",
    "coordinateMetadata",
    "scanCount",
    "imageCount",
    "scanSize",
    "imageSize"
})
@XmlRootElement(name = "E57root")
public class E57Root {

    @XmlElement(required = true)
    protected String guid;
    @XmlElement(required = true)
    protected BigDecimal version;
    @XmlElement(name = "creation_datetime", required = true)
    protected XMLGregorianCalendar creationDatetime;
    @XmlElement(name = "coordinate_metadata", required = true)
    protected String coordinateMetadata;
    @XmlElement(name = "scan_count")
    protected byte scanCount;
    @XmlElement(name = "image_count")
    protected byte imageCount;
    @XmlElement(name = "scan_size")
    protected byte scanSize;
    @XmlElement(name = "image_size")
    protected short imageSize;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Gets the value of the creationDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDatetime() {
        return creationDatetime;
    }

    /**
     * Sets the value of the creationDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDatetime(XMLGregorianCalendar value) {
        this.creationDatetime = value;
    }

    /**
     * Gets the value of the coordinateMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinateMetadata() {
        return coordinateMetadata;
    }

    /**
     * Sets the value of the coordinateMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinateMetadata(String value) {
        this.coordinateMetadata = value;
    }

    /**
     * Gets the value of the scanCount property.
     * 
     */
    public byte getScanCount() {
        return scanCount;
    }

    /**
     * Sets the value of the scanCount property.
     * 
     */
    public void setScanCount(byte value) {
        this.scanCount = value;
    }

    /**
     * Gets the value of the imageCount property.
     * 
     */
    public byte getImageCount() {
        return imageCount;
    }

    /**
     * Sets the value of the imageCount property.
     * 
     */
    public void setImageCount(byte value) {
        this.imageCount = value;
    }

    /**
     * Gets the value of the scanSize property.
     * 
     */
    public byte getScanSize() {
        return scanSize;
    }

    /**
     * Sets the value of the scanSize property.
     * 
     */
    public void setScanSize(byte value) {
        this.scanSize = value;
    }

    /**
     * Gets the value of the imageSize property.
     * 
     */
    public short getImageSize() {
        return imageSize;
    }

    /**
     * Sets the value of the imageSize property.
     * 
     */
    public void setImageSize(short value) {
        this.imageSize = value;
    }

}
