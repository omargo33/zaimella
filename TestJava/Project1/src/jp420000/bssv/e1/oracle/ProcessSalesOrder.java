
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processSalesOrder complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="processSalesOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://oracle.e1.bssv.JP420000/}processSOHeader" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processSalesOrder", propOrder = { "header" })
public class ProcessSalesOrder extends ValueObject {

    protected ProcessSOHeader header;

    /**
     * Gets the value of the header property.
     *
     * @return
     *     possible object is
     *     {@link ProcessSOHeader }
     *
     */
    public ProcessSOHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     *
     * @param value
     *     allowed object is
     *     {@link ProcessSOHeader }
     *
     */
    public void setHeader(ProcessSOHeader value) {
        this.header = value;
    }

}
