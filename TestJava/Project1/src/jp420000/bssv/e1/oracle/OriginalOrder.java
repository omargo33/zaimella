
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for originalOrder complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="originalOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originalOrderKey" type="{http://oracle.e1.bssv.JP420000/}originalOrderKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "originalOrder", propOrder = { "originalOrderKey" })
@XmlSeeAlso({ ShowSalesDetailOriginalOrder.class })
public class OriginalOrder extends ValueObject {

    protected OriginalOrderKey originalOrderKey;

    /**
     * Gets the value of the originalOrderKey property.
     *
     * @return
     *     possible object is
     *     {@link OriginalOrderKey }
     *
     */
    public OriginalOrderKey getOriginalOrderKey() {
        return originalOrderKey;
    }

    /**
     * Sets the value of the originalOrderKey property.
     *
     * @param value
     *     allowed object is
     *     {@link OriginalOrderKey }
     *
     */
    public void setOriginalOrderKey(OriginalOrderKey value) {
        this.originalOrderKey = value;
    }

}
