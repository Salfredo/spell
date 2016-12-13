//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.07 at 08:49:39 AM CET 
//


package com.streamserve.schemas.documenttype._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Describes the metadata present in one document type or metadata group.
 * 			
 * 
 * <p>Java class for MetadataTypesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataTypesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadata" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="scope" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}Name" />
 *                 &lt;attribute name="guid" use="required" type="{http://schemas.streamserve.com/public/1.0}GUIDType" />
 *                 &lt;attribute name="variable" type="{http://schemas.streamserve.com/documenttype/1.0}VariableType" />
 *                 &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="archived" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="postprocess" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataTypesType", propOrder = {
    "metadata"
})
public class MetadataTypesType {

    protected List<MetadataTypesType.Metadata> metadata;

    /**
     * Gets the value of the metadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataTypesType.Metadata }
     * 
     * 
     */
    public List<MetadataTypesType.Metadata> getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<MetadataTypesType.Metadata>();
        }
        return this.metadata;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="scope" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}Name" />
     *       &lt;attribute name="guid" use="required" type="{http://schemas.streamserve.com/public/1.0}GUIDType" />
     *       &lt;attribute name="variable" type="{http://schemas.streamserve.com/documenttype/1.0}VariableType" />
     *       &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="archived" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="postprocess" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Metadata {

        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "scope", required = true)
        protected String scope;
        @XmlAttribute(name = "type", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "Name")
        protected String type;
        @XmlAttribute(name = "guid", required = true)
        protected String guid;
        @XmlAttribute(name = "variable")
        protected String variable;
        @XmlAttribute(name = "text")
        protected String text;
        @XmlAttribute(name = "archived")
        protected Boolean archived;
        @XmlAttribute(name = "message")
        protected Boolean message;
        @XmlAttribute(name = "postprocess")
        protected Boolean postprocess;

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
         * Gets the value of the scope property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScope() {
            return scope;
        }

        /**
         * Sets the value of the scope property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScope(String value) {
            this.scope = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

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
         * Gets the value of the variable property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariable() {
            return variable;
        }

        /**
         * Sets the value of the variable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariable(String value) {
            this.variable = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Gets the value of the archived property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isArchived() {
            if (archived == null) {
                return false;
            } else {
                return archived;
            }
        }

        /**
         * Sets the value of the archived property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setArchived(Boolean value) {
            this.archived = value;
        }

        /**
         * Gets the value of the message property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isMessage() {
            if (message == null) {
                return false;
            } else {
                return message;
            }
        }

        /**
         * Sets the value of the message property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMessage(Boolean value) {
            this.message = value;
        }

        /**
         * Gets the value of the postprocess property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isPostprocess() {
            if (postprocess == null) {
                return false;
            } else {
                return postprocess;
            }
        }

        /**
         * Sets the value of the postprocess property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPostprocess(Boolean value) {
            this.postprocess = value;
        }

    }

}
