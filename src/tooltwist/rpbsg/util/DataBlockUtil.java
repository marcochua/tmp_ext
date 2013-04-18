package tooltwist.rpbsg.util;

import tooltwist.rpbsg.util.StringUtils;
import tooltwist.rpbsg.util.WebUtils;

public class DataBlockUtil {

	//file and directory constants
	public static final String PCMA_CONF_PATH = "conf-pcma";
	public static final String PROJECT_NAME = "pcma_t";
	public static final String MESSAGES_CONF_FILE = "messages.xml";
	public static final String DESIGN_PUBLISH_DIR = "designPublishDir";
	public static final String PRODUCTION_PUBLISH_DIR = "productionPublishDir";
	public static final String EMAIL_TEMPLATES_PATH = "email-templates";
	public static final String EMAIL_TEMPLATE_FILE = "myrp.email";
	public static final String HTM_TEMPLATE_FILE = "myrp.htm";

	public static final String PCMA_USER_CONFIG_PATH = WebUtils.getWbdProperty("userConfigPath", StringUtils.EMPTY) + "%s/%s/%s";
	public static final String PCMA_CONFIG_PATH = WebUtils.getWbdProperty("configPath", StringUtils.EMPTY);
	public static final String PCMA_IMAGES_PATH = "pcma/images/";
	
	public static final String GENERATED_REPORTS_FOLDER = WebUtils.getWbdProperty("userConfigPath", StringUtils.EMPTY) + "generated-reports";
	
	//path of default templates and themes
	public static final String TEMPLATES_PATH = "conf-local/local-data/templates/";
	public static final String THEME_PATH = "conf-local/local-data/themes/";
	
	//Designer Mode
	public static final String DESIGNER_MODE_DRAFTS = "designer-mode/drafts";
	public static final String DESIGNER_MODE_TEMPLATES = "designer-mode/templates";
	public static final String DESIGNER_MODE_THEMES = "designer-mode/themes";
	//Template Mode
	public static final String TEMPLATE_MODE_DRAFTS = "template-mode/drafts";
	public static final String TEMPLATE_MODE_TEMPLATES = "template-mode/templates";
	public static final String TEMPLATE_MODE_THEMES = "template-mode/themes";
	
	//configuration file in user draft folder
	public static final String CONFIG_TEMPLATE = "configuration.xml";
	
	public static final String THEME_IMAGES_FOLDER = "/pcma-images/%s/themeImages/";
	public static final String BORDER_IMAGES_FOLDER = "/pcma-images/%s/borderImages/";
	
	public static final String MORTON_TEMPLATE_FILE = "template_mortonAndMorton.xml";
	public static final String RP_ESTIMATE_TEMPLATE_FILE = "template_rpEstimate.xml";
	
	public static final String SALE_RANGE_CONF_FILE = "saleRange.xml";
	public static final String AVM_RANGE_CONF_FILE = "avmRange.xml";
	public static final String TEMPLATE_STYLE = "/pcma/stylesheets/template_style.css";
	
	public static final String TOOL_TIP_FORMAT = "javascript: jQuery(this).simpletip({ content: '%s', fixed: false });";
	public static final String PAGE_BREAK = "<div style=\"page-break-after: always;\">\n\t\t\t<span style=\"display: none;\">&nbsp;</span></div>"; 
	
	//wbd configuration constants
	public static final String LOGIN_TIMEOUT = "loginTimeout";
	public static final String SERVER_NAME = "serverName";
	public static final String PCMA_WEBCONTENT_DIR = "pcmaWebContentDir";
	public static final String PARTNER_SID = "partnerSid";
	public static final String DEFAULT_SID = "91-941c6edd9cc092d853c70049313243b3";
	public static final String LOGIN_PAGE = "loginPage";
	public static final String DEFAULT_LOGIN_PAGE = "https://uat.rpdata.com/rpp/login.html";
	
	//session parameters
	public static final String REQUEST_TIME_SESSION = "requestTimeSession";
	public static final String PROPERTY_DETAIL_SESSION = "propertyDetailSession";
	public static final String AVM_SESSION = "avmSession";
	public static final String SEARCH_REFINE_SESSION = "searchRefineSession";
	public static final String RESULTS_NUMBER_SESSION = "resultsNumberSession";
	public static final String SEARCH_COMPONENT_ID_SESSION = "searchComponentIdSession";
	public static final String SEARCH_FILTER_SESSION = "searchFilterSession";
	public static final String SELECTED_PROPERTY_IDS_SESSION = "selectedPropertyIdsSession";
	public static final String PROPERTY_ID_SESSION = "propertyIdSession";
	public static final String PROPERTY_ID_OLD_SESSION = "oldPropertyIdSession";
	
	public static final String SESSION_TEMPLATE_MODE = "sessionTemplateMode";
	public static final String SESSION_CREATE_TEMPLATE = "sessionCreateTemplate";
	public static final String SESSION_TEMPLATE_ID = "sessionTemplateId";
	
	//Component Sessions (BSG Data)
	public static final String SESSION_PROPERTY_ID_FLAG = "sessionComponentIdFlag";
	//maps
	public static final String SESSION_TOPO_MAP = "sessionTopoMap";
	public static final String SESSION_AERIAL_MAP = "sessionAerialMap";
	public static final String SESSION_AREA_MAP = "sessionAreaMap";
	//sales by price
	public static final String SESSION_SALES_BY_PRICE = "sessionSalesByPrice";
	public static final String SESSION_SALES_BY_PRICE_CHART = "sessionSalesByPriceChart";
	//sales per annum (sales by number)
	public static final String SESSION_SALES_BY_NUMBER = "sessionSalesByNumber";
	public static final String SESSION_SALES_BY_NUMBER_CHART = "sessionSalesByNumberChart";
	//median sales price (monthly median prices)
	public static final String SESSION_MONTHLY_MEDIAN_PRICES = "sessionMonthlyMedianPrices";
	public static final String SESSION_MONTHLY_MEDIAN_PRICES_CHART = "sessionMonthlyMedianPriceChart";
	//capital growth median prices
	public static final String SESSION_CAPITAL_GROWTH_MEDIAN_PRICES = "sessionCapitalGrowthMedianPrices";
	public static final String SESSION_CAPITAL_GROWTH_MEDIAN_PRICES_CHART = "sessionCapitalGrowthMedianPricesChart";
	//area profile
	public static final String SESSION_DEMOGRAPHICS = "sessionDemoGraphics";
	public static final String SESSION_AREA_PROFILE_MEDIAN_CHART = "sessionAreaProfileMedianChart";
	//sex age ratio
	public static final String SESSION_SEX_AGE_RATIO = "sessionSexAgeRatio";
	public static final String SESSION_SEX_AGE_RATIO_CHART = "sessionSexAgeRatioChart";
	//household income
	public static final String SESSION_HOUSEHOLD_INCOME = "sessionHouseholdIncome";
	public static final String SESSION_HOUSEHOLD_INCOME_CHART = "sessionHouseholdIncomeChart";
	//household structure
	public static final String SESSION_HOUSEHOLD_STRUCTURE = "sessionHouseholdStructure";
	public static final String SESSION_HOUSEHOLD_STRUCTURE_CHART = "sessionHouseholdStructureChart";
	//household occupancy
	public static final String SESSION_HOUSEHOLD_OCCUPANCY = "sessionHouseholdOccupancy";
	public static final String SESSION_HOUSEHOLD_OCCUPANCY_CHART = "sessionHouseholdOccupancyChart";
	//disclaimer
	public static final String SESSION_DISCLAIMER = "sessionDisclaimer";
	
