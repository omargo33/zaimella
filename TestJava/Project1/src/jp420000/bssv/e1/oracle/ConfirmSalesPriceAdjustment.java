
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for confirmSalesPriceAdjustment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="confirmSalesPriceAdjustment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}messageValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="financial" type="{http://oracle.e1.bssv.JP420000/}financial" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{http://oracle.e1.bssv.JP420000/}itemGroupCustomer" minOccurs="0"/&gt;
 *         &lt;element name="priceAdjustmentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="processing" type="{http://oracle.e1.bssv.JP420000/}processing" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmSalesPriceAdjustment",
         propOrder =
         { "adjustmentTypeCode", "costTypeCode", "customer", "financial", "item", "priceAdjustmentId", "processing",
           "unitOfMeasureTransaction"
    })
public class ConfirmSalesPriceAdjustment extends MessageValueObject {

    protected String adjustmentTypeCode;
    protected String costTypeCode;
    protected Entity customer;
    protected Financial financial;
    protected ItemGroupCustomer item;
    protected Integer priceAdjustmentId;
    protected Processing processing;
    protected String unitOfMeasureTransaction;

    /**
     * Gets the value of the adjustmentTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdjustmentTypeCode() {
        return adjustmentTypeCode;
    }

    /**
     * Sets the value of the adjustmentTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdjustmentTypeCode(String value) {
        this.adjustmentTypeCode = value;
    }

    /**
     * Gets the value of the costTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCostTypeCode() {
        return costTypeCode;
    }

    /**
     * Sets the value of the costTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCostTypeCode(String value) {
        this.costTypeCode = value;
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
     * Gets the value of the financial property.
     *
     * @return
     *     possible object is
     *     {@link Financial }
     *
     */
    public Financial getFinancial() {
        return financial;
    }

    /**
     * Sets the value of the financial property.
     *
     * @param value
     *     allowed object is
     *     {@link Financial }
     *
     */
    public void setFinancial(Financial value) {
        this.financial = value;
    }

    /**
     * Gets the value of the item property.
     *
     * @return
     *     possible object is
     *     {@link ItemGroupCustomer }
     *
     */
    public ItemGroupCustomer getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     *
     * @param value
     *     allowed object is
     *     {@link ItemGroupCustomer }
     *
     */
    public void setItem(ItemGroupCustomer value) {
        this.item = value;
    }

    /**
     * Gets the value of the priceAdjustmentId property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPriceAdjustmentId() {
        return priceAdjustmentId;
    }

    /**
     * Sets the value of the priceAdjustmentId property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPriceAdjustmentId(Integer value) {
        this.priceAdjustmentId = value;
    }

    /**
     * Gets the value of the processing property.
     *
     * @return
     *     possible object is
     *     {@link Processing }
     *
     */
    public Processing getProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     *
     * @param value
     *     allowed object is
     *     {@link Processing }
     *
     */
    public void setProcessing(Processing value) {
        this.processing = value;
    }

    /**
     * Gets the value of the unitOfMeasureTransaction property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitOfMeasureTransaction() {
        return unitOfMeasureTransaction;
    }

    /**
     * Sets the value of the unitOfMeasureTransaction property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitOfMeasureTransaction(String value) {
        this.unitOfMeasureTransaction = value;
    }

}
