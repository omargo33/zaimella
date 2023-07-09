
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processSOCustomer complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="processSOCustomer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://oracle.e1.bssv.JP420000/}entity" minOccurs="0"/&gt;
 *         &lt;element name="mailingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processSOCustomer",
         propOrder =
         { "addressLine1", "addressLine2", "addressLine3", "addressLine4", "city", "countryCode", "countyCode",
           "customer", "mailingName", "postalCode", "stateCode"
    })
public class ProcessSOCustomer extends ValueObject {

    protected String addressLine1;
    protected String addressLine2;
    protected String addressLine3;
    protected String addressLine4;
    protected String city;
    protected String countryCode;
    protected String countyCode;
    protected Entity customer;
    protected String mailingName;
    protected String postalCode;
    protected String stateCode;

    /**
     * Gets the value of the addressLine1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressLine4 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine4(String value) {
        this.addressLine4 = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the countryCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countyCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * Sets the value of the countyCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountyCode(String value) {
        this.countyCode = value;
    }

    /**
     * Gets the value of the customer property.
     *
     * @return
     *     possible object is
     *     {@link Entity }
     *
     */
    public Entity getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     *
     * @param value
     *     allowed object is
     *     {@link Entity }
     *
     */
    public void setCustomer(Entity value) {
        this.customer = value;
    }

    /**
     * Gets the value of the mailingName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMailingName() {
        return mailingName;
    }

    /**
     * Sets the value of the mailingName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMailingName(String value) {
        this.mailingName = value;
    }

    /**
     * Gets the value of the postalCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the stateCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

}
