
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processSODetailProduct complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="processSODetailProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="configuration" type="{http://oracle.e1.bssv.JP420000/}configuration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="item" type="{http://oracle.e1.bssv.JP420000/}itemGroupCustomer" minOccurs="0"/&gt;
 *         &lt;element name="itemVolume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="itemWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "processSODetailProduct",
         propOrder =
         { "configuration", "description1", "description2", "item", "itemVolume", "itemWeight", "location", "lotNumber",
           "unitOfMeasureCodeVolume", "unitOfMeasureCodeWeight"
    })
public class ProcessSODetailProduct extends ValueObject {

    @XmlElement(nillable = true)
    protected List<Configuration> configuration;
    protected String description1;
    protected String description2;
    protected ItemGroupCustomer item;
    protected BigDecimal itemVolume;
    protected BigDecimal itemWeight;
    protected String location;
    protected String lotNumber;
    protected String unitOfMeasureCodeVolume;
    protected String unitOfMeasureCodeWeight;

    /**
     * Gets the value of the configuration property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuration property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguration().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Configuration }
     *
     *
     */
    public List<Configuration> getConfiguration() {
        if (configuration == null) {
            configuration = new ArrayList<Configuration>();
        }
        return this.configuration;
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