	//property attributes
	public static final String ATTRIBUTE_FORMAT = "\t\t<td><img alt='%s' src='%s' /></td><td class='width5'>&nbsp;</td><td class='attributesLabel'><label>%s</label></td>\n";
	public static final String LAND_AREA_FORMAT = "\t\t<td><img alt='%s' src='%s' /></td><td class='width5'>&nbsp;</td><td class='attributesLabel'><label>%sm<sup>2</sup></label></td>\n";
	public static final String BED_ROOMS_IMAGE = StringUtils.getWebappPrefix() + "/cropImage/pcma_images.pcma_i_bedroom.png";
	public static final String BATH_ROOMS_IMAGE = StringUtils.getWebappPrefix() + "/cropImage/pcma_images.pcma_i_bathroom.png";
	public static final String CAR_SPACES_IMAGE = StringUtils.getWebappPrefix() + "/cropImage/pcma_images.pcma_i_carSpace.png";
	public static final String LAND_AREA_IMAGE = StringUtils.getWebappPrefix() + "/cropImage/pcma_images.pcma_i_landSize.png";
	
	//theme types
	public static String HEADER = "header";
	public static String COVER = "cover";
	public static String FOOTER = "footer";
	public static String BORDER = "border";
			
	//BSG components constants
	public static final int CASE_PROPERTY_DETAILS = 1;
	public static final int CASE_MAPS = 2;
	public static final int CASE_AREA_PROFILE = 7;
	public static final int CASE_RECENT_MEDIAN_PRICES = 8;
	public static final int CASE_SALES_PER_ANNUM = 9;
	public static final int CASE_SALES_BY_PRICE = 10;
	public static final int CASE_CAPITAL_GROWTH_MEDIAN_PRICES = 11;
	public static final int HOUSEHOLD = 12;
	public static final int CASE_AGE_SEX_RATIO = 13;
	public static final int CASE_DISCLAIMER = 16;

	public static final int CASE_SOLD_PROPERTIES = 3;
	public static final int CASE_OTM = 4;
	public static final int CASE_MARKET_COMPARE = 5;
	public static final int CASE_RENTAL = 6;
	public static final int CASE_HOUSEHOLD_INCOME = 14;
	
	public static final int DEFAULT_MAX_RESULTS = 20;
	public static final String FILTER_SEARCH_TYPE = "filterSearch";
	public static final String PROPERTY_FIELD_TYPE = "propertyField";
	
	//wrappers
	public static final String REPORT_WRAPPER = "<html><head><style type='text/css'>%s</style></head><body>%s</body></html>";
	public static final String HEADER_WRAPPER = "<div id='templateHeader'>%s</div>";
	public static final String FOOTER_WRAPPER = "<div id='templateFooter'>%s</div>";
	public static final String CONTENT_WRAPPER = "<div id='templateContent'%s>%s</div>";
	public static final String TEMPLATE_HEADER_STYLE = "@top-center { content: element(templateHeader, last-except) }";
	public static final String TEMPLATE_FOOTER_STYLE = "@bottom-center { content: element(templateFooter, last-except) }";
	public static final String TEMPLATE_PAGE_NUMBER = "<span id='templatePageNumber'></span>";
	public static final String TEMPLATE_PAGE_COUNT = "<span id='templatePageCount'></span>";
	public static final String TEMPLATE_PAGE_BREAK = "<span style='page-break-after: always;'></span>";
	public static final String BORDER_WRAPPER = " style=\"background: url('%s') repeat-y scroll 0 0 transparent;\"";
	
	//build/version number
	public static final String VERSION_NUMBER = "versionNumber";
	public static final String BUILD_NUMBER = "buildNumber";
	
	//message configuration fields constants
	public static final String MSG_ID = "id";
	public static final String MSG_TYPE = "type";
	public static final String MSG_REFERS_TO = "refersTo";
	public static final String MSG_FIELD_NAME = "fieldName";
	public static final String MSG_DESCRIPTION = "description";
	
	//status constants
	public static final String STATUS_TRUE = "true";
	public static final String STATUS_FALSE = "false";
	
	//char constants
	public static final String UNDERSCORE = "_";
	public static final String PERIOD = ".";
	public static final String SPACE = "&nbsp;";
	
	//date time format constants
	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_TIME_FORMAT2 = "yyMMddHHmmssSSSSS";
	public static final String DATE_FORMAT = "dd/MM/yyyy";
	public static final String DATE_FORMAT2 = "MMMM dd, yyyy";
	public static final String DATE_FORMAT3 = "dd MMMM yyyy";
	public static final String DATE_FORMAT4 = "dd MMM, yyyy";
	public static final String DATE_FORMAT5 = "MMM dd, yyyy";
	public static final String DATE_FORMAT6 = "MMM yyyy";
	public static final String DATE_FORMAT7 = "MM/yyyy";
	public static final String TIME_FORMAT = "h:mma";
	public static final String DATE_FORMAT8 = "dd-MMM-yyyy";
	
	public static final String RPM_DATE_FORMAT = "dd/MM/yyyy";
	public static final String DB_DATE_FORMAT = "yyyy-MM-dd";
	
	//XPC methods
	public static final String SELECT_METHOD = "select";
	public static final String INSERT_METHOD = "insert";
	public static final String UPDATE_METHOD = "update";
	public static final String DELETE_METHOD = "delete";
	public static final String DATABASE_QUERY_XPC = "databaseQuery";
	public static final String XML_FORMAT = "<%s><![CDATA[%s]]></%s>\n";
	public static final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
	public static final String XML_SELECT = "<select status=\"all\">\n%s</select>";
	public static final String XML_OUTPUT = "output";
	public static final String XML_NOT_FOUND = "<notfound/>";
	public static final String XML_FILE_EXTENSION = ".xml";
	public static final String CDATA_FORMAT = "<![CDATA[%s]]>";
	public static final String PNG_FILE_EXTENSION = ".png";
	public static final String PDF_FILE_EXTENSION = ".pdf";
	
	//Single Line Search fields constants
	public static final String SINGLE_LINE_ADDRESS_SEARCH = "singleLineSearch";
	public static final String SLAS_DEFAULT_VALUE = "defaultValue";
	public static final int SLAS_MAX_RESULTS = 10;
	public static final String SLAS_CATEGORIES = "1";
	public static final String SLAS_SEARCH_STRING = "searchString";
	public static final String SLAS_MAX_SUGGESTION_RESULTS = "maxSuggestionResults";
	public static final String SLAS_PROPERTY_SEARCH_RESULT = "propertySearchResult";
	public static final String SLAS_MULTIPLE_SEARCH_RESULT = "multipleSearchResult";
	public static final String SLAS_NO_SEARCH_RESULT = "noSearchResult";
	public static final String SLAS_FROM_SUGGESTION = "fromSuggestion";
	
	//Database table constants
	public static final String USER_MASTER_TABLE = "user_master";
	public static final String USER_TYPE_TABLE = "user_type";
	public static final String IMAGE_GALLERY_TABLE = "image_gallery";
	public static final String DISCLAIMER_TABLE = "disclaimer";
	public static final String TEMPLATE_TABLE = "template";
	public static final String THEME_TABLE = "theme";
	public static final String COMPONENT_TABLE = "component";
	public static final String COMPANY_TABLE = "company";
	public static final String AGENT_TABLE = "agent";
	public static final String THEME_FIELD = "theme_field";
	public static final String REPORT_HISTORY_TABLE = "report_history";
	public static final String LAND_SIZE_TABLE = "land_size";
	public static final String SALE_PRICE_TABLE = "sale_price";
	
