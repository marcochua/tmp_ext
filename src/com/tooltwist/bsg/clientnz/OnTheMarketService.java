
package com.tooltwist.bsg.clientnz;

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
@WebService(name = "OnTheMarketService", targetNamespace = "http://rpdata.com/bsg/schemas")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OnTheMarketService {


    /**
     * 
     * @param getOtmPropertySummaryListRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.clientnz.GetOtmPropertySummaryListResponse>
     */
    @WebMethod(operationName = "getOtmPropertySummaryList")
    public Response<GetOtmPropertySummaryListResponse> getOtmPropertySummaryListAsync(
        @WebParam(name = "getOtmPropertySummaryListRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getOtmPropertySummaryListRequest")
        GetOtmPropertySummaryListRequest getOtmPropertySummaryListRequest);

    /**
     * 
     * @param getOtmPropertySummaryListRequest
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getOtmPropertySummaryList")
    public Future<?> getOtmPropertySummaryListAsync(
        @WebParam(name = "getOtmPropertySummaryListRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getOtmPropertySummaryListRequest")
        GetOtmPropertySummaryListRequest getOtmPropertySummaryListRequest,
        @WebParam(name = "getOtmPropertySummaryListResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetOtmPropertySummaryListResponse> asyncHandler);

    /**
     * 
     * @param getOtmPropertySummaryListRequest
     * @return
     *     returns com.tooltwist.bsg.clientnz.GetOtmPropertySummaryListResponse
     */
    @WebMethod
    @WebResult(name = "getOtmPropertySummaryListResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getOtmPropertySummaryListResponse")
    public GetOtmPropertySummaryListResponse getOtmPropertySummaryList(
        @WebParam(name = "getOtmPropertySummaryListRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getOtmPropertySummaryListRequest")
        GetOtmPropertySummaryListRequest getOtmPropertySummaryListRequest);

    /**
     * 
     * @param getOTMPropertyIdsByRadiusRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.clientnz.GetOTMPropertyIdsByRadiusResponse>
     */
    @WebMethod(operationName = "getOTMPropertyIdsByRadius")
    public Response<GetOTMPropertyIdsByRadiusResponse> getOTMPropertyIdsByRadiusAsync(
        @WebParam(name = "getOTMPropertyIdsByRadiusRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getOTMPropertyIdsByRadiusRequest")
        GetOTMPropertyIdsByRadiusRequest getOTMPropertyIdsByRadiusRequest);

    /**
     * 
     * @param getOTMPropertyIdsByRadiusRequest
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getOTMPropertyIdsByRadius")
    public Future<?> getOTMPropertyIdsByRadiusAsync(
        @WebParam(name = "getOTMPropertyIdsByRadiusRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getOTMPropertyIdsByRadiusRequest")
        GetOTMPropertyIdsByRadiusRequest getOTMPropertyIdsByRadiusRequest,
        @WebParam(name = "getOTMPropertyIdsByRadiusResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetOTMPropertyIdsByRadiusResponse> asyncHandler);

    /**
     * 
     * @param getOTMPropertyIdsByRadiusRequest
     * @return
     *     returns com.tooltwist.bsg.clientnz.GetOTMPropertyIdsByRadiusResponse
     */
    @WebMethod
    @WebResult(name = "getOTMPropertyIdsByRadiusResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getOTMPropertyIdsByRadiusResponse")
    public GetOTMPropertyIdsByRadiusResponse getOTMPropertyIdsByRadius(
        @WebParam(name = "getOTMPropertyIdsByRadiusRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getOTMPropertyIdsByRadiusRequest")
        GetOTMPropertyIdsByRadiusRequest getOTMPropertyIdsByRadiusRequest);

    /**
     * 
     * @param getOTMPropertyIdsForAreaRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.clientnz.GetOTMPropertyIdsForAreaResponse>
     */
    @WebMethod(operationName = "getOTMPropertyIdsForArea")
    public Response<GetOTMPropertyIdsForAreaResponse> getOTMPropertyIdsForAreaAsync(
        @WebParam(name = "getOTMPropertyIdsForAreaRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getOTMPropertyIdsForAreaRequest")
        GetOTMPropertyIdsForAreaRequest getOTMPropertyIdsForAreaRequest);

    /**
     * 
     * @param asyncHandler
     * @param getOTMPropertyIdsForAreaRequest
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getOTMPropertyIdsForArea")
    public Future<?> getOTMPropertyIdsForAreaAsync(
        @WebParam(name = "getOTMPropertyIdsForAreaRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getOTMPropertyIdsForAreaRequest")
        GetOTMPropertyIdsForAreaRequest getOTMPropertyIdsForAreaRequest,
        @WebParam(name = "getOTMPropertyIdsForAreaResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetOTMPropertyIdsForAreaResponse> asyncHandler);

    /**
     * 
     * @param getOTMPropertyIdsForAreaRequest
     * @return
     *     returns com.tooltwist.bsg.clientnz.GetOTMPropertyIdsForAreaResponse
     */
    @WebMethod
    @WebResult(name = "getOTMPropertyIdsForAreaResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getOTMPropertyIdsForAreaResponse")
    public GetOTMPropertyIdsForAreaResponse getOTMPropertyIdsForArea(
        @WebParam(name = "getOTMPropertyIdsForAreaRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getOTMPropertyIdsForAreaRequest")
        GetOTMPropertyIdsForAreaRequest getOTMPropertyIdsForAreaRequest);

    /**
     * 
     * @param refineOtmPropertiesRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.clientnz.RefineOtmPropertiesResponse>
     */
    @WebMethod(operationName = "refineOtmProperties")
    public Response<RefineOtmPropertiesResponse> refineOtmPropertiesAsync(
        @WebParam(name = "refineOtmPropertiesRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "refineOtmPropertiesRequest")
        RefineOtmPropertiesRequest refineOtmPropertiesRequest);

    /**
     * 
     * @param asyncHandler
     * @param refineOtmPropertiesRequest
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "refineOtmProperties")
    public Future<?> refineOtmPropertiesAsync(
        @WebParam(name = "refineOtmPropertiesRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "refineOtmPropertiesRequest")
        RefineOtmPropertiesRequest refineOtmPropertiesRequest,
        @WebParam(name = "refineOtmPropertiesResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<RefineOtmPropertiesResponse> asyncHandler);

    /**
     * 
     * @param refineOtmPropertiesRequest
     * @return
     *     returns com.tooltwist.bsg.clientnz.RefineOtmPropertiesResponse
     */
    @WebMethod
    @WebResult(name = "refineOtmPropertiesResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "refineOtmPropertiesResponse")
    public RefineOtmPropertiesResponse refineOtmProperties(
        @WebParam(name = "refineOtmPropertiesRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "refineOtmPropertiesRequest")
        RefineOtmPropertiesRequest refineOtmPropertiesRequest);

    /**
     * 
     * @param getListingsForPropertyIdRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.clientnz.GetListingsForPropertyIdResponse>
     */
    @WebMethod(operationName = "getListingsForPropertyId")
    public Response<GetListingsForPropertyIdResponse> getListingsForPropertyIdAsync(
        @WebParam(name = "getListingsForPropertyIdRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getListingsForPropertyIdRequest")
        GetListingsForPropertyIdRequest getListingsForPropertyIdRequest);

    /**
     * 
     * @param asyncHandler
     * @param getListingsForPropertyIdRequest
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getListingsForPropertyId")
    public Future<?> getListingsForPropertyIdAsync(
        @WebParam(name = "getListingsForPropertyIdRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getListingsForPropertyIdRequest")
        GetListingsForPropertyIdRequest getListingsForPropertyIdRequest,
        @WebParam(name = "getListingsForPropertyIdResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetListingsForPropertyIdResponse> asyncHandler);

    /**
     * 
     * @param getListingsForPropertyIdRequest
     * @return
     *     returns com.tooltwist.bsg.clientnz.GetListingsForPropertyIdResponse
     */
    @WebMethod
    @WebResult(name = "getListingsForPropertyIdResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getListingsForPropertyIdResponse")
    public GetListingsForPropertyIdResponse getListingsForPropertyId(
        @WebParam(name = "getListingsForPropertyIdRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getListingsForPropertyIdRequest")
        GetListingsForPropertyIdRequest getListingsForPropertyIdRequest);

}