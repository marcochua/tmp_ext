package com.tooltwist.bsg.util;

public class ErrorMessages {
	
	/* Application related exception messages */
	public static final String SYSTEM_ERROR = "\"System error\",\"description\":\"Runtime exception was encountered.\"";
	
	/* Security related exception messages */
	public static final String RATE_LIMIT_EXCEEDED = "\"User has reached limit\"";
	public static final String INVALID_REQUEST = "\"Invalid Request\",\"description\":\"All requests must be sent through POST.\"";
	public static final String INVALID_SERVICE = "\"Invalid service\"";
	
	/* BSG related exceptions messages */
	public static final String SESSION_TOKEN_REQUEST_ERROR = "\"Error from BSG when generating session token.\"";
	public static final String EXPIRED_SESSION_TOKEN = "\"Session token has expired.\"";
	public static final String CREDENTIALS_FOR_SESSION_TOKEN_ERROR = "\"Error from BSG when getting credentials for session token.\"";
	public static final String BSG_ERROR = "\"Error calling BSG service.\"";
	public static final String REMOTE_EXCEPTION = "\"Remote connection error was encountered while connecting to BSG.\"";
	public static final String REMOTE_OTM_EXCEPTION = "\"Connection error was encountered while connecting to BSG.\"";
	
	/* Parameter related exception messages */
	public static final String INVALID_PARAMETER = "\"Invalid Parameter\"";
	public static final String INVALID_PROPERTY_ID = "\"Invalid or missing property id parameter\"";
	public static final String INVALID_USER_ID = "\"Invalid or missing user id parameter\"";
	public static final String INVALID_STATE = "\"Invalid or missing state parameter\"";
	public static final String INVALID_POSTCODE = "\"Invalid or missing postcode parameter\"";
	public static final String INVALID_SORT_TYPE = "\"Invalid sort type parameter\"";
	public static final String INVALID_LONGITUDE_REQ = "\"Invalid or missing longitute parameter\"";
	public static final String INVALID_LATITUDE_REQ = "\"Invalid or missing latitude parameter\"";
	public static final String INVALID_MAXRESULT_REQ = "\"Invalid or missing maximum result parameter\"";
	public static final String INVALID_STATE_REQ = "\"Invalid or missing state parameter\"";
	public static final String INVALID_SUBURB_REQ = "\"Invalid or missing suburb parameter\"";
	public static final String INVALID_PERIOD_REQ = "\"Invalid or missing period parameter\"";
	public static final String INVALID_YEAR_FROM_REQ = "\"Invalid or missing year from parameter\"";
	public static final String INVALID_BOUNDS_COORDS_SOUTH_WEST = "\"Invalid or missing southwest latitude longitude coordinates parameter\"";
	public static final String INVALID_BOUNDS_COORDS_NORTH_EAST = "\"Invalid or missing northeast latitude longitude coordinates parameter\"";
	public static final String INVALID_PAGINATION = "\"Start parameter exceeds the maximum pagination number.\"";
	public static final String INVALID_PROPERTY_TYPE = "\"Invalid or missing type parameter\"";
	public static final String INVALID_BOOLEAN_HOUSE = "\"Invalid or missing house parameter\"";
	public static final String INVALID_BOOLEAN_UNIT = "\"Invalid or missing unit parameter\"";
	public static final String INVALID_BOOLEAN_RECENTLY_SOLD = "\"Invalid or missing recentlySold parameter\"";
	public static final String INVALID_BOOLEAN_FOR_SALE = "\"Invalid or missing forSale parameter\"";
	public static final String INVALID_BOOLEAN_OTHER = "\"Invalid or missing other parameter\"";
	public static final String INVALID_CATEGORY_REQ = "\"Invalid or missing category parameter\"";
	public static final String INVALID_SUGGESTION_REQ = "\"Invalid or missing suggestion parameter\"";
}
