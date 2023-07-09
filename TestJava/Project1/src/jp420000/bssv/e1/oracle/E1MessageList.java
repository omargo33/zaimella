
package jp420000.bssv.e1.oracle;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for e1MessageList complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="e1MessageList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="e1Messages" type="{http://oracle.e1.bssv.JP420000/}e1Message" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "e1MessageList", propOrder = { "e1Messages" })
public class E1MessageList {

    @XmlElement(nillable = true)
    protected List<E1Message> e1Messages;

    /**
     * Gets the value of the e1Messages property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1Messages property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1Messages().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E1Message }
     *
     *
     */
    public List<E1Message> getE1Messages() {
        if (e1Messages == null) {
            e1Messages = new ArrayList<E1Message>();
        }
        return this.e1Messages;
    }

}
