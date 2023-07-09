
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priceAdjustmentLedger complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="priceAdjustmentLedger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentCalculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentMutuallyExclusive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentScheduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountAdjustmentDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="amountAdjustmentForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="basisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ledgerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manualDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overridePriceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="promotionDisplayControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quantityFrom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureCodeFactorValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valueBasedOn" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="valueFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceAdjustmentLedger",
         propOrder =
         { "adjustmentCalculation", "adjustmentGroup", "adjustmentMutuallyExclusive", "adjustmentReasonCode",
           "adjustmentScheduleCode", "adjustmentTypeCode", "amountAdjustmentDomestic", "amountAdjustmentForeign",
           "basisCode", "ledgerTypeCode", "manualDiscount", "overridePriceCode", "promotionDisplayControl",
           "quantityFrom", "sequenceNumber", "unitOfMeasureCodeFactorValue", "valueBasedOn", "valueFactor"
    })
public class PriceAdjustmentLedger extends ValueObject {

    protected String adjustmentCalculation;
    protected String adjustmentGroup;
    protected String adjustmentMutuallyExclusive;
    protected String adjustmentReasonCode;
    protected String adjustmentScheduleCode;
    protected String adjustmentTypeCode;
    protected BigDecimal amountAdjustmentDomestic;
    protected BigDecimal amountAdjustmentForeign;
    protected String basisCode;
    protected String ledgerTypeCode;
    protected String manualDiscount;
    protected String overridePriceCode;
    protected String promotionDisplayControl;
    protected BigDecimal quantityFrom;
    protected Integer sequenceNumber;
    protected String unitOfMeasureCodeFactorValue;
    protected BigDecimal valueBasedOn;
    protected BigDecimal valueFactor;

    /**
     * Gets the value of the adjustmentCalculation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdjustmentCalculation() {
        return adjustmentCalculation;
    }

    /**
     * Sets the value of the adjustmentCalculation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdjustmentCalculation(String value) {
        this.adjustmentCalculation = value;
    }

    /**
     * Gets the value of the adjustmentGroup property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdjustmentGroup() {
        return adjustmentGroup;
    }

    /**
     * Sets the value of the adjustmentGroup property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdjustmentGroup(String value) {
        this.adjustmentGroup = value;
    }

    /**
     * Gets the value of the adjustmentMutuallyExclusive property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdjustmentMutuallyExclusive() {
        return adjustmentMutuallyExclusive;
    }

    /**
     * Sets the value of the adjustmentMutuallyExclusive property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdjustmentMutuallyExclusive(String value) {
        this.adjustmentMutuallyExclusive = value;
    }

    /**
     * Gets the value of the adjustmentReasonCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }

    /**
     * Sets the value of the adjustmentReasonCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdjustmentReasonCode(String value) {
        this.adjustmentReasonCode = value;
    }

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
     * Gets the value of the adjustmentTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdjustmentTypeCode() {
        return adjustmentTypeCode;
    }

    /**
     * Sets the value of the adjustmentTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdjustmentTypeCode(String value) {
        this.adjustmentTypeCode = value;
    }

    /**
     * Gets the value of the amountAdjustmentDomestic property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAmountAdjustmentDomestic() {
        return amountAdjustmentDomestic;
    }

    /**
     * Sets the value of the amountAdjustmentDomestic property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAmountAdjustmentDomestic(BigDecimal value) {
        this.amountAdjustmentDomestic = value;
    }

    /**
     * Gets the value of the amountAdjustmentForeign property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAmountAdjustmentForeign() {
        return amountAdjustmentForeign;
    }

    /**
     * Sets the value of the amountAdjustmentForeign property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAmountAdjustmentForeign(BigDecimal value) {
        this.amountAdjustmentForeign = value;
    }

    /**
     * Gets the value of the basisCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBasisCode() {
        return basisCode;
    }

    /**
     * Sets the value of the basisCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBasisCode(String value) {
        this.basisCode = value;
    }

    /**
     * Gets the value of the ledgerTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLedgerTypeCode() {
        return ledgerTypeCode;
    }

    /**
     * Sets the value of the ledgerTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLedgerTypeCode(String value) {
        this.ledgerTypeCode = value;
    }

    /**
     * Gets the value of the manualDiscount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManualDiscount() {
        return manualDiscount;
    }

    /**
     * Sets the value of the manualDiscount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManualDiscount(String value) {
        this.manualDiscount = value;
    }

    /**
     * Gets the value of the overridePriceCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOverridePriceCode() {
        return overridePriceCode;
    }

    /**
     * Sets the value of the overridePriceCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOverridePriceCode(String value) {
        this.overridePriceCode = value;
    }

    /**
     * Gets the value of the promotionDisplayControl property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPromotionDisplayControl() {
        return promotionDisplayControl;
    }

    /**
     * Sets the value of the promotionDisplayControl property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPromotionDisplayControl(String value) {
        this.promotionDisplayControl = value;
    }

    /**
     * Gets the value of the quantityFrom property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getQuantityFrom() {
        return quantityFrom;
    }

    /**
     * Sets the value of the quantityFrom property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setQuantityFrom(BigDecimal value) {
        this.quantityFrom = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the unitOfMeasureCodeFactorValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitOfMeasureCodeFactorValue() {
        return unitOfMeasureCodeFactorValue;
    }

    /**
     * Sets the value of the unitOfMeasureCodeFactorValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitOfMeasureCodeFactorValue(String value) {
        this.unitOfMeasureCodeFactorValue = value;
    }

    /**
     * Gets the value of the valueBasedOn property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValueBasedOn() {
        return valueBasedOn;
    }

    /**
     * Sets the value of the valueBasedOn property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValueBasedOn(BigDecimal value) {
        this.valueBasedOn = value;
    }

    /**
     * Gets the value of the valueFactor property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValueFactor() {
        return valueFactor;
    }

    /**
     * Sets the value of the valueFactor property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValueFactor(BigDecimal value) {
        this.valueFactor = value;
    }

}
