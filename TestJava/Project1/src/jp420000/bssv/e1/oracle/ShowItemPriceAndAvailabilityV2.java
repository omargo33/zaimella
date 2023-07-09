
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for showItemPriceAndAvailabilityV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="showItemPriceAndAvailabilityV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}messageValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://oracle.e1.bssv.JP420000/}productOutV2" minOccurs="0"/&gt;
 *         &lt;element name="useTaxedPrices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showItemPriceAndAvailabilityV2", propOrder = { "currencyCode", "product", "useTaxedPrices" })
public class ShowItemPriceAndAvailabilityV2 extends MessageValueObject {

    protected String currencyCode;
    protected ProductOutV2 product;
    protected Boolean useTaxedPrices;

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
     *     {@link ProductOutV2 }
     *
     */
    public ProductOutV2 getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value
     *     allowed object is
     *     {@link ProductOutV2 }
     *
     */
    public void setProduct(ProductOutV2 value) {
        this.product = value;
    }

    /**
     * Gets the value of the useTaxedPrices property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isUseTaxedPrices() {
        return useTaxedPrices;
    }

    /**
     * Sets the value of the useTaxedPrices property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setUseTaxedPrices(Boolean value) {
        this.useTaxedPrices = value;
    }

}
