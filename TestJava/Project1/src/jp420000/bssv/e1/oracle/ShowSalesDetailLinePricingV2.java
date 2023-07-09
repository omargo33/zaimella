
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for showSalesDetailLinePricingV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="showSalesDetailLinePricingV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentScheduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datePriceEffective" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateTaxedPricesEffective" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="itemPriceGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="taxedPriceInvoicedForKitDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxedPriceInvoicedForKitForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "showSalesDetailLinePricingV2",
         propOrder =
         { "adjustmentScheduleCode", "datePriceEffective", "dateTaxedPricesEffective", "itemPriceGroupCode",
           "priceCode1", "priceCode2", "priceCode3", "priceExtendedDomestic", "priceExtendedForeign",
           "priceUnitDomestic", "priceUnitForeign", "taxAmountExtendedDomestic", "taxAmountExtendedForeign",
           "taxAmountUnitDomestic", "taxAmountUnitForeign", "taxedPriceExtendedDomestic", "taxedPriceExtendedForeign",
           "taxedPriceInvoicedForKitDomestic", "taxedPriceInvoicedForKitForeign", "taxedPriceUnitDomestic",
           "taxedPriceUnitForeign", "unitOfMeasureCodePricing"
    })
public class ShowSalesDetailLinePricingV2 extends ValueObject {

    protected String adjustmentScheduleCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePriceEffective;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTaxedPricesEffective;
    protected String itemPriceGroupCode;
    protected String priceCode1;
    protected String priceCode2;
    protected String priceCode3;
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
    protected BigDecimal taxedPriceInvoicedForKitDomestic;
    protected BigDecimal taxedPriceInvoicedForKitForeign;
    protected BigDecimal taxedPriceUnitDomestic;
    protected BigDecimal taxedPriceUnitForeign;
    protected String unitOfMeasureCodePricing;

    /**
     * Gets the value of the adjustmentScheduleCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdjustmentScheduleCode() {
        return adjustmentScheduleCode;
    }

    /**
     * Sets the value of the adjustmentScheduleCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdjustmentScheduleCode(String value) {
        this.adjustmentScheduleCode = value;
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
     * Gets the value of the dateTaxedPricesEffective property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateTaxedPricesEffective() {
        return dateTaxedPricesEffective;
    }

    /**
     * Sets the value of the dateTaxedPricesEffective property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateTaxedPricesEffective(XMLGregorianCalendar value) {
        this.dateTaxedPricesEffective = value;
    }

    /**
     * Gets the value of the itemPriceGroupCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemPriceGroupCode() {
        return itemPriceGroupCode;
    }

    /**
     * Sets the value of the itemPriceGroupCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemPriceGroupCode(String value) {
        this.itemPriceGroupCode = value;
    }

    /**
     * Gets the value of the priceCode1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPriceCode1() {
        return priceCode1;
    }

    /**
     * Sets the value of the priceCode1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPriceCode1(String value) {
        this.priceCode1 = value;
    }

    /**
     * Gets the value of the priceCode2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPriceCode2() {
        return priceCode2;
    }

    /**
     * Sets the value of the priceCode2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPriceCode2(String value) {
        this.priceCode2 = value;
    }

    /**
     * Gets the value of the priceCode3 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPriceCode3() {
        return priceCode3;
    }

    /**
     * Sets the value of the priceCode3 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPriceCode3(String value) {
        this.priceCode3 = value;
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
     * Gets the value of the taxedPriceInvoicedForKitDomestic property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxedPriceInvoicedForKitDomestic() {
        return taxedPriceInvoicedForKitDomestic;
    }

    /**
     * Sets the value of the taxedPriceInvoicedForKitDomestic property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxedPriceInvoicedForKitDomestic(BigDecimal value) {
        this.taxedPriceInvoicedForKitDomestic = value;
    }

    /**
     * Gets the value of the taxedPriceInvoicedForKitForeign property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxedPriceInvoicedForKitForeign() {
        return taxedPriceInvoicedForKitForeign;
    }

    /**
     * Sets the value of the taxedPriceInvoicedForKitForeign property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxedPriceInvoicedForKitForeign(BigDecimal value) {
        this.taxedPriceInvoicedForKitForeign = value;
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
