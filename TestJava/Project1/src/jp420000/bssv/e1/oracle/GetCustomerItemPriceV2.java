
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getCustomerItemPriceV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getCustomerItemPriceV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agreementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrier" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://oracle.e1.bssv.JP420000/}customer" minOccurs="0"/&gt;
 *         &lt;element name="customerPriceGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datePriceEffective" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateTaxedPricesEffective" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="discountTrade" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="endUseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="freightHandlingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lineOfBusinessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modeOfTransportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentInstrumentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentTermsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceAdjustmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processing" type="{http://oracle.e1.bssv.JP420000/}processingVersion" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://oracle.e1.bssv.JP420000/}product" minOccurs="0"/&gt;
 *         &lt;element name="rateExchange" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="routeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusCodeDuty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stopCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureCodePricing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureCodeTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="useTaxedPrices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="zoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerItemPriceV2",
         propOrder =
         { "agreementID", "businessUnit", "carrier", "currencyCode", "customer", "customerPriceGroupCode",
           "datePriceEffective", "dateTaxedPricesEffective", "discountTrade", "endUseCode", "freightHandlingCode",
           "lineOfBusinessCode", "modeOfTransportCode", "paymentInstrumentCode", "paymentTermsCode",
           "priceAdjustmentId", "priceCode1", "priceCode2", "priceCode3", "processing", "product", "rateExchange",
           "routeCode", "statusCodeDuty", "stopCode", "transactionQuantity", "unitOfMeasureCodePricing",
           "unitOfMeasureCodeTransaction", "useTaxedPrices", "zoneNumber"
    })
public class GetCustomerItemPriceV2 extends ValueObject {

    protected String agreementID;
    protected String businessUnit;
    protected Entity carrier;
    protected String currencyCode;
    protected Customer customer;
    protected String customerPriceGroupCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePriceEffective;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTaxedPricesEffective;
    protected BigDecimal discountTrade;
    protected String endUseCode;
    protected String freightHandlingCode;
    protected String lineOfBusinessCode;
    protected String modeOfTransportCode;
    protected String paymentInstrumentCode;
    protected String paymentTermsCode;
    protected String priceAdjustmentId;
    protected String priceCode1;
    protected String priceCode2;
    protected String priceCode3;
    protected ProcessingVersion processing;
    protected Product product;
    protected BigDecimal rateExchange;
    protected String routeCode;
    protected String statusCodeDuty;
    protected String stopCode;
    protected BigDecimal transactionQuantity;
    protected String unitOfMeasureCodePricing;
    protected String unitOfMeasureCodeTransaction;
    protected Boolean useTaxedPrices;
    protected String zoneNumber;

    /**
     * Gets the value of the agreementID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAgreementID() {
        return agreementID;
    }

    /**
     * Sets the value of the agreementID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAgreementID(String value) {
        this.agreementID = value;
    }

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
     * Gets the value of the discountTrade property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDiscountTrade() {
        return discountTrade;
    }

    /**
     * Sets the value of the discountTrade property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDiscountTrade(BigDecimal value) {
        this.discountTrade = value;
    }

    /**
     * Gets the value of the endUseCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEndUseCode() {
        return endUseCode;
    }

    /**
     * Sets the value of the endUseCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEndUseCode(String value) {
        this.endUseCode = value;
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
     * Gets the value of the lineOfBusinessCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLineOfBusinessCode() {
        return lineOfBusinessCode;
    }

    /**
     * Sets the value of the lineOfBusinessCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLineOfBusinessCode(String value) {
        this.lineOfBusinessCode = value;
    }

    /**
     * Gets the value of the modeOfTransportCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getModeOfTransportCode() {
        return modeOfTransportCode;
    }

    /**
     * Sets the value of the modeOfTransportCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setModeOfTransportCode(String value) {
        this.modeOfTransportCode = value;
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
     * Gets the value of the priceAdjustmentId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPriceAdjustmentId() {
        return priceAdjustmentId;
    }

    /**
     * Sets the value of the priceAdjustmentId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPriceAdjustmentId(String value) {
        this.priceAdjustmentId = value;
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
     * Gets the value of the processing property.
     *
     * @return
     *     possible object is
     *     {@link ProcessingVersion }
     *
     */
    public ProcessingVersion getProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     *
     * @param value
     *     allowed object is
     *     {@link ProcessingVersion }
     *
     */
    public void setProcessing(ProcessingVersion value) {
        this.processing = value;
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
     * Gets the value of the rateExchange property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getRateExchange() {
        return rateExchange;
    }

    /**
     * Sets the value of the rateExchange property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setRateExchange(BigDecimal value) {
        this.rateExchange = value;
    }

    /**
     * Gets the value of the routeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRouteCode() {
        return routeCode;
    }

    /**
     * Sets the value of the routeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRouteCode(String value) {
        this.routeCode = value;
    }

    /**
     * Gets the value of the statusCodeDuty property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusCodeDuty() {
        return statusCodeDuty;
    }

    /**
     * Sets the value of the statusCodeDuty property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusCodeDuty(String value) {
        this.statusCodeDuty = value;
    }

    /**
     * Gets the value of the stopCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStopCode() {
        return stopCode;
    }

    /**
     * Sets the value of the stopCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStopCode(String value) {
        this.stopCode = value;
    }

    /**
     * Gets the value of the transactionQuantity property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTransactionQuantity() {
        return transactionQuantity;
    }

    /**
     * Sets the value of the transactionQuantity property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTransactionQuantity(BigDecimal value) {
        this.transactionQuantity = value;
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

    /**
     * Gets the value of the zoneNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZoneNumber() {
        return zoneNumber;
    }

    /**
     * Sets the value of the zoneNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZoneNumber(String value) {
        this.zoneNumber = value;
    }

}