	//Database sequence constants
	public static final String USER_MASTER_ID_SEQ = "user_master_id_seq";
	public static final String IMAGE_GALLERY_ID_SEQ = "image_gallery_id_seq";
	public static final String DISCLAIMER_ID_SEQ = "disclaimer_id_seq";
	public static final String TEMPLATE_ID_SEQ = "template_id_seq";
	public static final String THEME_ID_SEQ = "theme_id_seq";
	public static final String COMPONENT_ID_SEQ = "component_id_seq";
	public static final String COMPANY_ID_SEQ = "company_id_seq";
	public static final String AGENT_ID_SEQ = "agent_id_seq";
	
	//component types
	public static final String STATIC_COMPONENT_TYPE = "Static";
	public static final String BSG_COMPONENT_TYPE = "BSG";
	
	//user types
	public static final String CUSTOMER_USER_TYPE = "CUS";
	public static final String ADMIN_USER_TYPE = "ADM";
	
	//order types
	public static final String DESC_ORDER_TYPE = "desc";
	public static final String ASC_ORDER_TYPE = "asc";
	
	//Property status
	public static final Integer FOR_SALE = 0;
	public static final Integer FOR_RENT = 1;
	
	//Search categories
	public static final int EXACT_ADDRESS_SEARCH = 1;
	public static final int STREET_ADDRESS_SEARCH = 2;
	public static final int SUBURB_ADDRESS_SEARCH = 3;
	public static final int POSTCODE_ADDRESS_SEARCH = 4;
	
	//Image masking
	public static final String MASKED_IMAGE_URL = StringUtils.getWebappPrefix() + "/servlet/imageDisplay?op=generateMaskedImage&imageUrl={imageUrl}&height={height}&width={width}";
	public static final String PDF_IMAGE_URL = StringUtils.getWebappPrefix() + "/servlet/imageDisplay?op=generatePdfImage&imageUrl={imageUrl}&width={width}&height={height}";

	//Gateway service methods
	public static final String GATEWAY_SERVICE_XPC = "pcma.gatewayService";
	public static final String GET_PROPERTY_ID_LIST_FROM_SUGGESTION_GATEWAY_SERVICE = "getPropertyIdListFromSuggestion";
	public static final String GET_PROPERTY_IDS_FOR_AREA_GATEWAY_SERVICE = "getPropertyIdsForArea";
	public static final String GET_SUGGESTION_LIST_GATEWAY_SERVICE = "getSuggestionList";
	public static final String GET_PROPERTY_DETAIL_GATEWAY_SERVICE = "getPropertyDetail";
	public static final String GET_SALES_HISTORY_LIST_GATEWAY_SERVICE = "getSalesHistoryList";
	public static final String GET_PROPERTY_SUMMARY_GATEWAY_SERVICE = "getPropertySummary";
	public static final String GET_PROPERTY_SUMMARY_LIST_GATEWAY_SERVICE = "getPropertySummaryList";
	public static final String GET_DEMOGRAPHICS_PARAGRAPH_GATEWAY_SERVICE = "getDemographicsParagraph";
	public static final String GET_YEARLY_MEDIAN_PRICES_CHART_URL_GATEWAY_SERVICE = "getYearlyMedianPricesChartURL";
	public static final String GET_MONTHLY_MEDIAN_PRICES_CHART_URL_GATEWAY_SERVICE = "getMonthlyMedianPricesChartURL";
	public static final String GET_AREA_PROFILE_MEDIAN_PRICES_CHART_URL_GATEWAY_SERVICE = "getAreaProfileMedianPricesChartURL";
	public static final String GET_AGE_SEX_RATIO_CHART_URL_GATEWAY_SERVICE = "getAgeSexRatioChartURL";
	public static final String GET_AGE_SEX_RATIO = "getAgeSexRatio";
	public static final String GET_HOUSEHOLD_INCOME_CHART_URL_GATEWAY_SERVICE = "getHouseholdIncomeChartURL";
	public static final String GET_HOUSEHOLD_INCOME = "getHouseHoldIncome";
	public static final String GET_HOUSEHOLD_STRUCTURE = "getHouseHoldStructure";
	public static final String GET_HOUSEHOLD_STRUCTURE_CHART_URL_GATEWAY_SERVICE = "getHouseholdStructureChartURL";
	public static final String GET_HOUSEHOLD_OCCUPANCY = "getHouseHoldOccupancy";
	public static final String GET_HOUSEHOLD_OCCUPANCY_CHART_URL_GATEWAY_SERVICE = "getHouseholdOccupancyChartURL";
	public static final String GET_CAPITAL_GROWTH_CHART_URL_GATEWAY_SERVICE = "getCapitalGrowthChartURL";
	public static final String GET_CAPITAL_GROWTH_GATEWAY_SERVICE = "getCapitalGrowth";
	public static final String GET_MONTHLY_MEDIAN_PRICES_GATEWAY_SERVICE = "getMonthlyMedianPrices";
	public static final String GET_YEARLY_MEDIAN_PRICES_GATEWAY_SERVICE = "getYearlyMedianPrices";
	public static final String GET_PHOTOS_GATEWAY_SERVICE = "getPhotos";
	public static final String GET_TOPO_MAP_GATEWAY_SERVICE = "getTopoMap";
	public static final String GET_AERIAL_MAP_GATEWAY_SERVICE = "getAerialMap";
	public static final String GET_STREET_MAP_GATEWAY_SERVICE = "getStreetMap";
	public static final String GET_AREA_MAP_GATEWAY_SERVICE = "getAreaMap";
	public static final String GET_AVM_GATEWAY_SERVICE = "getAVM";
	public static final String GET_SALES_BY_NUMBER_GATEWAY_SERVICE = "getSalesByNumber";
	public static final String GET_SALES_BY_PRICE_GATEWAY_SERVICE = "getSalesByPrice";
	public static final String GET_SALES_BY_PRICE_CHART_URL_GATEWAY_SERVICE = "getSalesByPriceChartURL";
	public static final String GET_SALES_BY_NUMBER_CHART_URL_GATEWAY_SERVICE = "getSalesByNumberChartURL";
	public static final String GET_SOLD_PROPERTIES_GATEWAY_SERVICE = "getSoldProperties";
	public static final String GET_RECENT_SALES_GATEWAY_SERVICE = "getRecentSales";
	public static final String GET_DATE_PREPARED_GATEWAY_SERVICE = "getDatePrepared";
	public static final String GET_DISCLAIMER_GATEWAY_SERVICE = "getDisclaimer";
	public static final String GET_PROPERTY_IDS_FROM_RADIUS_SERVICE = "getPropertyIdsFromRadius";
	public static final String GET_OTM_PROPERTY_SUMMARY_LIST = "getOtmPropertySummaryList";
	public static final String GET_PROPERTY_INFO_LIST_GATEWAY_SERVICE = "getPropertyInfoList";
	public static final String GET_CREDENTIALS_FOR_SESSION_TOKEN_GATEWAY_SERVICE = "getCredentialsForSessionToken";
	public static final String GET_ALL_USER_DETAILS_GATEWAY_SERVICE = "getAllUserDetails";
	public static final String VALIDATE_HMAC_HASH_GATEWAY_SERVICE = "validateHmacHash";
	public static final String SEARCH_GATEWAY_SERVICE = "search";
	public static final String REFINE_PROPERTIES_GATEWAY_SERVICE = "refineProperties";
	
	public static final String DATE_PREPARED_BASE_PRODUCT = "date_prepared";
	public static final String SALES_NUMBER_BASE_PRODUCT = "sales_number";
	
