//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.07 at 05:54:44 PM CEST 
//


package generated_ifcm;

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
 *         &lt;element ref="{}header"/>
 *         &lt;element ref="{}ifcparameters"/>
 *         &lt;element ref="{}quantities"/>
 *         &lt;element ref="{}informationMetric"/>
 *         &lt;element ref="{}Dependencies"/>
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
    "header",
    "ifcparameters",
    "quantities",
    "informationMetric",
    "dependencies"
})
@XmlRootElement(name = "ifcm")
public class Ifcm {

    @XmlElement(required = true)
    protected Header header;
    @XmlElement(required = true)
    protected Ifcparameters ifcparameters;
    @XmlElement(required = true)
    protected Quantities quantities;
    @XmlElement(required = true)
    protected InformationMetric informationMetric;
    @XmlElement(name = "Dependencies", required = true)
    protected Dependencies dependencies;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the ifcparameters property.
     * 
     * @return
     *     possible object is
     *     {@link Ifcparameters }
     *     
     */
    public Ifcparameters getIfcparameters() {
        return ifcparameters;
    }

    /**
     * Sets the value of the ifcparameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ifcparameters }
     *     
     */
    public void setIfcparameters(Ifcparameters value) {
        this.ifcparameters = value;
    }

    /**
     * Gets the value of the quantities property.
     * 
     * @return
     *     possible object is
     *     {@link Quantities }
     *     
     */
    public Quantities getQuantities() {
        return quantities;
    }

    /**
     * Sets the value of the quantities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantities }
     *     
     */
    public void setQuantities(Quantities value) {
        this.quantities = value;
    }

    /**
     * Gets the value of the informationMetric property.
     * 
     * @return
     *     possible object is
     *     {@link InformationMetric }
     *     
     */
    public InformationMetric getInformationMetric() {
        return informationMetric;
    }

    /**
     * Sets the value of the informationMetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationMetric }
     *     
     */
    public void setInformationMetric(InformationMetric value) {
        this.informationMetric = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * @return
     *     possible object is
     *     {@link Dependencies }
     *     
     */
    public Dependencies getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dependencies }
     *     
     */
    public void setDependencies(Dependencies value) {
        this.dependencies = value;
    }

}