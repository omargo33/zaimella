
package jp594205.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voD554205A1OUTPUT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="voD554205A1OUTPUT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP594205/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JDEnterpriseOneEventPoint01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voD554205A1OUTPUT", propOrder = { "dataItem", "jdEnterpriseOneEventPoint01" })
public class VoD554205A1OUTPUT extends ValueObject {

    protected String dataItem;
    @XmlElement(name = "JDEnterpriseOneEventPoint01")
    protected String jdEnterpriseOneEventPoint01;

    /**
     * Gets the value of the dataItem property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDataItem() {
        return dataItem;
    }

    /**
     * Sets the value of the dataItem property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDataItem(String value) {
        this.dataItem = value;
    }

    /**
     * Gets the value of the jdEnterpriseOneEventPoint01 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJDEnterpriseOneEventPoint01() {
        return jdEnterpriseOneEventPoint01;
    }

    /**
     * Sets the value of the jdEnterpriseOneEventPoint01 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJDEnterpriseOneEventPoint01(String value) {
        this.jdEnterpriseOneEventPoint01 = value;
    }

}
