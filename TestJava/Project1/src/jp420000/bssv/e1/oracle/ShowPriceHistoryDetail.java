
package jp420000.bssv.e1.oracle;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for showPriceHistoryDetail complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="showPriceHistoryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}priceHistory"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priceAdjustmentLedger" type="{http://oracle.e1.bssv.JP420000/}priceAdjustmentLedger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showPriceHistoryDetail", propOrder = { "priceAdjustmentLedger" })
public class ShowPriceHistoryDetail extends PriceHistory {

    @XmlElement(nillable = true)
    protected List<PriceAdjustmentLedger> priceAdjustmentLedger;

    /**
     * Gets the value of the priceAdjustmentLedger property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceAdjustmentLedger property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceAdjustmentLedger().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceAdjustmentLedger }
     *
     *
     */
    public List<PriceAdjustmentLedger> getPriceAdjustmentLedger() {
        if (priceAdjustmentLedger == null) {
            priceAdjustmentLedger = new ArrayList<PriceAdjustmentLedger>();
        }
        return this.priceAdjustmentLedger;
    }

}
