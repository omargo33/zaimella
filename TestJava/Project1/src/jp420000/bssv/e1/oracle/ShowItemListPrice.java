
package jp420000.bssv.e1.oracle;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for showItemListPrice complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="showItemListPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://oracle.e1.bssv.JP420000/}messageValueObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="showItemListPrice" type="{http://oracle.e1.bssv.JP420000/}itemListPriceRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showItemListPrice", propOrder = { "showItemListPrice" })
public class ShowItemListPrice extends MessageValueObject {

    @XmlElement(nillable = true)
    protected List<ItemListPriceRecord> showItemListPrice;

    /**
     * Gets the value of the showItemListPrice property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the showItemListPrice property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShowItemListPrice().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemListPriceRecord }
     *
     *
     */
    public List<ItemListPriceRecord> getShowItemListPrice() {
        if (showItemListPrice == null) {
            showItemListPrice = new ArrayList<ItemListPriceRecord>();
        }
        return this.showItemListPrice;
    }

}
