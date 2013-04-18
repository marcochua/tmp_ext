package com.tooltwist.bsg.util;

public enum BsgWSDL {

	PROPERTY_SERVICE ("/bsgAU-2.0/ws/propertyService.wsdl"),
    ONTHEMARKET_SERVICE ("/bsgAU-2.0/ws/onTheMarketService.wsdl"),
    SESSION_SERVICE ("/bsgAU-2.0/ws/sessionService.wsdl"),
    AUGOVERMENT_SERVICE ("/bsgAU-2.0/ws/auGovernmentStatisticsService.wsdl"),
    PROPERTYIMAGERY_SERVICE ("/bsgAU-2.0/ws/propertyImageryService.wsdl"),
    PROPERTYSTATISTICS_SERVICE ("/bsgAU-2.0/ws/propertyStatisticsService.wsdl"),
    SALES_SERVICE ("/bsgAU-2.0/ws/salesService.wsdl"),
    VALUERS_SERVICE ("/bsgAU-2.0/ws/valuersService.wsdl"),
    PROPERTYSEARCH_SERVICE ("/bsgAU-2.0/ws/propertySearchService.wsdl"),
    USER_SERVICE ("/bsgAU-2.0/ws/userService.wsdl"),
    MARKETCOMPARE_SERVICE ("/bsgAU-2.0/ws/marketCompareService.wsdl");
	
	private final String wsdl;
	
    private BsgWSDL(String wsdl){
        this.wsdl = wsdl;
    }
    public String getValue(){return wsdl;}

}
