
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for showItemPriceAndAvailability complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="showItemPriceAndAvailability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}messageValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://oracle.e1.bssv.JP420000/}productOut" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showItemPriceAndAvailability", propOrder = { "currencyCode", "product" })
public class ShowItemPriceAndAvailability extends MessageValueObject {

    protected String currencyCode;
    protected ProductOut product;

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
     * Gets the value of the product property.
     *
     * @return
     *     possible object is
     *     {@link ProductOut }
     *
     */
    public ProductOut getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value
     *     allowed object is
     *     {@link ProductOut }
     *
     */
    public void setProduct(ProductOut value) {
        this.product = value;
    }

}
