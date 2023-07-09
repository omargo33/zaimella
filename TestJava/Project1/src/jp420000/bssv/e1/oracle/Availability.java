
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for availability complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="availability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quantityAvailable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="warehouse" type="{http://oracle.e1.bssv.JP420000/}warehouse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "availability", propOrder = { "quantityAvailable", "warehouse" })
public class Availability extends ValueObject {

    protected BigDecimal quantityAvailable;
    protected Warehouse warehouse;

    /**
     * Gets the value of the quantityAvailable property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * Sets the value of the quantityAvailable property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setQuantityAvailable(BigDecimal value) {
        this.quantityAvailable = value;
    }

    /**
     * Gets the value of the warehouse property.
     *
     * @return
     *     possible object is
     *     {@link Warehouse }
     *
     */
    public Warehouse getWarehouse() {
        return warehouse;
    }

    /**
     * Sets the value of the warehouse property.
     *
     * @param value
     *     allowed object is
     *     {@link Warehouse }
     *
     */
    public void setWarehouse(Warehouse value) {
        this.warehouse = value;
    }

}
