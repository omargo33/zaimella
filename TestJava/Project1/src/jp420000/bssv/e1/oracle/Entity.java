
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entity complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="entity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="entityLongId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entityTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entity", propOrder = { "entityId", "entityLongId", "entityTaxId" })
public class Entity extends ValueObject {

    protected Integer entityId;
    protected String entityLongId;
    protected String entityTaxId;

    /**
     * Gets the value of the entityId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setEntityId(Integer value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the entityLongId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEntityLongId() {
        return entityLongId;
    }

    /**
     * Sets the value of the entityLongId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEntityLongId(String value) {
        this.entityLongId = value;
    }

    /**
     * Gets the value of the entityTaxId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEntityTaxId() {
        return entityTaxId;
    }

    /**
     * Sets the value of the entityTaxId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEntityTaxId(String value) {
        this.entityTaxId = value;
    }

}