	//Suggestion list service fields
	public static final String SUGGESTION_LIST_BASE_PRODUCT = "suggestion_list";
	public static final String SL_ADDRESS_SERVICE_FIELD = "address";
	public static final String SL_ADDRESS_KEY_SERVICE_FIELD = "key";
	public static final String SL_ADDRESS_VALUE_SERVICE_FIELD = "value";
	
	//Property detail service fields
	public static final String PROPERTY_DETAIL_BASE_PRODUCT = "property_detail";
	public static final String PD_PROPERTY_ID_SERVICE_FIELD = "property_id";
	public static final String PD_PROPERTY_ADDRESS_SERVICE_FIELD = "property_address";
	public static final String PD_PROPERTY_PHOTO_URL_SERVICE_FIELD = "property_photo_url";
	public static final String PD_OWNER_NAME_SERVICE_FIELD = "owner_name";
	public static final String PD_PROPERTY_VENDOR_SERVICE_FIELD = "property_vendor";
	public static final String PD_PROPERTY_TYPE_SERVICE_FIELD = "property_type";
	public static final String PD_CATEGORY_TYPE_SERVICE_FIELD = "category_type";
	public static final String PD_LGA_NAME_SERVICE_FIELD = "lga_name";
	public static final String PD_PRIMARY_LAND_USE_SERVICE_FIELD = "primary_land_use";
	public static final String PD_SECONDARY_LAND_USE_SERVICE_FIELD = "secondary_land_use";	
	public static final String PD_ZONE_SERVICE_FIELD = "zone";
	public static final String PD_ZONE_DESCRIPTION_SERVICE_FIELD = "zone_description";
	public static final String PD_LOT_PLAN_SERVICE_FIELD = "lot_plan";
	public static final String PD_RPD_SERVICE_FIELD = "rpd";
	public static final String PD_UCV_SERVICE_FIELD = "ucv";
	public static final String PD_UCV_DATE_SERVICE_FIELD = "ucv_date";
	public static final String PD_LAND_AREA_SERVICE_FIELD = "land_area";
	public static final String PD_BED_ROOMS_SERVICE_FIELD = "bed_rooms";
	public static final String PD_BATH_ROOMS_SERVICE_FIELD = "bath_rooms";
	public static final String PD_LOCKUP_GARAGES_SERVICE_FIELD = "lockup_garages";
	public static final String PD_CAR_SPACES_SERVICE_FIELD = "car_spaces";
	public static final String PD_ATTRIBUTES_SERVICE_FIELD = "attributes";
	public static final String PD_LONGITUDE_SERVICE_FIELD = "longitude";
	public static final String PD_LATITUDE_SERVICE_FIELD = "latitude";
	public static final String PD_FLOOR_AREA_SERVICE_FIELD = "floor_area";
	public static final String PD_RPD = "rpd";
	
	//Property address detail service fields
	public static final String PROPERTY_ADDRESS_DETAIL_BASE_PRODUCT = "property_address_detail";
	public static final String PA_COUNTRY_SERVICE_FIELD = "country";
	public static final String PA_STATE_SERVICE_FIELD = "state";
	public static final String PA_SUBURB_SERVICE_FIELD = "suburb";
	public static final String PA_POST_CODE_SERVICE_FIELD = "post_code";
	public static final String PA_STREET_NAME_SERVICE_FIELD = "street_name";
	public static final String PA_STREET_DESIGNATOR_SERVICE_FIELD = "street_designator";
	public static final String PA_STREET_EXTENSION_SERVICE_FIELD = "street_extension";
	public static final String PA_STREET_DIRECTION_SERVICE_FIELD = "street_direction";
	public static final String PA_UNIT_DESIGNATOR_SERVICE_FIELD = "unit_designator";
    
	//REA attribute service fields
	public static final String REA_ATTRIBUTE_DETAIL_BASE_PRODUCT = "rea_attribute_detail";
	public static final String REA_ID_SERVICE_FIELD = "rea_id";
	public static final String REA_RECENT_SALE_SERVICE_FIELD = "rea_recent_sale";
	
	//FullProperties Attributes (Feature)
	public static final String FULL_PROPERTIES_ATTRIBUTES_DETAILS = "full_properties_attributes";
	public static final String FULL_PROPERTIES_ATTRIBUTES_NAME = "full_properties_attributes_name";
	public static final String FULL_PROPERTIES_ATTRIBUTES_VALUE = "full_properties_attributes_value";
	
	//StateProperties Attributes (Feature)
	public static final String STATE_PROPERTIES_ATTRIBUTES_DETAILS = "state_properties_attributes";
	public static final String STATE_PROPERTIES_ATTRIBUTES_NAME = "state_properties_attributes_name";
	public static final String STATE_PROPERTIES_ATTRIBUTES_VALUE = "state_properties_attributes_value";
	
	//Property listing list service fields
	public static final String PROPERTY_LISTING_LIST_BASE_PRODUCT = "listing_list";
	public static final String PLL_DETAIL_SERVICE_FIELD = "listing_list_detail";
	public static final String PLL_AGENCY_NAME_SERVICE_FIELD = "agency_name";
	public static final String PLL_AGENT_NAME_SERVICE_FIELD = "agent_name";
	public static final String PLL_DAYS_LISTED_SERVICE_FIELD = "days_listed";
	public static final String PLL_LATEST_LIST_DATE_SERVICE_FIELD = "latest_list_date";
	public static final String PLL_LATEST_LISTED_PRICE_SERVICE_FIELD = "latest_listed_price";
	public static final String PLL_LATEST_LISTED_PRICE_DESCRIPTION_SERVICE_FIELD = "latest_listed_price_description";
	public static final String PLL_LISTING_TYPE_DESCRIPTION_SERVICE_FIELD = "listing_type_description";
	public static final String PLL_PROPERTY_ID_SERVICE_FIELD = "property_id";

	//Rental listing list service fields
	public static final String RENTAL_LISTING_BASE_PRODUCT = "rental_list";
	public static final String RL_DETAIL_SERVICE_FIELD = "rental_list_detail";
	public static final String RL_AGENCY_NAME_SERVICE_FIELD = "agency_name";
	public static final String RL_AGENT_NAME_SERVICE_FIELD = "agent_name";
	public static final String RL_DAYS_LISTED_SERVICE_FIELD = "days_listed";
	public static final String RL_LATEST_LIST_DATE_SERVICE_FIELD = "latest_listed_price";
	public static final String RL_LATEST_LISTED_PRICE_SERVICE_FIELD = "latest_listed_price";
	public static final String RL_LISTING_TYPE_DESCRIPTION_SERVICE_FIELD = "listing_type_description";
	public static final String RL_PERIOD_SERVICE_FIELD = "period";
	public static final String RL_PROPERTY_ID_SERVICE_FIELD = "property_id";
	public static final String RL_RENTAL_AMOUNT_SERVICE_FIELD = "rental_amount";
    
	//Property owners service fields
	public static final String PROPERTY_OWNERS_BASE_PRODUCT = "property_owner_list";
	public static final String PO_DETAIL_SERVICE_FIELD = "property_owner_detail";
	public static final String PO_ADDRESS_LINE1_SERVICE_FIELD = "address_line1";
	public static final String PO_ADDRESS_LINE2_SERVICE_FIELD = "address_line2";
	public static final String PO_CARE_OF_TEXT_SERVICE_FIELD = "care_of_text";
	public static final String PO_COMPANY_NAME_SERVICE_FIELD = "company_name";
	public static final String PO_FIRST_NAME_SERVICE_FIELD = "first_name";
	public static final String PO_LAST_NAME_SERVICE_FIELD = "last_name";
	public static final String PO_LAST_TRANSFER_ID_SERVICE_FIELD = "last_transfer_id";
	public static final String PO_OWNER_ID_SERVICE_FIELD = "owner_id";
	public static final String PO_POST_CODE_SERVICE_FIELD = "post_code";
		
