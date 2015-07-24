//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.09 at 01:01:42 PM CEST 
//


package generated_buildm;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated_buildm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FloorCount_QNAME = new QName("", "floorCount");
    private final static QName _StreetAddress_QNAME = new QName("", "streetAddress");
    private final static QName _StartDate_QNAME = new QName("", "startDate");
    private final static QName _Location_QNAME = new QName("", "location");
    private final static QName _ArchitecturalStyle_QNAME = new QName("", "architecturalStyle");
    private final static QName _BuildingArea_QNAME = new QName("", "buildingArea");
    private final static QName _Creator_QNAME = new QName("", "creator");
    private final static QName _Function_QNAME = new QName("", "function");
    private final static QName _LevelOfDetail_QNAME = new QName("", "levelOfDetail");
    private final static QName _ModificationDetails_QNAME = new QName("", "modificationDetails");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _HasFormatDetails_QNAME = new QName("", "hasFormatDetails");
    private final static QName _Event_QNAME = new QName("", "event");
    private final static QName _Contributor_QNAME = new QName("", "contributor");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _PostalLocality_QNAME = new QName("", "postalLocality");
    private final static QName _Longitude_QNAME = new QName("", "longitude");
    private final static QName _License_QNAME = new QName("", "license");
    private final static QName _AddressCountry_QNAME = new QName("", "addressCountry");
    private final static QName _Identifier_QNAME = new QName("", "Identifier");
    private final static QName _RightsDetails_QNAME = new QName("", "rightsDetails");
    private final static QName _UnitCode_QNAME = new QName("", "unitCode");
    private final static QName _CompletionDate_QNAME = new QName("", "completionDate");
    private final static QName _HasPart_QNAME = new QName("", "hasPart");
    private final static QName _NumberOfRooms_QNAME = new QName("", "numberOfRooms");
    private final static QName _Format_QNAME = new QName("", "format");
    private final static QName _RebuildingDate_QNAME = new QName("", "rebuildingDate");
    private final static QName _Cost_QNAME = new QName("", "cost");
    private final static QName _HasType_QNAME = new QName("", "hasType");
    private final static QName _PostalCodeStart_QNAME = new QName("", "postalCodeStart");
    private final static QName _Architect_QNAME = new QName("", "architect");
    private final static QName _Provenance_QNAME = new QName("", "provenance");
    private final static QName _PostalCodeEnd_QNAME = new QName("", "postalCodeEnd");
    private final static QName _Filesize_QNAME = new QName("", "filesize");
    private final static QName _AddressRegion_QNAME = new QName("", "addressRegion");
    private final static QName _Owner_QNAME = new QName("", "owner");
    private final static QName _DateCreated_QNAME = new QName("", "dateCreated");
    private final static QName _ConstructionTime_QNAME = new QName("", "constructionTime");
    private final static QName _IsPartOf_QNAME = new QName("", "isPartOf");
    private final static QName _Latitude_QNAME = new QName("", "latitude");
    private final static QName _PostOfficeBoxNumber_QNAME = new QName("", "postOfficeBoxNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated_buildm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Buildm }
     * 
     */
    public Buildm createBuildm() {
        return new Buildm();
    }

    /**
     * Create an instance of {@link PhysicalAsset }
     * 
     */
    public PhysicalAsset createPhysicalAsset() {
        return new PhysicalAsset();
    }

    /**
     * Create an instance of {@link DigitalObject }
     * 
     */
    public DigitalObject createDigitalObject() {
        return new DigitalObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "floorCount")
    public JAXBElement<Byte> createFloorCount(Byte value) {
        return new JAXBElement<Byte>(_FloorCount_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "streetAddress")
    public JAXBElement<String> createStreetAddress(String value) {
        return new JAXBElement<String>(_StreetAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startDate")
    public JAXBElement<Short> createStartDate(Short value) {
        return new JAXBElement<Short>(_StartDate_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "location")
    public JAXBElement<String> createLocation(String value) {
        return new JAXBElement<String>(_Location_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "architecturalStyle")
    public JAXBElement<String> createArchitecturalStyle(String value) {
        return new JAXBElement<String>(_ArchitecturalStyle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "buildingArea")
    public JAXBElement<String> createBuildingArea(String value) {
        return new JAXBElement<String>(_BuildingArea_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "creator")
    public JAXBElement<String> createCreator(String value) {
        return new JAXBElement<String>(_Creator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "function")
    public JAXBElement<String> createFunction(String value) {
        return new JAXBElement<String>(_Function_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "levelOfDetail")
    public JAXBElement<String> createLevelOfDetail(String value) {
        return new JAXBElement<String>(_LevelOfDetail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modificationDetails")
    public JAXBElement<String> createModificationDetails(String value) {
        return new JAXBElement<String>(_ModificationDetails_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hasFormatDetails")
    public JAXBElement<String> createHasFormatDetails(String value) {
        return new JAXBElement<String>(_HasFormatDetails_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "event")
    public JAXBElement<String> createEvent(String value) {
        return new JAXBElement<String>(_Event_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contributor")
    public JAXBElement<String> createContributor(String value) {
        return new JAXBElement<String>(_Contributor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postalLocality")
    public JAXBElement<String> createPostalLocality(String value) {
        return new JAXBElement<String>(_PostalLocality_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "longitude")
    public JAXBElement<BigDecimal> createLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Longitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "license")
    public JAXBElement<String> createLicense(String value) {
        return new JAXBElement<String>(_License_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "addressCountry")
    public JAXBElement<String> createAddressCountry(String value) {
        return new JAXBElement<String>(_AddressCountry_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Identifier")
    public JAXBElement<String> createIdentifier(String value) {
        return new JAXBElement<String>(_Identifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rightsDetails")
    public JAXBElement<String> createRightsDetails(String value) {
        return new JAXBElement<String>(_RightsDetails_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "unitCode")
    public JAXBElement<String> createUnitCode(String value) {
        return new JAXBElement<String>(_UnitCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "completionDate")
    public JAXBElement<Short> createCompletionDate(Short value) {
        return new JAXBElement<Short>(_CompletionDate_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hasPart")
    public JAXBElement<String> createHasPart(String value) {
        return new JAXBElement<String>(_HasPart_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "numberOfRooms")
    public JAXBElement<Byte> createNumberOfRooms(Byte value) {
        return new JAXBElement<Byte>(_NumberOfRooms_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "format")
    public JAXBElement<String> createFormat(String value) {
        return new JAXBElement<String>(_Format_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rebuildingDate")
    public JAXBElement<XMLGregorianCalendar> createRebuildingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RebuildingDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cost")
    public JAXBElement<BigDecimal> createCost(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Cost_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hasType")
    public JAXBElement<String> createHasType(String value) {
        return new JAXBElement<String>(_HasType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postalCodeStart")
    public JAXBElement<Integer> createPostalCodeStart(Integer value) {
        return new JAXBElement<Integer>(_PostalCodeStart_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "architect")
    public JAXBElement<String> createArchitect(String value) {
        return new JAXBElement<String>(_Architect_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provenance")
    public JAXBElement<String> createProvenance(String value) {
        return new JAXBElement<String>(_Provenance_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postalCodeEnd")
    public JAXBElement<Integer> createPostalCodeEnd(Integer value) {
        return new JAXBElement<Integer>(_PostalCodeEnd_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "filesize")
    public JAXBElement<Long> createFilesize(Long value) {
        return new JAXBElement<Long>(_Filesize_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "addressRegion")
    public JAXBElement<String> createAddressRegion(String value) {
        return new JAXBElement<String>(_AddressRegion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "owner")
    public JAXBElement<String> createOwner(String value) {
        return new JAXBElement<String>(_Owner_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dateCreated")
    public JAXBElement<XMLGregorianCalendar> createDateCreated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateCreated_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "constructionTime")
    public JAXBElement<Integer> createConstructionTime(Integer value) {
        return new JAXBElement<Integer>(_ConstructionTime_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "isPartOf")
    public JAXBElement<String> createIsPartOf(String value) {
        return new JAXBElement<String>(_IsPartOf_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "latitude")
    public JAXBElement<BigDecimal> createLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Latitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postOfficeBoxNumber")
    public JAXBElement<Short> createPostOfficeBoxNumber(Short value) {
        return new JAXBElement<Short>(_PostOfficeBoxNumber_QNAME, Short.class, null, value);
    }

}