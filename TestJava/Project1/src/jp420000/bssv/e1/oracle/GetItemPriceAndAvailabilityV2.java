
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getItemPriceAndAvailabilityV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getItemPriceAndAvailabilityV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentScheduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="processing" type="{http://oracle.e1.bssv.JP420000/}processingVersion" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://oracle.e1.bssv.JP420000/}productIn" minOccurs="0"/&gt;
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
@XmlType(name = "getItemPriceAndAvailabilityV2",
         propOrder =
         { "adjustmentScheduleCode", "businessUnit", "currencyCode", "customer", "processing", "product",
           "useTaxedPrices"
    })
public class GetItemPriceAndAvailabilityV2 extends ValueObject {

    protected String adjustmentScheduleCode;
    protected String businessUnit;
    protected String currencyCode;
    protected Entity customer;
    protected ProcessingVersion processing;
    protected ProductIn product;
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
     *     {@link Entity }
     *
     */
    public Entity getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setCustomer(Entity value) {
        this.customer = value;
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
     *     {@link ProductIn }
     *
     */
    public ProductIn getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value
     *     allowed object is
     *     {@link ProductIn }
     *
     */
    public void setProduct(ProductIn value) {
        this.product = value;
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
