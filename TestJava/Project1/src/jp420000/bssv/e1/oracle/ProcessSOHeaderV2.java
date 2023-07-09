
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
 * <p>Java class for processSOHeaderV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="processSOHeaderV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachmentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billing" type="{http://oracle.e1.bssv.JP420000/}processSOHeaderBillingV2" minOccurs="0"/&gt;
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCodeTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateCancel" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateOrdered" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateRequested" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateScheduledPick" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deliverTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="detail" type="{http://oracle.e1.bssv.JP420000/}processSODetailV2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="forwardedTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="holdOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoicedTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="orderTakenBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paidBy" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="processing" type="{http://oracle.e1.bssv.JP420000/}processSOHeaderProcessing" minOccurs="0"/&gt;
 *         &lt;element name="rateExchange" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="salesOrderKey" type="{http://oracle.e1.bssv.JP420000/}salesOrderKey" minOccurs="0"/&gt;
 *         &lt;element name="shipTo" type="{http://oracle.e1.bssv.JP420000/}processSOCustomer" minOccurs="0"/&gt;
 *         &lt;element name="soldTo" type="{http://oracle.e1.bssv.JP420000/}processSOCustomer" minOccurs="0"/&gt;
 *         &lt;element name="timeRequested" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="timeScheduledPick" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="userReservedData" type="{http://oracle.e1.bssv.JP420000/}userReservedData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processSOHeaderV2",
         propOrder =
         { "attachmentText", "billing", "businessUnit", "company", "currencyCodeTo", "customerPO", "dateCancel",
           "dateOrdered", "dateRequested", "dateScheduledPick", "deliverTo", "detail", "forwardedTo", "holdOrderCode",
           "invoicedTo", "orderTakenBy", "orderedBy", "paidBy", "processing", "rateExchange", "salesOrderKey", "shipTo",
           "soldTo", "timeRequested", "timeScheduledPick", "userReservedData"
    })
public class ProcessSOHeaderV2 extends ValueObject {

    protected String attachmentText;
    protected ProcessSOHeaderBillingV2 billing;
    protected String businessUnit;
    protected String company;
    protected String currencyCodeTo;
    protected String customerPO;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCancel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOrdered;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRequested;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateScheduledPick;
    protected Entity deliverTo;
    @XmlElement(nillable = true)
    protected List<ProcessSODetailV2> detail;
    protected Entity forwardedTo;
    protected String holdOrderCode;
    protected Entity invoicedTo;
    protected String orderTakenBy;
    protected String orderedBy;
    protected Entity paidBy;
    protected ProcessSOHeaderProcessing processing;
    protected BigDecimal rateExchange;
    protected SalesOrderKey salesOrderKey;
    protected ProcessSOCustomer shipTo;
    protected ProcessSOCustomer soldTo;
    protected Integer timeRequested;
    protected Integer timeScheduledPick;
    protected UserReservedData userReservedData;

    /**
     * Gets the value of the attachmentText property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttachmentText() {
        return attachmentText;
    }

    /**
     * Sets the value of the attachmentText property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttachmentText(String value) {
        this.attachmentText = value;
    }

    /**
     * Gets the value of the billing property.
     *
     * @return
     *     possible object is
     *     {@link ProcessSOHeaderBillingV2 }
     *
     */
    public ProcessSOHeaderBillingV2 getBilling() {
        return billing;
    }

    /**
     * Sets the value of the billing property.
     *
     * @param value
     *     allowed object is
     *     {@link ProcessSOHeaderBillingV2 }
     *
     */
    public void setBilling(ProcessSOHeaderBillingV2 value) {
        this.billing = value;
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
     * Gets the value of the currencyCodeTo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrencyCodeTo() {
        return currencyCodeTo;
    }

    /**
     * Sets the value of the currencyCodeTo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrencyCodeTo(String value) {
        this.currencyCodeTo = value;
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
     * Gets the value of the dateOrdered property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateOrdered() {
        return dateOrdered;
    }

    /**
     * Sets the value of the dateOrdered property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateOrdered(XMLGregorianCalendar value) {
        this.dateOrdered = value;
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
     * {@link ProcessSODetailV2 }
     *
     *
     */
    public List<ProcessSODetailV2> getDetail() {
        if (detail == null) {
            detail = new ArrayList<ProcessSODetailV2>();
        }
        return this.detail;
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
     * Gets the value of the processing property.
     *
     * @return
     *     possible object is
     *     {@link ProcessSOHeaderProcessing }
     *
     */
    public ProcessSOHeaderProcessing getProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     *
     * @param value
     *     allowed object is
     *     {@link ProcessSOHeaderProcessing }
     *
     */
    public void setProcessing(ProcessSOHeaderProcessing value) {
        this.processing = value;
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
     *     {@link ProcessSOCustomer }
     *
     */
    public ProcessSOCustomer getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     *
     * @param value
     *     allowed object is
     *     {@link ProcessSOCustomer }
     *
     */
    public void setShipTo(ProcessSOCustomer value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the soldTo property.
     *
     * @return
     *     possible object is
     *     {@link ProcessSOCustomer }
     *
     */
    public ProcessSOCustomer getSoldTo() {
        return soldTo;
    }

    /**
     * Sets the value of the soldTo property.
     *
     * @param value
     *     allowed object is
     *     {@link ProcessSOCustomer }
     *
     */
    public void setSoldTo(ProcessSOCustomer value) {
        this.soldTo = value;
    }

    /**
     * Gets the value of the timeRequested property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTimeRequested() {
        return timeRequested;
    }

    /**
     * Sets the value of the timeRequested property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTimeRequested(Integer value) {
        this.timeRequested = value;
    }

    /**
     * Gets the value of the timeScheduledPick property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTimeScheduledPick() {
        return timeScheduledPick;
    }

    /**
     * Sets the value of the timeScheduledPick property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTimeScheduledPick(Integer value) {
        this.timeScheduledPick = value;
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

}
