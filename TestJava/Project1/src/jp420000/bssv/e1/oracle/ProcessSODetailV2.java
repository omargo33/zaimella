
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for processSODetailV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="processSODetailV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agreementSupplement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="billing" type="{http://oracle.e1.bssv.JP420000/}processSODetailBillingV2" minOccurs="0"/&gt;
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessUnitDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="categoryCodesPurchasing" type="{http://oracle.e1.bssv.JP420000/}categoryCodesPurchasing" minOccurs="0"/&gt;
 *         &lt;element name="categoryCodesSales" type="{http://oracle.e1.bssv.JP420000/}categoryCodesSales" minOccurs="0"/&gt;
 *         &lt;element name="customerPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateCancel" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datePromisedDelivery" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datePromisedOriginal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datePromisedShip" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateRequested" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateScheduledPick" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="documentLineNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="dutyStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endUseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lineOfBusinessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lineTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originalOrder" type="{http://oracle.e1.bssv.JP420000/}processSOOriginalOrder" minOccurs="0"/&gt;
 *         &lt;element name="priorityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processing" type="{http://oracle.e1.bssv.JP420000/}processSODetailProcessing" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://oracle.e1.bssv.JP420000/}processSODetailProduct" minOccurs="0"/&gt;
 *         &lt;element name="quantityBackOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityCanceled" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityShippable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relatedOrder" type="{http://oracle.e1.bssv.JP420000/}relatedOrder" minOccurs="0"/&gt;
 *         &lt;element name="shipTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="statusCodeLast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusCodeNext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supplier" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
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
@XmlType(name = "processSODetailV2",
         propOrder =
         { "agreementId", "agreementSupplement", "billing", "businessUnit", "businessUnitDestination",
           "categoryCodesPurchasing", "categoryCodesSales", "customerPO", "dateCancel", "datePromisedDelivery",
           "datePromisedOriginal", "datePromisedShip", "dateRequested", "dateScheduledPick", "documentLineNumber",
           "dutyStatusCode", "endUseCode", "lineOfBusinessCode", "lineTypeCode", "originalOrder", "priorityCode",
           "processing", "product", "quantityBackOrdered", "quantityCanceled", "quantityOrdered", "quantityShippable",
           "reference", "relatedOrder", "shipTo", "statusCodeLast", "statusCodeNext", "supplier",
           "timePromisedDelivery", "timePromisedOriginal", "timePromisedShip", "timeRequested", "timeScheduledPick",
           "unitOfMeasureCodeTransaction", "userReservedData"
    })
public class ProcessSODetailV2 extends ValueObject {

    protected String agreementId;
    protected Integer agreementSupplement;
    protected ProcessSODetailBillingV2 billing;
    protected String businessUnit;
    protected String businessUnitDestination;
    protected CategoryCodesPurchasing categoryCodesPurchasing;
    protected CategoryCodesSales categoryCodesSales;
    protected String customerPO;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCancel;
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
    protected BigDecimal documentLineNumber;
    protected String dutyStatusCode;
    protected String endUseCode;
    protected String lineOfBusinessCode;
    protected String lineTypeCode;
    protected ProcessSOOriginalOrder originalOrder;
    protected String priorityCode;
    protected ProcessSODetailProcessing processing;
    protected ProcessSODetailProduct product;
    protected BigDecimal quantityBackOrdered;
    protected BigDecimal quantityCanceled;
    protected BigDecimal quantityOrdered;
    protected BigDecimal quantityShippable;
    protected String reference;
    protected RelatedOrder relatedOrder;
    protected Entity shipTo;
    protected String statusCodeLast;
    protected String statusCodeNext;
    protected Entity supplier;
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
     * Gets the value of the billing property.
     *
     * @return
     *     possible object is
     *     {@link ProcessSODetailBillingV2 }
     *
     */
    public ProcessSODetailBillingV2 getBilling() {
        return billing;
    }

    /**
     * Sets the value of the billing property.
     *
     * @param value
     *     allowed object is
     *     {@link ProcessSODetailBillingV2 }
     *
     */
    public void setBilling(ProcessSODetailBillingV2 value) {
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
     * Gets the value of the businessUnitDestination property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBusinessUnitDestination() {
        return businessUnitDestination;
    }

    /**
     * Sets the value of the businessUnitDestination property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBusinessUnitDestination(String value) {
        this.businessUnitDestination = value;
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
     *     {@link ProcessSOOriginalOrder }
     *
     */
    public ProcessSOOriginalOrder getOriginalOrder() {
        return originalOrder;
    }

    /**
     * Sets the value of the originalOrder property.
     *
     * @param value
     *     allowed object is
     *     {@link ProcessSOOriginalOrder }
     *
     */
    public void setOriginalOrder(ProcessSOOriginalOrder value) {
        this.originalOrder = value;
    }

    /**
     * Gets the value of the priorityCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPriorityCode() {
        return priorityCode;
    }

    /**
     * Sets the value of the priorityCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPriorityCode(String value) {
        this.priorityCode = value;
    }

    /**
     * Gets the value of the processing property.
     *
     * @return
     *     possible object is
     *     {@link ProcessSODetailProcessing }
     *
     */
    public ProcessSODetailProcessing getProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     *
     * @param value
     *     allowed object is
     *     {@link ProcessSODetailProcessing }
     *
     */
    public void setProcessing(ProcessSODetailProcessing value) {
        this.processing = value;
    }

    /**
     * Gets the value of the product property.
     *
     * @return
     *     possible object is
     *     {@link ProcessSODetailProduct }
     *
     */
    public ProcessSODetailProduct getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value
     *     allowed object is
     *     {@link ProcessSODetailProduct }
     *
     */
    public void setProduct(ProcessSODetailProduct value) {
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
     * Gets the value of the supplier property.
     *
     * @return
     *     possible object is
     *     {@link Entity }
     *
     */
    public Entity getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setSupplier(Entity value) {
        this.supplier = value;
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
