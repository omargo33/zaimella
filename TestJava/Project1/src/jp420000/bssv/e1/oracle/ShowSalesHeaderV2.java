
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for showSalesHeaderV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="showSalesHeaderV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentScheduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountTotalOrderDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="amountTotalOrderForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCodeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyModeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerPriceGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateActualShip" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateCancel" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datePromisedShip" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateRequested" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateScheduledPick" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateTransaction" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deliverTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="deliveryInstruction1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deliveryInstruction2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detail" type="{http://oracle.e1.bssv.JP420000/}showSalesDetailV2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="entityIdCarrier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="forwardedTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="freightHandlingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="holdOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoicedTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="modeOfTransport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderTakenBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originalOrder" type="{http://oracle.e1.bssv.JP420000/}originalOrder" minOccurs="0"/&gt;
 *         &lt;element name="paidBy" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="paymentInstrumentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentTermsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="percentDiscountTrade" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="printMessageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RMAId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RMAType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rateExchangeOverride" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="routeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesOrderKey" type="{http://oracle.e1.bssv.JP420000/}salesOrderKey" minOccurs="0"/&gt;
 *         &lt;element name="shipTo" type="{http://oracle.e1.bssv.JP420000/}showSalesShipTo" minOccurs="0"/&gt;
 *         &lt;element name="soldTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="stopCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxExplanationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxRateAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="useTaxedPrices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="userReservedData" type="{http://oracle.e1.bssv.JP420000/}userReservedData" minOccurs="0"/&gt;
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
@XmlType(name = "showSalesHeaderV2",
         propOrder =
         { "adjustmentScheduleCode", "amountTotalOrderDomestic", "amountTotalOrderForeign", "businessUnit", "company",
           "currencyCodeFrom", "currencyModeCode", "customerPO", "customerPriceGroupCode", "dateActualShip",
           "dateCancel", "datePromisedShip", "dateRequested", "dateScheduledPick", "dateTransaction", "deliverTo",
           "deliveryInstruction1", "deliveryInstruction2", "detail", "entityIdCarrier", "forwardedTo",
           "freightHandlingCode", "holdOrderCode", "invoicedTo", "modeOfTransport", "orderTakenBy", "orderedBy",
           "originalOrder", "paidBy", "paymentInstrumentCode", "paymentTermsCode", "percentDiscountTrade",
           "printMessageCode", "rmaId", "rmaType", "rateExchangeOverride", "reasonCode", "routeCode", "salesOrderKey",
           "shipTo", "soldTo", "stopCode", "taxExplanationCode", "taxRateAreaCode", "useTaxedPrices",
           "userReservedData", "zoneNumber"
    })
public class ShowSalesHeaderV2 extends ValueObject {

    protected String adjustmentScheduleCode;
    protected BigDecimal amountTotalOrderDomestic;
    protected BigDecimal amountTotalOrderForeign;
    protected String businessUnit;
    protected String company;
    protected String currencyCodeFrom;
    protected String currencyModeCode;
    protected String customerPO;
    protected String customerPriceGroupCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateActualShip;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCancel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePromisedShip;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRequested;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateScheduledPick;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTransaction;
    protected Entity deliverTo;
    protected String deliveryInstruction1;
    protected String deliveryInstruction2;
    @XmlElement(nillable = true)
    protected List<ShowSalesDetailV2> detail;
    protected Integer entityIdCarrier;
    protected Entity forwardedTo;
    protected String freightHandlingCode;
    protected String holdOrderCode;
    protected Entity invoicedTo;
    protected String modeOfTransport;
    protected String orderTakenBy;
    protected String orderedBy;
    protected OriginalOrder originalOrder;
    protected Entity paidBy;
    protected String paymentInstrumentCode;
    protected String paymentTermsCode;
    protected BigDecimal percentDiscountTrade;
    protected String printMessageCode;
    @XmlElement(name = "RMAId")
    protected Integer rmaId;
    @XmlElement(name = "RMAType")
    protected String rmaType;
    protected BigDecimal rateExchangeOverride;
    protected String reasonCode;
    protected String routeCode;
    protected SalesOrderKey salesOrderKey;
    protected ShowSalesShipTo shipTo;
    protected Entity soldTo;
    protected String stopCode;
    protected String taxExplanationCode;
    protected String taxRateAreaCode;
    protected Boolean useTaxedPrices;
    protected UserReservedData userReservedData;
    protected String zoneNumber;

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
     * Gets the value of the amountTotalOrderDomestic property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAmountTotalOrderDomestic() {
        return amountTotalOrderDomestic;
    }

    /**
     * Sets the value of the amountTotalOrderDomestic property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAmountTotalOrderDomestic(BigDecimal value) {
        this.amountTotalOrderDomestic = value;
    }

    /**
     * Gets the value of the amountTotalOrderForeign property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAmountTotalOrderForeign() {
        return amountTotalOrderForeign;
    }

    /**
     * Sets the value of the amountTotalOrderForeign property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAmountTotalOrderForeign(BigDecimal value) {
        this.amountTotalOrderForeign = value;
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
     * Gets the value of the company property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the currencyCodeFrom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrencyCodeFrom() {
        return currencyCodeFrom;
    }

    /**
     * Sets the value of the currencyCodeFrom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrencyCodeFrom(String value) {
        this.currencyCodeFrom = value;
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
     * Gets the value of the customerPO property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerPO() {
        return customerPO;
    }

    /**
     * Sets the value of the customerPO property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerPO(String value) {
        this.customerPO = value;
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
     * Gets the value of the dateActualShip property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateActualShip() {
        return dateActualShip;
    }

    /**
     * Sets the value of the dateActualShip property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateActualShip(XMLGregorianCalendar value) {
        this.dateActualShip = value;
    }

    /**
     * Gets the value of the dateCancel property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateCancel() {
        return dateCancel;
    }

    /**
     * Sets the value of the dateCancel property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateCancel(XMLGregorianCalendar value) {
        this.dateCancel = value;
    }

    /**
     * Gets the value of the datePromisedShip property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDatePromisedShip() {
        return datePromisedShip;
    }

    /**
     * Sets the value of the datePromisedShip property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDatePromisedShip(XMLGregorianCalendar value) {
        this.datePromisedShip = value;
    }

    /**
     * Gets the value of the dateRequested property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateRequested() {
        return dateRequested;
    }

    /**
     * Sets the value of the dateRequested property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateRequested(XMLGregorianCalendar value) {
        this.dateRequested = value;
    }

    /**
     * Gets the value of the dateScheduledPick property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateScheduledPick() {
        return dateScheduledPick;
    }

    /**
     * Sets the value of the dateScheduledPick property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateScheduledPick(XMLGregorianCalendar value) {
        this.dateScheduledPick = value;
    }

    /**
     * Gets the value of the dateTransaction property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateTransaction() {
        return dateTransaction;
    }

    /**
     * Sets the value of the dateTransaction property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateTransaction(XMLGregorianCalendar value) {
        this.dateTransaction = value;
    }

    /**
     * Gets the value of the deliverTo property.
     *
     * @return
     *     possible object is
     *     {@link Entity }
     *
     */
    public Entity getDeliverTo() {
        return deliverTo;
    }

    /**
     * Sets the value of the deliverTo property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setDeliverTo(Entity value) {
        this.deliverTo = value;
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
     * Gets the value of the detail property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShowSalesDetailV2 }
     *
     *
     */
    public List<ShowSalesDetailV2> getDetail() {
        if (detail == null) {
            detail = new ArrayList<ShowSalesDetailV2>();
        }
        return this.detail;
    }

    /**
     * Gets the value of the entityIdCarrier property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getEntityIdCarrier() {
        return entityIdCarrier;
    }

    /**
     * Sets the value of the entityIdCarrier property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setEntityIdCarrier(Integer value) {
        this.entityIdCarrier = value;
    }

    /**
     * Gets the value of the forwardedTo property.
     *
     * @return
     *     possible object is
     *     {@link Entity }
     *
     */
    public Entity getForwardedTo() {
        return forwardedTo;
    }

    /**
     * Sets the value of the forwardedTo property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setForwardedTo(Entity value) {
        this.forwardedTo = value;
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
     * Gets the value of the holdOrderCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHoldOrderCode() {
        return holdOrderCode;
    }

    /**
     * Sets the value of the holdOrderCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHoldOrderCode(String value) {
        this.holdOrderCode = value;
    }

    /**
     * Gets the value of the invoicedTo property.
     *
     * @return
     *     possible object is
     *     {@link Entity }
     *
     */
    public Entity getInvoicedTo() {
        return invoicedTo;
    }

    /**
     * Sets the value of the invoicedTo property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setInvoicedTo(Entity value) {
        this.invoicedTo = value;
    }

    /**
     * Gets the value of the modeOfTransport property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getModeOfTransport() {
        return modeOfTransport;
    }

    /**
     * Sets the value of the modeOfTransport property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setModeOfTransport(String value) {
        this.modeOfTransport = value;
    }

    /**
     * Gets the value of the orderTakenBy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrderTakenBy() {
        return orderTakenBy;
    }

    /**
     * Sets the value of the orderTakenBy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrderTakenBy(String value) {
        this.orderTakenBy = value;
    }

    /**
     * Gets the value of the orderedBy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrderedBy() {
        return orderedBy;
    }

    /**
     * Sets the value of the orderedBy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrderedBy(String value) {
        this.orderedBy = value;
    }

    /**
     * Gets the value of the originalOrder property.
     *
     * @return
     *     possible object is
     *     {@link OriginalOrder }
     *
     */
    public OriginalOrder getOriginalOrder() {
        return originalOrder;
    }

    /**
     * Sets the value of the originalOrder property.
     *
     * @param value
     *     allowed object is
     *     {@link OriginalOrder }
     *
     */
    public void setOriginalOrder(OriginalOrder value) {
        this.originalOrder = value;
    }

    /**
     * Gets the value of the paidBy property.
     *
     * @return
     *     possible object is
     *     {@link Entity }
     *
     */
    public Entity getPaidBy() {
        return paidBy;
    }

    /**
     * Sets the value of the paidBy property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setPaidBy(Entity value) {
        this.paidBy = value;
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
     * Gets the value of the rmaId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getRMAId() {
        return rmaId;
    }

    /**
     * Sets the value of the rmaId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setRMAId(Integer value) {
        this.rmaId = value;
    }

    /**
     * Gets the value of the rmaType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRMAType() {
        return rmaType;
    }

    /**
     * Sets the value of the rmaType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRMAType(String value) {
        this.rmaType = value;
    }

    /**
     * Gets the value of the rateExchangeOverride property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getRateExchangeOverride() {
        return rateExchangeOverride;
    }

    /**
     * Sets the value of the rateExchangeOverride property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setRateExchangeOverride(BigDecimal value) {
        this.rateExchangeOverride = value;
    }

    /**
     * Gets the value of the reasonCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
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
     * Gets the value of the salesOrderKey property.
     *
     * @return
     *     possible object is
     *     {@link SalesOrderKey }
     *
     */
    public SalesOrderKey getSalesOrderKey() {
        return salesOrderKey;
    }

    /**
     * Sets the value of the salesOrderKey property.
     *
     * @param value
     *     allowed object is
     *     {@link SalesOrderKey }
     *
     */
    public void setSalesOrderKey(SalesOrderKey value) {
        this.salesOrderKey = value;
    }

    /**
     * Gets the value of the shipTo property.
     *
     * @return
     *     possible object is
     *     {@link ShowSalesShipTo }
     *
     */
    public ShowSalesShipTo getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     *
     * @param value
     *     allowed object is
     *     {@link ShowSalesShipTo }
     *
     */
    public void setShipTo(ShowSalesShipTo value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the soldTo property.
     *
     * @return
     *     possible object is
     *     {@link Entity }
     *
     */
    public Entity getSoldTo() {
        return soldTo;
    }

    /**
     * Sets the value of the soldTo property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setSoldTo(Entity value) {
        this.soldTo = value;
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

    /**
     * Gets the value of the userReservedData property.
     *
     * @return
     *     possible object is
     *     {@link UserReservedData }
     *
     */
    public UserReservedData getUserReservedData() {
        return userReservedData;
    }

    /**
     * Sets the value of the userReservedData property.
     *
     * @param value
     *     allowed object is
     *     {@link UserReservedData }
     *
     */
    public void setUserReservedData(UserReservedData value) {
        this.userReservedData = value;
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
