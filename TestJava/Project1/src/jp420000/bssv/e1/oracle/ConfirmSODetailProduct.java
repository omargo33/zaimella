
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for confirmSODetailProduct complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="confirmSODetailProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="item" type="{http://oracle.e1.bssv.JP420000/}itemGroupCustomer" minOccurs="0"/&gt;
 *         &lt;element name="lineTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusCodeLast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusCodeNext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmSODetailProduct",
         propOrder = { "item", "lineTypeCode", "lotNumber", "statusCodeLast", "statusCodeNext" })
public class ConfirmSODetailProduct extends ValueObject {

    protected ItemGroupCustomer item;
    protected String lineTypeCode;
    protected String lotNumber;
    protected String statusCodeLast;
    protected String statusCodeNext;

    /**
     * Gets the value of the item property.
     *
     * @return
     *     possible object is
     *     {@link ItemGroupCustomer }
     *
     */
    public ItemGroupCustomer getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     *
     * @param value
     *     allowed object is
     *     {@link ItemGroupCustomer }
     *
     */
    public void setItem(ItemGroupCustomer value) {
        this.item = value;
    }

    /**
     * Gets the value of the lineTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLineTypeCode() {
        return lineTypeCode;
    }

    /**
     * Sets the value of the lineTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLineTypeCode(String value) {
        this.lineTypeCode = value;
    }

    /**
     * Gets the value of the lotNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the statusCodeLast property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusCodeLast() {
        return statusCodeLast;
    }

    /**
     * Sets the value of the statusCodeLast property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusCodeLast(String value) {
        this.statusCodeLast = value;
    }

    /**
     * Gets the value of the statusCodeNext property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusCodeNext() {
        return statusCodeNext;
    }

    /**
     * Sets the value of the statusCodeNext property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusCodeNext(String value) {
        this.statusCodeNext = value;
    }

}
