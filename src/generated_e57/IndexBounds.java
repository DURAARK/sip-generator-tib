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
 *         &lt;element ref="{}row_minimum"/>
 *         &lt;element ref="{}row_maximum"/>
 *         &lt;element ref="{}col_minimum"/>
 *         &lt;element ref="{}col_maximum"/>
 *         &lt;element ref="{}return_minimum"/>
 *         &lt;element ref="{}return_maximum"/>
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
    "rowMinimum",
    "rowMaximum",
    "colMinimum",
    "colMaximum",
    "returnMinimum",
    "returnMaximum"
})
@XmlRootElement(name = "index_bounds")
public class IndexBounds {

    @XmlElement(name = "row_minimum")
    protected byte rowMinimum;
    @XmlElement(name = "row_maximum")
    protected short rowMaximum;
    @XmlElement(name = "col_minimum")
    protected byte colMinimum;
    @XmlElement(name = "col_maximum")
    protected short colMaximum;
    @XmlElement(name = "return_minimum")
    protected byte returnMinimum;
    @XmlElement(name = "return_maximum")
    protected byte returnMaximum;

    /**
     * Gets the value of the rowMinimum property.
     * 
     */
    public byte getRowMinimum() {
        return rowMinimum;
    }

    /**
     * Sets the value of the rowMinimum property.
     * 
     */
    public void setRowMinimum(byte value) {
        this.rowMinimum = value;
    }

    /**
     * Gets the value of the rowMaximum property.
     * 
     */
    public short getRowMaximum() {
        return rowMaximum;
    }

    /**
     * Sets the value of the rowMaximum property.
     * 
     */
    public void setRowMaximum(short value) {
        this.rowMaximum = value;
    }

    /**
     * Gets the value of the colMinimum property.
     * 
     */
    public byte getColMinimum() {
        return colMinimum;
    }

    /**
     * Sets the value of the colMinimum property.
     * 
     */
    public void setColMinimum(byte value) {
        this.colMinimum = value;
    }

    /**
     * Gets the value of the colMaximum property.
     * 
     */
    public short getColMaximum() {
        return colMaximum;
    }

    /**
     * Sets the value of the colMaximum property.
     * 
     */
    public void setColMaximum(short value) {
        this.colMaximum = value;
    }

    /**
     * Gets the value of the returnMinimum property.
     * 
     */
    public byte getReturnMinimum() {
        return returnMinimum;
    }

    /**
     * Sets the value of the returnMinimum property.
     * 
     */
    public void setReturnMinimum(byte value) {
        this.returnMinimum = value;
    }

    /**
     * Gets the value of the returnMaximum property.
     * 
     */
    public byte getReturnMaximum() {
        return returnMaximum;
    }

    /**
     * Sets the value of the returnMaximum property.
     * 
     */
    public void setReturnMaximum(byte value) {
        this.returnMaximum = value;
    }

}
