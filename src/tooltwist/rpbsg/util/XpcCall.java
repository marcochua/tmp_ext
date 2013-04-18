package tooltwist.rpbsg.util;

public enum XpcCall {
	/**
	 * Suggestion list for AU
	 */
	SUGGESTION_LIST("rpbsg.propertyService","getSuggestionList"),
	/**
	 * Suggestion list for NZ
	 */
	SUGGESTION_LIST_NZ("rpbsg.propertyService","getSuggestionListNZ"),
	
	PROPERTY_ID_LIST_FROM_SUGGESTION_NZ("rpbsg.propertyService","getPropertyIdListFromSuggestionNZ"),
	PROPERTY_ID_LIST_FROM_SUGGESTION("rpbsg.propertyService","getPropertyIdListFromSuggestion"),
	
	PROPERTY_SUMMARY_LIST_NZ("rpbsg.propertyService","getPropertySummaryListNZ"),
	PROPERTY_SUMMARY_LIST("rpbsg.propertyService","getPropertySummaryList");
	
	private String xpcName;
	private String xpcMethod;
	
	private XpcCall(String xpcName, String xpcMethod) {
		this.setXpcName(xpcName);
		this.setXpcMethod(xpcMethod);
	}

	public String getXpcName() {
		return xpcName;
	}

	public void setXpcName(String xpcName) {
		this.xpcName = xpcName;
	}

	public String getXpcMethod() {
		return xpcMethod;
	}

	public void setXpcMethod(String xpcMethod) {
		this.xpcMethod = xpcMethod;
	}
	
	
	
}

