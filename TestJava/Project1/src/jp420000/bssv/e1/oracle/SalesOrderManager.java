
package jp420000.bssv.e1.oracle;

import java.math.BigDecimal;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebService(name = "SalesOrderManager", targetNamespace = "http://oracle.e1.bssv.JP420000/")
@XmlSeeAlso({ ObjectFactory.class })
public interface SalesOrderManager {


    /**
     *
     * @param item
     * @param e1MessageList
     * @param adjustmentTypeCode
     * @param promotionAddChangeMask
     * @param financial
     * @param priceAdjustmentId
     * @param processing
     * @param dates
     * @param costTypeCode
     * @param unitOfMeasureTransaction
     * @param customer
     * @throws BusinessServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "processSalesPriceAdjustment", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                    className = "jp420000.bssv.e1.oracle.ProcessSalesPriceAdjustment")
    @ResponseWrapper(localName = "processSalesPriceAdjustmentResponse",
                     targetNamespace = "http://oracle.e1.bssv.JP420000/",
                     className = "jp420000.bssv.e1.oracle.ConfirmSalesPriceAdjustment")
    public void processSalesPriceAdjustment(@WebParam(name = "adjustmentTypeCode", targetNamespace = "",
                                                      mode = WebParam.Mode.INOUT) Holder<String> adjustmentTypeCode,
                                            @WebParam(name = "costTypeCode", targetNamespace = "",
                                                      mode = WebParam.Mode.INOUT) Holder<String> costTypeCode,
                                            @WebParam(name = "customer", targetNamespace = "",
                                                      mode = WebParam.Mode.INOUT) Holder<Entity> customer,
                                            @WebParam(name = "dates", targetNamespace = "") Dates dates,
                                            @WebParam(name = "financial", targetNamespace = "",
                                                      mode = WebParam.Mode.INOUT) Holder<Financial> financial,
                                            @WebParam(name = "item", targetNamespace = "", mode = WebParam.Mode.INOUT)
                                            Holder<ItemGroupCustomer> item,
                                            @WebParam(name = "priceAdjustmentId", targetNamespace = "",
                                                      mode = WebParam.Mode.INOUT) Holder<Integer> priceAdjustmentId,
                                            @WebParam(name = "processing", targetNamespace = "",
                                                      mode = WebParam.Mode.INOUT) Holder<Processing> processing,
                                            @WebParam(name = "promotionAddChangeMask", targetNamespace = "")
                                            String promotionAddChangeMask,
                                            @WebParam(name = "unitOfMeasureTransaction", targetNamespace = "",
                                                      mode = WebParam.Mode.INOUT)
                                            Holder<String> unitOfMeasureTransaction,
                                            @WebParam(name = "e1MessageList", targetNamespace = "",
                                                      mode = WebParam.Mode.OUT)
                                            Holder<E1MessageList> e1MessageList) throws BusinessServiceException_Exception;

    /**
     *
     * @param product
     * @param businessUnit
     * @param e1MessageList
     * @param processing
     * @param product0
     * @param currencyCode
     * @param adjustmentScheduleCode
     * @param customer
     * @throws BusinessServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "getItemPriceAndAvailability", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                    className = "jp420000.bssv.e1.oracle.GetItemPriceAndAvailability")
    @ResponseWrapper(localName = "getItemPriceAndAvailabilityResponse",
                     targetNamespace = "http://oracle.e1.bssv.JP420000/",
                     className = "jp420000.bssv.e1.oracle.ShowItemPriceAndAvailability")
    public void getItemPriceAndAvailability(@WebParam(name = "adjustmentScheduleCode", targetNamespace = "")
                                            String adjustmentScheduleCode,
                                            @WebParam(name = "businessUnit", targetNamespace = "") String businessUnit,
                                            @WebParam(name = "currencyCode", targetNamespace = "",
                                                      mode = WebParam.Mode.INOUT) Holder<String> currencyCode,
                                            @WebParam(name = "customer", targetNamespace = "") Entity customer,
                                            @WebParam(name = "processing", targetNamespace = "")
                                            ProcessingVersion processing,
                                            @WebParam(name = "product", targetNamespace = "") ProductIn product,
                                            @WebParam(name = "e1MessageList", targetNamespace = "",
                                                      mode = WebParam.Mode.OUT) Holder<E1MessageList> e1MessageList,
                                            @WebParam(name = "product", targetNamespace = "", mode = WebParam.Mode.OUT)
                                            Holder<ProductOut> product0) throws BusinessServiceException_Exception;

    /**
     *
     * @param product
     * @param businessUnit
     * @param e1MessageList
     * @param processing
     * @param product0
     * @param currencyCode
     * @param adjustmentScheduleCode
     * @param useTaxedPrices
     * @param customer
     * @throws BusinessServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "getItemPriceAndAvailabilityV2", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                    className = "jp420000.bssv.e1.oracle.GetItemPriceAndAvailabilityV2")
    @ResponseWrapper(localName = "getItemPriceAndAvailabilityV2Response",
                     targetNamespace = "http://oracle.e1.bssv.JP420000/",
                     className = "jp420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV2")
    public void getItemPriceAndAvailabilityV2(@WebParam(name = "adjustmentScheduleCode", targetNamespace = "")
                                              String adjustmentScheduleCode,
                                              @WebParam(name = "businessUnit", targetNamespace = "")
                                              String businessUnit,
                                              @WebParam(name = "currencyCode", targetNamespace = "",
                                                        mode = WebParam.Mode.INOUT) Holder<String> currencyCode,
                                              @WebParam(name = "customer", targetNamespace = "") Entity customer,
                                              @WebParam(name = "processing", targetNamespace = "")
                                              ProcessingVersion processing,
                                              @WebParam(name = "product", targetNamespace = "") ProductIn product,
                                              @WebParam(name = "useTaxedPrices", targetNamespace = "",
                                                        mode = WebParam.Mode.INOUT) Holder<Boolean> useTaxedPrices,
                                              @WebParam(name = "e1MessageList", targetNamespace = "",
                                                        mode = WebParam.Mode.OUT) Holder<E1MessageList> e1MessageList,
                                              @WebParam(name = "product", targetNamespace = "",
                                                        mode = WebParam.Mode.OUT)
                                              Holder<ProductOutV2> product0) throws BusinessServiceException_Exception;

    /**
     *
     * @param transactionQuantity
     * @param businessUnit
     * @param modeOfTransportCode
     * @param priceAdjustmentId
     * @param quantityOrdered
     * @param endUseCode
     * @param priceUnitForeign
     * @param priceExtendedDomestic
     * @param customerPriceGroupCode
     * @param priceListForeign
     * @param paymentTermsCode
     * @param zoneNumber
     * @param costExtendedForeign
     * @param unitOfMeasureCodeTransaction
     * @param discountTrade
     * @param priceExtendedForeign
     * @param freightHandlingCode
     * @param lineOfBusinessCode
     * @param rateExchange
     * @param priceCode2
     * @param routeCode
     * @param priceCode3
     * @param stopCode
     * @param product
     * @param statusCodeDuty
     * @param priceCode1
     * @param costUnitForeign
     * @param currencyModeCode
     * @param priceListDomestic
     * @param priceUnitDomestic
     * @param carrier
     * @param e1MessageList
     * @param datePriceEffective
     * @param unitOfMeasureCodePricing
     * @param agreementID
     * @param costExtendedDomestic
     * @param costUnitDomestic
     * @param paymentInstrumentCode
     * @param processing
     * @param currencyCode
     * @param customer
     * @throws BusinessServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "getCustomerItemPrice", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                    className = "jp420000.bssv.e1.oracle.GetCustomerItemPrice")
    @ResponseWrapper(localName = "getCustomerItemPriceResponse", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                     className = "jp420000.bssv.e1.oracle.ShowCustomerItemPrice")
    public void getCustomerItemPrice(@WebParam(name = "agreementID", targetNamespace = "") String agreementID,
                                     @WebParam(name = "businessUnit", targetNamespace = "", mode = WebParam.Mode.INOUT)
                                     Holder<String> businessUnit,
                                     @WebParam(name = "carrier", targetNamespace = "") Entity carrier,
                                     @WebParam(name = "currencyCode", targetNamespace = "", mode = WebParam.Mode.INOUT)
                                     Holder<String> currencyCode,
                                     @WebParam(name = "customer", targetNamespace = "", mode = WebParam.Mode.INOUT)
                                     Holder<Customer> customer,
                                     @WebParam(name = "customerPriceGroupCode", targetNamespace = "")
                                     String customerPriceGroupCode,
                                     @WebParam(name = "datePriceEffective", targetNamespace = "",
                                               mode = WebParam.Mode.INOUT)
                                     Holder<XMLGregorianCalendar> datePriceEffective,
                                     @WebParam(name = "discountTrade", targetNamespace = "") BigDecimal discountTrade,
                                     @WebParam(name = "endUseCode", targetNamespace = "") String endUseCode,
                                     @WebParam(name = "freightHandlingCode", targetNamespace = "")
                                     String freightHandlingCode,
                                     @WebParam(name = "lineOfBusinessCode", targetNamespace = "")
                                     String lineOfBusinessCode,
                                     @WebParam(name = "modeOfTransportCode", targetNamespace = "")
                                     String modeOfTransportCode,
                                     @WebParam(name = "paymentInstrumentCode", targetNamespace = "")
                                     String paymentInstrumentCode,
                                     @WebParam(name = "paymentTermsCode", targetNamespace = "") String paymentTermsCode,
                                     @WebParam(name = "priceAdjustmentId", targetNamespace = "")
                                     String priceAdjustmentId,
                                     @WebParam(name = "priceCode1", targetNamespace = "") String priceCode1,
                                     @WebParam(name = "priceCode2", targetNamespace = "") String priceCode2,
                                     @WebParam(name = "priceCode3", targetNamespace = "") String priceCode3,
                                     @WebParam(name = "processing", targetNamespace = "") ProcessingVersion processing,
                                     @WebParam(name = "product", targetNamespace = "", mode = WebParam.Mode.INOUT)
                                     Holder<Product> product,
                                     @WebParam(name = "rateExchange", targetNamespace = "") BigDecimal rateExchange,
                                     @WebParam(name = "routeCode", targetNamespace = "") String routeCode,
                                     @WebParam(name = "statusCodeDuty", targetNamespace = "") String statusCodeDuty,
                                     @WebParam(name = "stopCode", targetNamespace = "") String stopCode,
                                     @WebParam(name = "transactionQuantity", targetNamespace = "")
                                     BigDecimal transactionQuantity,
                                     @WebParam(name = "unitOfMeasureCodePricing", targetNamespace = "",
                                               mode = WebParam.Mode.INOUT) Holder<String> unitOfMeasureCodePricing,
                                     @WebParam(name = "unitOfMeasureCodeTransaction", targetNamespace = "",
                                               mode = WebParam.Mode.INOUT) Holder<String> unitOfMeasureCodeTransaction,
                                     @WebParam(name = "zoneNumber", targetNamespace = "") String zoneNumber,
                                     @WebParam(name = "e1MessageList", targetNamespace = "", mode = WebParam.Mode.OUT)
                                     Holder<E1MessageList> e1MessageList,
                                     @WebParam(name = "costExtendedDomestic", targetNamespace = "",
                                               mode = WebParam.Mode.OUT) Holder<BigDecimal> costExtendedDomestic,
                                     @WebParam(name = "costExtendedForeign", targetNamespace = "",
                                               mode = WebParam.Mode.OUT) Holder<BigDecimal> costExtendedForeign,
                                     @WebParam(name = "costUnitDomestic", targetNamespace = "",
                                               mode = WebParam.Mode.OUT) Holder<BigDecimal> costUnitDomestic,
                                     @WebParam(name = "costUnitForeign", targetNamespace = "", mode = WebParam.Mode.OUT)
                                     Holder<BigDecimal> costUnitForeign,
                                     @WebParam(name = "currencyModeCode", targetNamespace = "",
                                               mode = WebParam.Mode.OUT) Holder<String> currencyModeCode,
                                     @WebParam(name = "priceExtendedDomestic", targetNamespace = "",
                                               mode = WebParam.Mode.OUT) Holder<BigDecimal> priceExtendedDomestic,
                                     @WebParam(name = "priceExtendedForeign", targetNamespace = "",
                                               mode = WebParam.Mode.OUT) Holder<BigDecimal> priceExtendedForeign,
                                     @WebParam(name = "priceListDomestic", targetNamespace = "",
                                               mode = WebParam.Mode.OUT) Holder<BigDecimal> priceListDomestic,
                                     @WebParam(name = "priceListForeign", targetNamespace = "",
                                               mode = WebParam.Mode.OUT) Holder<BigDecimal> priceListForeign,
                                     @WebParam(name = "priceUnitDomestic", targetNamespace = "",
                                               mode = WebParam.Mode.OUT) Holder<BigDecimal> priceUnitDomestic,
                                     @WebParam(name = "priceUnitForeign", targetNamespace = "",
                                               mode = WebParam.Mode.OUT) Holder<BigDecimal> priceUnitForeign,
                                     @WebParam(name = "quantityOrdered", targetNamespace = "", mode = WebParam.Mode.OUT)
                                     Holder<BigDecimal> quantityOrdered) throws BusinessServiceException_Exception;

    /**
     *
     * @param businessUnit
     * @param taxedPriceUnitForeign
     * @param endUseCode
     * @param priceUnitForeign
     * @param priceExtendedDomestic
     * @param customerPriceGroupCode
     * @param priceListForeign
     * @param zoneNumber
     * @param costExtendedForeign
     * @param unitOfMeasureCodeTransaction
     * @param freightHandlingCode
     * @param lineOfBusinessCode
     * @param taxAmountUnitDomestic
     * @param priceCode2
     * @param routeCode
     * @param priceCode3
     * @param stopCode
     * @param statusCodeDuty
     * @param taxAmountExtendedForeign
     * @param priceCode1
     * @param dateTaxedPricesEffective
     * @param currencyModeCode
     * @param taxedPriceUnitDomestic
     * @param priceUnitDomestic
     * @param e1MessageList
     * @param agreementID
     * @param processing
     * @param transactionQuantity
     * @param modeOfTransportCode
     * @param priceAdjustmentId
     * @param quantityOrdered
     * @param taxedPriceExtendedDomestic
     * @param paymentTermsCode
     * @param discountTrade
     * @param priceExtendedForeign
     * @param rateExchange
     * @param taxAmountExtendedDomestic
     * @param product
     * @param costUnitForeign
     * @param priceListDomestic
     * @param useTaxedPrices
     * @param carrier
     * @param taxedPriceExtendedForeign
     * @param datePriceEffective
     * @param unitOfMeasureCodePricing
     * @param taxAmountUnitForeign
     * @param costExtendedDomestic
     * @param costUnitDomestic
     * @param paymentInstrumentCode
     * @param currencyCode
     * @param customer
     * @throws BusinessServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "getCustomerItemPriceV2", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                    className = "jp420000.bssv.e1.oracle.GetCustomerItemPriceV2")
    @ResponseWrapper(localName = "getCustomerItemPriceV2Response", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                     className = "jp420000.bssv.e1.oracle.ShowCustomerItemPriceV2")
    public void getCustomerItemPriceV2(@WebParam(name = "agreementID", targetNamespace = "") String agreementID,
                                       @WebParam(name = "businessUnit", targetNamespace = "",
                                                 mode = WebParam.Mode.INOUT) Holder<String> businessUnit,
                                       @WebParam(name = "carrier", targetNamespace = "") Entity carrier,
                                       @WebParam(name = "currencyCode", targetNamespace = "",
                                                 mode = WebParam.Mode.INOUT) Holder<String> currencyCode,
                                       @WebParam(name = "customer", targetNamespace = "", mode = WebParam.Mode.INOUT)
                                       Holder<Customer> customer,
                                       @WebParam(name = "customerPriceGroupCode", targetNamespace = "")
                                       String customerPriceGroupCode,
                                       @WebParam(name = "datePriceEffective", targetNamespace = "",
                                                 mode = WebParam.Mode.INOUT)
                                       Holder<XMLGregorianCalendar> datePriceEffective,
                                       @WebParam(name = "dateTaxedPricesEffective", targetNamespace = "",
                                                 mode = WebParam.Mode.INOUT)
                                       Holder<XMLGregorianCalendar> dateTaxedPricesEffective,
                                       @WebParam(name = "discountTrade", targetNamespace = "") BigDecimal discountTrade,
                                       @WebParam(name = "endUseCode", targetNamespace = "") String endUseCode,
                                       @WebParam(name = "freightHandlingCode", targetNamespace = "")
                                       String freightHandlingCode,
                                       @WebParam(name = "lineOfBusinessCode", targetNamespace = "")
                                       String lineOfBusinessCode,
                                       @WebParam(name = "modeOfTransportCode", targetNamespace = "")
                                       String modeOfTransportCode,
                                       @WebParam(name = "paymentInstrumentCode", targetNamespace = "")
                                       String paymentInstrumentCode,
                                       @WebParam(name = "paymentTermsCode", targetNamespace = "")
                                       String paymentTermsCode,
                                       @WebParam(name = "priceAdjustmentId", targetNamespace = "")
                                       String priceAdjustmentId,
                                       @WebParam(name = "priceCode1", targetNamespace = "") String priceCode1,
                                       @WebParam(name = "priceCode2", targetNamespace = "") String priceCode2,
                                       @WebParam(name = "priceCode3", targetNamespace = "") String priceCode3,
                                       @WebParam(name = "processing", targetNamespace = "")
                                       ProcessingVersion processing,
                                       @WebParam(name = "product", targetNamespace = "", mode = WebParam.Mode.INOUT)
                                       Holder<Product> product,
                                       @WebParam(name = "rateExchange", targetNamespace = "") BigDecimal rateExchange,
                                       @WebParam(name = "routeCode", targetNamespace = "") String routeCode,
                                       @WebParam(name = "statusCodeDuty", targetNamespace = "") String statusCodeDuty,
                                       @WebParam(name = "stopCode", targetNamespace = "") String stopCode,
                                       @WebParam(name = "transactionQuantity", targetNamespace = "")
                                       BigDecimal transactionQuantity,
                                       @WebParam(name = "unitOfMeasureCodePricing", targetNamespace = "",
                                                 mode = WebParam.Mode.INOUT) Holder<String> unitOfMeasureCodePricing,
                                       @WebParam(name = "unitOfMeasureCodeTransaction", targetNamespace = "",
                                                 mode = WebParam.Mode.INOUT)
                                       Holder<String> unitOfMeasureCodeTransaction,
                                       @WebParam(name = "useTaxedPrices", targetNamespace = "",
                                                 mode = WebParam.Mode.INOUT) Holder<Boolean> useTaxedPrices,
                                       @WebParam(name = "zoneNumber", targetNamespace = "") String zoneNumber,
                                       @WebParam(name = "e1MessageList", targetNamespace = "", mode = WebParam.Mode.OUT)
                                       Holder<E1MessageList> e1MessageList,
                                       @WebParam(name = "costExtendedDomestic", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> costExtendedDomestic,
                                       @WebParam(name = "costExtendedForeign", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> costExtendedForeign,
                                       @WebParam(name = "costUnitDomestic", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> costUnitDomestic,
                                       @WebParam(name = "costUnitForeign", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> costUnitForeign,
                                       @WebParam(name = "currencyModeCode", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<String> currencyModeCode,
                                       @WebParam(name = "priceExtendedDomestic", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> priceExtendedDomestic,
                                       @WebParam(name = "priceExtendedForeign", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> priceExtendedForeign,
                                       @WebParam(name = "priceListDomestic", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> priceListDomestic,
                                       @WebParam(name = "priceListForeign", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> priceListForeign,
                                       @WebParam(name = "priceUnitDomestic", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> priceUnitDomestic,
                                       @WebParam(name = "priceUnitForeign", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> priceUnitForeign,
                                       @WebParam(name = "quantityOrdered", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> quantityOrdered,
                                       @WebParam(name = "taxAmountExtendedDomestic", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> taxAmountExtendedDomestic,
                                       @WebParam(name = "taxAmountExtendedForeign", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> taxAmountExtendedForeign,
                                       @WebParam(name = "taxAmountUnitDomestic", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> taxAmountUnitDomestic,
                                       @WebParam(name = "taxAmountUnitForeign", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> taxAmountUnitForeign,
                                       @WebParam(name = "taxedPriceExtendedDomestic", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT)
                                       Holder<BigDecimal> taxedPriceExtendedDomestic,
                                       @WebParam(name = "taxedPriceExtendedForeign", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> taxedPriceExtendedForeign,
                                       @WebParam(name = "taxedPriceUnitDomestic", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT) Holder<BigDecimal> taxedPriceUnitDomestic,
                                       @WebParam(name = "taxedPriceUnitForeign", targetNamespace = "",
                                                 mode = WebParam.Mode.OUT)
                                       Holder<BigDecimal> taxedPriceUnitForeign) throws BusinessServiceException_Exception;

    /**
     *
     * @param e1MessageList
     * @param header0
     * @param header
     * @throws BusinessServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "getSalesOrder", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                    className = "jp420000.bssv.e1.oracle.GetSalesOrder")
    @ResponseWrapper(localName = "getSalesOrderResponse", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                     className = "jp420000.bssv.e1.oracle.ShowSalesOrder")
    public void getSalesOrder(@WebParam(name = "header", targetNamespace = "") GetSalesHeader header,
                              @WebParam(name = "e1MessageList", targetNamespace = "", mode = WebParam.Mode.OUT)
                              Holder<E1MessageList> e1MessageList,
                              @WebParam(name = "header", targetNamespace = "", mode = WebParam.Mode.OUT)
                              Holder<List<ShowSalesHeader>> header0) throws BusinessServiceException_Exception;

    /**
     *
     * @param e1MessageList
     * @param header0
     * @param header
     * @throws BusinessServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "getSalesOrderV2", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                    className = "jp420000.bssv.e1.oracle.GetSalesOrder")
    @ResponseWrapper(localName = "getSalesOrderV2Response", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                     className = "jp420000.bssv.e1.oracle.ShowSalesOrderV2")
    public void getSalesOrderV2(@WebParam(name = "header", targetNamespace = "") GetSalesHeader header,
                                @WebParam(name = "e1MessageList", targetNamespace = "", mode = WebParam.Mode.OUT)
                                Holder<E1MessageList> e1MessageList,
                                @WebParam(name = "header", targetNamespace = "", mode = WebParam.Mode.OUT)
                                Holder<List<ShowSalesHeaderV2>> header0) throws BusinessServiceException_Exception;

    /**
     *
     * @param e1MessageList
     * @param header0
     * @param header
     * @throws BusinessServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "processSalesOrder", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                    className = "jp420000.bssv.e1.oracle.ProcessSalesOrder")
    @ResponseWrapper(localName = "processSalesOrderResponse", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                     className = "jp420000.bssv.e1.oracle.ConfirmSalesOrder")
    public void processSalesOrder(@WebParam(name = "header", targetNamespace = "") ProcessSOHeader header,
                                  @WebParam(name = "e1MessageList", targetNamespace = "", mode = WebParam.Mode.OUT)
                                  Holder<E1MessageList> e1MessageList,
                                  @WebParam(name = "header", targetNamespace = "", mode = WebParam.Mode.OUT)
                                  Holder<ConfirmSOHeader> header0) throws BusinessServiceException_Exception;

    /**
     *
     * @param e1MessageList
     * @param header0
     * @param header
     * @throws BusinessServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "processSalesOrderV2", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                    className = "jp420000.bssv.e1.oracle.ProcessSalesOrderV2")
    @ResponseWrapper(localName = "processSalesOrderV2Response", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                     className = "jp420000.bssv.e1.oracle.ConfirmSalesOrderV2")
    public void processSalesOrderV2(@WebParam(name = "header", targetNamespace = "") ProcessSOHeaderV2 header,
                                    @WebParam(name = "e1MessageList", targetNamespace = "", mode = WebParam.Mode.OUT)
                                    Holder<E1MessageList> e1MessageList,
                                    @WebParam(name = "header", targetNamespace = "", mode = WebParam.Mode.OUT)
                                    Holder<ConfirmSOHeaderV2> header0) throws BusinessServiceException_Exception;

    /**
     *
     * @param item
     * @param businessUnit
     * @param e1MessageList
     * @param dateExpiration
     * @param dateEffective
     * @param showItemListPrice
     * @param currencyCode
     * @param unitOfMeasureCode
     * @param customer
     * @throws BusinessServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "getItemListPrice", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                    className = "jp420000.bssv.e1.oracle.GetItemListPrice")
    @ResponseWrapper(localName = "getItemListPriceResponse", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                     className = "jp420000.bssv.e1.oracle.ShowItemListPrice")
    public void getItemListPrice(@WebParam(name = "businessUnit", targetNamespace = "") String businessUnit,
                                 @WebParam(name = "currencyCode", targetNamespace = "") String currencyCode,
                                 @WebParam(name = "customer", targetNamespace = "") Entity customer,
                                 @WebParam(name = "dateEffective", targetNamespace = "")
                                 XMLGregorianCalendar dateEffective,
                                 @WebParam(name = "dateExpiration", targetNamespace = "")
                                 XMLGregorianCalendar dateExpiration,
                                 @WebParam(name = "item", targetNamespace = "") ItemGroupCustomer item,
                                 @WebParam(name = "unitOfMeasureCode", targetNamespace = "") String unitOfMeasureCode,
                                 @WebParam(name = "e1MessageList", targetNamespace = "", mode = WebParam.Mode.OUT)
                                 Holder<E1MessageList> e1MessageList,
                                 @WebParam(name = "showItemListPrice", targetNamespace = "", mode = WebParam.Mode.OUT)
                                 Holder<List<ItemListPriceRecord>> showItemListPrice) throws BusinessServiceException_Exception;

    /**
     *
     * @param e1MessageList
     * @param detail0
     * @param detail
     * @throws BusinessServiceException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "getSalesOrderPriceHistory", targetNamespace = "http://oracle.e1.bssv.JP420000/",
                    className = "jp420000.bssv.e1.oracle.GetSalesOrderPriceHistory")
    @ResponseWrapper(localName = "getSalesOrderPriceHistoryResponse",
                     targetNamespace = "http://oracle.e1.bssv.JP420000/",
                     className = "jp420000.bssv.e1.oracle.ShowSalesOrderPriceHistory")
    public void getSalesOrderPriceHistory(@WebParam(name = "detail", targetNamespace = "") PriceHistory detail,
                                          @WebParam(name = "e1MessageList", targetNamespace = "",
                                                    mode = WebParam.Mode.OUT) Holder<E1MessageList> e1MessageList,
                                          @WebParam(name = "detail", targetNamespace = "", mode = WebParam.Mode.OUT)
                                          Holder<List<ShowPriceHistoryDetail>> detail0) throws BusinessServiceException_Exception;

}
