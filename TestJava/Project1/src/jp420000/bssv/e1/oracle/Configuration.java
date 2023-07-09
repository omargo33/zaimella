
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configuration complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="configuration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{http://oracle.e1.bssv.JP420000/}itemGroupCustomer" minOccurs="0"/&gt;
 *         &lt;element name="itemParent" type="{http://oracle.e1.bssv.JP420000/}itemGroupCustomer" minOccurs="0"/&gt;
 *         &lt;element name="lineTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quantityComponent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="segment" type="{http://oracle.e1.bssv.JP420000/}segment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureCodeComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuration",
         propOrder =
         { "businessUnit", "description1", "item", "itemParent", "lineTypeCode", "quantityComponent", "segment",
           "unitOfMeasureCodeComponent"
    })
public class Configuration extends ValueObject {

    protected String businessUnit;
    protected String description1;
    protected ItemGroupCustomer item;
    protected ItemGroupCustomer itemParent;
    protected String lineTypeCode;
    protected BigDecimal quantityComponent;
    @XmlElement(nillable = true)
    protected List<Segment> segment;
    protected String unitOfMeasureCodeComponent;

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
     * Gets the value of the itemParent property.
     *
     * @return
     *     possible object is
     *     {@link ItemGroupCustomer }
     *
     */
    public ItemGroupCustomer getItemParent() {
        return itemParent;
    }

    /**
     * Sets the value of the itemParent property.
     *
     * @param value
     *     allowed object is
     *     {@link ItemGroupCustomer }
     *
     */
    public void setItemParent(ItemGroupCustomer value) {
        this.itemParent = value;
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
     * Gets the value of the quantityComponent property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getQuantityComponent() {
        return quantityComponent;
    }

    /**
     * Sets the value of the quantityComponent property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setQuantityComponent(BigDecimal value) {
        this.quantityComponent = value;
    }

    /**
     * Gets the value of the segment property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Segment }
     *
     *
     */
    public List<Segment> getSegment() {
        if (segment == null) {
            segment = new ArrayList<Segment>();
        }
        return this.segment;
    }

    /**
     * Gets the value of the unitOfMeasureCodeComponent property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitOfMeasureCodeComponent() {
        return unitOfMeasureCodeComponent;
    }

    /**
     * Sets the value of the unitOfMeasureCodeComponent property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitOfMeasureCodeComponent(String value) {
        this.unitOfMeasureCodeComponent = value;
    }

}