	//Property default photo service fields
	public static final String PROPERTY_DEFAULT_PHOTO_BASE_PRODUCT = "property_default_photo";
	public static final String PDP_LARGE_URL_SERVICE_FIELD = "large_url";
	public static final String PDP_MEDIUM_URL_SERVICE_FIELD = "medium_url";
	public static final String PDP_THUMBNAIL_URL_SERVICE_FIELD = "thumbnail_url";
	public static final String PDP_NO_THUMBNAIL_URL_SERVICE_FIELD = StringUtils.getWebappPrefix() + "/cropImage/pcma_images.pcma_i_noPhotoAvailable.png";
	public static final String PDP_NO_MEDIUM_URL_SERVICE_FIELD = StringUtils.getWebappPrefix() + "/cropImage/pcma_images.pcma_i_noPhotoAvailableMedium.png";
	
	//Sales history list service fields
	public static final String SALES_HISTORY_LIST_BASE_PRODUCT = "sales_history_list";
	public static final String SHL_DETAIL_SERVICE_FIELD = "sales_history_detail";
	public static final String SHL_AGENT_ADVICE_SERVICE_FIELD = "agent_advice";
	public static final String SHL_SALE_TYPE_SERVICE_FIELD = "sale_type";
	public static final String SHL_SALE_DATE_SERVICE_FIELD = "sale_date";
	public static final String SHL_SALE_PRICE_SERVICE_FIELD = "sale_price";
	public static final String SHL_SALE_CODE_SERVICE_FIELD = "sale_code";
	public static final String SHL_COMPANY_NAME_SERVICE_FIELD = "company_name";
	public static final String SHL_VENDORS_SERVICE_FIELD = "vendors";
	public static final String SHL_VENDORS_DETAIL_SERVICE_FIELD = "vendors_detail";
	public static final String SHL_VENDOR_NAME_SERVICE_FIELD = "vendor_name";
	
	public static final String AREA_SNAPSHOT_BASE_PRODUCT = "area_snapshot";
	public static final String AREA_ACTIVITY_BASE_PRODUCT = "area_activity";
	
	//Property summary list service fields
	public static final int SALE_DATE_SORT_TYPE = 2;
	public static final String PROPERTY_SUMMARY_LIST_BASE_PRODUCT = "property_summary_list";
	public static final String PSL_DETAIL_SERVICE_FIELD = "property_summary_detail";
	public static final String PSL_PROPERTY_ADDRESS_SERVICE_FIELD = "property_address";
	public static final String PSL_SALE_PRICE_SERVICE_FIELD  = "sale_price";
	public static final String PSL_PROPERTY_PHOTO_URL_SERVICE_FIELD = "property_photo_url";
	public static final String PSL_SALE_DATE_SERVICE_FIELD  = "sale_date";
	public static final String PSL_LAND_USE_SERVICE_FIELD  = "land_use";
	public static final String PSL_LAND_AREA_SERVICE_FIELD  = "land_area";
	public static final String PSL_LOT_PLAN_SERVICE_FIELD  = "lot_plan";
	public static final String PSL_ZONE_SERVICE_FIELD  = "zone";
	public static final String PSL_ATTRIBUTES_SERVICE_FIELD  = "attributes";
	public static final String PSL_SOLD_BY_SERVICE_FIELD  = "sold_by";
	public static final String PSL_BED_ROOMS_SERVICE_FIELD = "bed_rooms";
	public static final String PSL_BATH_ROOMS_SERVICE_FIELD = "bath_rooms";
	public static final String PSL_LOCKUP_GARAGES_SERVICE_FIELD = "lockup_garages";
	public static final String PSL_CAR_SPACES_SERVICE_FIELD = "car_spaces";
	public static final String PSL_UNCONFIRMED_ICON_URL_SERVICE_FIELD = "unconfirmed_icon_url";
	public static final String PSL_FONT_COLOR_SERVICE_FIELD   = "font_color";
	public static final String PSL_FONT_COLOR_IS_AGENT_ADVICE  = "#922394";
	public static final String PSL_FONT_COLOR_IS_NOT_AGENT_ADVICE  = "#57539f";
	public static final String PSL_SALE_TYPE_SERVICE_FIELD = "sale_type";
	public static final String PSL_AGENT_NAME_SERVICE_FIELD = "agent_name";
	public static final String PSL_STREET_DESIGNATOR_SERVICE_FIELD = "street_designator";
	public static final String PSL_STREET_NAME_SERVICE_FIELD = "street_name";
	public static final String PSL_STREET_EXTENSION_SERVICE_FIELD = "street_extension";
	public static final String PSL_PROPERTY_ID_SERVICE_FIELD = "property_id";
	public static final String PSL_UNIT_DESIGNATOR_SERVICE_FIELD = "unit_designator";
	public static final String PSL_IS_REA_RECENT_SALE_SERVICE_FIELD = "is_rea_recent_sale";
	public static final String PSL_DAYS_LISTED_SERVICE_FIELD = "days_listed";
	public static final String PSL_LATEST_LIST_DATE_SERVICE_FIELD = "latest_list_date";
	public static final String PSL_LATEST_LISTED_PRICE_DESCRIPTION_SERVICE_FIELD = "latest_listed_price_description";
	public static final String PSL_LISTING_TYPE_DESCRIPTION_SERVICE_FIELD = "listing_type_description";
	public static final String PSL_LATITUDE_SERVICE_FIELD = "latitude";
	public static final String PSL_LONGITUDE_SERVICE_FIELD = "longitude";
	public static final String PSL_UCV_SERVICE_FIELD = "ucv";
	public static final String PSL_UCV_DATE_SERVICE_FIELD = "ucv_date";
	public static final String PSL_RPD_SERVICE_FIELD = "rpd";
	public static final String PSL_LGA_NAME_SERVICE_FIELD = "lga_name";
	public static final String PSL_REA_ID_SERVICE_FIELD = "rea_id";
	public static final String PSL_PROPERTY_TYPE_SERVICE_FIELD = "property_type";
	public static final String PSL_AGENCY_NAME_SERVICE_FIELD = "agency_name";
	public static final String PSL_DISTANCE_FROM_SUBJECT_SERVICE_FIELD = "distance_from_subject";
	
	//Demographics paragraph service fields
	public static final String DEMOGRAPHICS_PARAGRAPH_BASE_PRODUCT = "demographics_paragraph";
	public static final String DP_1_SERVICE_FIELD = "demographics_paragraph_1";
	public static final String DP_2_SERVICE_FIELD = "demographics_paragraph_2";
	public static final String DP_3_SERVICE_FIELD = "demographics_paragraph_3";
	
	//Age Sex Ratio fields
	public static final String AGE_SEX_RATIO = "age_sex_ratio";
	public static final String RATIO = "ratio";
	public static final String AGE_SEX_RATIO_AGE_GROUP_LABEL = "age_group_label";
	public static final String AGE_SEX_RATIO_LGA_FEMALE_PERCENTAGE = "lga_female_percentage";
	public static final String AGE_SEX_RATIO_LGA_MALE_PERCENTAGE = "lga_male_percentage";
	public static final String AGE_SEX_RATIO_LOCALITY_FEMALE_PERCENTAGE = "locality_female_percentage";
	public static final String AGE_SEX_RATIO_LOCALITY_MALE_PERCENTAGE = "locality_male_percentage";
	public static final String AGE_SEX_RATIO_TABLE = "age_sex_ratio_table";
	public static final String AGE_SEX_RATIO_DATA = "age_sex_ratio_table_data";
	
