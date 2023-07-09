
package jp420000.bssv.e1.oracle;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for showSalesOrderPriceHistory complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="showSalesOrderPriceHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}messageValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detail" type="{http://oracle.e1.bssv.JP420000/}showPriceHistoryDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showSalesOrderPriceHistory", propOrder = { "detail" })
public class ShowSalesOrderPriceHistory extends MessageValueObject {

    @XmlElement(nillable = true)
    protected List<ShowPriceHistoryDetail> detail;

    /**
     * Gets the value of the detail property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShowPriceHistoryDetail }
     *
     *
     */
    public List<ShowPriceHistoryDetail> getDetail() {
        if (detail == null) {
            detail = new ArrayList<ShowPriceHistoryDetail>();
        }
        return this.detail;
    }

}
