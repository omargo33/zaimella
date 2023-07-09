
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productOutV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="productOutV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="availability" type="{http://oracle.e1.bssv.JP420000/}availability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{http://oracle.e1.bssv.JP420000/}itemGroupCustomer" minOccurs="0"/&gt;
 *         &lt;element name="priceExtended" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quantityOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxAmountExtended" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxAmountUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxedPriceExtended" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxedPriceUnit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "productOutV2",
         propOrder =
         { "availability", "item", "priceExtended", "priceUnit", "quantityOrdered", "taxAmountExtended",
           "taxAmountUnit", "taxedPriceExtended", "taxedPriceUnit", "unitOfMeasureCodePricing",
           "unitOfMeasureCodeTransaction"
    })
public class ProductOutV2 extends ValueObject {

    @XmlElement(nillable = true)
    protected List<Availability> availability;
    protected ItemGroupCustomer item;
    protected BigDecimal priceExtended;
    protected BigDecimal priceUnit;
    protected BigDecimal quantityOrdered;
    protected BigDecimal taxAmountExtended;
    protected BigDecimal taxAmountUnit;
    protected BigDecimal taxedPriceExtended;
    protected BigDecimal taxedPriceUnit;
    protected String unitOfMeasureCodePricing;
    protected String unitOfMeasureCodeTransaction;

    /**
     * Gets the value of the availability property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Availability }
     *
     *
     */
    public List<Availability> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<Availability>();
        }
        return this.availability;
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
     * Gets the value of the priceExtended property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPriceExtended() {
        return priceExtended;
    }

    /**
     * Sets the value of the priceExtended property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPriceExtended(BigDecimal value) {
        this.priceExtended = value;
    }

    /**
     * Gets the value of the priceUnit property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPriceUnit() {
        return priceUnit;
    }

    /**
     * Sets the value of the priceUnit property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPriceUnit(BigDecimal value) {
        this.priceUnit = value;
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
     * Gets the value of the taxAmountExtended property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxAmountExtended() {
        return taxAmountExtended;
    }

    /**
     * Sets the value of the taxAmountExtended property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxAmountExtended(BigDecimal value) {
        this.taxAmountExtended = value;
    }

    /**
     * Gets the value of the taxAmountUnit property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxAmountUnit() {
        return taxAmountUnit;
    }

    /**
     * Sets the value of the taxAmountUnit property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxAmountUnit(BigDecimal value) {
        this.taxAmountUnit = value;
    }

    /**
     * Gets the value of the taxedPriceExtended property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxedPriceExtended() {
        return taxedPriceExtended;
    }

    /**
     * Sets the value of the taxedPriceExtended property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxedPriceExtended(BigDecimal value) {
        this.taxedPriceExtended = value;
    }

    /**
     * Gets the value of the taxedPriceUnit property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTaxedPriceUnit() {
        return taxedPriceUnit;
    }

    /**
     * Sets the value of the taxedPriceUnit property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTaxedPriceUnit(BigDecimal value) {
        this.taxedPriceUnit = value;
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