	//Household Income
	public static final String HOUSEHOLD_INCOME = "household_income";
	public static final String HOUSEHOLD_INCOME_DETAILS = "household_income_details";
	public static final String HOUSEHOLD_INCOME_RANGE = "household_income_range";
	public static final String HOUSEHOLD_INCOME_LGA_PERCENTAGE = "household_lga_percentage";
	public static final String HOUSEHOLD_INCOME_LOCALITY_PERCENTAGE = "household_locality_percentage";
	
	//Household Structure
	public static final String HOUSEHOLD_STRUCTURE = "household_structure";
	public static final String HOUSEHOLD_STRUCTURE_DETAILS = "household_structure_details";
	public static final String HOUSEHOLD_STRUCTURE_PERCENTAGE = "household_structure_percentage";
	public static final String HOUSEHOLD_STRUCTURE_TYPE = "household_structure_type";
	
	//Household Occupancy
	public static final String HOUSEHOLD_OCCUPANCY = "household_occupancy";
	public static final String HOUSEHOLD_OCCUPANCY_DETAILS = "household_occupancy_details";
	public static final String HOUSEHOLD_OCCUPANCY_PERCENTAGE = "household_occupancy_percentage";
	public static final String HOUSEHOLD_OCCUPANCY_TYPE = "household_occupancy_type";
	
	//Yearly median prices chart URL
	public static final String YEARLY_MEDIAN_PRICES_CHART_URL_BASE_PRODUCT = "yearly_median_prices_chart_url";
	//Monthly median prices chart URL
	public static final String MONTHLY_MEDIAN_PRICES_CHART_URL_BASE_PRODUCT = "monthly_median_prices_chart_url";
	//Area profile median prices chart URL
	public static final String AREA_PROFILE_MEDIAN_PRICES_CHART_URL_BASE_PRODUCT = "area_profile_median_prices_chart_url";
	//Age sex ratio chart URL
	public static final String AGE_SEX_RATIO_CHART_URL_BASE_PRODUCT = "age_sex_ratio_chart_url";
	//Household income chart URL
	public static final String HOUSEHOLD_INCOME_CHART_URL_BASE_PRODUCT = "household_income_chart_url";
	//Household structure chart URL
	public static final String HOUSEHOLD_STUCTURE_CHART_URL_BASE_PRODUCT = "household_structure_chart_url";
	//Household occupancy chart URL
	public static final String HOUSEHOLD_OCCUPANCY_CHART_URL_BASE_PRODUCT = "household_occupancy_chart_url";
	//Capital growth chart URL
	public static final String CAPITAL_GROWTH_CHART_URL_BASE_PRODUCT = "capital_growth_chart_url";
	//Sales By Number chart URL
	public static final String SALES_BY_NUMBER_CHART_URL_BASE_PRODUCT = "sales_by_number_chart_url";
	//Sales By Price chart URL
	public static final String SALES_BY_PRICE_CHART_URL_BASE_PRODUCT = "sales_by_price_chart_url";
	
	//Capital growth service fields
	public static final String CAPITAL_GROWTH_BASE_PRODUCT = "capital_growth";
	public static final String CG_LGA_NAME_SERVICE_FIELD = "lga_name";
	public static final String CG_LOCALITY_NAME_SERVICE_FIELD = "locality_name";
	public static final String CG_DETAIL_SERVICE_FIELD = "capital_growth_detail";
	public static final String CG_PERIOD_SERVICE_FIELD = "period";
	public static final String CG_LGA_VALUE_SERVICE_FIELD = "lga_value";
	public static final String CG_LOCALITY_VALUE_SERVICE_FIELD = "locality_value";
	
	//Monthly median prices service fields
	public static final String MONTHLY_MEDIAN_PRICES_BASE_PRODUCT = "monthly_median_prices";
	public static final String MMP_LGA_NAME_SERVICE_FIELD = "lga_name";
	public static final String MMP_LOCALITY_NAME_SERVICE_FIELD = "locality_name";
	public static final String MMP_DETAIL_SERVICE_FIELD = "monthly_median_prices_detail";
	public static final String MMP_LGA_VALUE_SERVICE_FIELD = "lga_value";
	public static final String MMP_LOCALITY_VALUE_SERVICE_FIELD = "locality_value";
	public static final String MMP_MONTH_SERVICE_FIELD = "month";
	public static final String MMP_MONTH_ABBREVIATED_SERVICE_FIELD = "month_abbreviated";
	public static final String MMP_YEAR_SERVICE_FIELD = "year";
	
	//Yearly median prices service fields
	public static final String YEARLY_MEDIAN_PRICES_BASE_PRODUCT = "yearly_median_prices";
	public static final String YMP_LGA_NAME_SERVICE_FIELD = "lga_name";
	public static final String YMP_LOCALITY_NAME_SERVICE_FIELD = "locality_name";
	public static final String YMP_DETAIL_SERVICE_FIELD = "yearly_median_prices_detail";
	public static final String YMP_PERIOD_SERVICE_FIELD = "period";
	public static final String YMP_LGA_VALUE_SERVICE_FIELD = "lga_value";
	public static final String YMP_LOCALITY_VALUE_SERVICE_FIELD = "locality_value";
	public static final String YMP_YEAR_SERVICE_FIELD = "year";
	
	//Photos service fields
	public static final String PHOTOS_BASE_PRODUCT = "photos";
	public static final String PHOTOS_DETAIL_SERVICE_FIELD = "photos_detail";
	public static final String SMALL_IMAGE_SERVICE_FIELD = "small_image";
	public static final String SCAN_DATE_SERVICE_FIELD = "scan_date";
	
	//Sales By Price fields
	public static final String SALES_BY_PRICE_BASE_PRODUCT = "sales_by_price";
	public static final String SALES_BY_PRICE_DETAILS_FIELD = "sales_by_price_details";
	public static final String SALES_BY_PRICE_LABEL_TEXT = "label_text";
	public static final String SALES_BY_PRICE_NUMBER = "number";
	
	//Topo map url
	public static final String TOPO_MAP_URL_BASE_PRODUCT = "topo_map_url";
	//Aerial map url
	public static final String AERIAL_MAP_URL_BASE_PRODUCT = "aerial_map_url";
	//Street map url
	public static final String STREET_MAP_URL_BASE_PRODUCT = "street_map_url";
	//Area map url
	public static final String AREA_MAP_URL_BASE_PRODUCT = "area_map_url";
	
	//AVM service fields
	public static final String AVM_BASE_PRODUCT = "avm";
	public static final String AVM_FARES_FSD_SCORE_SERVICE_FIELD = "fares_fsd_score";
	public static final String AVM_FSD_COLOR_SERVICE_FIELD = "fsd_color";
	public static final String AVM_CHECK_ICON_URL_SERVICE_FIELD = "check_icon_url";
	public static final String AVM_FARES_REFERENCE_ID_SERVICE_FIELD = "fares_reference_id";
	public static final String AVM_FARES_RUN_DATE_SERVICE_FIELD = "fares_run_date";
	public static final String AVM_FARES_SCORE_SERVICE_FIELD = "fares_score";
	public static final String AVM_FARES_VALUE_ESTIMATE_SERVICE_FIELD = "fares_value_estimate";
	public static final String AVM_FARES_VALUE_HIGH_SERVICE_FIELD = "fares_value_high";
	public static final String AVM_FARES_VALUE_LOW_SERVICE_FIELD = "fares_value_low";
	public static final String AVM_PROBABLE_VALUE_RANGE_SERVICE_FIELD = "probable_value_range";
	public static final String AVM_SOLD_PROPERTIES_SERVICE_FIELD = "sold_properties";
	public static final String AVM_SOLD_PROPERTIES_DETAIL_SERVICE_FIELD = "sold_properties_detail";
	public static final String AVM_SOLD_PROPERTY_ID_SERVICE_FIELD = "sold_property_id";
	public static final String AVM_RED_ICON = "pcma_i_avmRed.png";
	public static final String AVM_AMBER_ICON = "pcma_i_avmAmber.png";
	public static final String AVM_GREEN_ICON = "pcma_i_avmGreen.png";
	
