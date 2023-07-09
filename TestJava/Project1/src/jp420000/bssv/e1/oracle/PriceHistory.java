
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priceHistory complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="priceHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentLineNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="salesOrderKey" type="{http://oracle.e1.bssv.JP420000/}salesOrderKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceHistory", propOrder = { "documentLineNumber", "salesOrderKey" })
@XmlSeeAlso({ ShowPriceHistoryDetail.class })
public class PriceHistory extends ValueObject {

    protected BigDecimal documentLineNumber;
    protected SalesOrderKey salesOrderKey;

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
     * Gets the value of the salesOrderKey property.
     *
     * @return
     *     possible object is
     *     {@link SalesOrderKey }
     *
     */
    public SalesOrderKey getSalesOrderKey() {
        return salesOrderKey;
    }

    /**
     * Sets the value of the salesOrderKey property.
     *
     * @param value
     *     allowed object is
     *     {@link SalesOrderKey }
     *
     */
    public void setSalesOrderKey(SalesOrderKey value) {
        this.salesOrderKey = value;
    }

}
