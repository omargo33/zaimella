
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for showSalesDetail complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="showSalesDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agreementSupplement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="categoryCodesPurchasing" type="{http://oracle.e1.bssv.JP420000/}categoryCodesPurchasing" minOccurs="0"/&gt;
 *         &lt;element name="categoryCodesSales" type="{http://oracle.e1.bssv.JP420000/}categoryCodesSales" minOccurs="0"/&gt;
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costExtendedDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="costExtendedForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="costUnitPurchasingDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="costUnitPurchasingForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="currencyCodeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateAccounting" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateActualShip" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateCancel" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateInvoice" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateOrdered" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datePromisedDelivery" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datePromisedOriginal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datePromisedShip" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateRequested" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateScheduledPick" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deliverTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="deliveryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="document" type="{http://oracle.e1.bssv.JP420000/}document" minOccurs="0"/&gt;
 *         &lt;element name="documentLineNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="dutyStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endUseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entityIdSupplier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lineBilling" type="{http://oracle.e1.bssv.JP420000/}showSalesDetailLineBilling" minOccurs="0"/&gt;
 *         &lt;element name="lineOfBusinessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lineTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originalOrder" type="{http://oracle.e1.bssv.JP420000/}showSalesDetailOriginalOrder" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="pickSlipId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://oracle.e1.bssv.JP420000/}showSalesDetailProduct" minOccurs="0"/&gt;
 *         &lt;element name="quantityBackOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityCanceled" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityShippable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="rateExchangeOverride" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relatedOrder" type="{http://oracle.e1.bssv.JP420000/}relatedOrder" minOccurs="0"/&gt;
 *         &lt;element name="shipTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="shipmentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="soldTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="statusCodeLast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusCodeNext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timePromisedDelivery" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="timePromisedOriginal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="timePromisedShip" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="timeRequested" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="timeScheduledPick" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureCodeTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "showSalesDetail",
         propOrder =
         { "agreementId", "agreementSupplement", "businessUnit", "categoryCodesPurchasing", "categoryCodesSales",
           "company", "costExtendedDomestic", "costExtendedForeign", "costUnitPurchasingDomestic",
           "costUnitPurchasingForeign", "currencyCodeFrom", "customerPO", "dateAccounting", "dateActualShip",
           "dateCancel", "dateInvoice", "dateOrdered", "datePromisedDelivery", "datePromisedOriginal",
           "datePromisedShip", "dateRequested", "dateScheduledPick", "deliverTo", "deliveryId", "document",
           "documentLineNumber", "dutyStatusCode", "endUseCode", "entityIdSupplier", "lineBilling",
           "lineOfBusinessCode", "lineTypeCode", "originalOrder", "parent", "pickSlipId", "product",
           "quantityBackOrdered", "quantityCanceled", "quantityOrdered", "quantityShippable", "rateExchangeOverride",
           "reference", "relatedOrder", "shipTo", "shipmentId", "soldTo", "statusCodeLast", "statusCodeNext",
           "timePromisedDelivery", "timePromisedOriginal", "timePromisedShip", "timeRequested", "timeScheduledPick",
           "unitOfMeasureCodeTransaction", "userReservedData"
    })
public class ShowSalesDetail extends ValueObject {

    protected String agreementId;
    protected Integer agreementSupplement;
    protected String businessUnit;
    protected CategoryCodesPurchasing categoryCodesPurchasing;
    protected CategoryCodesSales categoryCodesSales;
    protected String company;
    protected BigDecimal costExtendedDomestic;
    protected BigDecimal costExtendedForeign;
    protected BigDecimal costUnitPurchasingDomestic;
    protected BigDecimal costUnitPurchasingForeign;
    protected String currencyCodeFrom;
    protected String customerPO;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAccounting;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateActualShip;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCancel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateInvoice;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOrdered;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePromisedDelivery;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePromisedOriginal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePromisedShip;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRequested;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateScheduledPick;
    protected Entity deliverTo;
    protected Integer deliveryId;
    protected Document document;
    protected BigDecimal documentLineNumber;
    protected String dutyStatusCode;
    protected String endUseCode;
    protected Integer entityIdSupplier;
    protected ShowSalesDetailLineBilling lineBilling;
    protected String lineOfBusinessCode;
    protected String lineTypeCode;
    protected ShowSalesDetailOriginalOrder originalOrder;
    protected Entity parent;
    protected Integer pickSlipId;
    protected ShowSalesDetailProduct product;
    protected BigDecimal quantityBackOrdered;
    protected BigDecimal quantityCanceled;
    protected BigDecimal quantityOrdered;
    protected BigDecimal quantityShippable;
    protected BigDecimal rateExchangeOverride;
    protected String reference;
    protected RelatedOrder relatedOrder;
    protected Entity shipTo;
    protected Integer shipmentId;
    protected Entity soldTo;
    protected String statusCodeLast;
    protected String statusCodeNext;
    protected Integer timePromisedDelivery;
    protected Integer timePromisedOriginal;
    protected Integer timePromisedShip;
    protected Integer timeRequested;
    protected Integer timeScheduledPick;
    protected String unitOfMeasureCodeTransaction;
    protected UserReservedData userReservedData;

    /**
     * Gets the value of the agreementId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAgreementId() {
        return agreementId;
    }

    /**
     * Sets the value of the agreementId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAgreementId(String value) {
        this.agreementId = value;
    }

    /**
     * Gets the value of the agreementSupplement property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getAgreementSupplement() {
        return agreementSupplement;
    }

    /**
     * Sets the value of the agreementSupplement property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setAgreementSupplement(Integer value) {
        this.agreementSupplement = value;
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
     * Gets the value of the categoryCodesPurchasing property.
     *
     * @return
     *     possible object is
     *     {@link CategoryCodesPurchasing }
     *
     */
    public CategoryCodesPurchasing getCategoryCodesPurchasing() {
        return categoryCodesPurchasing;
    }

    /**
     * Sets the value of the categoryCodesPurchasing property.
     *
     * @param value
     *     allowed object is
     *     {@link CategoryCodesPurchasing }
     *
     */
    public void setCategoryCodesPurchasing(CategoryCodesPurchasing value) {
        this.categoryCodesPurchasing = value;
    }

    /**
     * Gets the value of the categoryCodesSales property.
     *
     * @return
     *     possible object is
     *     {@link CategoryCodesSales }
     *
     */
    public CategoryCodesSales getCategoryCodesSales() {
        return categoryCodesSales;
    }

    /**
     * Sets the value of the categoryCodesSales property.
     *
     * @param value
     *     allowed object is
     *     {@link CategoryCodesSales }
     *
     */
    public void setCategoryCodesSales(CategoryCodesSales value) {
        this.categoryCodesSales = value;
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
     * Gets the value of the costUnitPurchasingDomestic property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCostUnitPurchasingDomestic() {
        return costUnitPurchasingDomestic;
    }

    /**
     * Sets the value of the costUnitPurchasingDomestic property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCostUnitPurchasingDomestic(BigDecimal value) {
        this.costUnitPurchasingDomestic = value;
    }

    /**
     * Gets the value of the costUnitPurchasingForeign property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCostUnitPurchasingForeign() {
        return costUnitPurchasingForeign;
    }

    /**
     * Sets the value of the costUnitPurchasingForeign property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCostUnitPurchasingForeign(BigDecimal value) {
        this.costUnitPurchasingForeign = value;
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
     * Gets the value of the dateAccounting property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateAccounting() {
        return dateAccounting;
    }

    /**
     * Sets the value of the dateAccounting property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateAccounting(XMLGregorianCalendar value) {
        this.dateAccounting = value;
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
     * Gets the value of the dateInvoice property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDateInvoice() {
        return dateInvoice;
    }

    /**
     * Sets the value of the dateInvoice property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDateInvoice(XMLGregorianCalendar value) {
        this.dateInvoice = value;
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
     * Gets the value of the datePromisedDelivery property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDatePromisedDelivery() {
        return datePromisedDelivery;
    }

    /**
     * Sets the value of the datePromisedDelivery property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDatePromisedDelivery(XMLGregorianCalendar value) {
        this.datePromisedDelivery = value;
    }

    /**
     * Gets the value of the datePromisedOriginal property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDatePromisedOriginal() {
        return datePromisedOriginal;
    }

    /**
     * Sets the value of the datePromisedOriginal property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDatePromisedOriginal(XMLGregorianCalendar value) {
        this.datePromisedOriginal = value;
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
     * Gets the value of the deliveryId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getDeliveryId() {
        return deliveryId;
    }

    /**
     * Sets the value of the deliveryId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setDeliveryId(Integer value) {
        this.deliveryId = value;
    }

    /**
     * Gets the value of the document property.
     *
     * @return
     *     possible object is
     *     {@link Document }
     *
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     *
     * @param value
     *     allowed object is
     *     {@link Document }
     *
     */
    public void setDocument(Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the documentLineNumber property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDocumentLineNumber() {
        return documentLineNumber;
    }

    /**
     * Sets the value of the documentLineNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDocumentLineNumber(BigDecimal value) {
        this.documentLineNumber = value;
    }

    /**
     * Gets the value of the dutyStatusCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDutyStatusCode() {
        return dutyStatusCode;
    }

    /**
     * Sets the value of the dutyStatusCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDutyStatusCode(String value) {
        this.dutyStatusCode = value;
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
     * Gets the value of the entityIdSupplier property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getEntityIdSupplier() {
        return entityIdSupplier;
    }

    /**
     * Sets the value of the entityIdSupplier property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setEntityIdSupplier(Integer value) {
        this.entityIdSupplier = value;
    }

    /**
     * Gets the value of the lineBilling property.
     *
     * @return
     *     possible object is
     *     {@link ShowSalesDetailLineBilling }
     *
     */
    public ShowSalesDetailLineBilling getLineBilling() {
        return lineBilling;
    }

    /**
     * Sets the value of the lineBilling property.
     *
     * @param value
     *     allowed object is
     *     {@link ShowSalesDetailLineBilling }
     *
     */
    public void setLineBilling(ShowSalesDetailLineBilling value) {
        this.lineBilling = value;
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
     * Gets the value of the lineTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLineTypeCode() {
        return lineTypeCode;
    }

    /**
     * Sets the value of the lineTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLineTypeCode(String value) {
        this.lineTypeCode = value;
    }

    /**
     * Gets the value of the originalOrder property.
     *
     * @return
     *     possible object is
     *     {@link ShowSalesDetailOriginalOrder }
     *
     */
    public ShowSalesDetailOriginalOrder getOriginalOrder() {
        return originalOrder;
    }

    /**
     * Sets the value of the originalOrder property.
     *
     * @param value
     *     allowed object is
     *     {@link ShowSalesDetailOriginalOrder }
     *
     */
    public void setOriginalOrder(ShowSalesDetailOriginalOrder value) {
        this.originalOrder = value;
    }

    /**
     * Gets the value of the parent property.
     *
     * @return
     *     possible object is
     *     {@link Entity }
     *
     */
    public Entity getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setParent(Entity value) {
        this.parent = value;
    }

    /**
     * Gets the value of the pickSlipId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPickSlipId() {
        return pickSlipId;
    }

    /**
     * Sets the value of the pickSlipId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPickSlipId(Integer value) {
        this.pickSlipId = value;
    }

    /**
     * Gets the value of the product property.
     *
     * @return
     *     possible object is
     *     {@link ShowSalesDetailProduct }
     *
     */
    public ShowSalesDetailProduct getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value
     *     allowed object is
     *     {@link ShowSalesDetailProduct }
     *
     */
    public void setProduct(ShowSalesDetailProduct value) {
        this.product = value;
    }

    /**
     * Gets the value of the quantityBackOrdered property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getQuantityBackOrdered() {
        return quantityBackOrdered;
    }

    /**
     * Sets the value of the quantityBackOrdered property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setQuantityBackOrdered(BigDecimal value) {
        this.quantityBackOrdered = value;
    }

    /**
     * Gets the value of the quantityCanceled property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getQuantityCanceled() {
        return quantityCanceled;
    }

    /**
     * Sets the value of the quantityCanceled property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setQuantityCanceled(BigDecimal value) {
        this.quantityCanceled = value;
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
     * Gets the value of the quantityShippable property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getQuantityShippable() {
        return quantityShippable;
    }

    /**
     * Sets the value of the quantityShippable property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setQuantityShippable(BigDecimal value) {
        this.quantityShippable = value;
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
     * Gets the value of the reference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the relatedOrder property.
     *
     * @return
     *     possible object is
     *     {@link RelatedOrder }
     *
     */
    public RelatedOrder getRelatedOrder() {
        return relatedOrder;
    }

    /**
     * Sets the value of the relatedOrder property.
     *
     * @param value
     *     allowed object is
     *     {@link RelatedOrder }
     *
     */
    public void setRelatedOrder(RelatedOrder value) {
        this.relatedOrder = value;
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
     * Gets the value of the shipmentId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getShipmentId() {
        return shipmentId;
    }

    /**
     * Sets the value of the shipmentId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setShipmentId(Integer value) {
        this.shipmentId = value;
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
     * Gets the value of the statusCodeLast property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusCodeLast() {
        return statusCodeLast;
    }

    /**
     * Sets the value of the statusCodeLast property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusCodeLast(String value) {
        this.statusCodeLast = value;
    }

    /**
     * Gets the value of the statusCodeNext property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusCodeNext() {
        return statusCodeNext;
    }

    /**
     * Sets the value of the statusCodeNext property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusCodeNext(String value) {
        this.statusCodeNext = value;
    }

    /**
     * Gets the value of the timePromisedDelivery property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTimePromisedDelivery() {
        return timePromisedDelivery;
    }

    /**
     * Sets the value of the timePromisedDelivery property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTimePromisedDelivery(Integer value) {
        this.timePromisedDelivery = value;
    }

    /**
     * Gets the value of the timePromisedOriginal property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTimePromisedOriginal() {
        return timePromisedOriginal;
    }

    /**
     * Sets the value of the timePromisedOriginal property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTimePromisedOriginal(Integer value) {
        this.timePromisedOriginal = value;
    }

    /**
     * Gets the value of the timePromisedShip property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTimePromisedShip() {
        return timePromisedShip;
    }

    /**
     * Sets the value of the timePromisedShip property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTimePromisedShip(Integer value) {
        this.timePromisedShip = value;
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
