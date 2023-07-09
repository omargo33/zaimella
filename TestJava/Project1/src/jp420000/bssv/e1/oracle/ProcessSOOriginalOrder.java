
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processSOOriginalOrder complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="processSOOriginalOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentLineNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "processSOOriginalOrder", propOrder = { "documentLineNumber", "originalOrderKey" })
public class ProcessSOOriginalOrder extends ValueObject {

    protected BigDecimal documentLineNumber;
    protected OriginalOrderKey originalOrderKey;

    /**
     * Gets the value of the documentLineNumber property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDocumentLineNumber() {
        return documentLineNumber;
    }

    /**
     * Sets the value of the documentLineNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDocumentLineNumber(BigDecimal value) {
        this.documentLineNumber = value;
    }

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
