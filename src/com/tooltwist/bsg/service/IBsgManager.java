package com.tooltwist.bsg.service;

import java.util.List;

import com.tooltwist.bsg.client.*;
import com.tooltwist.bsg.form.LoginCredentials;
import com.tooltwist.bsg.form.OtmSalesPropertyByRadiusResponse;

public interface IBsgManager {
	
	/* PropertyServiceBean */
	public GetPropertySummaryResponse getPropertySummary(Integer propertyId);
    public GetPropertySummaryListResponse getPropertySummaryList(List<Integer> propertyIdInput, Integer sortType);
    public GetPropertyDetailResponse getPropertyDetail(Integer propertyId);
    public GetPropertyIdsForAreaResponse getPropertyIdsForArea(String country, String state, String suburb, String postcode, String streetName);
    public GetPropertyIdsForCompanyResponse getPropertyIdsForCompany(String companyName, String state, String country);
    public GetPropertyIdsByPlanResponse getPropertyIdsByPlan(GetPropertyIdsByPlanRequest planInput);
    public GetAddressMatchResponse getAddressMatch(GetAddressMatchRequest addressMatchInput);
    public GetAvailableAttributesForPropertyIdsResponse getAvailableAttributesForPropertyIds(List<Integer> propertyIdInput);
    public GetPropertyIdListFromSuggestionResponse getPropertyIdListFromSuggestion(String searchString, Integer searchCategory);
    public GetSuggestionListResponse getSuggestionList(String searchString, int maxSuggestionResults, List<Integer> searchCategories);
    public RefinePropertiesResponse refineProperties(List<Integer> propertyIdInput, PropertySearchCriteriaInput propertySearchCriteriaInput, Integer sortType, List<BsgPropertyAttributeFilter> attributeFilterList);
    public GetStreetListResponse getStreetList(String streetName, String suburb, String state, String country);
    public GetPropertyIdsByNameResponse getPropertyIdsByName(String firstName, String lastName, String state, String country);
    public GetPropertyCoordinatesResponse getPropertyCoordinates(Integer propertyId);
    public GetAVMResponse getAVM(GetAVMRequest avmInput);
    public GetPropertyIdsByRadiusResponse getPropertyIdsByRadius(GetPropertyIdsByRadiusRequest propertyIdsByRadiusInput);
    public GetLookupValuesResponse getLookupValues(String lookupCode);
    public GetPropertyIdFromEPReferenceResponse getPropertyIdFromEPReferenceResponse(GetPropertyIdFromEPReferenceRequest request);
    
    public GetPropertySummaryResponse getPropertySummary(Integer propertyId, LoginCredentials credentials);
    public GetPropertySummaryListResponse getPropertySummaryList(List<Integer> propertyIdInput, Integer sortType, LoginCredentials credentials);
    public GetPropertyDetailResponse getPropertyDetail(Integer propertyId, LoginCredentials credentials);
    public GetPropertyIdsForCompanyResponse getPropertyIdsForCompany(String companyName, String state, String country, LoginCredentials credentials);
    public GetPropertyIdsByPlanResponse getPropertyIdsByPlan(GetPropertyIdsByPlanRequest planInput, LoginCredentials credentials);
    public GetAddressMatchResponse getAddressMatch(GetAddressMatchRequest addressMatchInput, LoginCredentials credentials);
    public GetAvailableAttributesForPropertyIdsResponse getAvailableAttributesForPropertyIds(List<Integer> propertyIdInput, LoginCredentials credentials);
    public GetPropertyIdListFromSuggestionResponse getPropertyIdListFromSuggestion(String searchString, Integer searchCategory, LoginCredentials credentials);
    public RefinePropertiesResponse refineProperties(List<Integer> propertyIdInput, PropertySearchCriteriaInput propertySearchCriteriaInput, Integer sortType, List<BsgPropertyAttributeFilter> attributeFilterList, LoginCredentials credentials);
    public GetStreetListResponse getStreetList(String streetName, String suburb, String state, String country, LoginCredentials credentials);
    public GetPropertyIdsByNameResponse getPropertyIdsByName(String firstName, String lastName, String state, String country, LoginCredentials credentials);
    public GetPropertyCoordinatesResponse getPropertyCoordinates(Integer propertyId, LoginCredentials credentials);
    public GetAVMResponse getAVM(GetAVMRequest avmInput, LoginCredentials credentials);
    public GetPropertyIdsByRadiusResponse getPropertyIdsByRadius(GetPropertyIdsByRadiusRequest propertyIdsByRadiusInput, LoginCredentials credentials);
    public GetLookupValuesResponse getLookupValues(String lookupCode, LoginCredentials credentials);
    public GetPropertySummaryListByNameSuburbResponse getPropertySummaryListByNameSuburb(String firstName, String lastName, String suburb, Integer pageNumber, Integer pageSize, LoginCredentials credentials);
    public GetPropertySummaryListByNameSuburbResponse getPropertySummaryListByNameSuburb(String firstName, String lastName, String suburb, Integer pageNumber, Integer pageSize);
    public DoneCMAResponse isDoneCMA(Integer propertyId, LoginCredentials credentials);
    
