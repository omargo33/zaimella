
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for showSalesDetailLinePricing complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="showSalesDetailLinePricing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentScheduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datePriceEffective" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="itemPriceGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceExtendedDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceExtendedForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceUnitDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceUnitForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "showSalesDetailLinePricing",
         propOrder =
         { "adjustmentScheduleCode", "datePriceEffective", "itemPriceGroupCode", "priceCode1", "priceCode2",
           "priceCode3", "priceExtendedDomestic", "priceExtendedForeign", "priceUnitDomestic", "priceUnitForeign",
           "unitOfMeasureCodePricing"
    })
public class ShowSalesDetailLinePricing extends ValueObject {

    protected String adjustmentScheduleCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePriceEffective;
    protected String itemPriceGroupCode;
    protected String priceCode1;
    protected String priceCode2;
    protected String priceCode3;
    protected BigDecimal priceExtendedDomestic;
    protected BigDecimal priceExtendedForeign;
    protected BigDecimal priceUnitDomestic;
    protected BigDecimal priceUnitForeign;
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
