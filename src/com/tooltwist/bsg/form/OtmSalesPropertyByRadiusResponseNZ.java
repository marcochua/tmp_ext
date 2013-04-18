package com.tooltwist.bsg.form;

import com.tooltwist.bsg.clientnz.GetOTMPropertyIdsByRadiusResponse;
import com.tooltwist.bsg.clientnz.GetSalesPropertyIdsByRadiusResponse;

public class OtmSalesPropertyByRadiusResponseNZ {

	
	private GetOTMPropertyIdsByRadiusResponse otmIdsByRadiusResponse = new GetOTMPropertyIdsByRadiusResponse();
	private GetSalesPropertyIdsByRadiusResponse salesPropertyIdsByRadiusResponse = new GetSalesPropertyIdsByRadiusResponse();
	
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
}