	public static final String REPORT_IMAGE_PATH = StringUtils.getWebappPrefix() + "/cropImage/pcma_images.";
	public static final String REPORT_AVM_RED_ICON = "pcma_i_avmRedIcon.png";
	public static final String REPORT_AVM_AMBER_ICON = "pcma_i_avmAmberIcon.png";
	public static final String REPORT_AVM_GREEN_ICON = "pcma_i_avmGreenIcon.png";
	public static final String REPORT_UNCONFIRMED_SALES_ICON = "pcma_unconfirmedSalesIcon.png";
	
	//Sales by number service fields
	public static final String SALES_BY_NUMBER_BASE_PRODUCT = "sales_by_number";
	public static final String SBN_SALES_PER_YEAR_SERVICE_FIELD = "sales_per_year";
	public static final String SBN_YEAR_SERVICE_FIELD = "year";
	public static final String SBN_NUMBER_SERVICE_FIELD = "number";
	
	//Sold properties service fields
	public static final String SOLD_PROPERTIES_BASE_PRODUCT = "sold_properties";
	public static final String SP_DETAIL_SERVICE_FIELD = "past_sale";
	public static final String SP_PROPERT_ID_SERVICE_FIELD = "property_id";
	public static final String SP_THUMBNAIL_URL_SERVICE_FIELD = "thumbnail_url";
	public static final String SP_DISTANCE_FROM_SUBJECT_SERVICE_FIELD = "distance_from_subject";
	public static final String SP_TRANSFER_DATE_SERVICE_FIELD = "transfer_date";
	public static final String SP_TRANSFER_PRICE_SERVICE_FIELD = "transfer_price";
	public static final String SP_ATTRIBUTES_SERVICE_FIELD = "attributes";
	public static final String SP_BED_ROOMS_SERVICE_FIELD = "bed_rooms";
	public static final String SP_BATH_ROOMS_SERVICE_FIELD = "bath_rooms";
	public static final String SP_CAR_SPACES_SERVICE_FIELD = "car_spaces";
	public static final String SP_LAND_AREA_SERVICE_FIELD = "land_area";
	public static final String SP_PROPERTY_ADDRESS_SERVICE_FIELD = "property_address";
	public static final String SP_FARES_REFERENCE_ID_SERVICE_FIELD = "fares_reference_id";
	
	//Recent sales service fields
	public static final String RECENT_SALES_BASE_PRODUCT = "recent_sales";
	public static final String RS_DETAIL_SERVICE_FIELD = "recent_sales_detail";
	public static final String RS_ID_SERVICE_FIELD = "recent_sales_id";
	
	//Refine properties service fields
	public static final String REFINE_PROPERTIES_BASE_PRODUCT = "refine_properties";
	public static final String RP_DETAIL_SERVICE_FIELD = "refine_properties_detail";
	public static final String RP_ID_SERVICE_FIELD = "refine_properties_id";
	
	//property IDs by radius service fields
	public static final String PROPERTY_IDS_BY_RADIUS_BASE_PRODUCT = "property_id_list";
	public static final String PIBR_DETAIL_SERVICE_FIELD = "property_id_list_detail";
	public static final String PIBR_ID_SERVICE_FIELD = "property_id";
	public static final String PIBR_LATITUDE_SERVICE_FIELD = "latitude";
	public static final String PIBR_LONGITUDE_SERVICE_FIELD = "longitude";
	
	//Property id list from suggestion service fields
	public static final String PROPERTY_ID_LIST_FROM_SUGGESTION_BASE_PRODUCT = "property_id_list";
	public static final String PILFS_DETAIL_SERVICE_FIELD = "property_id_list_detail";
	public static final String PILFS_ID_SERVICE_FIELD = "property_id";
	
	//property IDs for area service fields
	public static final String PROPERTY_IDS_FOR_AREA_BASE_PRODUCT = "property_id_list";
	public static final String PIFA_DETAIL_SERVICE_FIELD = "property_id_list_detail";
	public static final String PIFA_ID_SERVICE_FIELD = "property_id";
	
	//Disclaimer
	public static final String DISCLAIMER_BASE_PRODUCT = "disclaimer";
	public static final String DISCLAIMER_DEFAULT_TITLE = "default_title";
	public static final String DISCLAIMER_DEFAULT_DESCRIPTION  = "default_description";
	public static final String DISCLAIMER_TITLE = "title";
	public static final String DISCLAIMER_DESCRIPTION  = "description";
	public static final String DISCLAIMER_AVM_TITLE = "avm_title";
	public static final String DISCLAIMER_AVM_DESCRIPTION  = "avm_description";
	public static final String DISCLAIMER_VIC_TITLE = "vic_title";
	public static final String DISCLAIMER_VIC_DESCRIPTION  = "vic_description";
	
	//Session token credentials fields
	public static final String CREDENTIALS_FOR_SESSION_TOKEN_BASE_PRODUCT = "session_token_credential";
	public static final String CREDENTIALS_FOR_SESSION_TOKEN_MESSAGE_TYPE = "message_type";
	public static final String CREDENTIALS_FOR_SESSION_TOKEN_MESSAGE_KEY = "message_key";
	public static final String CREDENTIALS_FOR_SESSION_TOKEN_ERROR_INVALID = "error.bsg.invalid.sessionToken";
	public static final String CREDENTIALS_FOR_SESSION_TOKEN_ERROR_EXPIRED = "error.integrator.authtoken.expired";
	public static final String CREDENTIALS_FOR_SESSION_TOKEN_SUCCESS = "success";
	public static final String CREDENTIALS_FOR_SESSION_TOKEN_CUSTOMER_ID = "customer_id";
	public static final String CREDENTIALS_FOR_SESSION_TOKEN_INTEGRATOR_ID = "integrator_id";
	
	//All user details fields
	public static final String ALL_USER_DETAILS = "all_user_details";
	public static final String AUD_PERSONAL_INFO = "personal_info";
	public static final String AUD_WORK_INFO = "work_info";
	public static final String AUD_AGENCY_INFO = "agency_info";
	public static final String AUD_USER_NAME = "user_name";
	public static final String AUD_TITLE = "title";
	public static final String AUD_FIRST_NAME = "first_name";
	public static final String AUD_LAST_NAME = "last_name";
	public static final String AUD_PHONE_NUMBER = "phone_number";
	public static final String AUD_MOBILE_NUMBER = "mobile_number";
	public static final String AUD_FAX_NUMBER = "fax_number";
	public static final String AUD_EMAIL_ADDRESS = "email_address";
	public static final String AUD_PHOTO = "photo";
	public static final String AUD_TRADE_NAME = "trade_name";
	public static final String AUD_ADDRESS1 = "address1";
	public static final String AUD_SUBURB = "suburb";
	public static final String AUD_POSTCODE = "postcode";
	public static final String AUD_STATE = "state";
	public static final String AUD_COUNTRY = "country";
	public static final String AUD_WEBSITE = "website";
	public static final String AUD_INDUSTRY_SEGMENT = "industry_segment";
	public static final String AUD_FRANCHISE_ID = "franchise_id";
	public static final String AUD_LOGO = "logo";
	