    /* SalesServiceBean */
    public GetSaleDetailResponse getSaleDetail(Integer propertyId);
    public RefineSoldPropertiesResponse refineSoldProperties(RefineSoldPropertiesRequest salesSearchCriteriaInput);
    public GetSalesPropertySummaryListResponse getSalesPropertySummaryList(List<Integer> propertyIdInput, Integer sortType);
    public IsHotSpotResponse isHotSpot(String state, String suburb, String postcode);
    public GetHomeBuyerIndexResponse getHomeBuyerIndex(String state, String suburb, String postcode);
    
    public GetSaleDetailResponse getSaleDetail(Integer propertyId, LoginCredentials credentials);
    public RefineSoldPropertiesResponse refineSoldProperties(RefineSoldPropertiesRequest salesSearchCriteriaInput, LoginCredentials credentials);
    public GetSalesPropertySummaryListResponse getSalesPropertySummaryList(List<Integer> propertyIdInput, Integer sortType, LoginCredentials credentials);
    public IsHotSpotResponse isHotSpot(String state, String suburb, String postcode, LoginCredentials credentials);
    public GetHomeBuyerIndexResponse getHomeBuyerIndex(String state, String suburb, String postcode, LoginCredentials credentials);
    public GetSalesPropertyIdsByRadiusResponse getSalesPropertyIdsByRadius(GetSalesPropertyIdsByRadiusRequest request, LoginCredentials credentials);
    
    /* PropertyStatisticsServicesBean */
    public GetSalesByNumberResponse getSalesByNumber(GetSalesByNumberRequest request);
    public GetSalesByNumberChartURLResponse getSalesByNumberChartURL(GetSalesByNumberChartURLRequest request);
    public GetSalesByPriceResponse getSalesByPrice(GetSalesByPriceRequest request);
    public GetSalesByPriceChartURLResponse getSalesByPriceChartURL(GetSalesByPriceChartURLRequest request);
    public GetYearlyMedianPricesResponse getYearlyMedianPrices(GetYearlyMedianPricesRequest request);
    public GetYearlyMedianPricesChartURLResponse getYearlyMedianPricesChartURL(GetYearlyMedianPricesChartURLRequest request);
    public GetMonthlyMedianPricesResponse getMonthlyMedianPrices(GetMonthlyMedianPricesRequest request);
    public GetMonthlyMedianPricesChartURLResponse getMonthlyMedianPricesChartURL(GetMonthlyMedianPricesChartURLRequest request);
    public GetCapitalGrowthResponse getCapitalGrowth(GetCapitalGrowthRequest request);
    public GetCapitalGrowthChartURLResponse getCapitalGrowthChartURL(GetCapitalGrowthChartURLRequest request);
    public GetAreaProfileMedianPricesChartURLResponse getAreaProfileMedianPricesChartURL(GetAreaProfileMedianPricesChartURLRequest request);
    
