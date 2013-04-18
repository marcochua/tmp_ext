package com.tooltwist.bsg.service;

import java.util.List;

import com.tooltwist.bsg.clientnz.GetPropertyIdFromEPReferenceRequest;
import com.tooltwist.bsg.clientnz.GetPropertyIdFromEPReferenceResponse;
import com.tooltwist.bsg.clientnz.PropertiesCriteria;
import com.tooltwist.bsg.clientnz.PropertyOTMCriteria;
import com.tooltwist.bsg.clientnz.PropertySalesCriteria;
import com.tooltwist.bsg.clientnz.SearchAreaCriteria;
import com.tooltwist.bsg.clientnz.SearchRadiusCriteria;
import com.tooltwist.bsg.clientnz.SearchRequest;
import com.tooltwist.bsg.clientnz.SearchResponse;
import com.tooltwist.bsg.clientnz.BsgPropertyAttributeFilter;
import com.tooltwist.bsg.clientnz.DoneCMAResponse;
import com.tooltwist.bsg.clientnz.GenerateIntegratorAuthTokenResponse;
import com.tooltwist.bsg.clientnz.GetAVMRequest;
import com.tooltwist.bsg.clientnz.GetAVMResponse;
import com.tooltwist.bsg.clientnz.GetAddressMatchRequest;
import com.tooltwist.bsg.clientnz.GetAddressMatchResponse;
import com.tooltwist.bsg.clientnz.GetAerialMapResponse;
import com.tooltwist.bsg.clientnz.GetAreaMapResponse;
import com.tooltwist.bsg.clientnz.GetAreaProfileMedianPricesChartURLRequest;
import com.tooltwist.bsg.clientnz.GetAreaProfileMedianPricesChartURLResponse;
import com.tooltwist.bsg.clientnz.GetAvailableAttributesForPropertyIdsResponse;
import com.tooltwist.bsg.clientnz.GetCapitalGrowthChartURLRequest;
import com.tooltwist.bsg.clientnz.GetCapitalGrowthChartURLResponse;
import com.tooltwist.bsg.clientnz.GetCapitalGrowthRequest;
import com.tooltwist.bsg.clientnz.GetCapitalGrowthResponse;
import com.tooltwist.bsg.clientnz.GetCredentialsForSessionTokenResponse;
import com.tooltwist.bsg.clientnz.GetCustomersForUserResponse;
import com.tooltwist.bsg.clientnz.GetHomeBuyerIndexResponse;
import com.tooltwist.bsg.clientnz.GetListingsForPropertyIdResponse;
import com.tooltwist.bsg.clientnz.GetLookupValuesResponse;
import com.tooltwist.bsg.clientnz.GetMonthlyMedianPricesChartURLRequest;
import com.tooltwist.bsg.clientnz.GetMonthlyMedianPricesChartURLResponse;
import com.tooltwist.bsg.clientnz.GetMonthlyMedianPricesRequest;
import com.tooltwist.bsg.clientnz.GetMonthlyMedianPricesResponse;
import com.tooltwist.bsg.clientnz.GetOTMPropertyIdsByRadiusRequest;
import com.tooltwist.bsg.clientnz.GetOTMPropertyIdsByRadiusResponse;
import com.tooltwist.bsg.clientnz.GetOtmPropertySummaryListResponse;
import com.tooltwist.bsg.clientnz.GetPhotosResponse;
import com.tooltwist.bsg.clientnz.GetPropertyCoordinatesResponse;
import com.tooltwist.bsg.clientnz.GetPropertyDetailResponse;
import com.tooltwist.bsg.clientnz.GetPropertyIdListFromSuggestionResponse;
import com.tooltwist.bsg.clientnz.GetPropertyIdsByNameResponse;
import com.tooltwist.bsg.clientnz.GetPropertyIdsByPlanRequest;
import com.tooltwist.bsg.clientnz.GetPropertyIdsByPlanResponse;
import com.tooltwist.bsg.clientnz.GetPropertyIdsByRadiusRequest;
import com.tooltwist.bsg.clientnz.GetPropertyIdsByRadiusResponse;
import com.tooltwist.bsg.clientnz.GetPropertyIdsForAreaResponse;
import com.tooltwist.bsg.clientnz.GetPropertyIdsForCompanyResponse;
import com.tooltwist.bsg.clientnz.GetPropertySummaryListByNameSuburbResponse;
import com.tooltwist.bsg.clientnz.GetPropertySummaryListResponse;
import com.tooltwist.bsg.clientnz.GetPropertySummaryResponse;
import com.tooltwist.bsg.clientnz.GetSaleDetailResponse;
import com.tooltwist.bsg.clientnz.GetSalesByNumberChartURLRequest;
import com.tooltwist.bsg.clientnz.GetSalesByNumberChartURLResponse;
import com.tooltwist.bsg.clientnz.GetSalesByNumberRequest;
import com.tooltwist.bsg.clientnz.GetSalesByNumberResponse;
import com.tooltwist.bsg.clientnz.GetSalesByPriceChartURLRequest;
import com.tooltwist.bsg.clientnz.GetSalesByPriceChartURLResponse;
import com.tooltwist.bsg.clientnz.GetSalesByPriceRequest;
import com.tooltwist.bsg.clientnz.GetSalesByPriceResponse;
import com.tooltwist.bsg.clientnz.GetSalesPropertyIdsByRadiusRequest;
import com.tooltwist.bsg.clientnz.GetSalesPropertyIdsByRadiusResponse;
import com.tooltwist.bsg.clientnz.GetSalesPropertySummaryListResponse;
import com.tooltwist.bsg.clientnz.GetStreetListResponse;
import com.tooltwist.bsg.clientnz.GetStreetMapResponse;
import com.tooltwist.bsg.clientnz.GetSuggestionListResponse;
import com.tooltwist.bsg.clientnz.GetTopoMapResponse;
import com.tooltwist.bsg.clientnz.GetYearlyMedianPricesChartURLRequest;
import com.tooltwist.bsg.clientnz.GetYearlyMedianPricesChartURLResponse;
import com.tooltwist.bsg.clientnz.GetYearlyMedianPricesRequest;
import com.tooltwist.bsg.clientnz.GetYearlyMedianPricesResponse;
import com.tooltwist.bsg.clientnz.IsHotSpotResponse;
import com.tooltwist.bsg.clientnz.LayerMapOptions;
import com.tooltwist.bsg.clientnz.PropertySearchCriteriaInput;
import com.tooltwist.bsg.clientnz.RefineOtmPropertiesRequest;
import com.tooltwist.bsg.clientnz.RefineOtmPropertiesResponse;
import com.tooltwist.bsg.clientnz.RefinePropertiesResponse;
import com.tooltwist.bsg.clientnz.RefineSoldPropertiesRequest;
import com.tooltwist.bsg.clientnz.RefineSoldPropertiesResponse;
import com.tooltwist.bsg.clientnz.SortType;
import com.tooltwist.bsg.form.LoginCredentials;
import com.tooltwist.bsg.form.OtmSalesPropertyByRadiusResponseNZ;

