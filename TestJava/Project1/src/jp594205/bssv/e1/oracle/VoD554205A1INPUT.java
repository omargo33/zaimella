
package jp594205.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voD554205A1INPUT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="voD554205A1INPUT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP594205/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyKeyEDIDocumentKeyCo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EDIDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EDIDocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voD554205A1INPUT",
         propOrder = { "companyKeyEDIDocumentKeyCo", "ediDocumentNumber", "ediDocumentType", "version" })
public class VoD554205A1INPUT extends ValueObject {

    protected String companyKeyEDIDocumentKeyCo;
    @XmlElement(name = "EDIDocumentNumber")
    protected Integer ediDocumentNumber;
    @XmlElement(name = "EDIDocumentType")
    protected String ediDocumentType;
    protected String version;

    /**
     * Gets the value of the companyKeyEDIDocumentKeyCo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompanyKeyEDIDocumentKeyCo() {
        return companyKeyEDIDocumentKeyCo;
    }

    /**
     * Sets the value of the companyKeyEDIDocumentKeyCo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompanyKeyEDIDocumentKeyCo(String value) {
        this.companyKeyEDIDocumentKeyCo = value;
    }

    /**
     * Gets the value of the ediDocumentNumber property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getEDIDocumentNumber() {
        return ediDocumentNumber;
    }

    /**
     * Sets the value of the ediDocumentNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setEDIDocumentNumber(Integer value) {
        this.ediDocumentNumber = value;
    }

    /**
     * Gets the value of the ediDocumentType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEDIDocumentType() {
        return ediDocumentType;
    }

    /**
     * Sets the value of the ediDocumentType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEDIDocumentType(String value) {
        this.ediDocumentType = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
