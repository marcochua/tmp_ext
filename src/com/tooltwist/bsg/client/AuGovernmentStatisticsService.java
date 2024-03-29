
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
@WebService(name = "AuGovernmentStatisticsService", targetNamespace = "http://rpdata.com/bsg/schemas")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AuGovernmentStatisticsService {


    /**
     * 
     * @param getHouseholdStructureChartURLRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.client.GetHouseholdStructureChartURLResponse>
     */
    @WebMethod(operationName = "getHouseholdStructureChartURL")
    public Response<GetHouseholdStructureChartURLResponse> getHouseholdStructureChartURLAsync(
        @WebParam(name = "getHouseholdStructureChartURLRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdStructureChartURLRequest")
        GetHouseholdStructureChartURLRequest getHouseholdStructureChartURLRequest);

    /**
     * 
     * @param asyncHandler
     * @param getHouseholdStructureChartURLRequest
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getHouseholdStructureChartURL")
    public Future<?> getHouseholdStructureChartURLAsync(
        @WebParam(name = "getHouseholdStructureChartURLRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdStructureChartURLRequest")
        GetHouseholdStructureChartURLRequest getHouseholdStructureChartURLRequest,
        @WebParam(name = "getHouseholdStructureChartURLResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetHouseholdStructureChartURLResponse> asyncHandler);

    /**
     * 
     * @param getHouseholdStructureChartURLRequest
     * @return
     *     returns com.tooltwist.bsg.client.GetHouseholdStructureChartURLResponse
     */
    @WebMethod
    @WebResult(name = "getHouseholdStructureChartURLResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdStructureChartURLResponse")
    public GetHouseholdStructureChartURLResponse getHouseholdStructureChartURL(
        @WebParam(name = "getHouseholdStructureChartURLRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdStructureChartURLRequest")
        GetHouseholdStructureChartURLRequest getHouseholdStructureChartURLRequest);

    /**
     * 
     * @param getAgeSexRatioChartURLRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.client.GetAgeSexRatioChartURLResponse>
     */
    @WebMethod(operationName = "getAgeSexRatioChartURL")
    public Response<GetAgeSexRatioChartURLResponse> getAgeSexRatioChartURLAsync(
        @WebParam(name = "getAgeSexRatioChartURLRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getAgeSexRatioChartURLRequest")
        GetAgeSexRatioChartURLRequest getAgeSexRatioChartURLRequest);

    /**
     * 
     * @param getAgeSexRatioChartURLRequest
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getAgeSexRatioChartURL")
    public Future<?> getAgeSexRatioChartURLAsync(
        @WebParam(name = "getAgeSexRatioChartURLRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getAgeSexRatioChartURLRequest")
        GetAgeSexRatioChartURLRequest getAgeSexRatioChartURLRequest,
        @WebParam(name = "getAgeSexRatioChartURLResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetAgeSexRatioChartURLResponse> asyncHandler);

    /**
     * 
     * @param getAgeSexRatioChartURLRequest
     * @return
     *     returns com.tooltwist.bsg.client.GetAgeSexRatioChartURLResponse
     */
    @WebMethod
    @WebResult(name = "getAgeSexRatioChartURLResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getAgeSexRatioChartURLResponse")
    public GetAgeSexRatioChartURLResponse getAgeSexRatioChartURL(
        @WebParam(name = "getAgeSexRatioChartURLRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getAgeSexRatioChartURLRequest")
        GetAgeSexRatioChartURLRequest getAgeSexRatioChartURLRequest);

    /**
     * 
     * @param getHouseholdIncomeRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.client.GetHouseholdIncomeResponse>
     */
    @WebMethod(operationName = "getHouseholdIncome")
    public Response<GetHouseholdIncomeResponse> getHouseholdIncomeAsync(
        @WebParam(name = "getHouseholdIncomeRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdIncomeRequest")
        GetHouseholdIncomeRequest getHouseholdIncomeRequest);

    /**
     * 
     * @param asyncHandler
     * @param getHouseholdIncomeRequest
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getHouseholdIncome")
    public Future<?> getHouseholdIncomeAsync(
        @WebParam(name = "getHouseholdIncomeRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdIncomeRequest")
        GetHouseholdIncomeRequest getHouseholdIncomeRequest,
        @WebParam(name = "getHouseholdIncomeResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetHouseholdIncomeResponse> asyncHandler);

    /**
     * 
     * @param getHouseholdIncomeRequest
     * @return
     *     returns com.tooltwist.bsg.client.GetHouseholdIncomeResponse
     */
    @WebMethod
    @WebResult(name = "getHouseholdIncomeResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdIncomeResponse")
    public GetHouseholdIncomeResponse getHouseholdIncome(
        @WebParam(name = "getHouseholdIncomeRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdIncomeRequest")
        GetHouseholdIncomeRequest getHouseholdIncomeRequest);

    /**
     * 
     * @param getHouseholdIncomeChartURLRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.client.GetHouseholdIncomeChartURLResponse>
     */
    @WebMethod(operationName = "getHouseholdIncomeChartURL")
    public Response<GetHouseholdIncomeChartURLResponse> getHouseholdIncomeChartURLAsync(
        @WebParam(name = "getHouseholdIncomeChartURLRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdIncomeChartURLRequest")
        GetHouseholdIncomeChartURLRequest getHouseholdIncomeChartURLRequest);

    /**
     * 
     * @param getHouseholdIncomeChartURLRequest
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getHouseholdIncomeChartURL")
    public Future<?> getHouseholdIncomeChartURLAsync(
        @WebParam(name = "getHouseholdIncomeChartURLRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdIncomeChartURLRequest")
        GetHouseholdIncomeChartURLRequest getHouseholdIncomeChartURLRequest,
        @WebParam(name = "getHouseholdIncomeChartURLResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetHouseholdIncomeChartURLResponse> asyncHandler);

    /**
     * 
     * @param getHouseholdIncomeChartURLRequest
     * @return
     *     returns com.tooltwist.bsg.client.GetHouseholdIncomeChartURLResponse
     */
    @WebMethod
    @WebResult(name = "getHouseholdIncomeChartURLResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdIncomeChartURLResponse")
    public GetHouseholdIncomeChartURLResponse getHouseholdIncomeChartURL(
        @WebParam(name = "getHouseholdIncomeChartURLRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdIncomeChartURLRequest")
        GetHouseholdIncomeChartURLRequest getHouseholdIncomeChartURLRequest);

    /**
     * 
     * @param getHouseholdStructureRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.client.GetHouseholdStructureResponse>
     */
    @WebMethod(operationName = "getHouseholdStructure")
    public Response<GetHouseholdStructureResponse> getHouseholdStructureAsync(
        @WebParam(name = "getHouseholdStructureRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdStructureRequest")
        GetHouseholdStructureRequest getHouseholdStructureRequest);

    /**
     * 
     * @param asyncHandler
     * @param getHouseholdStructureRequest
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getHouseholdStructure")
    public Future<?> getHouseholdStructureAsync(
        @WebParam(name = "getHouseholdStructureRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdStructureRequest")
        GetHouseholdStructureRequest getHouseholdStructureRequest,
        @WebParam(name = "getHouseholdStructureResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetHouseholdStructureResponse> asyncHandler);

    /**
     * 
     * @param getHouseholdStructureRequest
     * @return
     *     returns com.tooltwist.bsg.client.GetHouseholdStructureResponse
     */
    @WebMethod
    @WebResult(name = "getHouseholdStructureResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdStructureResponse")
    public GetHouseholdStructureResponse getHouseholdStructure(
        @WebParam(name = "getHouseholdStructureRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdStructureRequest")
        GetHouseholdStructureRequest getHouseholdStructureRequest);

    /**
     * 
     * @param getHouseholdOccupancyRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.client.GetHouseholdOccupancyResponse>
     */
    @WebMethod(operationName = "getHouseholdOccupancy")
    public Response<GetHouseholdOccupancyResponse> getHouseholdOccupancyAsync(
        @WebParam(name = "getHouseholdOccupancyRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdOccupancyRequest")
        GetHouseholdOccupancyRequest getHouseholdOccupancyRequest);

    /**
     * 
     * @param getHouseholdOccupancyRequest
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getHouseholdOccupancy")
    public Future<?> getHouseholdOccupancyAsync(
        @WebParam(name = "getHouseholdOccupancyRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdOccupancyRequest")
        GetHouseholdOccupancyRequest getHouseholdOccupancyRequest,
        @WebParam(name = "getHouseholdOccupancyResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetHouseholdOccupancyResponse> asyncHandler);

    /**
     * 
     * @param getHouseholdOccupancyRequest
     * @return
     *     returns com.tooltwist.bsg.client.GetHouseholdOccupancyResponse
     */
    @WebMethod
    @WebResult(name = "getHouseholdOccupancyResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdOccupancyResponse")
    public GetHouseholdOccupancyResponse getHouseholdOccupancy(
        @WebParam(name = "getHouseholdOccupancyRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdOccupancyRequest")
        GetHouseholdOccupancyRequest getHouseholdOccupancyRequest);

    /**
     * 
     * @param getHouseholdOccupancyChartURLRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.client.GetHouseholdOccupancyChartURLResponse>
     */
    @WebMethod(operationName = "getHouseholdOccupancyChartURL")
    public Response<GetHouseholdOccupancyChartURLResponse> getHouseholdOccupancyChartURLAsync(
        @WebParam(name = "getHouseholdOccupancyChartURLRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdOccupancyChartURLRequest")
        GetHouseholdOccupancyChartURLRequest getHouseholdOccupancyChartURLRequest);

    /**
     * 
     * @param asyncHandler
     * @param getHouseholdOccupancyChartURLRequest
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getHouseholdOccupancyChartURL")
    public Future<?> getHouseholdOccupancyChartURLAsync(
        @WebParam(name = "getHouseholdOccupancyChartURLRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdOccupancyChartURLRequest")
        GetHouseholdOccupancyChartURLRequest getHouseholdOccupancyChartURLRequest,
        @WebParam(name = "getHouseholdOccupancyChartURLResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetHouseholdOccupancyChartURLResponse> asyncHandler);

    /**
     * 
     * @param getHouseholdOccupancyChartURLRequest
     * @return
     *     returns com.tooltwist.bsg.client.GetHouseholdOccupancyChartURLResponse
     */
    @WebMethod
    @WebResult(name = "getHouseholdOccupancyChartURLResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdOccupancyChartURLResponse")
    public GetHouseholdOccupancyChartURLResponse getHouseholdOccupancyChartURL(
        @WebParam(name = "getHouseholdOccupancyChartURLRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getHouseholdOccupancyChartURLRequest")
        GetHouseholdOccupancyChartURLRequest getHouseholdOccupancyChartURLRequest);

    /**
     * 
     * @param getAgeSexRatioRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.client.GetAgeSexRatioResponse>
     */
    @WebMethod(operationName = "getAgeSexRatio")
    public Response<GetAgeSexRatioResponse> getAgeSexRatioAsync(
        @WebParam(name = "getAgeSexRatioRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getAgeSexRatioRequest")
        GetAgeSexRatioRequest getAgeSexRatioRequest);

    /**
     * 
     * @param getAgeSexRatioRequest
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getAgeSexRatio")
    public Future<?> getAgeSexRatioAsync(
        @WebParam(name = "getAgeSexRatioRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getAgeSexRatioRequest")
        GetAgeSexRatioRequest getAgeSexRatioRequest,
        @WebParam(name = "getAgeSexRatioResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetAgeSexRatioResponse> asyncHandler);

    /**
     * 
     * @param getAgeSexRatioRequest
     * @return
     *     returns com.tooltwist.bsg.client.GetAgeSexRatioResponse
     */
    @WebMethod
    @WebResult(name = "getAgeSexRatioResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getAgeSexRatioResponse")
    public GetAgeSexRatioResponse getAgeSexRatio(
        @WebParam(name = "getAgeSexRatioRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getAgeSexRatioRequest")
        GetAgeSexRatioRequest getAgeSexRatioRequest);

    /**
     * 
     * @param getStatisticsForRegionRequest
     * @return
     *     returns javax.xml.ws.Response<com.tooltwist.bsg.client.GetStatisticsForRegionResponse>
     */
    @WebMethod(operationName = "getStatisticsForRegion")
    public Response<GetStatisticsForRegionResponse> getStatisticsForRegionAsync(
        @WebParam(name = "getStatisticsForRegionRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getStatisticsForRegionRequest")
        GetStatisticsForRegionRequest getStatisticsForRegionRequest);

    /**
     * 
     * @param asyncHandler
     * @param getStatisticsForRegionRequest
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getStatisticsForRegion")
    public Future<?> getStatisticsForRegionAsync(
        @WebParam(name = "getStatisticsForRegionRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getStatisticsForRegionRequest")
        GetStatisticsForRegionRequest getStatisticsForRegionRequest,
        @WebParam(name = "getStatisticsForRegionResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetStatisticsForRegionResponse> asyncHandler);

    /**
     * 
     * @param getStatisticsForRegionRequest
     * @return
     *     returns com.tooltwist.bsg.client.GetStatisticsForRegionResponse
     */
    @WebMethod
    @WebResult(name = "getStatisticsForRegionResponse", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getStatisticsForRegionResponse")
    public GetStatisticsForRegionResponse getStatisticsForRegion(
        @WebParam(name = "getStatisticsForRegionRequest", targetNamespace = "http://rpdata.com/bsg/schemas", partName = "getStatisticsForRegionRequest")
        GetStatisticsForRegionRequest getStatisticsForRegionRequest);

}
