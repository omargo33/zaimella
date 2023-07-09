
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for confirmSODetailDates complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="confirmSODetailDates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datePromisedDelivery" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datePromisedShip" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateRequested" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="timePromisedDelivery" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="timePromisedShip" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="timeRequested" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmSODetailDates",
         propOrder =
         { "datePromisedDelivery", "datePromisedShip", "dateRequested", "timePromisedDelivery", "timePromisedShip",
           "timeRequested"
    })
public class ConfirmSODetailDates extends ValueObject {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePromisedDelivery;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePromisedShip;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRequested;
    protected Integer timePromisedDelivery;
    protected Integer timePromisedShip;
    protected Integer timeRequested;

    /**
     * Gets the value of the datePromisedDelivery property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDatePromisedDelivery() {
        return datePromisedDelivery;
    }

    /**
     * Sets the value of the datePromisedDelivery property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDatePromisedDelivery(XMLGregorianCalendar value) {
        this.datePromisedDelivery = value;
    }

    /**
     * Gets the value of the datePromisedShip property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDatePromisedShip() {
        return datePromisedShip;
    }

    /**
     * Sets the value of the datePromisedShip property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDatePromisedShip(XMLGregorianCalendar value) {
        this.datePromisedShip = value;
    }

    /**
     * Gets the value of the dateRequested property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateRequested() {
        return dateRequested;
    }

    /**
     * Sets the value of the dateRequested property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateRequested(XMLGregorianCalendar value) {
        this.dateRequested = value;
    }

    /**
     * Gets the value of the timePromisedDelivery property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTimePromisedDelivery() {
        return timePromisedDelivery;
    }

    /**
     * Sets the value of the timePromisedDelivery property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTimePromisedDelivery(Integer value) {
        this.timePromisedDelivery = value;
    }

    /**
     * Gets the value of the timePromisedShip property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTimePromisedShip() {
        return timePromisedShip;
    }

    /**
     * Sets the value of the timePromisedShip property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTimePromisedShip(Integer value) {
        this.timePromisedShip = value;
    }

    /**
     * Gets the value of the timeRequested property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTimeRequested() {
        return timeRequested;
    }

    /**
     * Sets the value of the timeRequested property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTimeRequested(Integer value) {
        this.timeRequested = value;
    }

}
