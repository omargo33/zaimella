
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for confirmSODetail complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="confirmSODetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dates" type="{http://oracle.e1.bssv.JP420000/}confirmSODetailDates" minOccurs="0"/&gt;
 *         &lt;element name="delivery" type="{http://oracle.e1.bssv.JP420000/}confirmSODetailDelivery" minOccurs="0"/&gt;
 *         &lt;element name="documentLineNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="financial" type="{http://oracle.e1.bssv.JP420000/}confirmSODetailFinancial" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://oracle.e1.bssv.JP420000/}confirmSODetailProduct" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://oracle.e1.bssv.JP420000/}quantity" minOccurs="0"/&gt;
 *         &lt;element name="shipTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmSODetail",
         propOrder = { "dates", "delivery", "documentLineNumber", "financial", "product", "quantity", "shipTo"
    })
public class ConfirmSODetail extends ValueObject {

    protected ConfirmSODetailDates dates;
    protected ConfirmSODetailDelivery delivery;
    protected BigDecimal documentLineNumber;
    protected ConfirmSODetailFinancial financial;
    protected ConfirmSODetailProduct product;
    protected Quantity quantity;
    protected Entity shipTo;

    /**
     * Gets the value of the dates property.
     *
     * @return
     *     possible object is
     *     {@link ConfirmSODetailDates }
     *
     */
    public ConfirmSODetailDates getDates() {
        return dates;
    }

    /**
     * Sets the value of the dates property.
     *
     * @param value
     *     allowed object is
     *     {@link ConfirmSODetailDates }
     *
     */
    public void setDates(ConfirmSODetailDates value) {
        this.dates = value;
    }

    /**
     * Gets the value of the delivery property.
     *
     * @return
     *     possible object is
     *     {@link ConfirmSODetailDelivery }
     *
     */
    public ConfirmSODetailDelivery getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     *
     * @param value
     *     allowed object is
     *     {@link ConfirmSODetailDelivery }
     *
     */
    public void setDelivery(ConfirmSODetailDelivery value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the documentLineNumber property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDocumentLineNumber() {
        return documentLineNumber;
    }

    /**
     * Sets the value of the documentLineNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDocumentLineNumber(BigDecimal value) {
        this.documentLineNumber = value;
    }

    /**
     * Gets the value of the financial property.
     *
     * @return
     *     possible object is
     *     {@link ConfirmSODetailFinancial }
     *
     */
    public ConfirmSODetailFinancial getFinancial() {
        return financial;
    }

    /**
     * Sets the value of the financial property.
     *
     * @param value
     *     allowed object is
     *     {@link ConfirmSODetailFinancial }
     *
     */
    public void setFinancial(ConfirmSODetailFinancial value) {
        this.financial = value;
    }

    /**
     * Gets the value of the product property.
     *
     * @return
     *     possible object is
     *     {@link ConfirmSODetailProduct }
     *
     */
    public ConfirmSODetailProduct getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value
     *     allowed object is
     *     {@link ConfirmSODetailProduct }
     *
     */
    public void setProduct(ConfirmSODetailProduct value) {
        this.product = value;
    }

    /**
     * Gets the value of the quantity property.
     *
     * @return
     *     possible object is
     *     {@link Quantity }
     *
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     *
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the shipTo property.
     *
     * @return
     *     possible object is
     *     {@link Entity }
     *
     */
    public Entity getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setShipTo(Entity value) {
        this.shipTo = value;
    }

}
