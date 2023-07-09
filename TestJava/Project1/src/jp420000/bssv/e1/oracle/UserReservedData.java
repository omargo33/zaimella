
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for userReservedData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="userReservedData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userReservedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="userReservedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userReservedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="userReservedNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="userReservedReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userReservedData",
         propOrder =
         { "userReservedAmount", "userReservedCode", "userReservedDate", "userReservedNumber", "userReservedReference"
    })
public class UserReservedData extends ValueObject {

    protected BigDecimal userReservedAmount;
    protected String userReservedCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar userReservedDate;
    protected Integer userReservedNumber;
    protected String userReservedReference;

    /**
     * Gets the value of the userReservedAmount property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUserReservedAmount() {
        return userReservedAmount;
    }

    /**
     * Sets the value of the userReservedAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUserReservedAmount(BigDecimal value) {
        this.userReservedAmount = value;
    }

    /**
     * Gets the value of the userReservedCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserReservedCode() {
        return userReservedCode;
    }

    /**
     * Sets the value of the userReservedCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserReservedCode(String value) {
        this.userReservedCode = value;
    }

    /**
     * Gets the value of the userReservedDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUserReservedDate() {
        return userReservedDate;
    }

    /**
     * Sets the value of the userReservedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUserReservedDate(XMLGregorianCalendar value) {
        this.userReservedDate = value;
    }

    /**
     * Gets the value of the userReservedNumber property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getUserReservedNumber() {
        return userReservedNumber;
    }

    /**
     * Sets the value of the userReservedNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setUserReservedNumber(Integer value) {
        this.userReservedNumber = value;
    }

    /**
     * Gets the value of the userReservedReference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserReservedReference() {
        return userReservedReference;
    }

    /**
     * Sets the value of the userReservedReference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserReservedReference(String value) {
        this.userReservedReference = value;
    }

}
