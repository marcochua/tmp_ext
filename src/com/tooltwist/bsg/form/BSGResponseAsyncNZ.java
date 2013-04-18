package com.tooltwist.bsg.form;

import java.util.ArrayList;
import java.util.List;

import com.tooltwist.bsg.clientnz.GetOTMPropertyIdsByRadiusResponse;
import com.tooltwist.bsg.clientnz.GetOtmPropertySummaryListResponse;
import com.tooltwist.bsg.clientnz.GetPropertySummaryListResponse;
import com.tooltwist.bsg.clientnz.GetSalesPropertyIdsByRadiusResponse;
import com.tooltwist.bsg.clientnz.RefineOtmPropertiesResponse;
import com.tooltwist.bsg.clientnz.RefinePropertiesResponse;

public class BSGResponseAsyncNZ {

	private GetOtmPropertySummaryListResponse otmPropertySummaryListResponse = new GetOtmPropertySummaryListResponse();
	private GetPropertySummaryListResponse propertySummaryListResponse = new GetPropertySummaryListResponse();
	private GetPropertySummaryListResponse recentSalesSummaryListResponse = new GetPropertySummaryListResponse();
	private GetPropertySummaryListResponse pastSalesSummaryListResponse = new GetPropertySummaryListResponse();
	private RefinePropertiesResponse refinePropertiesResponse = new RefinePropertiesResponse();
	private RefineOtmPropertiesResponse refineOtmPropertiesResponse = new RefineOtmPropertiesResponse();
	private GetOTMPropertyIdsByRadiusResponse otmIdsByRadiusResponse = new GetOTMPropertyIdsByRadiusResponse();
	private GetSalesPropertyIdsByRadiusResponse salesPropertyIdsByRadiusResponse = new GetSalesPropertyIdsByRadiusResponse();
	private List<Integer> resultLessOtmAndPastSale = new ArrayList<Integer>();
	
	public void setOtmPropertySummaryListResponse(GetOtmPropertySummaryListResponse otmPropertySummaryListResponse)	{
		this.otmPropertySummaryListResponse = otmPropertySummaryListResponse;
	}
	public GetOtmPropertySummaryListResponse getOtmPropertySummaryListResponse()	{
		return otmPropertySummaryListResponse;
	}
	public void setPropertySummaryListResponse(GetPropertySummaryListResponse propertySummaryListResponse)	{
		this.propertySummaryListResponse = propertySummaryListResponse;
	}
	public GetPropertySummaryListResponse getPropertySummaryListResponse()	{
		return propertySummaryListResponse;
	}
	public void setRecentSalesSummaryListResponse(GetPropertySummaryListResponse recentSalesSummaryListResponse) {
		this.recentSalesSummaryListResponse = recentSalesSummaryListResponse;
	}
	public GetPropertySummaryListResponse getRecentSalesSummaryListResponse() {
		return recentSalesSummaryListResponse;
	}
	public void setPastSalesSummaryListResponse(GetPropertySummaryListResponse pastSalesSummaryListResponse) {
		this.pastSalesSummaryListResponse = pastSalesSummaryListResponse;
	}
	public GetPropertySummaryListResponse getPastSalesSummaryListResponse() {
		return pastSalesSummaryListResponse;
	}
	public void setRefinePropertiesResponse(RefinePropertiesResponse refinePropertiesResponse)	{
		this.refinePropertiesResponse = refinePropertiesResponse;
	}
	public RefinePropertiesResponse getRefinePropertiesResponse()	{
		return refinePropertiesResponse;
	}
	public void setRefineOtmPropertiesResponse(RefineOtmPropertiesResponse refineOtmPropertiesResponse)	{
		this.refineOtmPropertiesResponse = refineOtmPropertiesResponse;
	}
	public RefineOtmPropertiesResponse getRefineOtmPropertiesResponse()	{
		return refineOtmPropertiesResponse;
	}
	public GetOTMPropertyIdsByRadiusResponse getOtmIdsByRadiusResponse()
	{
		return otmIdsByRadiusResponse;
	}
	public void setOtmIdsByRadiusResponse(GetOTMPropertyIdsByRadiusResponse otmIdsByRadiusResponse)
	{
		this.otmIdsByRadiusResponse = otmIdsByRadiusResponse;
	}
	public GetSalesPropertyIdsByRadiusResponse getSalesPropertyIdsByRadiusResponse()
	{
		return salesPropertyIdsByRadiusResponse;
	}
	public void setSalesPropertyIdsByRadiusResponse(GetSalesPropertyIdsByRadiusResponse salesPropertyIdsByRadiusResponse)
	{
		this.salesPropertyIdsByRadiusResponse = salesPropertyIdsByRadiusResponse;
	}
	public void setResultLessOtmAndPastSale(List<Integer> resultLessOtmAndPastSale)
	{
		this.resultLessOtmAndPastSale = resultLessOtmAndPastSale;
	}
	public List<Integer> getResultLessOtmAndPastSale()
	{
		return resultLessOtmAndPastSale;
	}
}
