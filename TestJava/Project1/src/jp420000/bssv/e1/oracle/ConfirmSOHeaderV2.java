
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for confirmSOHeaderV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="confirmSOHeaderV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountTotalOrderDomestic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="amountTotalOrderForeign" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="attachmentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dates" type="{http://oracle.e1.bssv.JP420000/}confirmSOHeaderDates" minOccurs="0"/&gt;
 *         &lt;element name="delivery" type="{http://oracle.e1.bssv.JP420000/}confirmSOHeaderDelivery" minOccurs="0"/&gt;
 *         &lt;element name="detail" type="{http://oracle.e1.bssv.JP420000/}confirmSODetailV2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="financial" type="{http://oracle.e1.bssv.JP420000/}confirmSOHeaderFinancial" minOccurs="0"/&gt;
 *         &lt;element name="holdOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesOrderKey" type="{http://oracle.e1.bssv.JP420000/}salesOrderKey" minOccurs="0"/&gt;
 *         &lt;element name="shipTo" type="{http://oracle.e1.bssv.JP420000/}processSOCustomer" minOccurs="0"/&gt;
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
@XmlType(name = "confirmSOHeaderV2",
         propOrder =
         { "actionType", "amountTotalOrderDomestic", "amountTotalOrderForeign", "attachmentText", "businessUnit",
           "customerPO", "dates", "delivery", "detail", "financial", "holdOrderCode", "salesOrderKey", "shipTo",
           "useTaxedPrices"
    })
public class ConfirmSOHeaderV2 extends ValueObject {

    protected String actionType;
    protected BigDecimal amountTotalOrderDomestic;
    protected BigDecimal amountTotalOrderForeign;
    protected String attachmentText;
    protected String businessUnit;
    protected String customerPO;
    protected ConfirmSOHeaderDates dates;
    protected ConfirmSOHeaderDelivery delivery;
    @XmlElement(nillable = true)
    protected List<ConfirmSODetailV2> detail;
    protected ConfirmSOHeaderFinancial financial;
    protected String holdOrderCode;
    protected SalesOrderKey salesOrderKey;
    protected ProcessSOCustomer shipTo;
    protected Boolean useTaxedPrices;

    /**
     * Gets the value of the actionType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActionType(String value) {
        this.actionType = value;
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
     * Gets the value of the dates property.
     *
     * @return
     *     possible object is
     *     {@link ConfirmSOHeaderDates }
     *
     */
    public ConfirmSOHeaderDates getDates() {
        return dates;
    }

    /**
     * Sets the value of the dates property.
     *
     * @param value
     *     allowed object is
     *     {@link ConfirmSOHeaderDates }
     *
     */
    public void setDates(ConfirmSOHeaderDates value) {
        this.dates = value;
    }

    /**
     * Gets the value of the delivery property.
     *
     * @return
     *     possible object is
     *     {@link ConfirmSOHeaderDelivery }
     *
     */
    public ConfirmSOHeaderDelivery getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     *
     * @param value
     *     allowed object is
     *     {@link ConfirmSOHeaderDelivery }
     *
     */
    public void setDelivery(ConfirmSOHeaderDelivery value) {
        this.delivery = value;
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
     * {@link ConfirmSODetailV2 }
     *
     *
     */
    public List<ConfirmSODetailV2> getDetail() {
        if (detail == null) {
            detail = new ArrayList<ConfirmSODetailV2>();
        }
        return this.detail;
    }

    /**
     * Gets the value of the financial property.
     *
     * @return
     *     possible object is
     *     {@link ConfirmSOHeaderFinancial }
     *
     */
    public ConfirmSOHeaderFinancial getFinancial() {
        return financial;
    }

    /**
     * Sets the value of the financial property.
     *
     * @param value
     *     allowed object is
     *     {@link ConfirmSOHeaderFinancial }
     *
     */
    public void setFinancial(ConfirmSOHeaderFinancial value) {
        this.financial = value;
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
