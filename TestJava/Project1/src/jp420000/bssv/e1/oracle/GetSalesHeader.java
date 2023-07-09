
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getSalesHeader complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getSalesHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amountTotalOrderDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="amountTotalOrderForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCodeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateActualShip" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateCancel" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datePromisedPick" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateRequested" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateTransaction" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deliverTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="detail" type="{http://oracle.e1.bssv.JP420000/}getSalesDetail" minOccurs="0"/&gt;
 *         &lt;element name="forwardedTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="holdOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoicedTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="orderTakenBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originalOrder" type="{http://oracle.e1.bssv.JP420000/}originalOrder" minOccurs="0"/&gt;
 *         &lt;element name="paidBy" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="RMAId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RMAType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rateExchangeOverride" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="salesOrderKey" type="{http://oracle.e1.bssv.JP420000/}salesOrderKey" minOccurs="0"/&gt;
 *         &lt;element name="shipTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="soldTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSalesHeader",
         propOrder =
         { "amountTotalOrderDomestic", "amountTotalOrderForeign", "businessUnit", "company", "currencyCodeFrom",
           "customerPO", "dateActualShip", "dateCancel", "datePromisedPick", "dateRequested", "dateTransaction",
           "deliverTo", "detail", "forwardedTo", "holdOrderCode", "invoicedTo", "orderTakenBy", "originalOrder",
           "paidBy", "rmaId", "rmaType", "rateExchangeOverride", "salesOrderKey", "shipTo", "soldTo"
    })
public class GetSalesHeader extends ValueObject {

    protected BigDecimal amountTotalOrderDomestic;
    protected BigDecimal amountTotalOrderForeign;
    protected String businessUnit;
    protected String company;
    protected String currencyCodeFrom;
    protected String customerPO;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateActualShip;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCancel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePromisedPick;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRequested;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTransaction;
    protected Entity deliverTo;
    protected GetSalesDetail detail;
    protected Entity forwardedTo;
    protected String holdOrderCode;
    protected Entity invoicedTo;
    protected String orderTakenBy;
    protected OriginalOrder originalOrder;
    protected Entity paidBy;
    @XmlElement(name = "RMAId")
    protected Integer rmaId;
    @XmlElement(name = "RMAType")
    protected String rmaType;
    protected BigDecimal rateExchangeOverride;
    protected SalesOrderKey salesOrderKey;
    protected Entity shipTo;
    protected Entity soldTo;

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
     * Gets the value of the datePromisedPick property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDatePromisedPick() {
        return datePromisedPick;
    }

    /**
     * Sets the value of the datePromisedPick property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDatePromisedPick(XMLGregorianCalendar value) {
        this.datePromisedPick = value;
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
     * Gets the value of the detail property.
     *
     * @return
     *     possible object is
     *     {@link GetSalesDetail }
     *
     */
    public GetSalesDetail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     *
     * @param value
     *     allowed object is
     *     {@link GetSalesDetail }
     *
     */
    public void setDetail(GetSalesDetail value) {
        this.detail = value;
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

}
