
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
@WebServiceClient(name = "OnTheMarketServiceService", targetNamespace = "http://rpdata.com/bsg/schemas", wsdlLocation = "http://rpp.rpdata.com/bsgNZ-2.0/ws/onTheMarketService.wsdl")
public class OnTheMarketServiceService
    extends Service
{

    private final static URL ONTHEMARKETSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException ONTHEMARKETSERVICESERVICE_EXCEPTION;
    private final static QName ONTHEMARKETSERVICESERVICE_QNAME = new QName("http://rpdata.com/bsg/schemas", "OnTheMarketServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://rpp.rpdata.com/bsgNZ-2.0/ws/onTheMarketService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ONTHEMARKETSERVICESERVICE_WSDL_LOCATION = url;
        ONTHEMARKETSERVICESERVICE_EXCEPTION = e;
    }

    public OnTheMarketServiceService() {
        super(__getWsdlLocation(), ONTHEMARKETSERVICESERVICE_QNAME);
    }

    public OnTheMarketServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ONTHEMARKETSERVICESERVICE_QNAME, features);
    }

    public OnTheMarketServiceService(URL wsdlLocation) {
        super(wsdlLocation, ONTHEMARKETSERVICESERVICE_QNAME);
    }

    public OnTheMarketServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ONTHEMARKETSERVICESERVICE_QNAME, features);
    }

    public OnTheMarketServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OnTheMarketServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OnTheMarketService
     */
    @WebEndpoint(name = "OnTheMarketServiceSoap11")
    public OnTheMarketService getOnTheMarketServiceSoap11() {
        return super.getPort(new QName("http://rpdata.com/bsg/schemas", "OnTheMarketServiceSoap11"), OnTheMarketService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OnTheMarketService
     */
    @WebEndpoint(name = "OnTheMarketServiceSoap11")
    public OnTheMarketService getOnTheMarketServiceSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://rpdata.com/bsg/schemas", "OnTheMarketServiceSoap11"), OnTheMarketService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ONTHEMARKETSERVICESERVICE_EXCEPTION!= null) {
            throw ONTHEMARKETSERVICESERVICE_EXCEPTION;
        }
        return ONTHEMARKETSERVICESERVICE_WSDL_LOCATION;
    }

}