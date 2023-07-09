
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSalesOrder complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getSalesOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://oracle.e1.bssv.JP420000/}getSalesHeader" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSalesOrder", propOrder = { "header" })
public class GetSalesOrder extends ValueObject {

    protected GetSalesHeader header;

    /**
     * Gets the value of the header property.
     *
     * @return
     *     possible object is
     *     {@link GetSalesHeader }
     *
     */
    public GetSalesHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     *
     * @param value
     *     allowed object is
     *     {@link GetSalesHeader }
     *
     */
    public void setHeader(GetSalesHeader value) {
        this.header = value;
    }

}
