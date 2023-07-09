
package jp420000.bssv.e1.oracle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="segment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}valueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="segmentNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="segmentValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segment", propOrder = { "segmentNumber", "segmentValue" })
public class Segment extends ValueObject {

    protected Integer segmentNumber;
    protected String segmentValue;

    /**
     * Gets the value of the segmentNumber property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSegmentNumber() {
        return segmentNumber;
    }

    /**
     * Sets the value of the segmentNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSegmentNumber(Integer value) {
        this.segmentNumber = value;
    }

    /**
     * Gets the value of the segmentValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSegmentValue() {
        return segmentValue;
    }

    /**
     * Sets the value of the segmentValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSegmentValue(String value) {
        this.segmentValue = value;
    }

}
