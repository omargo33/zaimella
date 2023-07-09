
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processSODetailBilling complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="processSODetailBilling"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carrier" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="freightHandlingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modeOfTransportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentInstrumentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentTermsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pricing" type="{http://oracle.e1.bssv.JP420000/}pricing" minOccurs="0"/&gt;
 *         &lt;element name="printMessageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subledger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subledgerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxExplanationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxRateAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxableCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processSODetailBilling",
         propOrder =
         { "carrier", "freightHandlingCode", "modeOfTransportCode", "paymentInstrumentCode", "paymentTermsCode",
           "pricing", "printMessageCode", "subledger", "subledgerTypeCode", "taxExplanationCode", "taxRateAreaCode",
           "taxableCode"
    })
public class ProcessSODetailBilling extends ValueObject {

    protected Entity carrier;
    protected String freightHandlingCode;
    protected String modeOfTransportCode;
    protected String paymentInstrumentCode;
    protected String paymentTermsCode;
    protected Pricing pricing;
    protected String printMessageCode;
    protected String subledger;
    protected String subledgerTypeCode;
    protected String taxExplanationCode;
    protected String taxRateAreaCode;
    protected String taxableCode;

    /**
     * Gets the value of the carrier property.
     *
     * @return
     *     possible object is
     *     {@link Entity }
     *
     */
    public Entity getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setCarrier(Entity value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the freightHandlingCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFreightHandlingCode() {
        return freightHandlingCode;
    }

    /**
     * Sets the value of the freightHandlingCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFreightHandlingCode(String value) {
        this.freightHandlingCode = value;
    }

    /**
     * Gets the value of the modeOfTransportCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getModeOfTransportCode() {
        return modeOfTransportCode;
    }

    /**
     * Sets the value of the modeOfTransportCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setModeOfTransportCode(String value) {
        this.modeOfTransportCode = value;
    }

    /**
     * Gets the value of the paymentInstrumentCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentInstrumentCode() {
        return paymentInstrumentCode;
    }

    /**
     * Sets the value of the paymentInstrumentCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentInstrumentCode(String value) {
        this.paymentInstrumentCode = value;
    }

    /**
     * Gets the value of the paymentTermsCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentTermsCode() {
        return paymentTermsCode;
    }

    /**
     * Sets the value of the paymentTermsCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentTermsCode(String value) {
        this.paymentTermsCode = value;
    }

    /**
     * Gets the value of the pricing property.
     *
     * @return
     *     possible object is
     *     {@link Pricing }
     *
     */
    public Pricing getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     *
     * @param value
     *     allowed object is
     *     {@link Pricing }
     *
     */
    public void setPricing(Pricing value) {
        this.pricing = value;
    }

    /**
     * Gets the value of the printMessageCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrintMessageCode() {
        return printMessageCode;
    }

    /**
     * Sets the value of the printMessageCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrintMessageCode(String value) {
        this.printMessageCode = value;
    }

    /**
     * Gets the value of the subledger property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubledger() {
        return subledger;
    }

    /**
     * Sets the value of the subledger property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubledger(String value) {
        this.subledger = value;
    }

    /**
     * Gets the value of the subledgerTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubledgerTypeCode() {
        return subledgerTypeCode;
    }

    /**
     * Sets the value of the subledgerTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubledgerTypeCode(String value) {
        this.subledgerTypeCode = value;
    }

    /**
     * Gets the value of the taxExplanationCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxExplanationCode() {
        return taxExplanationCode;
    }

    /**
     * Sets the value of the taxExplanationCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxExplanationCode(String value) {
        this.taxExplanationCode = value;
    }

    /**
     * Gets the value of the taxRateAreaCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxRateAreaCode() {
        return taxRateAreaCode;
    }

    /**
     * Sets the value of the taxRateAreaCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxRateAreaCode(String value) {
        this.taxRateAreaCode = value;
    }

    /**
     * Gets the value of the taxableCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxableCode() {
        return taxableCode;
    }

    /**
     * Sets the value of the taxableCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxableCode(String value) {
        this.taxableCode = value;
    }

}
