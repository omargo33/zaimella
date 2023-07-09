
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemListPriceRecord complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="itemListPriceRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}itemListPriceShared"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lotGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lotPotency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="priceList" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemListPriceRecord", propOrder = { "location", "lotGrade", "lotNumber", "lotPotency", "priceList" })
public class ItemListPriceRecord extends ItemListPriceShared {

    protected String location;
    protected String lotGrade;
    protected String lotNumber;
    protected BigDecimal lotPotency;
    protected BigDecimal priceList;

    /**
     * Gets the value of the location property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the lotGrade property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLotGrade() {
        return lotGrade;
    }

    /**
     * Sets the value of the lotGrade property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLotGrade(String value) {
        this.lotGrade = value;
    }

    /**
     * Gets the value of the lotNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the lotPotency property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getLotPotency() {
        return lotPotency;
    }

    /**
     * Sets the value of the lotPotency property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setLotPotency(BigDecimal value) {
        this.lotPotency = value;
    }

    /**
     * Gets the value of the priceList property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setPriceList(BigDecimal value) {
        this.priceList = value;
    }

}