	//All user details fields
	public static final String VALIDATE_HMAC_HASH = "validate_hmac_hash";
	public static final String VHH_IS_VALID = "is_valid";
    
	//Property OTM summary	
	public static final String OTM_PROPERTY_SUMMARY_LIST = "property_otm_summary";
	public static final String OPSL_DETAIL_SERVICE_FIELD = "property_otm_summary_detail";
	public static final String OPSL_ID_SERVICE_FIELD = "property_otm_summary_ids";
	
	//Search service fields
	public static final String SEARCH_PROPERTIES = "search_properties";
	public static final String SEARCH_SALES = "search_sales";
	public static final String SEARCH_RECENT_SALES = "search_recent_sales";
	public static final String SEARCH_OTM = "search_otm";
	public static final String SEARCH_OTM_RENTAL = "search_otm_rental";
	public static final String SEARCH_RESULTS_NUMBER_SERVICE_FIELD = "results_number";
	public static final String SEARCH_PROPERTIES_NUMBER_SERVICE_FIELD = "properties_number";
	public static final String SEARCH_DETAIL_SERVICE_FIELD = "search_detail";
	public static final String SEARCH_PROPERTY_TYPES = "HOUSE,UNIT,LAND,OTHER";
	public static final String SEARCH_PROPERTY_TYPES_ALL = "HOUSE,UNIT,LAND,OTHER,COMMERCIAL,BUSINESS,COMMUNITY,FARM,FLATS";
	public static final String SEARCH_SORT_BY_ADDRESS = "ADDRESS";
	public static final String SEARCH_SORT_BY_SALE_DATE = "SALE_DATE";
	public static final String SEARCH_SORT_BY_LISTED_DATE = "LISTED_DATE";
	public static final String SEARCH_SORT_BY_SALE_PRICE = "SALE_PRICE";
	public static final String SEARCH_SORT_BY_LISTED_PRICE = "LISTED_PRICE";
	public static final String SEARCH_SORT_BY_AVM_EST = "AVM_EST";
	public static final String SEARCH_PROPERTY_ID_SERVICE_FIELD = "property_id";
	public static final String SEARCH_LATITUDE_SERVICE_FIELD = "latitude";
	public static final String SEARCH_LONGITUDE_SERVICE_FIELD = "longitude";
	public static final String SEARCH_PROPERTY_ADDRESS_SERVICE_FIELD = "property_address";
	public static final String SEARCH_STATE_SERVICE_FIELD = "state";
	public static final String SEARCH_PROPERTY_PHOTO_SERVICE_FIELD = "property_photo_url";
	public static final String SEARCH_PHOTO_MEDIUM_URL_SERVICE_FIELD = "photo_medium_url";
	public static final String SEARCH_PROPERTY_TYPE_SERVICE_FIELD = "property_type";
	public static final String SEARCH_SALE_PRICE_SERVICE_FIELD = "sale_price";
	public static final String SEARCH_SALE_DATE_SERVICE_FIELD = "sale_date";
	public static final String SEARCH_SALE_TYPE_SERVICE_FIELD = "sale_type";
	public static final String SEARCH_AVM_ESTIMATE_SERVICE_FIELD = "avm_estimate";
	public static final String SEARCH_AVM_FSD_SCORE_SERVICE_FIELD = "avm_fsd_score";
	public static final String SEARCH_AVM_HIGH_SERVICE_FIELD = "avm_high";
	public static final String SEARCH_AVM_LOW_SERVICE_FIELD = "avm_low";
	public static final String SEARCH_AVM_RUN_DATE_SERVICE_FIELD = "avm_run_date";
	public static final String SEARCH_AVM_ESTIMATE_RANGE_SERVICE_FIELD = "avm_estimate_range";
	public static final String SEARCH_AVM_FARES_SCORE_SERVICE_FIELD = "avm_fares_score";
	public static final String SEARCH_AVM_FSD_COLOR_SERVICE_FIELD = "fsd_color";
	public static final String SEARCH_AVM_CHECK_ICON_URL_SERVICE_FIELD = "check_icon_url";
	public static final String SEARCH_LAND_AREA_SERVICE_FIELD = "land_area";
	public static final String SEARCH_BED_ROOMS_SERVICE_FIELD = "bed_rooms";
	public static final String SEARCH_BATH_ROOMS_SERVICE_FIELD = "bath_rooms";
	public static final String SEARCH_LOCKUP_GARAGES_SERVICE_FIELD = "lockup_garages";
	public static final String SEARCH_CAR_SPACES_SERVICE_FIELD = "car_spaces";
	public static final String SEARCH_IS_REA_RECENT_SALE_SERVICE_FIELD = "is_rea_recent_sale";
	public static final String SEARCH_ATTRIBUTES_SERVICE_FIELD = "attributes";
	public static final String SEARCH_LAND_USE_SERVICE_FIELD = "land_use";
	public static final String SEARCH_LOT_PLAN_SERVICE_FIELD = "lot_plan";
	public static final String SEARCH_ZONE_SERVICE_FIELD = "zone";
	public static final String SEARCH_SOLD_BY_SERVICE_FIELD = "sold_by";
	public static final String SEARCH_UNCONFIRMED_ICON_SERVICE_FIELD = "unconfirmed_icon_url";
	public static final String SEARCH_RPD_SERVICE_FIELD = "rpd";
	public static final String SEARCH_DISTANCE_FROM_SUBJECT_SERVICE_FIELD = "distance_from_subject";
	public static final String SEARCH_LISTED_DATE_SERVICE_FIELD = "listed_date";
	public static final String SEARCH_LISTED_PRICE_SERVICE_FIELD = "listed_price";
	public static final String SEARCH_LISTED_PERIOD_CODE_SERVICE_FIELD = "listed_period_code";
	public static final String SEARCH_LISTED_PRICE_DESCRIPTION_SERVICE_FIELD = "listed_price_description";
	public static final String SEARCH_LISTED_TYPE_SERVICE_FIELD = "listed_type";
	public static final String SEARCH_START_LISTING_PRICE_SERVICE_FIELD = "start_listing_price";
	public static final String SEARCH_CURRENT_LISTING_PRICE_SERVICE_FIELD = "current_listing_price";
	public static final String SEARCH_DAYS_OTM_SERVICE_FIELD = "days_otm";
	public static final String SEARCH_PERCENT_FIRST_TO_LAST_LIST_PRICE_SERVICE_FIELD = "percent_first_to_last_list_price";
	public static final String SEARCH_PERCENT_TOTAL_CHANGE_SERVICE_FIELD = "percent_total_change";
	public static final String SEARCH_ACTUAL_TRANSFER_PRICE_SERVICE_FIELD = "actual_transfer_price";
	public static final String SEARCH_PERCENT_LAST_TO_ACTUAL_SALE_PRICE_SERVICE_FIELD = "percent_last_to_actual_sale_price";
	public static final String SEARCH_LISTING_START_DATE_SERVICE_FIELD = "listing_start_date";
	public static final String SEARCH_CURRENT_LISTING_DATE_SERVICE_FIELD = "current_listing_date";
	public static final String SEARCH_LISTING_AGENCY_NAME_SERVICE_FIELD = "listing_agency_name";
	
	//WBD Field Names
	public static final String MSG_URL_FIELD = "msgUrl";
	public static final String WEBAPP_PREFIX_FIELD = "webappPrefix";
	public static final String OFFLINE_MODE_FIELD = "offlineMode";
	
	public static final String DEFAULT_WEBAPP_PREFIX = "/ttsvr";
}