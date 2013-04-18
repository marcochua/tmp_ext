package com.tooltwist.bsg.form;

import java.util.ArrayList;
import java.util.List;

import com.tooltwist.bsg.client.RefineOtmPropertiesRequest;
import com.tooltwist.bsg.client.RefinePropertiesRequest;

public class BSGRequestAsync {
	
	private int batchValue  = 0;
	private List<RefineOtmPropertiesRequest> refineOtmPropertiesRequest = new ArrayList<RefineOtmPropertiesRequest>();
	private List<RefinePropertiesRequest> refinePropertiesRequest = new ArrayList<RefinePropertiesRequest>();
	
	public void setRefineOtmPropertiesRequest(List<RefineOtmPropertiesRequest> refineOtmPropertiesRequest) {
		this.refineOtmPropertiesRequest = refineOtmPropertiesRequest;
	}
	public List<RefineOtmPropertiesRequest> getRefineOtmPropertiesRequest(){
		return refineOtmPropertiesRequest;
	}
	public void setRefinePropertiesRequest(List<RefinePropertiesRequest> refinePropertiesRequest){
		this.refinePropertiesRequest = refinePropertiesRequest;
	}
	public List<RefinePropertiesRequest> getRefinePropertiesRequest(){
		return refinePropertiesRequest;
	}
	public void setBatchValue(int batchValue) {
		this.batchValue = batchValue;
	}
	public int getBatchValue() {
		return batchValue;
	}
}
