
package jp420000.bssv.e1.oracle;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the jp420000.bssv.e1.oracle package.
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
        new QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException");
    private final static QName _GetCustomerItemPrice_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getCustomerItemPrice");
    private final static QName _GetCustomerItemPriceResponse_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getCustomerItemPriceResponse");
    private final static QName _GetCustomerItemPriceV2_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getCustomerItemPriceV2");
    private final static QName _GetCustomerItemPriceV2Response_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getCustomerItemPriceV2Response");
    private final static QName _GetItemListPrice_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getItemListPrice");
    private final static QName _GetItemListPriceResponse_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getItemListPriceResponse");
    private final static QName _GetItemPriceAndAvailability_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailability");
    private final static QName _GetItemPriceAndAvailabilityResponse_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailabilityResponse");
    private final static QName _GetItemPriceAndAvailabilityV2_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailabilityV2");
    private final static QName _GetItemPriceAndAvailabilityV2Response_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailabilityV2Response");
    private final static QName _GetSalesOrder_QNAME = new QName("http://oracle.e1.bssv.JP420000/", "getSalesOrder");
    private final static QName _GetSalesOrderPriceHistory_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderPriceHistory");
    private final static QName _GetSalesOrderPriceHistoryResponse_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderPriceHistoryResponse");
    private final static QName _GetSalesOrderResponse_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderResponse");
    private final static QName _GetSalesOrderV2_QNAME = new QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderV2");
    private final static QName _GetSalesOrderV2Response_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderV2Response");
    private final static QName _ProcessSalesOrder_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "processSalesOrder");
    private final static QName _ProcessSalesOrderResponse_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderResponse");
    private final static QName _ProcessSalesOrderV2_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV2");
    private final static QName _ProcessSalesOrderV2Response_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV2Response");
    private final static QName _ProcessSalesPriceAdjustment_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "processSalesPriceAdjustment");
    private final static QName _ProcessSalesPriceAdjustmentResponse_QNAME =
        new QName("http://oracle.e1.bssv.JP420000/", "processSalesPriceAdjustmentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp420000.bssv.e1.oracle
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
     * Create an instance of {@link GetCustomerItemPrice }
     *
     */
    public GetCustomerItemPrice createGetCustomerItemPrice() {
        return new GetCustomerItemPrice();
    }

    /**
     * Create an instance of {@link ShowCustomerItemPrice }
     *
     */
    public ShowCustomerItemPrice createShowCustomerItemPrice() {
        return new ShowCustomerItemPrice();
    }

    /**
     * Create an instance of {@link GetCustomerItemPriceV2 }
     *
     */
    public GetCustomerItemPriceV2 createGetCustomerItemPriceV2() {
        return new GetCustomerItemPriceV2();
    }

    /**
     * Create an instance of {@link ShowCustomerItemPriceV2 }
     *
     */
    public ShowCustomerItemPriceV2 createShowCustomerItemPriceV2() {
        return new ShowCustomerItemPriceV2();
    }

    /**
     * Create an instance of {@link GetItemListPrice }
     *
     */
    public GetItemListPrice createGetItemListPrice() {
        return new GetItemListPrice();
    }

    /**
     * Create an instance of {@link ShowItemListPrice }
     *
     */
    public ShowItemListPrice createShowItemListPrice() {
        return new ShowItemListPrice();
    }

    /**
     * Create an instance of {@link GetItemPriceAndAvailability }
     *
     */
    public GetItemPriceAndAvailability createGetItemPriceAndAvailability() {
        return new GetItemPriceAndAvailability();
    }

    /**
     * Create an instance of {@link ShowItemPriceAndAvailability }
     *
     */
    public ShowItemPriceAndAvailability createShowItemPriceAndAvailability() {
        return new ShowItemPriceAndAvailability();
    }

    /**
     * Create an instance of {@link GetItemPriceAndAvailabilityV2 }
     *
     */
    public GetItemPriceAndAvailabilityV2 createGetItemPriceAndAvailabilityV2() {
        return new GetItemPriceAndAvailabilityV2();
    }

    /**
     * Create an instance of {@link ShowItemPriceAndAvailabilityV2 }
     *
     */
    public ShowItemPriceAndAvailabilityV2 createShowItemPriceAndAvailabilityV2() {
        return new ShowItemPriceAndAvailabilityV2();
    }

    /**
     * Create an instance of {@link GetSalesOrder }
     *
     */
    public GetSalesOrder createGetSalesOrder() {
        return new GetSalesOrder();
    }

    /**
     * Create an instance of {@link GetSalesOrderPriceHistory }
     *
     */
    public GetSalesOrderPriceHistory createGetSalesOrderPriceHistory() {
        return new GetSalesOrderPriceHistory();
    }

    /**
     * Create an instance of {@link ShowSalesOrderPriceHistory }
     *
     */
    public ShowSalesOrderPriceHistory createShowSalesOrderPriceHistory() {
        return new ShowSalesOrderPriceHistory();
    }

    /**
     * Create an instance of {@link ShowSalesOrder }
     *
     */
    public ShowSalesOrder createShowSalesOrder() {
        return new ShowSalesOrder();
    }

    /**
     * Create an instance of {@link ShowSalesOrderV2 }
     *
     */
    public ShowSalesOrderV2 createShowSalesOrderV2() {
        return new ShowSalesOrderV2();
    }

    /**
     * Create an instance of {@link ProcessSalesOrder }
     *
     */
    public ProcessSalesOrder createProcessSalesOrder() {
        return new ProcessSalesOrder();
    }

    /**
     * Create an instance of {@link ConfirmSalesOrder }
     *
     */
    public ConfirmSalesOrder createConfirmSalesOrder() {
        return new ConfirmSalesOrder();
    }

    /**
     * Create an instance of {@link ProcessSalesOrderV2 }
     *
     */
    public ProcessSalesOrderV2 createProcessSalesOrderV2() {
        return new ProcessSalesOrderV2();
    }

    /**
     * Create an instance of {@link ConfirmSalesOrderV2 }
     *
     */
    public ConfirmSalesOrderV2 createConfirmSalesOrderV2() {
        return new ConfirmSalesOrderV2();
    }

    /**
     * Create an instance of {@link ProcessSalesPriceAdjustment }
     *
     */
    public ProcessSalesPriceAdjustment createProcessSalesPriceAdjustment() {
        return new ProcessSalesPriceAdjustment();
    }

    /**
     * Create an instance of {@link ConfirmSalesPriceAdjustment }
     *
     */
    public ConfirmSalesPriceAdjustment createConfirmSalesPriceAdjustment() {
        return new ConfirmSalesPriceAdjustment();
    }

    /**
     * Create an instance of {@link ValueObject }
     *
     */
    public ValueObject createValueObject() {
        return new ValueObject();
    }

    /**
     * Create an instance of {@link ProcessSOHeaderV2 }
     *
     */
    public ProcessSOHeaderV2 createProcessSOHeaderV2() {
        return new ProcessSOHeaderV2();
    }

    /**
     * Create an instance of {@link ProcessSOHeaderBillingV2 }
     *
     */
    public ProcessSOHeaderBillingV2 createProcessSOHeaderBillingV2() {
        return new ProcessSOHeaderBillingV2();
    }

    /**
     * Create an instance of {@link Entity }
     *
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link ProcessSODetailV2 }
     *
     */
    public ProcessSODetailV2 createProcessSODetailV2() {
        return new ProcessSODetailV2();
    }

    /**
     * Create an instance of {@link ProcessSODetailBillingV2 }
     *
     */
    public ProcessSODetailBillingV2 createProcessSODetailBillingV2() {
        return new ProcessSODetailBillingV2();
    }

    /**
     * Create an instance of {@link PricingV2 }
     *
     */
    public PricingV2 createPricingV2() {
        return new PricingV2();
    }

    /**
     * Create an instance of {@link CategoryCodesPurchasing }
     *
     */
    public CategoryCodesPurchasing createCategoryCodesPurchasing() {
        return new CategoryCodesPurchasing();
    }

    /**
     * Create an instance of {@link CategoryCodesSales }
     *
     */
    public CategoryCodesSales createCategoryCodesSales() {
        return new CategoryCodesSales();
    }

    /**
     * Create an instance of {@link ProcessSOOriginalOrder }
     *
     */
    public ProcessSOOriginalOrder createProcessSOOriginalOrder() {
        return new ProcessSOOriginalOrder();
    }

    /**
     * Create an instance of {@link OriginalOrderKey }
     *
     */
    public OriginalOrderKey createOriginalOrderKey() {
        return new OriginalOrderKey();
    }

    /**
     * Create an instance of {@link ProcessSODetailProcessing }
     *
     */
    public ProcessSODetailProcessing createProcessSODetailProcessing() {
        return new ProcessSODetailProcessing();
    }

    /**
     * Create an instance of {@link ProcessSODetailProduct }
     *
     */
    public ProcessSODetailProduct createProcessSODetailProduct() {
        return new ProcessSODetailProduct();
    }

    /**
     * Create an instance of {@link Configuration }
     *
     */
    public Configuration createConfiguration() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link ItemGroupCustomer }
     *
     */
    public ItemGroupCustomer createItemGroupCustomer() {
        return new ItemGroupCustomer();
    }

    /**
     * Create an instance of {@link Segment }
     *
     */
    public Segment createSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link RelatedOrder }
     *
     */
    public RelatedOrder createRelatedOrder() {
        return new RelatedOrder();
    }

    /**
     * Create an instance of {@link RelatedOrderKey }
     *
     */
    public RelatedOrderKey createRelatedOrderKey() {
        return new RelatedOrderKey();
    }

    /**
     * Create an instance of {@link UserReservedData }
     *
     */
    public UserReservedData createUserReservedData() {
        return new UserReservedData();
    }

    /**
     * Create an instance of {@link ProcessSOHeaderProcessing }
     *
     */
    public ProcessSOHeaderProcessing createProcessSOHeaderProcessing() {
        return new ProcessSOHeaderProcessing();
    }

    /**
     * Create an instance of {@link SalesOrderKey }
     *
     */
    public SalesOrderKey createSalesOrderKey() {
        return new SalesOrderKey();
    }

    /**
     * Create an instance of {@link ProcessSOCustomer }
     *
     */
    public ProcessSOCustomer createProcessSOCustomer() {
        return new ProcessSOCustomer();
    }

    /**
     * Create an instance of {@link MessageValueObject }
     *
     */
    public MessageValueObject createMessageValueObject() {
        return new MessageValueObject();
    }

    /**
     * Create an instance of {@link ConfirmSOHeaderV2 }
     *
     */
    public ConfirmSOHeaderV2 createConfirmSOHeaderV2() {
        return new ConfirmSOHeaderV2();
    }

    /**
     * Create an instance of {@link ConfirmSOHeaderDates }
     *
     */
    public ConfirmSOHeaderDates createConfirmSOHeaderDates() {
        return new ConfirmSOHeaderDates();
    }

    /**
     * Create an instance of {@link ConfirmSOHeaderDelivery }
     *
     */
    public ConfirmSOHeaderDelivery createConfirmSOHeaderDelivery() {
        return new ConfirmSOHeaderDelivery();
    }

    /**
     * Create an instance of {@link ConfirmSODetailV2 }
     *
     */
    public ConfirmSODetailV2 createConfirmSODetailV2() {
        return new ConfirmSODetailV2();
    }

    /**
     * Create an instance of {@link ConfirmSODetailDates }
     *
     */
    public ConfirmSODetailDates createConfirmSODetailDates() {
        return new ConfirmSODetailDates();
    }

    /**
     * Create an instance of {@link ConfirmSODetailDelivery }
     *
     */
    public ConfirmSODetailDelivery createConfirmSODetailDelivery() {
        return new ConfirmSODetailDelivery();
    }

    /**
     * Create an instance of {@link ConfirmSODetailFinancialV2 }
     *
     */
    public ConfirmSODetailFinancialV2 createConfirmSODetailFinancialV2() {
        return new ConfirmSODetailFinancialV2();
    }

    /**
     * Create an instance of {@link ConfirmSODetailProduct }
     *
     */
    public ConfirmSODetailProduct createConfirmSODetailProduct() {
        return new ConfirmSODetailProduct();
    }

    /**
     * Create an instance of {@link Quantity }
     *
     */
    public Quantity createQuantity() {
        return new Quantity();
    }

    /**
     * Create an instance of {@link ConfirmSOHeaderFinancial }
     *
     */
    public ConfirmSOHeaderFinancial createConfirmSOHeaderFinancial() {
        return new ConfirmSOHeaderFinancial();
    }

    /**
     * Create an instance of {@link E1MessageList }
     *
     */
    public E1MessageList createE1MessageList() {
        return new E1MessageList();
    }

    /**
     * Create an instance of {@link E1Message }
     *
     */
    public E1Message createE1Message() {
        return new E1Message();
    }

    /**
     * Create an instance of {@link PriceHistory }
     *
     */
    public PriceHistory createPriceHistory() {
        return new PriceHistory();
    }

    /**
     * Create an instance of {@link ShowPriceHistoryDetail }
     *
     */
    public ShowPriceHistoryDetail createShowPriceHistoryDetail() {
        return new ShowPriceHistoryDetail();
    }

    /**
     * Create an instance of {@link PriceAdjustmentLedger }
     *
     */
    public PriceAdjustmentLedger createPriceAdjustmentLedger() {
        return new PriceAdjustmentLedger();
    }

    /**
     * Create an instance of {@link GetSalesHeader }
     *
     */
    public GetSalesHeader createGetSalesHeader() {
        return new GetSalesHeader();
    }

    /**
     * Create an instance of {@link GetSalesDetail }
     *
     */
    public GetSalesDetail createGetSalesDetail() {
        return new GetSalesDetail();
    }

    /**
     * Create an instance of {@link Document }
     *
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link DocumentKey }
     *
     */
    public DocumentKey createDocumentKey() {
        return new DocumentKey();
    }

    /**
     * Create an instance of {@link OriginalOrder }
     *
     */
    public OriginalOrder createOriginalOrder() {
        return new OriginalOrder();
    }

    /**
     * Create an instance of {@link GetDetailProduct }
     *
     */
    public GetDetailProduct createGetDetailProduct() {
        return new GetDetailProduct();
    }

    /**
     * Create an instance of {@link ShowSalesHeaderV2 }
     *
     */
    public ShowSalesHeaderV2 createShowSalesHeaderV2() {
        return new ShowSalesHeaderV2();
    }

    /**
     * Create an instance of {@link ShowSalesDetailV2 }
     *
     */
    public ShowSalesDetailV2 createShowSalesDetailV2() {
        return new ShowSalesDetailV2();
    }

    /**
     * Create an instance of {@link ShowSalesDetailLineBillingV2 }
     *
     */
    public ShowSalesDetailLineBillingV2 createShowSalesDetailLineBillingV2() {
        return new ShowSalesDetailLineBillingV2();
    }

    /**
     * Create an instance of {@link ShowSalesDetailLinePricingV2 }
     *
     */
    public ShowSalesDetailLinePricingV2 createShowSalesDetailLinePricingV2() {
        return new ShowSalesDetailLinePricingV2();
    }

    /**
     * Create an instance of {@link ShowSalesDetailOriginalOrder }
     *
     */
    public ShowSalesDetailOriginalOrder createShowSalesDetailOriginalOrder() {
        return new ShowSalesDetailOriginalOrder();
    }

    /**
     * Create an instance of {@link ShowSalesDetailProduct }
     *
     */
    public ShowSalesDetailProduct createShowSalesDetailProduct() {
        return new ShowSalesDetailProduct();
    }

    /**
     * Create an instance of {@link ShowDetailItem }
     *
     */
    public ShowDetailItem createShowDetailItem() {
        return new ShowDetailItem();
    }

    /**
     * Create an instance of {@link ShowSalesShipTo }
     *
     */
    public ShowSalesShipTo createShowSalesShipTo() {
        return new ShowSalesShipTo();
    }

    /**
     * Create an instance of {@link ProcessingVersion }
     *
     */
    public ProcessingVersion createProcessingVersion() {
        return new ProcessingVersion();
    }

    /**
     * Create an instance of {@link ProductIn }
     *
     */
    public ProductIn createProductIn() {
        return new ProductIn();
    }

    /**
     * Create an instance of {@link ProductOutV2 }
     *
     */
    public ProductOutV2 createProductOutV2() {
        return new ProductOutV2();
    }

    /**
     * Create an instance of {@link Availability }
     *
     */
    public Availability createAvailability() {
        return new Availability();
    }

    /**
     * Create an instance of {@link Warehouse }
     *
     */
    public Warehouse createWarehouse() {
        return new Warehouse();
    }

    /**
     * Create an instance of {@link WarehouseAddress }
     *
     */
    public WarehouseAddress createWarehouseAddress() {
        return new WarehouseAddress();
    }

    /**
     * Create an instance of {@link Dates }
     *
     */
    public Dates createDates() {
        return new Dates();
    }

    /**
     * Create an instance of {@link Financial }
     *
     */
    public Financial createFinancial() {
        return new Financial();
    }

    /**
     * Create an instance of {@link Processing }
     *
     */
    public Processing createProcessing() {
        return new Processing();
    }

    /**
     * Create an instance of {@link ProcessSOHeader }
     *
     */
    public ProcessSOHeader createProcessSOHeader() {
        return new ProcessSOHeader();
    }

    /**
     * Create an instance of {@link ProcessSOHeaderBilling }
     *
     */
    public ProcessSOHeaderBilling createProcessSOHeaderBilling() {
        return new ProcessSOHeaderBilling();
    }

    /**
     * Create an instance of {@link ProcessSODetail }
     *
     */
    public ProcessSODetail createProcessSODetail() {
        return new ProcessSODetail();
    }

    /**
     * Create an instance of {@link ProcessSODetailBilling }
     *
     */
    public ProcessSODetailBilling createProcessSODetailBilling() {
        return new ProcessSODetailBilling();
    }

    /**
     * Create an instance of {@link Pricing }
     *
     */
    public Pricing createPricing() {
        return new Pricing();
    }

    /**
     * Create an instance of {@link ConfirmSOHeader }
     *
     */
    public ConfirmSOHeader createConfirmSOHeader() {
        return new ConfirmSOHeader();
    }

    /**
     * Create an instance of {@link ConfirmSODetail }
     *
     */
    public ConfirmSODetail createConfirmSODetail() {
        return new ConfirmSODetail();
    }

    /**
     * Create an instance of {@link ConfirmSODetailFinancial }
     *
     */
    public ConfirmSODetailFinancial createConfirmSODetailFinancial() {
        return new ConfirmSODetailFinancial();
    }

    /**
     * Create an instance of {@link ProductOut }
     *
     */
    public ProductOut createProductOut() {
        return new ProductOut();
    }

    /**
     * Create an instance of {@link ItemListPriceShared }
     *
     */
    public ItemListPriceShared createItemListPriceShared() {
        return new ItemListPriceShared();
    }

    /**
     * Create an instance of {@link ItemListPriceRecord }
     *
     */
    public ItemListPriceRecord createItemListPriceRecord() {
        return new ItemListPriceRecord();
    }

    /**
     * Create an instance of {@link ShowSalesHeader }
     *
     */
    public ShowSalesHeader createShowSalesHeader() {
        return new ShowSalesHeader();
    }

    /**
     * Create an instance of {@link ShowSalesDetail }
     *
     */
    public ShowSalesDetail createShowSalesDetail() {
        return new ShowSalesDetail();
    }

    /**
     * Create an instance of {@link ShowSalesDetailLineBilling }
     *
     */
    public ShowSalesDetailLineBilling createShowSalesDetailLineBilling() {
        return new ShowSalesDetailLineBilling();
    }

    /**
     * Create an instance of {@link ShowSalesDetailLinePricing }
     *
     */
    public ShowSalesDetailLinePricing createShowSalesDetailLinePricing() {
        return new ShowSalesDetailLinePricing();
    }

    /**
     * Create an instance of {@link Customer }
     *
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Product }
     *
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessServiceException }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BusinessServiceException }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "BusinessServiceException")
    public JAXBElement<BusinessServiceException> createBusinessServiceException(BusinessServiceException value) {
        return new JAXBElement<BusinessServiceException>(_BusinessServiceException_QNAME,
                                                         BusinessServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerItemPrice }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerItemPrice }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getCustomerItemPrice")
    public JAXBElement<GetCustomerItemPrice> createGetCustomerItemPrice(GetCustomerItemPrice value) {
        return new JAXBElement<GetCustomerItemPrice>(_GetCustomerItemPrice_QNAME, GetCustomerItemPrice.class, null,
                                                     value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCustomerItemPrice }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowCustomerItemPrice }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getCustomerItemPriceResponse")
    public JAXBElement<ShowCustomerItemPrice> createGetCustomerItemPriceResponse(ShowCustomerItemPrice value) {
        return new JAXBElement<ShowCustomerItemPrice>(_GetCustomerItemPriceResponse_QNAME, ShowCustomerItemPrice.class,
                                                      null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerItemPriceV2 }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerItemPriceV2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getCustomerItemPriceV2")
    public JAXBElement<GetCustomerItemPriceV2> createGetCustomerItemPriceV2(GetCustomerItemPriceV2 value) {
        return new JAXBElement<GetCustomerItemPriceV2>(_GetCustomerItemPriceV2_QNAME, GetCustomerItemPriceV2.class,
                                                       null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCustomerItemPriceV2 }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowCustomerItemPriceV2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getCustomerItemPriceV2Response")
    public JAXBElement<ShowCustomerItemPriceV2> createGetCustomerItemPriceV2Response(ShowCustomerItemPriceV2 value) {
        return new JAXBElement<ShowCustomerItemPriceV2>(_GetCustomerItemPriceV2Response_QNAME,
                                                        ShowCustomerItemPriceV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemListPrice }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetItemListPrice }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getItemListPrice")
    public JAXBElement<GetItemListPrice> createGetItemListPrice(GetItemListPrice value) {
        return new JAXBElement<GetItemListPrice>(_GetItemListPrice_QNAME, GetItemListPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowItemListPrice }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowItemListPrice }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getItemListPriceResponse")
    public JAXBElement<ShowItemListPrice> createGetItemListPriceResponse(ShowItemListPrice value) {
        return new JAXBElement<ShowItemListPrice>(_GetItemListPriceResponse_QNAME, ShowItemListPrice.class, null,
                                                  value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemPriceAndAvailability }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetItemPriceAndAvailability }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getItemPriceAndAvailability")
    public JAXBElement<GetItemPriceAndAvailability> createGetItemPriceAndAvailability(GetItemPriceAndAvailability value) {
        return new JAXBElement<GetItemPriceAndAvailability>(_GetItemPriceAndAvailability_QNAME,
                                                            GetItemPriceAndAvailability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowItemPriceAndAvailability }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowItemPriceAndAvailability }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getItemPriceAndAvailabilityResponse")
    public JAXBElement<ShowItemPriceAndAvailability> createGetItemPriceAndAvailabilityResponse(ShowItemPriceAndAvailability value) {
        return new JAXBElement<ShowItemPriceAndAvailability>(_GetItemPriceAndAvailabilityResponse_QNAME,
                                                             ShowItemPriceAndAvailability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemPriceAndAvailabilityV2 }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetItemPriceAndAvailabilityV2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getItemPriceAndAvailabilityV2")
    public JAXBElement<GetItemPriceAndAvailabilityV2> createGetItemPriceAndAvailabilityV2(GetItemPriceAndAvailabilityV2 value) {
        return new JAXBElement<GetItemPriceAndAvailabilityV2>(_GetItemPriceAndAvailabilityV2_QNAME,
                                                              GetItemPriceAndAvailabilityV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowItemPriceAndAvailabilityV2 }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowItemPriceAndAvailabilityV2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getItemPriceAndAvailabilityV2Response")
    public JAXBElement<ShowItemPriceAndAvailabilityV2> createGetItemPriceAndAvailabilityV2Response(ShowItemPriceAndAvailabilityV2 value) {
        return new JAXBElement<ShowItemPriceAndAvailabilityV2>(_GetItemPriceAndAvailabilityV2Response_QNAME,
                                                               ShowItemPriceAndAvailabilityV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesOrder }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSalesOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getSalesOrder")
    public JAXBElement<GetSalesOrder> createGetSalesOrder(GetSalesOrder value) {
        return new JAXBElement<GetSalesOrder>(_GetSalesOrder_QNAME, GetSalesOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesOrderPriceHistory }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSalesOrderPriceHistory }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getSalesOrderPriceHistory")
    public JAXBElement<GetSalesOrderPriceHistory> createGetSalesOrderPriceHistory(GetSalesOrderPriceHistory value) {
        return new JAXBElement<GetSalesOrderPriceHistory>(_GetSalesOrderPriceHistory_QNAME,
                                                          GetSalesOrderPriceHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowSalesOrderPriceHistory }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowSalesOrderPriceHistory }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getSalesOrderPriceHistoryResponse")
    public JAXBElement<ShowSalesOrderPriceHistory> createGetSalesOrderPriceHistoryResponse(ShowSalesOrderPriceHistory value) {
        return new JAXBElement<ShowSalesOrderPriceHistory>(_GetSalesOrderPriceHistoryResponse_QNAME,
                                                           ShowSalesOrderPriceHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowSalesOrder }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowSalesOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getSalesOrderResponse")
    public JAXBElement<ShowSalesOrder> createGetSalesOrderResponse(ShowSalesOrder value) {
        return new JAXBElement<ShowSalesOrder>(_GetSalesOrderResponse_QNAME, ShowSalesOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesOrder }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSalesOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getSalesOrderV2")
    public JAXBElement<GetSalesOrder> createGetSalesOrderV2(GetSalesOrder value) {
        return new JAXBElement<GetSalesOrder>(_GetSalesOrderV2_QNAME, GetSalesOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowSalesOrderV2 }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowSalesOrderV2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "getSalesOrderV2Response")
    public JAXBElement<ShowSalesOrderV2> createGetSalesOrderV2Response(ShowSalesOrderV2 value) {
        return new JAXBElement<ShowSalesOrderV2>(_GetSalesOrderV2Response_QNAME, ShowSalesOrderV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessSalesOrder }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessSalesOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "processSalesOrder")
    public JAXBElement<ProcessSalesOrder> createProcessSalesOrder(ProcessSalesOrder value) {
        return new JAXBElement<ProcessSalesOrder>(_ProcessSalesOrder_QNAME, ProcessSalesOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmSalesOrder }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfirmSalesOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "processSalesOrderResponse")
    public JAXBElement<ConfirmSalesOrder> createProcessSalesOrderResponse(ConfirmSalesOrder value) {
        return new JAXBElement<ConfirmSalesOrder>(_ProcessSalesOrderResponse_QNAME, ConfirmSalesOrder.class, null,
                                                  value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessSalesOrderV2 }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessSalesOrderV2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "processSalesOrderV2")
    public JAXBElement<ProcessSalesOrderV2> createProcessSalesOrderV2(ProcessSalesOrderV2 value) {
        return new JAXBElement<ProcessSalesOrderV2>(_ProcessSalesOrderV2_QNAME, ProcessSalesOrderV2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmSalesOrderV2 }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfirmSalesOrderV2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "processSalesOrderV2Response")
    public JAXBElement<ConfirmSalesOrderV2> createProcessSalesOrderV2Response(ConfirmSalesOrderV2 value) {
        return new JAXBElement<ConfirmSalesOrderV2>(_ProcessSalesOrderV2Response_QNAME, ConfirmSalesOrderV2.class, null,
                                                    value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessSalesPriceAdjustment }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessSalesPriceAdjustment }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "processSalesPriceAdjustment")
    public JAXBElement<ProcessSalesPriceAdjustment> createProcessSalesPriceAdjustment(ProcessSalesPriceAdjustment value) {
        return new JAXBElement<ProcessSalesPriceAdjustment>(_ProcessSalesPriceAdjustment_QNAME,
                                                            ProcessSalesPriceAdjustment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmSalesPriceAdjustment }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfirmSalesPriceAdjustment }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.e1.bssv.JP420000/", name = "processSalesPriceAdjustmentResponse")
    public JAXBElement<ConfirmSalesPriceAdjustment> createProcessSalesPriceAdjustmentResponse(ConfirmSalesPriceAdjustment value) {
        return new JAXBElement<ConfirmSalesPriceAdjustment>(_ProcessSalesPriceAdjustmentResponse_QNAME,
                                                            ConfirmSalesPriceAdjustment.class, null, value);
    }

}
