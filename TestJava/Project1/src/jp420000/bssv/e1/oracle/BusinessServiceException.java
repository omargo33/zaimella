
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessServiceException complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BusinessServiceException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessServiceException", propOrder = { "message", "requestID" })
public class BusinessServiceException {

    protected String message;
    protected String requestID;

    /**
     * Gets the value of the message property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the requestID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

}
