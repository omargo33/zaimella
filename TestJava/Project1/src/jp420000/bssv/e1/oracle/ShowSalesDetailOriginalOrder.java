
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for showSalesDetailOriginalOrder complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="showSalesDetailOriginalOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}originalOrder"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentLineNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showSalesDetailOriginalOrder", propOrder = { "documentLineNumber" })
public class ShowSalesDetailOriginalOrder extends OriginalOrder {

    protected BigDecimal documentLineNumber;

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

}
