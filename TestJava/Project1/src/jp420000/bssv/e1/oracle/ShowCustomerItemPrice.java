
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for showCustomerItemPrice complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="showCustomerItemPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}messageValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costExtendedDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="costExtendedForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="costUnitDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="costUnitForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyModeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://oracle.e1.bssv.JP420000/}customer" minOccurs="0"/&gt;
 *         &lt;element name="datePriceEffective" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="priceExtendedDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceExtendedForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceListDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceListForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceUnitDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceUnitForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://oracle.e1.bssv.JP420000/}product" minOccurs="0"/&gt;
 *         &lt;element name="quantityOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureCodePricing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureCodeTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showCustomerItemPrice",
         propOrder =
         { "businessUnit", "costExtendedDomestic", "costExtendedForeign", "costUnitDomestic", "costUnitForeign",
           "currencyCode", "currencyModeCode", "customer", "datePriceEffective", "priceExtendedDomestic",
           "priceExtendedForeign", "priceListDomestic", "priceListForeign", "priceUnitDomestic", "priceUnitForeign",
           "product", "quantityOrdered", "unitOfMeasureCodePricing", "unitOfMeasureCodeTransaction"
    })
public class ShowCustomerItemPrice extends MessageValueObject {

    protected String businessUnit;
    protected BigDecimal costExtendedDomestic;
    protected BigDecimal costExtendedForeign;
    protected BigDecimal costUnitDomestic;
    protected BigDecimal costUnitForeign;
    protected String currencyCode;
    protected String currencyModeCode;
    protected Customer customer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePriceEffective;
    protected BigDecimal priceExtendedDomestic;
    protected BigDecimal priceExtendedForeign;
    protected BigDecimal priceListDomestic;
    protected BigDecimal priceListForeign;
    protected BigDecimal priceUnitDomestic;
    protected BigDecimal priceUnitForeign;
    protected Product product;
    protected BigDecimal quantityOrdered;
    protected String unitOfMeasureCodePricing;
    protected String unitOfMeasureCodeTransaction;

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
     * Gets the value of the costExtendedDomestic property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCostExtendedDomestic() {
        return costExtendedDomestic;
    }

    /**
     * Sets the value of the costExtendedDomestic property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCostExtendedDomestic(BigDecimal value) {
        this.costExtendedDomestic = value;
    }

    /**
     * Gets the value of the costExtendedForeign property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCostExtendedForeign() {
        return costExtendedForeign;
    }

    /**
     * Sets the value of the costExtendedForeign property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCostExtendedForeign(BigDecimal value) {
        this.costExtendedForeign = value;
    }

    /**
     * Gets the value of the costUnitDomestic property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCostUnitDomestic() {
        return costUnitDomestic;
    }

    /**
     * Sets the value of the costUnitDomestic property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCostUnitDomestic(BigDecimal value) {
        this.costUnitDomestic = value;
    }

    /**
     * Gets the value of the costUnitForeign property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCostUnitForeign() {
        return costUnitForeign;
    }

    /**
     * Sets the value of the costUnitForeign property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCostUnitForeign(BigDecimal value) {
        this.costUnitForeign = value;
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
     * Gets the value of the currencyModeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrencyModeCode() {
        return currencyModeCode;
    }

    /**
     * Sets the value of the currencyModeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrencyModeCode(String value) {
        this.currencyModeCode = value;
    }

    /**
     * Gets the value of the customer property.
     *
     * @return
     *     possible object is
     *     {@link Customer }
     *
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     *
     * @param value
     *     allowed object is
     *     {@link Customer }
     *
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the datePriceEffective property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDatePriceEffective() {
        return datePriceEffective;
    }

    /**
     * Sets the value of the datePriceEffective property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDatePriceEffective(XMLGregorianCalendar value) {
        this.datePriceEffective = value;
    }

    /**
     * Gets the value of the priceExtendedDomestic property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPriceExtendedDomestic() {
        return priceExtendedDomestic;
    }

    /**
     * Sets the value of the priceExtendedDomestic property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPriceExtendedDomestic(BigDecimal value) {
        this.priceExtendedDomestic = value;
    }

    /**
     * Gets the value of the priceExtendedForeign property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPriceExtendedForeign() {
        return priceExtendedForeign;
    }

    /**
     * Sets the value of the priceExtendedForeign property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPriceExtendedForeign(BigDecimal value) {
        this.priceExtendedForeign = value;
    }

    /**
     * Gets the value of the priceListDomestic property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPriceListDomestic() {
        return priceListDomestic;
    }

    /**
     * Sets the value of the priceListDomestic property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPriceListDomestic(BigDecimal value) {
        this.priceListDomestic = value;
    }

    /**
     * Gets the value of the priceListForeign property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPriceListForeign() {
        return priceListForeign;
    }

    /**
     * Sets the value of the priceListForeign property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPriceListForeign(BigDecimal value) {
        this.priceListForeign = value;
    }

    /**
     * Gets the value of the priceUnitDomestic property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPriceUnitDomestic() {
        return priceUnitDomestic;
    }

    /**
     * Sets the value of the priceUnitDomestic property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPriceUnitDomestic(BigDecimal value) {
        this.priceUnitDomestic = value;
    }

    /**
     * Gets the value of the priceUnitForeign property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPriceUnitForeign() {
        return priceUnitForeign;
    }

    /**
     * Sets the value of the priceUnitForeign property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPriceUnitForeign(BigDecimal value) {
        this.priceUnitForeign = value;
    }

    /**
     * Gets the value of the product property.
     *
     * @return
     *     possible object is
     *     {@link Product }
     *
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value
     *     allowed object is
     *     {@link Product }
     *
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the quantityOrdered property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }

    /**
     * Sets the value of the quantityOrdered property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setQuantityOrdered(BigDecimal value) {
        this.quantityOrdered = value;
    }

    /**
     * Gets the value of the unitOfMeasureCodePricing property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitOfMeasureCodePricing() {
        return unitOfMeasureCodePricing;
    }

    /**
     * Sets the value of the unitOfMeasureCodePricing property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitOfMeasureCodePricing(String value) {
        this.unitOfMeasureCodePricing = value;
    }

    /**
     * Gets the value of the unitOfMeasureCodeTransaction property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitOfMeasureCodeTransaction() {
        return unitOfMeasureCodeTransaction;
    }

    /**
     * Sets the value of the unitOfMeasureCodeTransaction property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitOfMeasureCodeTransaction(String value) {
        this.unitOfMeasureCodeTransaction = value;
    }

}
