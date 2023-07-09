
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processSOHeaderProcessing complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="processSOHeaderProcessing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processingVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processSOHeaderProcessing", propOrder = { "actionType", "processingVersion" })
public class ProcessSOHeaderProcessing extends ValueObject {

    protected String actionType;
    protected String processingVersion;

    /**
     * Gets the value of the actionType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the processingVersion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProcessingVersion() {
        return processingVersion;
    }

    /**
     * Sets the value of the processingVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProcessingVersion(String value) {
        this.processingVersion = value;
    }

}
