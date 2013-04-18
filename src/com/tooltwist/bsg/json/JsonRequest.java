package com.tooltwist.bsg.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonRequest {

	private String service;
	private String userId;
	private JsonObject jsonObject;
	private String strEleRequest;
	
	public JsonRequest() {
	}

	public void setStringElement(String strElement) {
		this.strEleRequest = strElement;
	}

	public String getAsStringRequest() {
		return strEleRequest;
	}
	
	public JsonRequest(JsonObject jsonObject) {
		this.jsonObject = jsonObject;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public JsonObject getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(JsonObject jsonObject) {
		this.jsonObject = jsonObject;
	}
	
	public String getAsString(String key) {
		JsonElement jsonElement = jsonObject.get(key);
		
		String val = "";
		if (jsonElement != null){
			if (jsonElement.isJsonPrimitive()){
				val = jsonElement.getAsString();
			}else{
				JsonArray array = new JsonArray();
				Object[] result = null;
				if (jsonElement != null){
					array = jsonElement.getAsJsonArray();
					result = new Object[array.size()];
					int tally = 0;
					for (JsonElement childElement : array) {
						Object value;
						if (childElement!=null && childElement.isJsonPrimitive()){
							value = childElement.getAsBigInteger().intValue();
							result[tally] = value;
					        ++tally;
						}			
					}
				}
				StringBuffer buff = new StringBuffer();
				for (int i=0; i<result.length; i++){
					if (i==result.length-1){
						buff.append(result[i]);
					}else{
						buff.append(result[i]).append(",");
					}
				}
				val = buff.toString();
			}
		}
		return val;
	}
	
	public int getAsInt(String key) {
		JsonElement jsonElement = jsonObject.get(key);
		
		int val = 0;
		if (jsonElement != null)
			val = jsonElement.getAsInt();
		
		return val;
	}
	
	public String[] getAsStringArray(String key) {
		return getAsString(key).split(",");
	}
	
	public String getAsJsonArray(String key){
		JsonElement jsonElement = jsonObject.get(key);
		String val = "";
		JsonArray array = new JsonArray();
		Object[] result = null;
		if (jsonElement != null){
			array = jsonElement.getAsJsonArray();
			result = new Object[array.size()];
			int tally = 0;
			for (JsonElement childElement : array) {
				Object value;
				if (childElement!=null && childElement.isJsonPrimitive()){
					value = childElement.getAsBigInteger().intValue();
					result[tally] = value;
			        ++tally;
				}			
			}
		}
		StringBuffer buff = new StringBuffer();
		
		if (result != null) {
			for (int i=0; i<result.length; i++){
				if (i==result.length-1){
					buff.append(result[i]);
				}else{
					buff.append(result[i]).append(",");
				}
			}
			val = buff.toString();
		}
		return val;
	}

}
