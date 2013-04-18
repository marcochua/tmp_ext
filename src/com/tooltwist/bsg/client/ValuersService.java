
package com.tooltwist.bsg.client;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ValuersService", targetNamespace = "http://rpdata.com/bsg/schemas")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ValuersService {


    /**
     * 
     * @param getExtendedValuersRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.client.GetExtendedValuersResponse>
     */
    @WebMethod(operationName = "getExtendedValuers")
    public Response<GetExtendedValuersResponse> getExtendedValuersAsync(
        @WebParam(name = "getExtendedValuersRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getExtendedValuersRequest")
        GetExtendedValuersRequest getExtendedValuersRequest);

    /**
     * 
     * @param getExtendedValuersRequest
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getExtendedValuers")
    public Future<?> getExtendedValuersAsync(
        @WebParam(name = "getExtendedValuersRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getExtendedValuersRequest")
        GetExtendedValuersRequest getExtendedValuersRequest,
        @WebParam(name = "getExtendedValuersResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetExtendedValuersResponse> asyncHandler);

    /**
     * 
     * @param getExtendedValuersRequest
     * @return
     *     returns com.tooltwist.bsg.client.GetExtendedValuersResponse
     */
    @WebMethod
    @WebResult(name = "getExtendedValuersResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getExtendedValuersResponse")
    public GetExtendedValuersResponse getExtendedValuers(
        @WebParam(name = "getExtendedValuersRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getExtendedValuersRequest")
        GetExtendedValuersRequest getExtendedValuersRequest);

    /**
     * 
     * @param getPropertyProfileRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.client.GetPropertyProfileResponse>
     */
    @WebMethod(operationName = "getPropertyProfile")
    public Response<GetPropertyProfileResponse> getPropertyProfileAsync(
        @WebParam(name = "getPropertyProfileRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getPropertyProfileRequest")
        GetPropertyProfileRequest getPropertyProfileRequest);

    /**
     * 
     * @param getPropertyProfileRequest
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getPropertyProfile")
    public Future<?> getPropertyProfileAsync(
        @WebParam(name = "getPropertyProfileRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getPropertyProfileRequest")
        GetPropertyProfileRequest getPropertyProfileRequest,
        @WebParam(name = "getPropertyProfileResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetPropertyProfileResponse> asyncHandler);

    /**
     * 
     * @param getPropertyProfileRequest
     * @return
     *     returns com.tooltwist.bsg.client.GetPropertyProfileResponse
     */
    @WebMethod
    @WebResult(name = "getPropertyProfileResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getPropertyProfileResponse")
    public GetPropertyProfileResponse getPropertyProfile(
        @WebParam(name = "getPropertyProfileRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getPropertyProfileRequest")
        GetPropertyProfileRequest getPropertyProfileRequest);

    /**
     * 
     * @param getValuersRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.client.GetValuersResponse>
     */
    @WebMethod(operationName = "getValuers")
    public Response<GetValuersResponse> getValuersAsync(
        @WebParam(name = "getValuersRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getValuersRequest")
        GetValuersRequest getValuersRequest);

    /**
     * 
     * @param asyncHandler
     * @param getValuersRequest
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getValuers")
    public Future<?> getValuersAsync(
        @WebParam(name = "getValuersRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getValuersRequest")
        GetValuersRequest getValuersRequest,
        @WebParam(name = "getValuersResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetValuersResponse> asyncHandler);

    /**
     * 
     * @param getValuersRequest
     * @return
     *     returns com.tooltwist.bsg.client.GetValuersResponse
     */
    @WebMethod
    @WebResult(name = "getValuersResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getValuersResponse")
    public GetValuersResponse getValuers(
        @WebParam(name = "getValuersRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getValuersRequest")
        GetValuersRequest getValuersRequest);

}
