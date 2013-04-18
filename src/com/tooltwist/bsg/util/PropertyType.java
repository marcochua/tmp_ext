package com.tooltwist.bsg.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tooltwist.bsg.service.BSGBeanFactory;

public class PropertyType {
	
	public static final String UNIT = "UNIT";
	public static final String HOUSE = "HOUSE";
	public static final String RESIDENTIAL = "RESIDENTIAL";
	public static final String LIFESTYLE = "LIFESTYLE";  //
	
	public static List<String> getHouseList(){
		String houseList = BSGBeanFactory.getBsgProperty("property.types.list.house").trim(); 
		String[] arrHouseList = houseList.split(",");
		
		return arrToList(arrHouseList);
	}
	
	public static List<String> getUnitList(){
		String unitList = BSGBeanFactory.getBsgProperty("property.types.list.unit").trim(); 
		String[] arrUnitList = unitList.split(",");
		
		return arrToList(arrUnitList);
	}
	
	public static List<String> getCommercialList(){
		String commercialList = BSGBeanFactory.getBsgProperty("property.types.list.commercial").trim(); 
		String[] arrCommercialList = commercialList.split(",");
		
		return arrToList(arrCommercialList);
	}
	
	public static List<String> getLandList(){
		String commercialList = BSGBeanFactory.getBsgProperty("property.types.list.land").trim(); 
		String[] arrCommercialList = commercialList.split(",");
		
		return arrToList(arrCommercialList);
	}
	
	public static List<String> getOtherList(){
		String otherList = BSGBeanFactory.getBsgProperty("property.types.list.other").trim(); 
		String[] arrOtherList = otherList.split(",");
		
		return arrToList(arrOtherList);
	}
	
	private static List<String> arrToList(String[] arr){
		
		List<String> list = new ArrayList<String>();
		
		for (int i=0; i<arr.length; i++){
			list.add(arr[i].trim());
		}
		
		return list;
		
	}
	
}
