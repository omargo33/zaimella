
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for warehouse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="warehouse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://oracle.e1.bssv.JP420000/}warehouseAddress" minOccurs="0"/&gt;
 *         &lt;element name="warehouse" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="warehouseDescriptive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "warehouse", propOrder = { "address", "warehouse", "warehouseDescriptive" })
public class Warehouse extends ValueObject {

    protected WarehouseAddress address;
    protected Integer warehouse;
    protected String warehouseDescriptive;

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link WarehouseAddress }
     *
     */
    public WarehouseAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link WarehouseAddress }
     *
     */
    public void setAddress(WarehouseAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the warehouse property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getWarehouse() {
        return warehouse;
    }

    /**
     * Sets the value of the warehouse property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setWarehouse(Integer value) {
        this.warehouse = value;
    }

    /**
     * Gets the value of the warehouseDescriptive property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWarehouseDescriptive() {
        return warehouseDescriptive;
    }

    /**
     * Sets the value of the warehouseDescriptive property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWarehouseDescriptive(String value) {
        this.warehouseDescriptive = value;
    }

}
