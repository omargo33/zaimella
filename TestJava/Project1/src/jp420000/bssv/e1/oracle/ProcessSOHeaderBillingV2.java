
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for processSOHeaderBillingV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="processSOHeaderBillingV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentScheduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrier" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCardAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCardAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCardTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerPriceGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deliveryInstruction1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deliveryInstruction2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="freightHandlingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentInstrumentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentTermsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="percentDiscountTrade" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="printMessageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxExplanationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxRateAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "processSOHeaderBillingV2",
         propOrder =
         { "adjustmentScheduleCode", "carrier", "checkNumber", "creditCardAccountName", "creditCardAccountNumber",
           "creditCardTypeCode", "customerPriceGroupCode", "dateExpiration", "deliveryInstruction1",
           "deliveryInstruction2", "freightHandlingCode", "paymentInstrumentCode", "paymentTermsCode",
           "percentDiscountTrade", "printMessageCode", "taxExplanationCode", "taxRateAreaCode", "useTaxedPrices"
    })
public class ProcessSOHeaderBillingV2 extends ValueObject {

    protected String adjustmentScheduleCode;
    protected Entity carrier;
    protected String checkNumber;
    protected String creditCardAccountName;
    protected String creditCardAccountNumber;
    protected String creditCardTypeCode;
    protected String customerPriceGroupCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateExpiration;
    protected String deliveryInstruction1;
    protected String deliveryInstruction2;
    protected String freightHandlingCode;
    protected String paymentInstrumentCode;
    protected String paymentTermsCode;
    protected BigDecimal percentDiscountTrade;
    protected String printMessageCode;
    protected String taxExplanationCode;
    protected String taxRateAreaCode;
    protected Boolean useTaxedPrices;

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
     * Gets the value of the carrier property.
     *
     * @return
     *     possible object is
     *     {@link Entity }
     *
     */
    public Entity getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setCarrier(Entity value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the checkNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the creditCardAccountName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreditCardAccountName() {
        return creditCardAccountName;
    }

    /**
     * Sets the value of the creditCardAccountName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreditCardAccountName(String value) {
        this.creditCardAccountName = value;
    }

    /**
     * Gets the value of the creditCardAccountNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreditCardAccountNumber() {
        return creditCardAccountNumber;
    }

    /**
     * Sets the value of the creditCardAccountNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreditCardAccountNumber(String value) {
        this.creditCardAccountNumber = value;
    }

    /**
     * Gets the value of the creditCardTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreditCardTypeCode() {
        return creditCardTypeCode;
    }

    /**
     * Sets the value of the creditCardTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreditCardTypeCode(String value) {
        this.creditCardTypeCode = value;
    }

    /**
     * Gets the value of the customerPriceGroupCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerPriceGroupCode() {
        return customerPriceGroupCode;
    }

    /**
     * Sets the value of the customerPriceGroupCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerPriceGroupCode(String value) {
        this.customerPriceGroupCode = value;
    }

    /**
     * Gets the value of the dateExpiration property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateExpiration() {
        return dateExpiration;
    }

    /**
     * Sets the value of the dateExpiration property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateExpiration(XMLGregorianCalendar value) {
        this.dateExpiration = value;
    }

    /**
     * Gets the value of the deliveryInstruction1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeliveryInstruction1() {
        return deliveryInstruction1;
    }

    /**
     * Sets the value of the deliveryInstruction1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeliveryInstruction1(String value) {
        this.deliveryInstruction1 = value;
    }

    /**
     * Gets the value of the deliveryInstruction2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeliveryInstruction2() {
        return deliveryInstruction2;
    }

    /**
     * Sets the value of the deliveryInstruction2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeliveryInstruction2(String value) {
        this.deliveryInstruction2 = value;
    }

    /**
     * Gets the value of the freightHandlingCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFreightHandlingCode() {
        return freightHandlingCode;
    }

    /**
     * Sets the value of the freightHandlingCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFreightHandlingCode(String value) {
        this.freightHandlingCode = value;
    }

    /**
     * Gets the value of the paymentInstrumentCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentInstrumentCode() {
        return paymentInstrumentCode;
    }

    /**
     * Sets the value of the paymentInstrumentCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentInstrumentCode(String value) {
        this.paymentInstrumentCode = value;
    }

    /**
     * Gets the value of the paymentTermsCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentTermsCode() {
        return paymentTermsCode;
    }

    /**
     * Sets the value of the paymentTermsCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentTermsCode(String value) {
        this.paymentTermsCode = value;
    }

    /**
     * Gets the value of the percentDiscountTrade property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPercentDiscountTrade() {
        return percentDiscountTrade;
    }

    /**
     * Sets the value of the percentDiscountTrade property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPercentDiscountTrade(BigDecimal value) {
        this.percentDiscountTrade = value;
    }

    /**
     * Gets the value of the printMessageCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrintMessageCode() {
        return printMessageCode;
    }

    /**
     * Sets the value of the printMessageCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrintMessageCode(String value) {
        this.printMessageCode = value;
    }

    /**
     * Gets the value of the taxExplanationCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxExplanationCode() {
        return taxExplanationCode;
    }

    /**
     * Sets the value of the taxExplanationCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxExplanationCode(String value) {
        this.taxExplanationCode = value;
    }

    /**
     * Gets the value of the taxRateAreaCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxRateAreaCode() {
        return taxRateAreaCode;
    }

    /**
     * Sets the value of the taxRateAreaCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxRateAreaCode(String value) {
        this.taxRateAreaCode = value;
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
