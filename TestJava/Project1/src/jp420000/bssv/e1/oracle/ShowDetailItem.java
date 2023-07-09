
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for showDetailItem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="showDetailItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemCatalog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="itemProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemUPCEAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showDetailItem", propOrder = { "itemCatalog", "itemId", "itemProduct", "itemUPCEAN" })
public class ShowDetailItem extends ValueObject {

    protected String itemCatalog;
    protected Integer itemId;
    protected String itemProduct;
    protected String itemUPCEAN;

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

    /**
     * Gets the value of the itemUPCEAN property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemUPCEAN() {
        return itemUPCEAN;
    }

    /**
     * Sets the value of the itemUPCEAN property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemUPCEAN(String value) {
        this.itemUPCEAN = value;
    }

}
