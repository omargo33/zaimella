
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for document complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentKey" type="{http://oracle.e1.bssv.JP420000/}documentKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "document", propOrder = { "documentKey" })
public class Document extends ValueObject {

    protected DocumentKey documentKey;

    /**
     * Gets the value of the documentKey property.
     *
     * @return
     *     possible object is
     *     {@link DocumentKey }
     *
     */
    public DocumentKey getDocumentKey() {
        return documentKey;
    }

    /**
     * Sets the value of the documentKey property.
     *
     * @param value
     *     allowed object is
     *     {@link DocumentKey }
     *
     */
    public void setDocumentKey(DocumentKey value) {
        this.documentKey = value;
    }

}
