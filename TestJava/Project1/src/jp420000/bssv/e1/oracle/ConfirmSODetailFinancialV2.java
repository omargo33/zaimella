
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for confirmSODetailFinancialV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="confirmSODetailFinancialV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priceExtendedDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceExtendedForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceUnitDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceUnitForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxAmountExtendedDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxAmountExtendedForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxAmountUnitDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxAmountUnitForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxedPriceExtendedDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxedPriceExtendedForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxedPriceUnitDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxedPriceUnitForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureCodePricing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmSODetailFinancialV2",
         propOrder =
         { "priceExtendedDomestic", "priceExtendedForeign", "priceUnitDomestic", "priceUnitForeign",
           "taxAmountExtendedDomestic", "taxAmountExtendedForeign", "taxAmountUnitDomestic", "taxAmountUnitForeign",
           "taxedPriceExtendedDomestic", "taxedPriceExtendedForeign", "taxedPriceUnitDomestic", "taxedPriceUnitForeign",
           "unitOfMeasureCodePricing"
    })
public class ConfirmSODetailFinancialV2 extends ValueObject {

    protected BigDecimal priceExtendedDomestic;
    protected BigDecimal priceExtendedForeign;
    protected BigDecimal priceUnitDomestic;
    protected BigDecimal priceUnitForeign;
    protected BigDecimal taxAmountExtendedDomestic;
    protected BigDecimal taxAmountExtendedForeign;
    protected BigDecimal taxAmountUnitDomestic;
    protected BigDecimal taxAmountUnitForeign;
    protected BigDecimal taxedPriceExtendedDomestic;
    protected BigDecimal taxedPriceExtendedForeign;
    protected BigDecimal taxedPriceUnitDomestic;
    protected BigDecimal taxedPriceUnitForeign;
    protected String unitOfMeasureCodePricing;

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
     * Gets the value of the taxAmountExtendedDomestic property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxAmountExtendedDomestic() {
        return taxAmountExtendedDomestic;
    }

    /**
     * Sets the value of the taxAmountExtendedDomestic property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxAmountExtendedDomestic(BigDecimal value) {
        this.taxAmountExtendedDomestic = value;
    }

    /**
     * Gets the value of the taxAmountExtendedForeign property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxAmountExtendedForeign() {
        return taxAmountExtendedForeign;
    }

    /**
     * Sets the value of the taxAmountExtendedForeign property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxAmountExtendedForeign(BigDecimal value) {
        this.taxAmountExtendedForeign = value;
    }

    /**
     * Gets the value of the taxAmountUnitDomestic property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxAmountUnitDomestic() {
        return taxAmountUnitDomestic;
    }

    /**
     * Sets the value of the taxAmountUnitDomestic property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxAmountUnitDomestic(BigDecimal value) {
        this.taxAmountUnitDomestic = value;
    }

    /**
     * Gets the value of the taxAmountUnitForeign property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxAmountUnitForeign() {
        return taxAmountUnitForeign;
    }

    /**
     * Sets the value of the taxAmountUnitForeign property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxAmountUnitForeign(BigDecimal value) {
        this.taxAmountUnitForeign = value;
    }

    /**
     * Gets the value of the taxedPriceExtendedDomestic property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxedPriceExtendedDomestic() {
        return taxedPriceExtendedDomestic;
    }

    /**
     * Sets the value of the taxedPriceExtendedDomestic property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxedPriceExtendedDomestic(BigDecimal value) {
        this.taxedPriceExtendedDomestic = value;
    }

    /**
     * Gets the value of the taxedPriceExtendedForeign property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxedPriceExtendedForeign() {
        return taxedPriceExtendedForeign;
    }

    /**
     * Sets the value of the taxedPriceExtendedForeign property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxedPriceExtendedForeign(BigDecimal value) {
        this.taxedPriceExtendedForeign = value;
    }

    /**
     * Gets the value of the taxedPriceUnitDomestic property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxedPriceUnitDomestic() {
        return taxedPriceUnitDomestic;
    }

    /**
     * Sets the value of the taxedPriceUnitDomestic property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxedPriceUnitDomestic(BigDecimal value) {
        this.taxedPriceUnitDomestic = value;
    }

    /**
     * Gets the value of the taxedPriceUnitForeign property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxedPriceUnitForeign() {
        return taxedPriceUnitForeign;
    }

    /**
     * Sets the value of the taxedPriceUnitForeign property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxedPriceUnitForeign(BigDecimal value) {
        this.taxedPriceUnitForeign = value;
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

}