    public GetSalesByNumberResponse getSalesByNumber(GetSalesByNumberRequest request, LoginCredentials credentials);
    public GetSalesByNumberChartURLResponse getSalesByNumberChartURL(GetSalesByNumberChartURLRequest request, LoginCredentials credentials);
    public GetSalesByPriceResponse getSalesByPrice(GetSalesByPriceRequest request, LoginCredentials credentials);
    public GetSalesByPriceChartURLResponse getSalesByPriceChartURL(GetSalesByPriceChartURLRequest request, LoginCredentials credentials);
    public GetYearlyMedianPricesResponse getYearlyMedianPrices(GetYearlyMedianPricesRequest request, LoginCredentials credentials);
    public GetYearlyMedianPricesChartURLResponse getYearlyMedianPricesChartURL(GetYearlyMedianPricesChartURLRequest request, LoginCredentials credentials);
    public GetMonthlyMedianPricesResponse getMonthlyMedianPrices(GetMonthlyMedianPricesRequest request, LoginCredentials credentials);
    public GetMonthlyMedianPricesChartURLResponse getMonthlyMedianPricesChartURL(GetMonthlyMedianPricesChartURLRequest request, LoginCredentials credentials);
    public GetCapitalGrowthResponse getCapitalGrowth(GetCapitalGrowthRequest request, LoginCredentials credentials);
    public GetCapitalGrowthChartURLResponse getCapitalGrowthChartURL(GetCapitalGrowthChartURLRequest request, LoginCredentials credentials);
    public GetAreaProfileMedianPricesChartURLResponse getAreaProfileMedianPricesChartURL(GetAreaProfileMedianPricesChartURLRequest request, LoginCredentials credentials);
    
    /* PropertyImageryServiceBean */
    public GetPhotosResponse getPhotos(Integer propertyId);
    public GetPhotosResponse getPhotos(Integer propertyId, LoginCredentials credentials);
    
    public GetAerialMapResponse getAerialMap(Integer propertyId, LayerMapOptions mapOptions);
    public GetStreetMapResponse getStreetMap(Integer propertyId, LayerMapOptions mapOptions);
    public GetTopoMapResponse getTopoMap(Integer propertyId, LayerMapOptions mapOptions);
    public GetAreaMapResponse getAreaMap(Integer propertyId);
    
    public GetAerialMapResponse getAerialMap(Integer propertyId, LayerMapOptions mapOptions, LoginCredentials credentials);
    public GetStreetMapResponse getStreetMap(Integer propertyId, LayerMapOptions mapOptions, LoginCredentials credentials);
    public GetTopoMapResponse getTopoMap(Integer propertyId, LayerMapOptions mapOptions, LoginCredentials credentials);
    public GetAreaMapResponse getAreaMap(Integer propertyId, LoginCredentials credentials);
    
    /* OnTheMarketServiceBean */
    public GetListingsForPropertyIdResponse getListingsForPropertyId(Integer propertyId);
    public RefineOtmPropertiesResponse refineOtmProperties(RefineOtmPropertiesRequest otmCriteria);
    public GetOtmPropertySummaryListResponse getOtmPropertySummaryList(List<Integer> propertyIdInput, SortType sortType);
    
    public GetListingsForPropertyIdResponse getListingsForPropertyId(Integer propertyId, LoginCredentials credentials);
    public RefineOtmPropertiesResponse refineOtmProperties(RefineOtmPropertiesRequest otmCriteria, LoginCredentials credentials);
    public GetOtmPropertySummaryListResponse getOtmPropertySummaryList(List<Integer> propertyIdInput, SortType sortType, LoginCredentials credentials);
    public GetOTMPropertyIdsByRadiusResponse getOtmPropertyIdsByRadius(GetOTMPropertyIdsByRadiusRequest request, LoginCredentials credentials);
    
    /* AuGovernmentStatisticsServiceBean */
    public GetHouseholdIncomeResponse getHouseholdIncome(GetHouseholdIncomeRequest request);
    public GetHouseholdStructureResponse getHouseholdStructure(GetHouseholdStructureRequest request);
    public GetHouseholdOccupancyResponse getHouseholdOccupancy(GetHouseholdOccupancyRequest request);
    public GetAgeSexRatioResponse getAgeSexRatio(GetAgeSexRatioRequest request);
    public GetAgeSexRatioChartURLResponse getAgeSexRatioChartURL(GetAgeSexRatioChartURLRequest request);
    public GetHouseholdIncomeChartURLResponse getHouseholdIncomeChartURL(GetHouseholdIncomeChartURLRequest request);
    public GetHouseholdStructureChartURLResponse getHouseholdStructureChartURL(GetHouseholdStructureChartURLRequest request);
    public GetHouseholdOccupancyChartURLResponse getHouseholdOccupancyChartURL(GetHouseholdOccupancyChartURLRequest request);
    public GetStatisticsForRegionResponse getStatisticsForRegion(GetStatisticsForRegionRequest request);
    
