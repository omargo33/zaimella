
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="customer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shipTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="soldTo" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = { "shipTo", "soldTo" })
public class Customer extends ValueObject {

    protected Entity shipTo;
    protected Entity soldTo;

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
     * Gets the value of the soldTo property.
     *
     * @return
     *     possible object is
     *     {@link Entity }
     *
     */
    public Entity getSoldTo() {
        return soldTo;
    }

    /**
     * Sets the value of the soldTo property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setSoldTo(Entity value) {
        this.soldTo = value;
    }

}
