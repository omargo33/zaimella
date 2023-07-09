
package jp594205.bssv.e1.oracle;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the jp594205.bssv.e1.oracle package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BusinessServiceException_QNAME =
        new QName("http://oracle.e1.bssv.JP594205/", "BusinessServiceException");
    private final static QName _SalesShippingConfirmation_QNAME =
        new QName("http://oracle.e1.bssv.JP594205/", "SalesShippingConfirmation");
    private final static QName _SalesShippingConfirmationResponse_QNAME =
        new QName("http://oracle.e1.bssv.JP594205/", "SalesShippingConfirmationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp594205.bssv.e1.oracle
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusinessServiceException }
     *
     */
    public BusinessServiceException createBusinessServiceException() {
        return new BusinessServiceException();
    }

    /**
     * Create an instance of {@link VoD554205A1INPUT }
     *
     */
    public VoD554205A1INPUT createVoD554205A1INPUT() {
        return new VoD554205A1INPUT();
    }

    /**
     * Create an instance of {@link VoD554205A1OUTPUT }
     *
     */
    public VoD554205A1OUTPUT createVoD554205A1OUTPUT() {
        return new VoD554205A1OUTPUT();
    }

    /**
     * Create an instance of {@link ValueObject }
     *
     */
    public ValueObject createValueObject() {
        return new ValueObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessServiceException }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BusinessServiceException }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP594205/", name = "BusinessServiceException")
    public JAXBElement<BusinessServiceException> createBusinessServiceException(BusinessServiceException value) {
        return new JAXBElement<BusinessServiceException>(_BusinessServiceException_QNAME,
                                                         BusinessServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoD554205A1INPUT }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VoD554205A1INPUT }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP594205/", name = "SalesShippingConfirmation")
    public JAXBElement<VoD554205A1INPUT> createSalesShippingConfirmation(VoD554205A1INPUT value) {
        return new JAXBElement<VoD554205A1INPUT>(_SalesShippingConfirmation_QNAME, VoD554205A1INPUT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoD554205A1OUTPUT }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VoD554205A1OUTPUT }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP594205/", name = "SalesShippingConfirmationResponse")
    public JAXBElement<VoD554205A1OUTPUT> createSalesShippingConfirmationResponse(VoD554205A1OUTPUT value) {
        return new JAXBElement<VoD554205A1OUTPUT>(_SalesShippingConfirmationResponse_QNAME, VoD554205A1OUTPUT.class,
                                                  null, value);
    }

}
