//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.09 at 01:01:42 PM CEST 
//


package generated_buildm;

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
 *         &lt;element ref="{}physicalAsset"/>
 *         &lt;element ref="{}digitalObject"/>
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
    "physicalAsset",
    "digitalObject"
})
@XmlRootElement(name = "buildm")
public class Buildm {

    @XmlElement(required = true)
    protected PhysicalAsset physicalAsset;
    @XmlElement(required = true)
    protected DigitalObject digitalObject;

    /**
     * Gets the value of the physicalAsset property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAsset }
     *     
     */
    public PhysicalAsset getPhysicalAsset() {
        return physicalAsset;
    }

    /**
     * Sets the value of the physicalAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAsset }
     *     
     */
    public void setPhysicalAsset(PhysicalAsset value) {
        this.physicalAsset = value;
    }

    /**
     * Gets the value of the digitalObject property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalObject }
     *     
     */
    public DigitalObject getDigitalObject() {
        return digitalObject;
    }

    /**
     * Sets the value of the digitalObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalObject }
     *     
     */
    public void setDigitalObject(DigitalObject value) {
        this.digitalObject = value;
    }

}
