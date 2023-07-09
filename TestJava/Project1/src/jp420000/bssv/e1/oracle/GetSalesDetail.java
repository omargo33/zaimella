
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getSalesDetail complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getSalesDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carrier" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="categoryCodesPurchasing" type="{http://oracle.e1.bssv.JP420000/}categoryCodesPurchasing" minOccurs="0"/&gt;
 *         &lt;element name="categoryCodesSales" type="{http://oracle.e1.bssv.JP420000/}categoryCodesSales" minOccurs="0"/&gt;
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCodeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateAccounting" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateActualShip" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateCancel" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateInvoice" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datePriceEffective" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datePromisedDelivery" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datePromisedOriginal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateRequested" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateScheduledPick" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateTransaction" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deliverTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="deliveryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="description1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="document" type="{http://oracle.e1.bssv.JP420000/}document" minOccurs="0"/&gt;
 *         &lt;element name="documentLineNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="freightHandlingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modeOfTransportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originalOrder" type="{http://oracle.e1.bssv.JP420000/}originalOrder" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="pickSlipId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="priceUnitDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceUnitForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://oracle.e1.bssv.JP420000/}getDetailProduct" minOccurs="0"/&gt;
 *         &lt;element name="quantityBackOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityCanceled" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityShippable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="rateExchangeOverride" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="relatedOrder" type="{http://oracle.e1.bssv.JP420000/}relatedOrder" minOccurs="0"/&gt;
 *         &lt;element name="shipTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="shipmentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="soldTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureCodePricing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureCodeTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSalesDetail",
         propOrder =
         { "agreementId", "businessUnit", "carrier", "categoryCodesPurchasing", "categoryCodesSales", "company",
           "currencyCodeFrom", "customerPO", "dateAccounting", "dateActualShip", "dateCancel", "dateInvoice",
           "datePriceEffective", "datePromisedDelivery", "datePromisedOriginal", "dateRequested", "dateScheduledPick",
           "dateTransaction", "deliverTo", "deliveryId", "description1", "description2", "document",
           "documentLineNumber", "freightHandlingCode", "modeOfTransportCode", "originalOrder", "parent", "pickSlipId",
           "priceUnitDomestic", "priceUnitForeign", "product", "quantityBackOrdered", "quantityCanceled",
           "quantityOrdered", "quantityShippable", "rateExchangeOverride", "relatedOrder", "shipTo", "shipmentId",
           "soldTo", "unitOfMeasureCodePricing", "unitOfMeasureCodeTransaction"
    })
public class GetSalesDetail extends ValueObject {

    protected String agreementId;
    protected String businessUnit;
    protected Entity carrier;
    protected CategoryCodesPurchasing categoryCodesPurchasing;
    protected CategoryCodesSales categoryCodesSales;
    protected String company;
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
    protected XMLGregorianCalendar datePriceEffective;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePromisedDelivery;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePromisedOriginal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRequested;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateScheduledPick;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTransaction;
    protected Entity deliverTo;
    protected Integer deliveryId;
    protected String description1;
    protected String description2;
    protected Document document;
    protected BigDecimal documentLineNumber;
    protected String freightHandlingCode;
    protected String modeOfTransportCode;
    protected OriginalOrder originalOrder;
    protected Entity parent;
    protected Integer pickSlipId;
    protected BigDecimal priceUnitDomestic;
    protected BigDecimal priceUnitForeign;
    protected GetDetailProduct product;
    protected BigDecimal quantityBackOrdered;
    protected BigDecimal quantityCanceled;
    protected BigDecimal quantityOrdered;
    protected BigDecimal quantityShippable;
    protected BigDecimal rateExchangeOverride;
    protected RelatedOrder relatedOrder;
    protected Entity shipTo;
    protected Integer shipmentId;
    protected Entity soldTo;
    protected String unitOfMeasureCodePricing;
    protected String unitOfMeasureCodeTransaction;

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
     * Gets the value of the description1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription1() {
        return description1;
    }

    /**
     * Sets the value of the description1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription1(String value) {
        this.description1 = value;
    }

    /**
     * Gets the value of the description2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription2() {
        return description2;
    }

    /**
     * Sets the value of the description2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription2(String value) {
        this.description2 = value;
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
     * Gets the value of the product property.
     *
     * @return
     *     possible object is
     *     {@link GetDetailProduct }
     *
     */
    public GetDetailProduct getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value
     *     allowed object is
     *     {@link GetDetailProduct }
     *
     */
    public void setProduct(GetDetailProduct value) {
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

}
