
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoryCodesSales complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="categoryCodesSales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="categoryCode001" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="categoryCode002" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="categoryCode003" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="categoryCode004" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="categoryCode005" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categoryCodesSales",
         propOrder = { "categoryCode001", "categoryCode002", "categoryCode003", "categoryCode004", "categoryCode005"
    })
public class CategoryCodesSales extends ValueObject {

    protected String categoryCode001;
    protected String categoryCode002;
    protected String categoryCode003;
    protected String categoryCode004;
    protected String categoryCode005;

    /**
     * Gets the value of the categoryCode001 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCategoryCode001() {
        return categoryCode001;
    }

    /**
     * Sets the value of the categoryCode001 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCategoryCode001(String value) {
        this.categoryCode001 = value;
    }

    /**
     * Gets the value of the categoryCode002 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCategoryCode002() {
        return categoryCode002;
    }

    /**
     * Sets the value of the categoryCode002 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCategoryCode002(String value) {
        this.categoryCode002 = value;
    }

    /**
     * Gets the value of the categoryCode003 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCategoryCode003() {
        return categoryCode003;
    }

    /**
     * Sets the value of the categoryCode003 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCategoryCode003(String value) {
        this.categoryCode003 = value;
    }

    /**
     * Gets the value of the categoryCode004 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCategoryCode004() {
        return categoryCode004;
    }

    /**
     * Sets the value of the categoryCode004 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCategoryCode004(String value) {
        this.categoryCode004 = value;
    }

    /**
     * Gets the value of the categoryCode005 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCategoryCode005() {
        return categoryCode005;
    }

    /**
     * Sets the value of the categoryCode005 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCategoryCode005(String value) {
        this.categoryCode005 = value;
    }

}
