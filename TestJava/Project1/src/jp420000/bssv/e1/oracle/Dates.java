
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dates complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="dates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateEffective" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dates", propOrder = { "dateEffective", "dateExpiration" })
public class Dates extends ValueObject {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEffective;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateExpiration;

    /**
     * Gets the value of the dateEffective property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateEffective() {
        return dateEffective;
    }

    /**
     * Sets the value of the dateEffective property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateEffective(XMLGregorianCalendar value) {
        this.dateEffective = value;
    }

    /**
     * Gets the value of the dateExpiration property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateExpiration() {
        return dateExpiration;
    }

    /**
     * Sets the value of the dateExpiration property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateExpiration(XMLGregorianCalendar value) {
        this.dateExpiration = value;
    }

}
