
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemGroupCustomer complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="itemGroupCustomer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemCatalog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemFreeForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="itemProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemGroupCustomer",
         propOrder = { "itemCatalog", "itemCustomer", "itemFreeForm", "itemId", "itemProduct" })
public class ItemGroupCustomer extends ValueObject {

    protected String itemCatalog;
    protected String itemCustomer;
    protected String itemFreeForm;
    protected Integer itemId;
    protected String itemProduct;

    /**
     * Gets the value of the itemCatalog property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemCatalog() {
        return itemCatalog;
    }

    /**
     * Sets the value of the itemCatalog property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemCatalog(String value) {
        this.itemCatalog = value;
    }

    /**
     * Gets the value of the itemCustomer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemCustomer() {
        return itemCustomer;
    }

    /**
     * Sets the value of the itemCustomer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemCustomer(String value) {
        this.itemCustomer = value;
    }

    /**
     * Gets the value of the itemFreeForm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemFreeForm() {
        return itemFreeForm;
    }

    /**
     * Sets the value of the itemFreeForm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemFreeForm(String value) {
        this.itemFreeForm = value;
    }

    /**
     * Gets the value of the itemId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setItemId(Integer value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itemProduct property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemProduct() {
        return itemProduct;
    }

    /**
     * Sets the value of the itemProduct property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemProduct(String value) {
        this.itemProduct = value;
    }

}
