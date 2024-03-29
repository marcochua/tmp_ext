
package com.tooltwist.bsg.clientnz;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SalesServiceService", targetNamespace = "http://rpdata.com/bsg/schemas", wsdlLocation = "http://rpp.rpdata.com/bsgNZ-2.0/ws/salesService.wsdl")
public class SalesServiceService
    extends Service
{

    private final static URL SALESSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException SALESSERVICESERVICE_EXCEPTION;
    private final static QName SALESSERVICESERVICE_QNAME = new QName("http://rpdata.com/bsg/schemas", "SalesServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://rpp.rpdata.com/bsgNZ-2.0/ws/salesService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SALESSERVICESERVICE_WSDL_LOCATION = url;
        SALESSERVICESERVICE_EXCEPTION = e;
    }

    public SalesServiceService() {
        super(__getWsdlLocation(), SALESSERVICESERVICE_QNAME);
    }

    public SalesServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SALESSERVICESERVICE_QNAME, features);
    }

    public SalesServiceService(URL wsdlLocation) {
        super(wsdlLocation, SALESSERVICESERVICE_QNAME);
    }

    public SalesServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SALESSERVICESERVICE_QNAME, features);
    }

    public SalesServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SalesServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SalesService
     */
    @WebEndpoint(name = "SalesServiceSoap11")
    public SalesService getSalesServiceSoap11() {
        return super.getPort(new QName("http://rpdata.com/bsg/schemas", "SalesServiceSoap11"), SalesService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SalesService
     */
    @WebEndpoint(name = "SalesServiceSoap11")
    public SalesService getSalesServiceSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://rpdata.com/bsg/schemas", "SalesServiceSoap11"), SalesService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SALESSERVICESERVICE_EXCEPTION!= null) {
            throw SALESSERVICESERVICE_EXCEPTION;
        }
        return SALESSERVICESERVICE_WSDL_LOCATION;
    }

}
