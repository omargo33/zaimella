
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for itemListPriceShared complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="itemListPriceShared"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="dateEffective" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{http://oracle.e1.bssv.JP420000/}itemGroupCustomer" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemListPriceShared",
         propOrder =
         { "businessUnit", "currencyCode", "customer", "dateEffective", "dateExpiration", "item", "unitOfMeasureCode"
    })
@XmlSeeAlso({ GetItemListPrice.class, ItemListPriceRecord.class })
public class ItemListPriceShared extends ValueObject {

    protected String businessUnit;
    protected String currencyCode;
    protected Entity customer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEffective;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateExpiration;
    protected ItemGroupCustomer item;
    protected String unitOfMeasureCode;

    /**
     * Gets the value of the businessUnit property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the value of the businessUnit property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBusinessUnit(String value) {
        this.businessUnit = value;
    }

    /**
     * Gets the value of the currencyCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the customer property.
     *
     * @return
     *     possible object is
     *     {@link Entity }
     *
     */
    public Entity getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setCustomer(Entity value) {
        this.customer = value;
    }

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
     * Gets the value of the unitOfMeasureCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * Sets the value of the unitOfMeasureCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

}
