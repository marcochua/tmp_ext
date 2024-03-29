
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
@WebServiceClient(name = "ValuersServiceService", targetNamespace = "http://rpdata.com/bsg/schemas", wsdlLocation = "http://rpp.rpdata.com/bsgNZ-2.0/ws/valuersService.wsdl")
public class ValuersServiceService
    extends Service
{

    private final static URL VALUERSSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException VALUERSSERVICESERVICE_EXCEPTION;
    private final static QName VALUERSSERVICESERVICE_QNAME = new QName("http://rpdata.com/bsg/schemas", "ValuersServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://rpp.rpdata.com/bsgNZ-2.0/ws/valuersService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VALUERSSERVICESERVICE_WSDL_LOCATION = url;
        VALUERSSERVICESERVICE_EXCEPTION = e;
    }

    public ValuersServiceService() {
        super(__getWsdlLocation(), VALUERSSERVICESERVICE_QNAME);
    }

    public ValuersServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VALUERSSERVICESERVICE_QNAME, features);
    }

    public ValuersServiceService(URL wsdlLocation) {
        super(wsdlLocation, VALUERSSERVICESERVICE_QNAME);
    }

    public ValuersServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VALUERSSERVICESERVICE_QNAME, features);
    }

    public ValuersServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ValuersServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ValuersService
     */
    @WebEndpoint(name = "ValuersServiceSoap11")
    public ValuersService getValuersServiceSoap11() {
        return super.getPort(new QName("http://rpdata.com/bsg/schemas", "ValuersServiceSoap11"), ValuersService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ValuersService
     */
    @WebEndpoint(name = "ValuersServiceSoap11")
    public ValuersService getValuersServiceSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://rpdata.com/bsg/schemas", "ValuersServiceSoap11"), ValuersService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VALUERSSERVICESERVICE_EXCEPTION!= null) {
            throw VALUERSSERVICESERVICE_EXCEPTION;
        }
        return VALUERSSERVICESERVICE_WSDL_LOCATION;
    }

}
