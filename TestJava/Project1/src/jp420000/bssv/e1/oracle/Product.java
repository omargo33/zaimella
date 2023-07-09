
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for product complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{http://oracle.e1.bssv.JP420000/}itemGroupCustomer" minOccurs="0"/&gt;
 *         &lt;element name="itemVolume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="itemWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shipTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureCodeVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureCodeWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product",
         propOrder =
         { "businessUnit", "item", "itemVolume", "itemWeight", "lineType", "location", "lotNumber", "shipTo",
           "unitOfMeasureCodeVolume", "unitOfMeasureCodeWeight"
    })
public class Product extends ValueObject {

    protected String businessUnit;
    protected ItemGroupCustomer item;
    protected BigDecimal itemVolume;
    protected BigDecimal itemWeight;
    protected String lineType;
    protected String location;
    protected String lotNumber;
    protected Entity shipTo;
    protected String unitOfMeasureCodeVolume;
    protected String unitOfMeasureCodeWeight;

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
     * Gets the value of the itemVolume property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getItemVolume() {
        return itemVolume;
    }

    /**
     * Sets the value of the itemVolume property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setItemVolume(BigDecimal value) {
        this.itemVolume = value;
    }

    /**
     * Gets the value of the itemWeight property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getItemWeight() {
        return itemWeight;
    }

    /**
     * Sets the value of the itemWeight property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setItemWeight(BigDecimal value) {
        this.itemWeight = value;
    }

    /**
     * Gets the value of the lineType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLineType(String value) {
        this.lineType = value;
    }

    /**
     * Gets the value of the location property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the lotNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
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
     * Gets the value of the unitOfMeasureCodeVolume property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitOfMeasureCodeVolume() {
        return unitOfMeasureCodeVolume;
    }

    /**
     * Sets the value of the unitOfMeasureCodeVolume property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitOfMeasureCodeVolume(String value) {
        this.unitOfMeasureCodeVolume = value;
    }

    /**
     * Gets the value of the unitOfMeasureCodeWeight property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitOfMeasureCodeWeight() {
        return unitOfMeasureCodeWeight;
    }

    /**
     * Sets the value of the unitOfMeasureCodeWeight property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitOfMeasureCodeWeight(String value) {
        this.unitOfMeasureCodeWeight = value;
    }

}