    public GetHouseholdIncomeResponse getHouseholdIncome(GetHouseholdIncomeRequest request, LoginCredentials credentials);
    public GetHouseholdStructureResponse getHouseholdStructure(GetHouseholdStructureRequest request, LoginCredentials credentials);
    public GetHouseholdOccupancyResponse getHouseholdOccupancy(GetHouseholdOccupancyRequest request, LoginCredentials credentials);
    public GetAgeSexRatioResponse getAgeSexRatio(GetAgeSexRatioRequest request, LoginCredentials credentials);
    public GetAgeSexRatioChartURLResponse getAgeSexRatioChartURL(GetAgeSexRatioChartURLRequest request, LoginCredentials credentials);
    public GetHouseholdIncomeChartURLResponse getHouseholdIncomeChartURL(GetHouseholdIncomeChartURLRequest request, LoginCredentials credentials);
    public GetHouseholdStructureChartURLResponse getHouseholdStructureChartURL(GetHouseholdStructureChartURLRequest request, LoginCredentials credentials);
    public GetHouseholdOccupancyChartURLResponse getHouseholdOccupancyChartURL(GetHouseholdOccupancyChartURLRequest request, LoginCredentials credentials);
    public GetStatisticsForRegionResponse getStatisticsForRegion(GetStatisticsForRegionRequest request, LoginCredentials credentials);
    
    /* SessionServiceBean */
    public GenerateIntegratorAuthTokenResponse generateIntegratorAuthToken(String userName, String password, Long integratorId, Long customerId);
    public GetCredentialsForSessionTokenResponse getCredentialsForSessionToken(String sessionToken);
    public GetCustomersForUserResponse getCustomersForUser(String username, String password);
    public ValidateHmacHashResponse validateHmacHash(String sessionToken, String url);
    
    /* BSG ASYNCHRONOUS CALLS */    
    List<Integer> refinePropertiesBatching(List<Integer> propertyIdInput, PropertySearchCriteriaInput propertySearchCriteriaInput, LoginCredentials credentials);
    List<GetPropertySummaryListResponse> getPropertySummaryListAsync(List<Integer> propertyIdInput1, List<Integer> propertyIdInput2, Integer sortType, LoginCredentials credentials);
    OtmSalesPropertyByRadiusResponse getOtmSalesPropertyIdsByRadiusAsync(Double lat, Double lon, Double radius, LoginCredentials credentials);
    public GetSuggestionListResponse getSuggestionListAsync(String searchString, int maxSuggestionResults, List<Integer> searchCategories);
    public GetPropertySummaryListResponse getPropertySummaryListAsync(List<Integer> propertyIdInput, Integer sortType, LoginCredentials credentials);
    public GetOtmPropertySummaryListResponse getOtmPropertySummaryListAsync(List<Integer> propertyIdInput, SortType sortType, LoginCredentials credentials);

    /* propertySearchServiceBean */
    public SearchResponse search(String featureKey, SearchAreaCriteria searchAreaCriteria, SearchRadiusCriteria searchRadiusCriteria, List<Integer> propertyIdInput, String sortBy, Boolean fetchProperties, PropertiesCriteria propertiesCriteria, Boolean fetchPropertySales, PropertySalesCriteria propertySalesCriteria, Boolean fetchPropertyRecentSales, PropertySalesCriteria propertyRecentSalesCriteria, Boolean fetchPropertyOTM, PropertyOTMCriteria propertyOTMCriteria, Boolean fetchPropertyOTMRental, PropertyOTMCriteria propertyOTMRentalCriteria);
    public SearchResponse search(String featureKey, SearchAreaCriteria searchAreaCriteria, SearchRadiusCriteria searchRadiusCriteria, List<Integer> propertyIdInput, String sortBy, Boolean fetchProperties, PropertiesCriteria propertiesCriteria, Boolean fetchPropertySales, PropertySalesCriteria propertySalesCriteria, Boolean fetchPropertyRecentSales, PropertySalesCriteria propertyRecentSalesCriteria, Boolean fetchPropertyOTM, PropertyOTMCriteria propertyOTMCriteria, Boolean fetchPropertyOTMRental, PropertyOTMCriteria propertyOTMRentalCriteria, LoginCredentials credentials);
	public SearchResponse search(SearchRequest request);
	public SearchResponse search(SearchRequest request, LoginCredentials credentials);
	
	public GetPropertyMatchResponse getPropertyMatch(GetPropertyMatchRequest request);
	
	/* UserServiceBean */
    public GetAllUserDetailsResponse getAllUserDetails(String sessionToken);
    
    public GetPropertyProfileResponse getPropertyProfile(GetPropertyProfileRequest request);
}