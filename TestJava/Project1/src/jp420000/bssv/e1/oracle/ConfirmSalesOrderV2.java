
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for confirmSalesOrderV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="confirmSalesOrderV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}messageValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://oracle.e1.bssv.JP420000/}confirmSOHeaderV2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmSalesOrderV2", propOrder = { "header" })
public class ConfirmSalesOrderV2 extends MessageValueObject {

    protected ConfirmSOHeaderV2 header;

    /**
     * Gets the value of the header property.
     *
     * @return
     *     possible object is
     *     {@link ConfirmSOHeaderV2 }
     *
     */
    public ConfirmSOHeaderV2 getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     *
     * @param value
     *     allowed object is
     *     {@link ConfirmSOHeaderV2 }
     *
     */
    public void setHeader(ConfirmSOHeaderV2 value) {
        this.header = value;
    }

}
