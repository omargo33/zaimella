
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processSalesOrderV2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="processSalesOrderV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://oracle.e1.bssv.JP420000/}processSOHeaderV2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processSalesOrderV2", propOrder = { "header" })
public class ProcessSalesOrderV2 extends ValueObject {

    protected ProcessSOHeaderV2 header;

    /**
     * Gets the value of the header property.
     *
     * @return
     *     possible object is
     *     {@link ProcessSOHeaderV2 }
     *
     */
    public ProcessSOHeaderV2 getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     *
     * @param value
     *     allowed object is
     *     {@link ProcessSOHeaderV2 }
     *
     */
    public void setHeader(ProcessSOHeaderV2 value) {
        this.header = value;
    }

}
