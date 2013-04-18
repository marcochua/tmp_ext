package com.tooltwist.bsg.util;

public enum BsgWSDLNZ {

	PROPERTY_SERVICE ("/bsgNZ-2.0/ws/propertyService.wsdl"),
    ONTHEMARKET_SERVICE ("/bsgNZ-2.0/ws/onTheMarketService.wsdl"),
    SESSION_SERVICE ("/bsgNZ-2.0/ws/sessionService.wsdl"),
    PROPERTYIMAGERY_SERVICE ("/bsgNZ-2.0/ws/propertyImageryService.wsdl"),
    PROPERTYSTATISTICS_SERVICE ("/bsgNZ-2.0/ws/propertyStatisticsService.wsdl"),
    SALES_SERVICE ("/bsgNZ-2.0/ws/salesService.wsdl"),
    VALUERS_SERVICE ("/bsgNZ-2.0/ws/valuersService.wsdl"),
    PROPERTYSEARCH_SERVICE ("/bsgNZ-2.0/ws/propertySearchService.wsdl"),
    USER_SERVICE ("/bsgNZ-2.0/ws/userService.wsdl"),
    MARKETCOMPARE_SERVICE ("/bsgNZ-2.0/ws/marketCompareService.wsdl");
	
	private final String wsdl;
	
    private BsgWSDLNZ(String wsdl){
        this.wsdl = wsdl;
    }
    public String getValue(){return wsdl;}

}
