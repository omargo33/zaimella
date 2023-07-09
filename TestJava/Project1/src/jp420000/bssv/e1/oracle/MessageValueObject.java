
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageValueObject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="messageValueObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="e1MessageList" type="{http://oracle.e1.bssv.JP420000/}e1MessageList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageValueObject", propOrder = { "e1MessageList" })
@XmlSeeAlso({ ShowCustomerItemPrice.class, ShowCustomerItemPriceV2.class, ShowItemListPrice.class,
              ShowItemPriceAndAvailability.class, ShowItemPriceAndAvailabilityV2.class,
              ShowSalesOrderPriceHistory.class, ShowSalesOrder.class, ShowSalesOrderV2.class, ConfirmSalesOrder.class,
              ConfirmSalesOrderV2.class, ConfirmSalesPriceAdjustment.class
    })
public class MessageValueObject extends ValueObject {

    protected E1MessageList e1MessageList;

    /**
     * Gets the value of the e1MessageList property.
     *
     * @return
     *     possible object is
     *     {@link E1MessageList }
     *
     */
    public E1MessageList getE1MessageList() {
        return e1MessageList;
    }

    /**
     * Sets the value of the e1MessageList property.
     *
     * @param value
     *     allowed object is
     *     {@link E1MessageList }
     *
     */
    public void setE1MessageList(E1MessageList value) {
        this.e1MessageList = value;
    }

}
