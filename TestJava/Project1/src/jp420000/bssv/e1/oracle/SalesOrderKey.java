
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salesOrderKey complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="salesOrderKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="documentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesOrderKey", propOrder = { "documentCompany", "documentNumber", "documentTypeCode" })
public class SalesOrderKey extends ValueObject {

    protected String documentCompany;
    protected Integer documentNumber;
    protected String documentTypeCode;

    /**
     * Gets the value of the documentCompany property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentCompany() {
        return documentCompany;
    }

    /**
     * Sets the value of the documentCompany property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentCompany(String value) {
        this.documentCompany = value;
    }

    /**
     * Gets the value of the documentNumber property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setDocumentNumber(Integer value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * Sets the value of the documentTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentTypeCode(String value) {
        this.documentTypeCode = value;
    }

}
