
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSalesOrderPriceHistory complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getSalesOrderPriceHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detail" type="{http://oracle.e1.bssv.JP420000/}priceHistory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSalesOrderPriceHistory", propOrder = { "detail" })
public class GetSalesOrderPriceHistory extends ValueObject {

    protected PriceHistory detail;

    /**
     * Gets the value of the detail property.
     *
     * @return
     *     possible object is
     *     {@link PriceHistory }
     *
     */
    public PriceHistory getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     *
     * @param value
     *     allowed object is
     *     {@link PriceHistory }
     *
     */
    public void setDetail(PriceHistory value) {
        this.detail = value;
    }

}
