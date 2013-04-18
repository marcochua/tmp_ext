package com.tooltwist.bsg.util;

import java.util.ArrayList;
import java.util.List;

import com.tooltwist.bsg.clientnz.PropertyIdInput;
import com.tooltwist.bsg.clientnz.RefineOtmPropertiesRequest;
import com.tooltwist.bsg.clientnz.RefinePropertiesRequest;
import com.tooltwist.bsg.form.BSGRequestAsyncNZ;

public class BSGObjectsUtilNZ {
	
	public static PropertyIdInput getPropertyIdInput(List<Integer> propertyIds){
		PropertyIdInput input = new PropertyIdInput();
		if (propertyIds!=null){
			input.getPropertyIdList().addAll(propertyIds);
		}				
		return input;
	}
	
	public static BSGRequestAsyncNZ getBSGRequestAsync(RefineOtmPropertiesRequest requestOtm, RefinePropertiesRequest requestNonOtm, List<Integer> propertyIds){
		PropertyIdInput properties = new PropertyIdInput();
		List<Integer> ids = new ArrayList<Integer>();
		BSGRequestAsyncNZ request = new BSGRequestAsyncNZ();
		if (requestOtm==null){
			requestOtm = new RefineOtmPropertiesRequest();
		}
		if (propertyIds!=null){
			if (propertyIds.size() > 3000){	
				request.setBatchValue(3);
				int endStart = propertyIds.size()/3;
				int startSecond = endStart + 1;
				int endSecond = startSecond + endStart;
				int startThird = endSecond + 1;
				int endThird = propertyIds.size() - 1;
				ids.addAll(propertyIds.subList(0, endStart));
				properties.getPropertyIdList().addAll(ids);
				requestOtm.setPropertyIdInput(properties);
				requestNonOtm.setPropertyIdInput(properties);
				request.getRefineOtmPropertiesRequest().add(requestOtm);
				request.getRefinePropertiesRequest().add(requestNonOtm);
				
				ids = new ArrayList<Integer>();
				properties = new PropertyIdInput();
				ids.addAll(propertyIds.subList(startSecond, endSecond));
				properties.getPropertyIdList().addAll(ids);
				requestOtm.setPropertyIdInput(properties);
				requestNonOtm.setPropertyIdInput(properties);
				request.getRefineOtmPropertiesRequest().add(requestOtm);
				request.getRefinePropertiesRequest().add(requestNonOtm);				
				
				ids = new ArrayList<Integer>();
				properties = new PropertyIdInput();
				ids.addAll(propertyIds.subList(startThird, endThird));
				properties.getPropertyIdList().addAll(ids);
				requestOtm.setPropertyIdInput(properties);
				requestNonOtm.setPropertyIdInput(properties);
				request.getRefineOtmPropertiesRequest().add(requestOtm);
				request.getRefinePropertiesRequest().add(requestNonOtm);
				
			}else if (propertyIds.size() > 1000){
				request.setBatchValue(2);
				int endStart = propertyIds.size()/2;
				int startSecond = endStart + 1;
				int endSecond = propertyIds.size() - 1;
				ids.addAll(propertyIds.subList(0, endStart));
				properties.getPropertyIdList().addAll(ids);
				requestOtm.setPropertyIdInput(properties);
				requestNonOtm.setPropertyIdInput(properties);
				request.getRefineOtmPropertiesRequest().add(requestOtm);
				request.getRefinePropertiesRequest().add(requestNonOtm);
				
				ids = new ArrayList<Integer>();
				properties = new PropertyIdInput();
				ids.addAll(propertyIds.subList(startSecond, endSecond));
				properties.getPropertyIdList().addAll(ids);
				requestOtm.setPropertyIdInput(properties);
				requestNonOtm.setPropertyIdInput(properties);
				request.getRefineOtmPropertiesRequest().add(requestOtm);
				request.getRefinePropertiesRequest().add(requestNonOtm);
				
			}else{
				request.setBatchValue(1);
				properties.getPropertyIdList().addAll(propertyIds);
				requestOtm.setPropertyIdInput(properties);
				requestNonOtm.setPropertyIdInput(properties);
				request.getRefineOtmPropertiesRequest().add(requestOtm);
				request.getRefinePropertiesRequest().add(requestNonOtm);
			}
		}	
		return request;
	}
	
}
