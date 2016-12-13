//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.07 at 08:49:39 AM CET 
//


package com.streamserve.schemas._public._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.streamserve.schemas._public._1 package. 
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

    private final static QName _Uid_QNAME = new QName("http://schemas.streamserve.com/public/1.0", "uid");
    private final static QName _Data_QNAME = new QName("http://schemas.streamserve.com/public/1.0", "data");
    private final static QName _Xlink_QNAME = new QName("http://schemas.streamserve.com/public/1.0", "xlink");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.streamserve.schemas._public._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UIDDefinitionType }
     * 
     */
    public UIDDefinitionType createUIDDefinitionType() {
        return new UIDDefinitionType();
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link ErrorDetailType }
     * 
     */
    public ErrorDetailType createErrorDetailType() {
        return new ErrorDetailType();
    }

    /**
     * Create an instance of {@link XLinkType }
     * 
     */
    public XLinkType createXLinkType() {
        return new XLinkType();
    }

    /**
     * Create an instance of {@link AttributeIDType }
     * 
     */
    public AttributeIDType createAttributeIDType() {
        return new AttributeIDType();
    }

    /**
     * Create an instance of {@link ValueCollectionType }
     * 
     */
    public ValueCollectionType createValueCollectionType() {
        return new ValueCollectionType();
    }

    /**
     * Create an instance of {@link AttributeCollectionType }
     * 
     */
    public AttributeCollectionType createAttributeCollectionType() {
        return new AttributeCollectionType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link CustomAttributeType }
     * 
     */
    public CustomAttributeType createCustomAttributeType() {
        return new CustomAttributeType();
    }

    /**
     * Create an instance of {@link ExtendedAttributeEnumType }
     * 
     */
    public ExtendedAttributeEnumType createExtendedAttributeEnumType() {
        return new ExtendedAttributeEnumType();
    }

    /**
     * Create an instance of {@link CustomAttributeCollectionType }
     * 
     */
    public CustomAttributeCollectionType createCustomAttributeCollectionType() {
        return new CustomAttributeCollectionType();
    }

    /**
     * Create an instance of {@link CustomAttributeIDType }
     * 
     */
    public CustomAttributeIDType createCustomAttributeIDType() {
        return new CustomAttributeIDType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UIDDefinitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.streamserve.com/public/1.0", name = "uid")
    public JAXBElement<UIDDefinitionType> createUid(UIDDefinitionType value) {
        return new JAXBElement<UIDDefinitionType>(_Uid_QNAME, UIDDefinitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.streamserve.com/public/1.0", name = "data")
    public JAXBElement<String> createData(String value) {
        return new JAXBElement<String>(_Data_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XLinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.streamserve.com/public/1.0", name = "xlink")
    public JAXBElement<XLinkType> createXlink(XLinkType value) {
        return new JAXBElement<XLinkType>(_Xlink_QNAME, XLinkType.class, null, value);
    }

}