public interface IBsgManagerNZ {
	
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
    public GetPropertySummaryListByNameSuburbResponse getPropertySummaryListByNameSuburb(String firstName, String lastName, String suburb, Integer pageNumber, Integer pageSize);
    public GetPropertyIdFromEPReferenceResponse getPropertyIdFromEPReferenceResponse(GetPropertyIdFromEPReferenceRequest getPropertyIdFromEPReferenceRequest);
    
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
    
    /* SessionServiceBean */
    public GenerateIntegratorAuthTokenResponse generateIntegratorAuthToken(String userName, String password, Long integratorId, Long customerId);
    public GetCredentialsForSessionTokenResponse getCredentialsForSessionToken(String sessionToken);
    public GetCustomersForUserResponse getCustomersForUser(String username, String password);
    
    
    /* BSG ASYNCHRONOUS CALLS */    
    List<Integer> refinePropertiesBatching(List<Integer> propertyIdInput, PropertySearchCriteriaInput propertySearchCriteriaInput, LoginCredentials credentials);
    List<GetPropertySummaryListResponse> getPropertySummaryListAsync(List<Integer> propertyIdInput1, List<Integer> propertyIdInput2, Integer sortType, LoginCredentials credentials);
    OtmSalesPropertyByRadiusResponseNZ getOtmSalesPropertyIdsByRadiusAsync(Double lat, Double lon, Double radius, LoginCredentials credentials);
    public GetSuggestionListResponse getSuggestionListAsync(String searchString, int maxSuggestionResults, List<Integer> searchCategories);
    public GetPropertySummaryListResponse getPropertySummaryListAsync(List<Integer> propertyIdInput, Integer sortType, LoginCredentials credentials);
    public GetOtmPropertySummaryListResponse getOtmPropertySummaryListAsync(List<Integer> propertyIdInput, SortType sortType, LoginCredentials credentials);

    public SearchResponse search(SearchRequest request, LoginCredentials credentials);

	SearchResponse search(String featureKey,
			SearchAreaCriteria searchAreaCriteria,
			SearchRadiusCriteria searchRadiusCriteria,
			List<Integer> propertyIdInput, String sortBy,
			Boolean fetchProperties, PropertiesCriteria propertiesCriteria,
			Boolean fetchPropertySales,
			PropertySalesCriteria propertySalesCriteria,
			Boolean fetchPropertyRecentSales,
			PropertySalesCriteria propertyRecentSalesCriteria,
			Boolean fetchPropertyOTM, PropertyOTMCriteria propertyOTMCriteria,
			Boolean fetchPropertyOTMRental,
			PropertyOTMCriteria propertyOTMRentalCriteria);

	SearchResponse search(String featureKey,
			SearchAreaCriteria searchAreaCriteria,
			SearchRadiusCriteria searchRadiusCriteria,
			List<Integer> propertyIdInput, String sortBy,
			Boolean fetchProperties, PropertiesCriteria propertiesCriteria,
			Boolean fetchPropertySales,
			PropertySalesCriteria propertySalesCriteria,
			Boolean fetchPropertyRecentSales,
			PropertySalesCriteria propertyRecentSalesCriteria,
			Boolean fetchPropertyOTM, PropertyOTMCriteria propertyOTMCriteria,
			Boolean fetchPropertyOTMRental,
			PropertyOTMCriteria propertyOTMRentalCriteria,
			LoginCredentials credentials);
	SearchResponse search(SearchRequest request);

}
