//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.09 at 01:01:42 PM CEST 
//


package generated_buildm;

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
 *         &lt;element ref="{}Identifier"/>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}latitude"/>
 *         &lt;element ref="{}longitude"/>
 *         &lt;element ref="{}owner"/>
 *         &lt;element ref="{}buildingArea"/>
 *         &lt;element ref="{}floorCount"/>
 *         &lt;element ref="{}numberOfRooms"/>
 *         &lt;element ref="{}function"/>
 *         &lt;element ref="{}architecturalStyle"/>
 *         &lt;element ref="{}description"/>
 *         &lt;element ref="{}location"/>
 *         &lt;element ref="{}streetAddress"/>
 *         &lt;element ref="{}postalCodeStart"/>
 *         &lt;element ref="{}postalCodeEnd"/>
 *         &lt;element ref="{}postOfficeBoxNumber"/>
 *         &lt;element ref="{}addressRegion"/>
 *         &lt;element ref="{}addressCountry"/>
 *         &lt;element ref="{}postalLocality"/>
 *         &lt;element ref="{}architect"/>
 *         &lt;element ref="{}contributor"/>
 *         &lt;element ref="{}startDate"/>
 *         &lt;element ref="{}completionDate"/>
 *         &lt;element ref="{}constructionTime"/>
 *         &lt;element ref="{}rebuildingDate"/>
 *         &lt;element ref="{}modificationDetails"/>
 *         &lt;element ref="{}cost"/>
 *         &lt;element ref="{}rightsDetails"/>
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
    "identifier",
    "name",
    "latitude",
    "longitude",
    "owner",
    "buildingArea",
    "floorCount",
    "numberOfRooms",
    "function",
    "architecturalStyle",
    "description",
    "location",
    "streetAddress",
    "postalCodeStart",
    "postalCodeEnd",
    "postOfficeBoxNumber",
    "addressRegion",
    "addressCountry",
    "postalLocality",
    "architect",
    "contributor",
    "startDate",
    "completionDate",
    "constructionTime",
    "rebuildingDate",
    "modificationDetails",
    "cost",
    "rightsDetails"
})
@XmlRootElement(name = "physicalAsset")
public class PhysicalAsset {

    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected BigDecimal latitude;
    @XmlElement(required = true)
    protected BigDecimal longitude;
    @XmlElement(required = true)
    protected String owner;
    @XmlElement(required = true)
    protected String buildingArea;
    protected byte floorCount;
    protected byte numberOfRooms;
    @XmlElement(required = true)
    protected String function;
    @XmlElement(required = true)
    protected String architecturalStyle;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String streetAddress;
    protected int postalCodeStart;
    protected int postalCodeEnd;
    protected short postOfficeBoxNumber;
    @XmlElement(required = true)
    protected String addressRegion;
    @XmlElement(required = true)
    protected String addressCountry;
    @XmlElement(required = true)
    protected String postalLocality;
    @XmlElement(required = true)
    protected String architect;
    @XmlElement(required = true)
    protected String contributor;
    protected short startDate;
    protected short completionDate;
    protected int constructionTime;
    @XmlElement(required = true)
    protected XMLGregorianCalendar rebuildingDate;
    @XmlElement(required = true)
    protected String modificationDetails;
    @XmlElement(required = true)
    protected BigDecimal cost;
    @XmlElement(required = true)
    protected String rightsDetails;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the buildingArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingArea() {
        return buildingArea;
    }

    /**
     * Sets the value of the buildingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingArea(String value) {
        this.buildingArea = value;
    }

    /**
     * Gets the value of the floorCount property.
     * 
     */
    public byte getFloorCount() {
        return floorCount;
    }

    /**
     * Sets the value of the floorCount property.
     * 
     */
    public void setFloorCount(byte value) {
        this.floorCount = value;
    }

    /**
     * Gets the value of the numberOfRooms property.
     * 
     */
    public byte getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     */
    public void setNumberOfRooms(byte value) {
        this.numberOfRooms = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the architecturalStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitecturalStyle() {
        return architecturalStyle;
    }

    /**
     * Sets the value of the architecturalStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitecturalStyle(String value) {
        this.architecturalStyle = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress(String value) {
        this.streetAddress = value;
    }

    /**
     * Gets the value of the postalCodeStart property.
     * 
     */
    public int getPostalCodeStart() {
        return postalCodeStart;
    }

    /**
     * Sets the value of the postalCodeStart property.
     * 
     */
    public void setPostalCodeStart(int value) {
        this.postalCodeStart = value;
    }

    /**
     * Gets the value of the postalCodeEnd property.
     * 
     */
    public int getPostalCodeEnd() {
        return postalCodeEnd;
    }

    /**
     * Sets the value of the postalCodeEnd property.
     * 
     */
    public void setPostalCodeEnd(int value) {
        this.postalCodeEnd = value;
    }

    /**
     * Gets the value of the postOfficeBoxNumber property.
     * 
     */
    public short getPostOfficeBoxNumber() {
        return postOfficeBoxNumber;
    }

    /**
     * Sets the value of the postOfficeBoxNumber property.
     * 
     */
    public void setPostOfficeBoxNumber(short value) {
        this.postOfficeBoxNumber = value;
    }

    /**
     * Gets the value of the addressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRegion() {
        return addressRegion;
    }

    /**
     * Sets the value of the addressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRegion(String value) {
        this.addressRegion = value;
    }

    /**
     * Gets the value of the addressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCountry() {
        return addressCountry;
    }

    /**
     * Sets the value of the addressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCountry(String value) {
        this.addressCountry = value;
    }

    /**
     * Gets the value of the postalLocality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalLocality() {
        return postalLocality;
    }

    /**
     * Sets the value of the postalLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalLocality(String value) {
        this.postalLocality = value;
    }

    /**
     * Gets the value of the architect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitect() {
        return architect;
    }

    /**
     * Sets the value of the architect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitect(String value) {
        this.architect = value;
    }

    /**
     * Gets the value of the contributor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributor() {
        return contributor;
    }

    /**
     * Sets the value of the contributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributor(String value) {
        this.contributor = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     */
    public short getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     */
    public void setStartDate(short value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the completionDate property.
     * 
     */
    public short getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of the completionDate property.
     * 
     */
    public void setCompletionDate(short value) {
        this.completionDate = value;
    }

    /**
     * Gets the value of the constructionTime property.
     * 
     */
    public int getConstructionTime() {
        return constructionTime;
    }

    /**
     * Sets the value of the constructionTime property.
     * 
     */
    public void setConstructionTime(int value) {
        this.constructionTime = value;
    }

    /**
     * Gets the value of the rebuildingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRebuildingDate() {
        return rebuildingDate;
    }

    /**
     * Sets the value of the rebuildingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRebuildingDate(XMLGregorianCalendar value) {
        this.rebuildingDate = value;
    }

    /**
     * Gets the value of the modificationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationDetails() {
        return modificationDetails;
    }

    /**
     * Sets the value of the modificationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationDetails(String value) {
        this.modificationDetails = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCost(BigDecimal value) {
        this.cost = value;
    }

    /**
     * Gets the value of the rightsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightsDetails() {
        return rightsDetails;
    }

    /**
     * Sets the value of the rightsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightsDetails(String value) {
        this.rightsDetails = value;
    }

}
