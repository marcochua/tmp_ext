package com.tooltwist.bsg.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Response;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.tooltwist.bsg.client.*;
import com.tooltwist.bsg.exception.BsgException;
import com.tooltwist.bsg.exception.WebServiceRequestException;
import com.tooltwist.bsg.form.LoginCredentials;
import com.tooltwist.bsg.form.OtmSalesPropertyByRadiusResponse;
import com.tooltwist.bsg.util.BSGObjectsUtil;
import com.tooltwist.bsg.util.ErrorMessages;
import com.tooltwist.bsg.util.StringUtils;

public class BsgManager implements IBsgManager {
	private static final Logger logger = Logger.getLogger(BsgManager.class);

	private static final String REQUEST = "REQUEST";
	private static final String RESPONSE = "RESPONSE";

	private String partnerSid = "";
	private long requestTime = 0;
	private long timeOfRequest;
	private String paramLog = "";
	private ILogDebugManager logDebugManager;

	public BsgManager(long timeOfRequest) {
		this.timeOfRequest = timeOfRequest;
		logDebugManager = BsgServiceFactory.getLogDebugManager();
	}

	public BsgManager(long timeOfRequest, String sid) {
		this.timeOfRequest = timeOfRequest;
		this.partnerSid = sid;
		logDebugManager = BsgServiceFactory.getLogDebugManager();
	}

	private String getSessionToken() {
		String sessionToken = null;
		if (this.partnerSid.length() > 0) {
			sessionToken = partnerSid;
		}else{
			sessionToken = BSGBeanFactory.getSessionToken();
		}	
		return sessionToken;
	}

	private String getSessionTokenFromCredentials(LoginCredentials credentials) {
		String sessionToken = null;
		if (this.partnerSid.length() > 0) {
			sessionToken = partnerSid;
		}else{
			if (credentials.getHasToken()) {
				sessionToken = credentials.getAuthenticationCode();
			} else {
				if (credentials.getIsCbaAndroid()) {
					sessionToken = BSGBeanFactory.getSessionToken("cba.android.session.token");
				} else {
					sessionToken = BSGBeanFactory.getSessionToken();					
				}
			}
		}
		
		return sessionToken;
	}
	
	private boolean isLog() {
		return Boolean.valueOf(BSGBeanFactory.getBsgProperty("log.bsg.transactions").trim());
	}
	
	private void logRequest(Object obj) {
		if (isLog())
			logRequest(new Gson().toJson(obj));
	}

	private void logRequest(String log) {
		if (isLog())
			log(REQUEST, "params : " + log);
	}

	private void logResponse(Object obj) {
		if (isLog())
			log(RESPONSE, "return : " + new Gson().toJson(obj));
	}

	private void logRequest(Object obj, LoginCredentials credentials) {
		if (isLog())
			logRequest(new Gson().toJson(obj), credentials);
	}
	
	private void logResponse(Object obj, LoginCredentials credentials) {
		if (isLog())
			log(RESPONSE, "return : " + new Gson().toJson(obj), credentials);
	}

	private void logRequest(String log, LoginCredentials credentials) {
		if (isLog())
			log(REQUEST, "params : " + log, credentials);
	}

	private void log(String type, String log, LoginCredentials credentials) {
		StackTraceElement[] stackTrace = (new Throwable()).getStackTrace();
		String service = "";
		for (StackTraceElement element : stackTrace) {
			String methodName = element.getMethodName();
			if (!methodName.equals("log") && !methodName.equals("logRequest") && !methodName.equals("logResponse")) {
				service = methodName;
				break;
			}
		}
		long timeNow = System.currentTimeMillis();
		if (!StringUtils.isEmpty(log))
			logger.debug(" @" + timeNow + "  " + credentials.getAppType() + " AU " + type + " --> service : \"" + service + "\" --> " + log);

		if (type.equals(REQUEST) && requestTime <= 0) {
			requestTime = timeNow;
			paramLog = log;
		} else if (type.equals(RESPONSE) && requestTime > 0) {
			long callDuration = timeNow - requestTime;
			//BSG call log|<serviceName>|<timeInMs>|ms
			logger.debug(credentials.getAppType() + " AU " + "BSG call log|" + service + "|" + callDuration + "|ms");
			logDebugManager.appendToLog(service, callDuration, timeOfRequest, "<font color='#F24C28'>" + paramLog + "</font><br><font color='#958377'>" + log + "</font>");
			requestTime = 0;
			paramLog = "";
		}
	}

	private void log(String type, String log) {
		StackTraceElement[] stackTrace = (new Throwable()).getStackTrace();
		String service = "";
		for (StackTraceElement element : stackTrace) {
			String methodName = element.getMethodName();
			if (!methodName.equals("log") && !methodName.equals("logRequest") && !methodName.equals("logResponse")) {
				service = methodName;
				break;
			}
		}
		long timeNow = System.currentTimeMillis();
		if (!StringUtils.isEmpty(log))
			logger.debug(" @" + timeNow + "  " + type + " --> service : \"" + service + "\" --> " + log);

		if (type.equals(REQUEST) && requestTime <= 0) {
			requestTime = timeNow;
			paramLog = log;
		} else if (type.equals(RESPONSE) && requestTime > 0) {
			long callDuration = timeNow - requestTime;
			//BSG call log|<serviceName>|<timeInMs>|ms
			logger.debug("BSG call log|" + service + "|" + callDuration + "|ms");
			logDebugManager.appendToLog(service, callDuration, timeOfRequest, "<font color='#F24C28'>" + paramLog + "</font><br><font color='#958377'>" + log + "</font>");
			requestTime = 0;
			paramLog = "";
		}
	}

	private void logError(String message) {
		StackTraceElement[] stackTrace = (new Throwable()).getStackTrace();
		String service = "";
		for (StackTraceElement element : stackTrace) {
			String methodName = element.getMethodName();
			if (!methodName.equals("log") && !methodName.equals("logRequest") 
					&& !methodName.equals("logResponse") && !methodName.equals("logError")
					&& !methodName.equals("validateMessages")) {
				service = methodName;
				break;
			}
		}
		logDebugManager.addError(service, timeOfRequest, message);
	}

	public boolean validateMessages(BaseBSGResponse response) {
		if (response == null) {
			logger.error("BSG response is null.");
			throw new WebServiceRequestException("\"BSG response is null.\"");
		}		
		return validateMessages(response.getMessages());

	}
	
	public boolean validateMessages(BaseServiceResponse response) {
		if (response == null) {
			logger.error("BSG response is null.");
			throw new WebServiceRequestException("\"BSG response is null.\"");
		}
		
		return validateMessages(response.getMessages());

	}

	public boolean validateMessages(List<ApplicationMessages> messages) {
		if (messages == null) {
			logger.error("BSG returned null ApplicationMessages[]");
			throw new WebServiceRequestException("\"BSG returned null value for application messages list.\"");
		}

		boolean isValid = true;
		for (ApplicationMessages message : messages) {
			if ("Error".equalsIgnoreCase(message.getMessageType())) {
				String messageKey = message.getMessageKey();
				logError(messageKey);
				throw new BsgException(getErrorMessage(messageKey));
			}
		}

		return isValid;
	}

	private String getErrorMessage(String exceptionMessage) {
		String messageKey = StringUtils.formatErrorMessage(exceptionMessage);

		StringBuilder errorMessage = new StringBuilder();
		errorMessage.append("\"");
		errorMessage.append(messageKey);
		errorMessage.append("\"");

		StackTraceElement[] stackTrace = (new Throwable()).getStackTrace();
		String service = "";
		for (StackTraceElement element : stackTrace) {
			String methodName = element.getMethodName();
			if (!methodName.equals("validateMessages") && !methodName.equals("getErrorMessage")) {
				service = methodName;
				break;
			}
		}
		
		String messageVal = BSGBeanFactory.getBsgErrorCode(messageKey);
		if (StringUtils.isEmpty(messageVal)) {
			logger.error("No mapped value for error : " + messageKey + " | " + "Service: " + service);
			messageVal = BSGBeanFactory.getBsgErrorCode("default.bsg.error");
			if (StringUtils.isEmpty(messageVal)) 
				return errorMessage.toString();
		} else {
			logger.info("Error from BSG : " + messageKey + " | " + "Service: " + service);
		}

		int idx1 = messageVal.indexOf("[");
		String substring1 = messageVal.substring(idx1 + 1);
		int idx2 = substring1.indexOf("]");
		String errorCode = substring1.substring(0, idx2);
		String description = substring1.substring(idx2 + 1);
		description = description.trim();

		if (!StringUtils.isEmpty(description)) {
			errorMessage.append(",\"message\":\"");
			errorMessage.append(description);
		}

		if (!StringUtils.isEmpty(errorCode) && StringUtils.isNumeric(errorCode)) {
			try {
				int code = Integer.parseInt(errorCode);
				errorMessage.append(" Error #" + errorCode);
				errorMessage.append("\"");
				errorMessage.append(",\"errorNo\":");
				errorMessage.append(code);
			} catch (NumberFormatException e) {
				logger.error("Error parsing String [" + errorCode + "] to Integer");
				errorMessage.append("\"");
			}
		} else {
			errorMessage.append("\"");
		}
		return errorMessage.toString();
	}

	private String throwException(String defaultMessage, SuggestionListResponse response, Exception exception) {
		if (response == null) {
			return getErrorMessage(exception.getMessage());
		}
		return throwException(defaultMessage, response.getMessages());
	}

	private String throwException(String defaultMessage, BaseBSGResponse response, Exception exception) {
		if (response == null) {
			return getErrorMessage(exception.getMessage());
		}
		return throwException(defaultMessage, response.getMessages());
	}
	
	private String throwException(String defaultMessage, BaseServiceResponse response, Exception exception) {
		if (response == null) {
			return getErrorMessage(exception.getMessage());
		}
		return throwException(defaultMessage, response.getMessages());
	}

	private String throwException(String defaultMessage, List<ApplicationMessages> messages) {
		String exception = defaultMessage;
		for (ApplicationMessages message : messages) {
			if (message != null)
				exception = message.getMessageKey();
			break;
		}
		return getErrorMessage(exception);
	}

	/* The following lines of codes are used for MSG/BSG service methods
	 * This implements the rp.connect from SolNet
	 */

	/* PROPERTY SERVICE BEAN */

	public GetPropertySummaryResponse getPropertySummary(Integer propertyId) {
		
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetPropertySummaryResponse response = null;
		GetPropertySummaryRequest property = new GetPropertySummaryRequest();
		property.setPropertyId(propertyId);
		property.setSessionToken(getSessionToken());
		logRequest(property);
		try {
			response = bean.getPropertySummary(property);
		} catch (Exception e) {
			logger.error(e);
			//logRequestResponseOnError(property, property, "getPropertySummary");
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetPropertySummaryResponse getPropertySummary(Integer propertyId, LoginCredentials credentials) {
		
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetPropertySummaryResponse response = null;
		GetPropertySummaryRequest property = new GetPropertySummaryRequest();
		property.setPropertyId(propertyId);
		property.setSessionToken(sessionToken);
		logRequest(property, credentials);
		try {
			response = bean.getPropertySummary(property);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetPropertySummaryListResponse getPropertySummaryList(List<Integer> propertyIdInput, Integer sortType) {
		
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetPropertySummaryListResponse response = null;
		GetPropertySummaryListRequest request = new GetPropertySummaryListRequest();
		request.setSortType(sortType);
		request.setSessionToken(getSessionToken());
		request.setPropertyIdInput(BSGObjectsUtil.getPropertyIdInput(propertyIdInput));
		logRequest(request);
		try {
			response = bean.getPropertySummaryList(request);
		} catch (Exception e) {
			if (e.getMessage().equals("default.bsg.error") || e.getMessage().equals("(500)internal.server.error")){
			
				for (int retries=0; retries<3; retries++){
					try {
						response = bean.getPropertySummaryList(request);
					} catch (Exception ex) {
						if (ex.getMessage().equals("default.bsg.error") || ex.getMessage().equals("(500)internal.server.error")){
							continue;
						}else{
							logger.error(ex);
							throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, ex));
						}
					}
				}
			
			}else{
				logger.error(e);
				throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
			}
		}
		
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetPropertySummaryListResponse getPropertySummaryList(List<Integer> propertyIdInput, Integer sortType, LoginCredentials credentials) {

		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetPropertySummaryListResponse response = null;
		GetPropertySummaryListRequest request = new GetPropertySummaryListRequest();
		request.setSortType(sortType);
		request.setSessionToken(sessionToken);
		request.setPropertyIdInput(BSGObjectsUtil.getPropertyIdInput(propertyIdInput));
		logRequest(request, credentials);
		try {
			response = bean.getPropertySummaryList(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetPropertyDetailResponse getPropertyDetail(Integer propertyId) {
		
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetPropertyDetailResponse response = null;
		GetPropertyDetailRequest request = new GetPropertyDetailRequest();
		request.setPropertyId(propertyId);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getPropertyDetail(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetPropertyDetailResponse getPropertyDetail(Integer propertyId, LoginCredentials credentials) {

		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetPropertyDetailResponse response = null;
		GetPropertyDetailRequest request = new GetPropertyDetailRequest();
		request.setPropertyId(propertyId);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getPropertyDetail(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetPropertyIdsForAreaResponse getPropertyIdsForArea(String country, String state, String suburb, String postcode, String streetName) {

		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetPropertyIdsForAreaResponse response = null;
		GetPropertyIdsForAreaRequest request = new GetPropertyIdsForAreaRequest();
		request.setCountry(country);
		request.setState(state);
		request.setSuburb(suburb);
		request.setPostCode(postcode);
		request.setStreetName(streetName);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getPropertyIdsForArea(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}
	
	public GetPropertyIdsForCompanyResponse getPropertyIdsForCompany(String companyName, String state, String country) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetPropertyIdsForCompanyResponse response = null;
		GetPropertyIdsForCompanyRequest request = new GetPropertyIdsForCompanyRequest();
		request.setCompanyName(companyName);
		request.setCountry(country);
		request.setState(state);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getPropertyIdsForCompany(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetPropertyIdsForCompanyResponse getPropertyIdsForCompany(String companyName, String state, String country, LoginCredentials credentials) {

		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetPropertyIdsForCompanyResponse response = null;
		GetPropertyIdsForCompanyRequest request = new GetPropertyIdsForCompanyRequest();
		request.setCompanyName(companyName);
		request.setCountry(country);
		request.setState(state);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getPropertyIdsForCompany(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetPropertyIdsByPlanResponse getPropertyIdsByPlan(GetPropertyIdsByPlanRequest planInput) {
		
		planInput.setSessionToken(getSessionToken());
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetPropertyIdsByPlanResponse response = null;
		logRequest(planInput);
		try {
			response = bean.getPropertyIdsByPlan(planInput);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetPropertyIdsByPlanResponse getPropertyIdsByPlan(GetPropertyIdsByPlanRequest planInput, LoginCredentials credentials) {

		planInput.setSessionToken(getSessionToken());		
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		planInput.setSessionToken(sessionToken);
		GetPropertyIdsByPlanResponse response = null;
		logRequest(planInput, credentials);
		try {
			response = bean.getPropertyIdsByPlan(planInput);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetAddressMatchResponse getAddressMatch(GetAddressMatchRequest addressMatchInput) {

		addressMatchInput.setSessionToken(getSessionToken());
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetAddressMatchResponse response = null;
		logRequest(addressMatchInput);
		try {
			response = bean.getAddressMatch(addressMatchInput);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);
		if (!validateMessages(response.getMessages()))
			response = getAddressMatch(addressMatchInput);

		return response;
	}

	public GetAddressMatchResponse getAddressMatch(GetAddressMatchRequest addressMatchInput, LoginCredentials credentials) {
		
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetAddressMatchResponse response = null;	
		String sessionToken = getSessionTokenFromCredentials(credentials);
		addressMatchInput.setSessionToken(sessionToken);
		logRequest(addressMatchInput, credentials);
		try {
			response = bean.getAddressMatch(addressMatchInput);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);
		if (!validateMessages(response.getMessages()))
			response = getAddressMatch(addressMatchInput, credentials);

		return response;
	}

	public GetAvailableAttributesForPropertyIdsResponse getAvailableAttributesForPropertyIds(List<Integer> propertyIdInput) {

		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetAvailableAttributesForPropertyIdsResponse response = null;
		GetAvailableAttributesForPropertyIdsRequest request = new GetAvailableAttributesForPropertyIdsRequest();
		request.setSessionToken(getSessionToken());
		request.getPropertyIdInput().addAll(propertyIdInput);
		logRequest(request);
		try {
			response = bean.getAvailableAttributesForPropertyIds(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetAvailableAttributesForPropertyIdsResponse getAvailableAttributesForPropertyIds(List<Integer> propertyIdInput, LoginCredentials credentials) {
		
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetAvailableAttributesForPropertyIdsResponse response = null;
		GetAvailableAttributesForPropertyIdsRequest request = new GetAvailableAttributesForPropertyIdsRequest();
		request.setSessionToken(sessionToken);
		request.getPropertyIdInput().addAll(propertyIdInput);
		logRequest(request, credentials);
		try {
			response = bean.getAvailableAttributesForPropertyIds(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetPropertyIdListFromSuggestionResponse getPropertyIdListFromSuggestion(String searchString, Integer searchCategory) {
		
		logRequest("searchString : " + searchString + ", searchCategory : " + searchCategory);
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetPropertyIdListFromSuggestionResponse response = null;
		GetPropertyIdListFromSuggestionRequest request = new GetPropertyIdListFromSuggestionRequest();
		request.setSearchCategory(searchCategory);
		request.setSearchString(searchString);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getPropertyIdListFromSuggestion(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetPropertyIdListFromSuggestionResponse getPropertyIdListFromSuggestion(String searchString, Integer searchCategory, LoginCredentials credentials) {

		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetPropertyIdListFromSuggestionResponse response = null;
		GetPropertyIdListFromSuggestionRequest request = new GetPropertyIdListFromSuggestionRequest();
		request.setSearchCategory(searchCategory);
		request.setSearchString(searchString);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getPropertyIdListFromSuggestion(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetSuggestionListResponse getSuggestionList(String searchString, int maxSuggestionResults, List<Integer> searchCategories) {
		
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetSuggestionListResponse response = null;
		GetSuggestionListRequest request = new GetSuggestionListRequest();
		request.setMaxSuggestionResults(maxSuggestionResults);
		request.setSearchString(searchString);
		request.getSearchCategories().addAll(searchCategories);
		logRequest(request);
		try {
			response = bean.getSuggestionList(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);
		return response;
	}

	public RefinePropertiesResponse refineProperties(List<Integer> propertyIdInput,PropertySearchCriteriaInput propertySearchCriteriaInput, Integer sortType,
			List<BsgPropertyAttributeFilter> attributeFilterList) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		RefinePropertiesResponse response = null;
		RefinePropertiesRequest request = new RefinePropertiesRequest();
		request.setPropertyIdInput(BSGObjectsUtil.getPropertyIdInput(propertyIdInput));
		request.setPropertySearchCriteriaInput(propertySearchCriteriaInput);
		request.setSortType(sortType);
		if (attributeFilterList!=null && attributeFilterList.size() > 0) request.getAttributeFilterList().addAll(attributeFilterList);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.refineProperties(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public RefinePropertiesResponse refineProperties(List<Integer> propertyIdInput, PropertySearchCriteriaInput propertySearchCriteriaInput, Integer sortType,
			List<BsgPropertyAttributeFilter> attributeFilterList, LoginCredentials credentials) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		RefinePropertiesResponse response = null;
		RefinePropertiesRequest request = new RefinePropertiesRequest();
		request.setPropertyIdInput(BSGObjectsUtil.getPropertyIdInput(propertyIdInput));
		request.setPropertySearchCriteriaInput(propertySearchCriteriaInput);
		request.setSortType(sortType);
		if (attributeFilterList!=null && attributeFilterList.size() > 0) request.getAttributeFilterList().addAll(attributeFilterList);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.refineProperties(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);
		
		return response;
	}

	public GetStreetListResponse getStreetList(String streetName, String suburb, String state, String country) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetStreetListResponse response = null;
		GetStreetListRequest request = new GetStreetListRequest();
		request.setCountry(country);
		request.setState(state);
		request.setStreetName(streetName);
		request.setSuburb(suburb);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getStreetList(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetStreetListResponse getStreetList(String streetName, String suburb, String state, String country, LoginCredentials credentials) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetStreetListResponse response = null;
		GetStreetListRequest request = new GetStreetListRequest();
		request.setCountry(country);
		request.setState(state);
		request.setStreetName(streetName);
		request.setSuburb(suburb);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getStreetList(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetPropertyIdsByNameResponse getPropertyIdsByName(String firstName, String lastName, String state, String country) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetPropertyIdsByNameResponse response = null;
		GetPropertyIdsByNameRequest request = new GetPropertyIdsByNameRequest();
		request.setCountry(country);
		request.setFirstName(firstName);
		request.setLastName(lastName);
		request.setState(state);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getPropertyIdsByName(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetPropertyIdsByNameResponse getPropertyIdsByName(String firstName, String lastName, String state, String country, LoginCredentials credentials) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetPropertyIdsByNameResponse response = null;
		GetPropertyIdsByNameRequest request = new GetPropertyIdsByNameRequest();
		request.setCountry(country);
		request.setFirstName(firstName);
		request.setLastName(lastName);
		request.setState(state);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getPropertyIdsByName(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}
	
	public GetPropertyCoordinatesResponse getPropertyCoordinates(Integer propertyId) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetPropertyCoordinatesResponse response = null;
		GetPropertyCoordinatesRequest request = new GetPropertyCoordinatesRequest();
		request.setPropertyId(propertyId);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getPropertyCoordinates(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetPropertyCoordinatesResponse getPropertyCoordinates(Integer propertyId, LoginCredentials credentials) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetPropertyCoordinatesResponse response = null;
		GetPropertyCoordinatesRequest request = new GetPropertyCoordinatesRequest();
		request.setPropertyId(propertyId);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getPropertyCoordinates(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetAVMResponse getAVM(GetAVMRequest avmInput) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetAVMResponse response = null;
		avmInput.setSessionToken(getSessionToken());
		logRequest(avmInput);
		try {
			response = bean.getAVM(avmInput);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetAVMResponse getAVM(GetAVMRequest avmInput, LoginCredentials credentials) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetAVMResponse response = null;
		avmInput.setSessionToken(sessionToken);
		logRequest(avmInput, credentials);
		try {
			response = bean.getAVM(avmInput);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetPropertyIdsByRadiusResponse getPropertyIdsByRadius(GetPropertyIdsByRadiusRequest propertyIdsByRadiusInput) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetPropertyIdsByRadiusResponse response = null;
		propertyIdsByRadiusInput.setSessionToken(getSessionToken());
		logRequest(propertyIdsByRadiusInput);
		try {
			response = bean.getPropertyIdsByRadius(propertyIdsByRadiusInput);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetPropertyIdsByRadiusResponse getPropertyIdsByRadius(GetPropertyIdsByRadiusRequest propertyIdsByRadiusInput, LoginCredentials credentials) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetPropertyIdsByRadiusResponse response = null;
		propertyIdsByRadiusInput.setSessionToken(sessionToken);
		logRequest(propertyIdsByRadiusInput, credentials);
		try {
			response = bean.getPropertyIdsByRadius(propertyIdsByRadiusInput);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetLookupValuesResponse getLookupValues(String lookupCode) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetLookupValuesResponse response = null;
		GetLookupValuesRequest request = new GetLookupValuesRequest();
		request.setLookupCode(lookupCode);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getLookupValues(request);
		} catch (Exception e) {
			logger.error(e);
			throw new WebServiceRequestException(ErrorMessages.REMOTE_EXCEPTION);
		}
		logResponse(response);
		return response;
	}

	public GetLookupValuesResponse getLookupValues(String lookupCode, LoginCredentials credentials) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetLookupValuesResponse response = null;
		GetLookupValuesRequest request = new GetLookupValuesRequest();
		request.setLookupCode(lookupCode);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getLookupValues(request);
		} catch (Exception e) {
			logger.error(e);
			throw new WebServiceRequestException(ErrorMessages.REMOTE_EXCEPTION);
		}
		logResponse(response, credentials);
		return response;
	}
	
	public GetPropertySummaryListByNameSuburbResponse getPropertySummaryListByNameSuburb(String firstName, String lastName, String suburb, Integer pageNumber, Integer pageSize) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		GetPropertySummaryListByNameSuburbResponse response = null;
		GetPropertySummaryListByNameSuburbRequest request = new GetPropertySummaryListByNameSuburbRequest();
		request.setFirstName(firstName);
		request.setLastName(lastName);
		request.setSuburb(suburb);
		request.setPageNumber(pageNumber);
		request.setPageSize(pageSize);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getPropertySummaryListByNameSuburb(request);
		} catch (Exception e) {
			logger.error(e);
			throw new WebServiceRequestException(ErrorMessages.REMOTE_EXCEPTION);
		}
		logResponse(response);
		
		validateMessages(response);

		return response;
	}
	
	public GetPropertySummaryListByNameSuburbResponse getPropertySummaryListByNameSuburb(String firstName, String lastName, String suburb, Integer pageNumber, Integer pageSize, LoginCredentials credentials) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetPropertySummaryListByNameSuburbResponse response = null;
		GetPropertySummaryListByNameSuburbRequest request = new GetPropertySummaryListByNameSuburbRequest();
		request.setFirstName(firstName);
		request.setLastName(lastName);
		request.setSuburb(suburb);
		request.setPageNumber(pageNumber);
		request.setPageSize(pageSize);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getPropertySummaryListByNameSuburb(request);
		} catch (Exception e) {
			logger.error(e);
			throw new WebServiceRequestException(ErrorMessages.REMOTE_EXCEPTION);
		}

		logResponse(response, credentials);
		
		validateMessages(response);

		return response;
	}
	
	public DoneCMAResponse isDoneCMA(Integer propertyId, LoginCredentials credentials){
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		DoneCMAResponse response = null;
		DoneCMARequest request = new DoneCMARequest();
		request.setPropertyId(propertyId);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.doneCMA(request);
		} catch (Exception e) {
			logger.error(e);
			throw new WebServiceRequestException(ErrorMessages.REMOTE_EXCEPTION);
		}
		logResponse(response, credentials);
		return response;
	}


	/* SALES SERVICE BEAN */
	public GetSaleDetailResponse getSaleDetail(Integer propertyId) {
		logRequest("propertyId : " + propertyId);
		SalesService bean = BSGBeanFactory.getSalesServiceBean();
		GetSaleDetailResponse response = null;
		GetSaleDetailRequest request = new GetSaleDetailRequest();
		request.setPropertyId(propertyId);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getSaleDetail(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetSaleDetailResponse getSaleDetail(Integer propertyId, LoginCredentials credentials) {
		logRequest("propertyId : " + propertyId);
		SalesService bean = BSGBeanFactory.getSalesServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetSaleDetailResponse response = null;
		GetSaleDetailRequest request = new GetSaleDetailRequest();
		request.setPropertyId(propertyId);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getSaleDetail(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public RefineSoldPropertiesResponse refineSoldProperties(RefineSoldPropertiesRequest salesSearchCriteriaInput) {
		SalesService bean = BSGBeanFactory.getSalesServiceBean();
		RefineSoldPropertiesResponse response = null;
		salesSearchCriteriaInput.setSessionToken(getSessionToken());
		logRequest(salesSearchCriteriaInput);
		try {
			response = bean.refineSoldProperties(salesSearchCriteriaInput);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public RefineSoldPropertiesResponse refineSoldProperties(RefineSoldPropertiesRequest salesSearchCriteriaInput, LoginCredentials credentials) {
		SalesService bean = BSGBeanFactory.getSalesServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		RefineSoldPropertiesResponse response = null;
		salesSearchCriteriaInput.setSessionToken(sessionToken);
		logRequest(salesSearchCriteriaInput, credentials);
		try {
			response = bean.refineSoldProperties(salesSearchCriteriaInput);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetSalesPropertySummaryListResponse getSalesPropertySummaryList(List<Integer> propertyIdInput, Integer sortType) {
		SalesService bean = BSGBeanFactory.getSalesServiceBean();
		GetSalesPropertySummaryListResponse response = null;
		GetSalesPropertySummaryListRequest request = new GetSalesPropertySummaryListRequest();
		request.setSortType(sortType);
		request.setSessionToken(getSessionToken());
		request.setPropertyIdInput(BSGObjectsUtil.getPropertyIdInput(propertyIdInput));
		logRequest(request);
		try {
			response = bean.getSalesPropertySummaryList(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetSalesPropertySummaryListResponse getSalesPropertySummaryList(List<Integer> propertyIdInput, Integer sortType, LoginCredentials credentials) {
		SalesService bean = BSGBeanFactory.getSalesServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetSalesPropertySummaryListResponse response = null;
		GetSalesPropertySummaryListRequest request = new GetSalesPropertySummaryListRequest();
		request.setSortType(sortType);
		request.setSessionToken(sessionToken);
		request.setPropertyIdInput(BSGObjectsUtil.getPropertyIdInput(propertyIdInput));
		logRequest(request, credentials);
		try {
			response = bean.getSalesPropertySummaryList(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public IsHotSpotResponse isHotSpot(String state, String suburb, String postcode){		
		SalesService bean = BSGBeanFactory.getSalesServiceBean();
		IsHotSpotResponse response = null;
		IsHotSpotRequest request = new IsHotSpotRequest();
		request.setPostcode(postcode);
		request.setState(state);
		request.setSuburb(suburb);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.isHotSpot(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public IsHotSpotResponse isHotSpot(String state, String suburb, String postcode, LoginCredentials credentials){
		SalesService bean = BSGBeanFactory.getSalesServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		IsHotSpotResponse response = null;
		IsHotSpotRequest request = new IsHotSpotRequest();
		request.setPostcode(postcode);
		request.setState(state);
		request.setSuburb(suburb);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.isHotSpot(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetHomeBuyerIndexResponse getHomeBuyerIndex(String state, String suburb, String postcode){
		SalesService bean = BSGBeanFactory.getSalesServiceBean();
		GetHomeBuyerIndexResponse response = null;
		GetHomeBuyerIndexRequest request = new GetHomeBuyerIndexRequest();
		request.setPostcode(postcode);
		request.setState(state);
		request.setSuburb(suburb);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getHomeBuyerIndex(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetHomeBuyerIndexResponse getHomeBuyerIndex(String state, String suburb, String postcode, LoginCredentials credentials){
		SalesService bean = BSGBeanFactory.getSalesServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetHomeBuyerIndexResponse response = null;
		GetHomeBuyerIndexRequest request = new GetHomeBuyerIndexRequest();
		request.setPostcode(postcode);
		request.setState(state);
		request.setSuburb(suburb);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getHomeBuyerIndex(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);
		
		validateMessages(response);

		return response;
	}

	public GetSalesPropertyIdsByRadiusResponse getSalesPropertyIdsByRadius(GetSalesPropertyIdsByRadiusRequest request, LoginCredentials credentials){
		SalesService bean = BSGBeanFactory.getSalesServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		request.setSessionToken(sessionToken);
		GetSalesPropertyIdsByRadiusResponse response = null;
		logRequest(request, credentials);
		try {
			response = bean.getSalesPropertyIdsByRadius(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);
		
		validateMessages(response);
		
		return response;
	}
	

	/* PROPERTY STATISTICS SERVICE BEAN */

	public GetSalesByNumberResponse getSalesByNumber(GetSalesByNumberRequest request) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		GetSalesByNumberResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getSalesByNumber(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetSalesByNumberResponse getSalesByNumber(GetSalesByNumberRequest request, LoginCredentials credentials) {
		logRequest(request);
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetSalesByNumberResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getSalesByNumber(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetSalesByNumberChartURLResponse getSalesByNumberChartURL(GetSalesByNumberChartURLRequest request) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		GetSalesByNumberChartURLResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getSalesByNumberChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetSalesByNumberChartURLResponse getSalesByNumberChartURL(GetSalesByNumberChartURLRequest request, LoginCredentials credentials) {
		logRequest(request);
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetSalesByNumberChartURLResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getSalesByNumberChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetSalesByPriceResponse getSalesByPrice(GetSalesByPriceRequest request) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		GetSalesByPriceResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getSalesByPrice(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetSalesByPriceResponse getSalesByPrice(GetSalesByPriceRequest request, LoginCredentials credentials) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetSalesByPriceResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getSalesByPrice(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetSalesByPriceChartURLResponse getSalesByPriceChartURL(GetSalesByPriceChartURLRequest request) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		GetSalesByPriceChartURLResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getSalesByPriceChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetSalesByPriceChartURLResponse getSalesByPriceChartURL(GetSalesByPriceChartURLRequest request, LoginCredentials credentials) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetSalesByPriceChartURLResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getSalesByPriceChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetYearlyMedianPricesChartURLResponse getYearlyMedianPricesChartURL(GetYearlyMedianPricesChartURLRequest request) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		GetYearlyMedianPricesChartURLResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getYearlyMedianPricesChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetYearlyMedianPricesChartURLResponse getYearlyMedianPricesChartURL(GetYearlyMedianPricesChartURLRequest request, LoginCredentials credentials) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetYearlyMedianPricesChartURLResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getYearlyMedianPricesChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetYearlyMedianPricesResponse getYearlyMedianPrices(GetYearlyMedianPricesRequest request) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		GetYearlyMedianPricesResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getYearlyMedianPrices(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetYearlyMedianPricesResponse getYearlyMedianPrices(GetYearlyMedianPricesRequest request, LoginCredentials credentials) {
		logRequest(request);
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetYearlyMedianPricesResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getYearlyMedianPrices(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetMonthlyMedianPricesResponse getMonthlyMedianPrices(GetMonthlyMedianPricesRequest request) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		GetMonthlyMedianPricesResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getMonthlyMedianPrices(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetMonthlyMedianPricesResponse getMonthlyMedianPrices(GetMonthlyMedianPricesRequest request, LoginCredentials credentials) {
		logRequest(request);
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetMonthlyMedianPricesResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getMonthlyMedianPrices(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetMonthlyMedianPricesChartURLResponse getMonthlyMedianPricesChartURL(GetMonthlyMedianPricesChartURLRequest request) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		GetMonthlyMedianPricesChartURLResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getMonthlyMedianPricesChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetMonthlyMedianPricesChartURLResponse getMonthlyMedianPricesChartURL(GetMonthlyMedianPricesChartURLRequest request, LoginCredentials credentials) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetMonthlyMedianPricesChartURLResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getMonthlyMedianPricesChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetCapitalGrowthResponse getCapitalGrowth(GetCapitalGrowthRequest request) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		GetCapitalGrowthResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getCapitalGrowth(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetCapitalGrowthResponse getCapitalGrowth(GetCapitalGrowthRequest request, LoginCredentials credentials) {
		logRequest(request);
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetCapitalGrowthResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getCapitalGrowth(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetCapitalGrowthChartURLResponse getCapitalGrowthChartURL(GetCapitalGrowthChartURLRequest request) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		GetCapitalGrowthChartURLResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getCapitalGrowthChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetCapitalGrowthChartURLResponse getCapitalGrowthChartURL(GetCapitalGrowthChartURLRequest request, LoginCredentials credentials) {
		logRequest(request);
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetCapitalGrowthChartURLResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getCapitalGrowthChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetAreaProfileMedianPricesChartURLResponse getAreaProfileMedianPricesChartURL(GetAreaProfileMedianPricesChartURLRequest request) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		GetAreaProfileMedianPricesChartURLResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getAreaProfileMedianPricesChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetAreaProfileMedianPricesChartURLResponse getAreaProfileMedianPricesChartURL(GetAreaProfileMedianPricesChartURLRequest request, LoginCredentials credentials) {
		PropertyStatisticsService bean = BSGBeanFactory.getPropertyStatisticsServicesBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetAreaProfileMedianPricesChartURLResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getAreaProfileMedianPricesChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}


	/* PROPERTY IMAGERY SERVICE BEAN */

	public GetPhotosResponse getPhotos(Integer propertyId) {
		logRequest("propertyId : " + propertyId);
		PropertyImageryService bean = BSGBeanFactory.getPropertyImageryServiceBean();
		GetPhotosResponse response = null;
		GetPhotosRequest request = new GetPhotosRequest();
		request.setPropertyId(propertyId);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getPhotos(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetPhotosResponse getPhotos(Integer propertyId, LoginCredentials credentials) {
		logRequest("propertyId : " + propertyId);
		PropertyImageryService bean = BSGBeanFactory.getPropertyImageryServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetPhotosResponse response = null;
		GetPhotosRequest request = new GetPhotosRequest();
		request.setPropertyId(propertyId);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getPhotos(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetAerialMapResponse getAerialMap(Integer propertyId, LayerMapOptions mapOptions) {
		PropertyImageryService bean = BSGBeanFactory.getPropertyImageryServiceBean();
		GetAerialMapResponse response = null;
		GetAerialMapRequest request = new GetAerialMapRequest();
		request.setMapOptions(mapOptions);
		request.setPropertyId(propertyId);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getAerialMap(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetAerialMapResponse getAerialMap(Integer propertyId, LayerMapOptions mapOptions, LoginCredentials credentials) {
		PropertyImageryService bean = BSGBeanFactory.getPropertyImageryServiceBean();
		GetAerialMapResponse response = null;
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetAerialMapRequest request = new GetAerialMapRequest();
		request.setMapOptions(mapOptions);
		request.setPropertyId(propertyId);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getAerialMap(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetStreetMapResponse getStreetMap(Integer propertyId, LayerMapOptions mapOptions) {
		PropertyImageryService bean = BSGBeanFactory.getPropertyImageryServiceBean();
		GetStreetMapResponse response = null;
		GetStreetMapRequest request = new GetStreetMapRequest();
		request.setMapOptions(mapOptions);
		request.setPropertyId(propertyId);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getStreetMap(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetStreetMapResponse getStreetMap(Integer propertyId, LayerMapOptions mapOptions, LoginCredentials credentials) {
		PropertyImageryService bean = BSGBeanFactory.getPropertyImageryServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetStreetMapResponse response = null;
		GetStreetMapRequest request = new GetStreetMapRequest();
		request.setMapOptions(mapOptions);
		request.setPropertyId(propertyId);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getStreetMap(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);
		
		validateMessages(response);

		return response;
	}

	public GetTopoMapResponse getTopoMap(Integer propertyId, LayerMapOptions mapOptions) {
		PropertyImageryService bean = BSGBeanFactory.getPropertyImageryServiceBean();
		GetTopoMapResponse response = null;
		GetTopoMapRequest request = new GetTopoMapRequest();
		request.setMapOptions(mapOptions);
		request.setPropertyId(propertyId);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getTopoMap(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetTopoMapResponse getTopoMap(Integer propertyId, LayerMapOptions mapOptions, LoginCredentials credentials) {
		PropertyImageryService bean = BSGBeanFactory.getPropertyImageryServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetTopoMapResponse response = null;
		GetTopoMapRequest request = new GetTopoMapRequest();
		request.setMapOptions(mapOptions);
		request.setPropertyId(propertyId);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getTopoMap(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetAreaMapResponse getAreaMap(Integer propertyId) {
		PropertyImageryService bean = BSGBeanFactory.getPropertyImageryServiceBean();
		GetAreaMapResponse response = null;
		GetAreaMapRequest request = new GetAreaMapRequest();
		request.setPropertyId(propertyId);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getAreaMap(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetAreaMapResponse getAreaMap(Integer propertyId, LoginCredentials credentials) {
		PropertyImageryService bean = BSGBeanFactory.getPropertyImageryServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetAreaMapResponse response = null;
		GetAreaMapRequest request = new GetAreaMapRequest();
		request.setPropertyId(propertyId);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getAreaMap(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}


	/* ON THE MARKET SERVICE BEAN */

	public GetListingsForPropertyIdResponse getListingsForPropertyId(Integer propertyId) {
		logRequest("propertyId : " + propertyId);
		OnTheMarketService bean = BSGBeanFactory.getOnTheMarketServiceBean();
		GetListingsForPropertyIdResponse response = null;
		GetListingsForPropertyIdRequest request = new GetListingsForPropertyIdRequest();
		request.setPropertyId(propertyId);
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getListingsForPropertyId(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetListingsForPropertyIdResponse getListingsForPropertyId(Integer propertyId, LoginCredentials credentials) {
		logRequest("propertyId : " + propertyId);
		OnTheMarketService bean = BSGBeanFactory.getOnTheMarketServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetListingsForPropertyIdResponse response = null;
		GetListingsForPropertyIdRequest request = new GetListingsForPropertyIdRequest();
		request.setPropertyId(propertyId);
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getListingsForPropertyId(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public RefineOtmPropertiesResponse refineOtmProperties(RefineOtmPropertiesRequest request) {
		OnTheMarketService bean = BSGBeanFactory.getOnTheMarketServiceBean();
		RefineOtmPropertiesResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.refineOtmProperties(request);
		} catch (Exception e) {
			logger.error(e);
			logger.error("Error connecting to refineOtmProperties method from BSG");
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public RefineOtmPropertiesResponse refineOtmProperties(RefineOtmPropertiesRequest request, LoginCredentials credentials) {
		OnTheMarketService bean = BSGBeanFactory.getOnTheMarketServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		RefineOtmPropertiesResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.refineOtmProperties(request);
		} catch (Exception e) {
			logger.error(e);
			logger.error("Error connecting to refineOtmProperties method from BSG");
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetOtmPropertySummaryListResponse getOtmPropertySummaryList(List<Integer> propertyIdInput, SortType sortType) {
		OnTheMarketService bean = BSGBeanFactory.getOnTheMarketServiceBean();
		GetOtmPropertySummaryListResponse response = null;
		GetOtmPropertySummaryListRequest request = new GetOtmPropertySummaryListRequest();
		request.setSessionToken(getSessionToken());
		request.setSortType(sortType);
		request.setPropertyIdInput(BSGObjectsUtil.getPropertyIdInput(propertyIdInput));		
		logRequest(request);
		try {
			response = bean.getOtmPropertySummaryList(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetOtmPropertySummaryListResponse getOtmPropertySummaryList(List<Integer> propertyIdInput, SortType sortType, LoginCredentials credentials) {
		OnTheMarketService bean = BSGBeanFactory.getOnTheMarketServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetOtmPropertySummaryListResponse response = null;
		GetOtmPropertySummaryListRequest request = new GetOtmPropertySummaryListRequest();
		request.setSessionToken(sessionToken);
		request.setSortType(sortType);
		PropertyIdInput input = new PropertyIdInput();
		input.getPropertyIdList().addAll(propertyIdInput);
		request.setPropertyIdInput(input);	
		logRequest(request, credentials);
		try {
			response = bean.getOtmPropertySummaryList(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetOTMPropertyIdsByRadiusResponse getOtmPropertyIdsByRadius(GetOTMPropertyIdsByRadiusRequest request, LoginCredentials credentials){
		OnTheMarketService bean = BSGBeanFactory.getOnTheMarketServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		request.setSessionToken(sessionToken);
		GetOTMPropertyIdsByRadiusResponse response = null;
		logRequest(request, credentials);
		try {
			response = bean.getOTMPropertyIdsByRadius(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}

		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	/* AU GOVERNMENT STATISTICS SERVICE BEAN */

	public GetHouseholdIncomeResponse getHouseholdIncome(GetHouseholdIncomeRequest request) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		GetHouseholdIncomeResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getHouseholdIncome(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetHouseholdIncomeResponse getHouseholdIncome(GetHouseholdIncomeRequest request, LoginCredentials credentials) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetHouseholdIncomeResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getHouseholdIncome(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetHouseholdStructureResponse getHouseholdStructure(GetHouseholdStructureRequest request) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		GetHouseholdStructureResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getHouseholdStructure(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetHouseholdStructureResponse getHouseholdStructure(GetHouseholdStructureRequest request, LoginCredentials credentials) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetHouseholdStructureResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getHouseholdStructure(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetHouseholdOccupancyResponse getHouseholdOccupancy(GetHouseholdOccupancyRequest request) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		GetHouseholdOccupancyResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getHouseholdOccupancy(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetHouseholdOccupancyResponse getHouseholdOccupancy(GetHouseholdOccupancyRequest request, LoginCredentials credentials) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetHouseholdOccupancyResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getHouseholdOccupancy(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetAgeSexRatioResponse getAgeSexRatio(GetAgeSexRatioRequest request) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		GetAgeSexRatioResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getAgeSexRatio(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetAgeSexRatioResponse getAgeSexRatio(GetAgeSexRatioRequest request, LoginCredentials credentials) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetAgeSexRatioResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getAgeSexRatio(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}

		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}	

	public GetAgeSexRatioChartURLResponse getAgeSexRatioChartURL(GetAgeSexRatioChartURLRequest request) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		GetAgeSexRatioChartURLResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getAgeSexRatioChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetAgeSexRatioChartURLResponse getAgeSexRatioChartURL(GetAgeSexRatioChartURLRequest request, LoginCredentials credentials) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetAgeSexRatioChartURLResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getAgeSexRatioChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetHouseholdIncomeChartURLResponse getHouseholdIncomeChartURL(GetHouseholdIncomeChartURLRequest request) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		GetHouseholdIncomeChartURLResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getHouseholdIncomeChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetHouseholdIncomeChartURLResponse getHouseholdIncomeChartURL(GetHouseholdIncomeChartURLRequest request, LoginCredentials credentials) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetHouseholdIncomeChartURLResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getHouseholdIncomeChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetHouseholdStructureChartURLResponse getHouseholdStructureChartURL(GetHouseholdStructureChartURLRequest request) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		GetHouseholdStructureChartURLResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getHouseholdStructureChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetHouseholdStructureChartURLResponse getHouseholdStructureChartURL(GetHouseholdStructureChartURLRequest request, LoginCredentials credentials) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetHouseholdStructureChartURLResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getHouseholdStructureChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetHouseholdOccupancyChartURLResponse getHouseholdOccupancyChartURL(GetHouseholdOccupancyChartURLRequest request) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		GetHouseholdOccupancyChartURLResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getHouseholdOccupancyChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetHouseholdOccupancyChartURLResponse getHouseholdOccupancyChartURL(GetHouseholdOccupancyChartURLRequest request, LoginCredentials credentials) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetHouseholdOccupancyChartURLResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getHouseholdOccupancyChartURL(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}

	public GetStatisticsForRegionResponse getStatisticsForRegion(GetStatisticsForRegionRequest request) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		GetStatisticsForRegionResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getStatisticsForRegion(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}

	public GetStatisticsForRegionResponse getStatisticsForRegion(GetStatisticsForRegionRequest request, LoginCredentials credentials) {
		AuGovernmentStatisticsService bean = BSGBeanFactory.getAuGovernmentStatisticsServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetStatisticsForRegionResponse response = null;
		request.setSessionToken(sessionToken);
		logRequest(request, credentials);
		try {
			response = bean.getStatisticsForRegion(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);

		validateMessages(response);

		return response;
	}


	/* SESSION SERVICE BEAN */	

	public GenerateIntegratorAuthTokenResponse generateIntegratorAuthToken(String userName, String password, Long integratorId, Long customerId){
		SessionService bean = BSGBeanFactory.getSessionServiceBean();    	
		GenerateIntegratorAuthTokenResponse response = null;
		GenerateIntegratorAuthTokenRequest request = new GenerateIntegratorAuthTokenRequest();
		request.setUserName(userName);
		request.setPassword(password);
		request.setIntegratorId(integratorId);
		request.setCustomerId(customerId);
		logRequest(request);
		try {
			response = bean.generateIntegratorAuthToken(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}		
		logResponse(response);
		return response;
	}

	public GetCredentialsForSessionTokenResponse getCredentialsForSessionToken(String sessionToken){
		SessionService bean = BSGBeanFactory.getSessionServiceBean();  
		GetCredentialsForSessionTokenResponse response = null;
		GetCredentialsForSessionTokenRequest request = new GetCredentialsForSessionTokenRequest();
		request.setSessionToken(sessionToken);
		logRequest(request);
		try {
			response = bean.getCredentialsForSessionToken(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);
		return response;
	}

	public GetCustomersForUserResponse getCustomersForUser(String username, String password){
		SessionService bean = BSGBeanFactory.getSessionServiceBean();  
		GetCustomersForUserResponse response = null;
		GetCustomersForUserRequest request = new GetCustomersForUserRequest();
		request.setPassword(password);
		request.setUserName(username);
		logRequest(request);
		try{
			response = bean.getCustomersForUser(request);
		}catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);
		return response;
	}
	
	@Override
	public ValidateHmacHashResponse validateHmacHash(String sessionToken, String url) {
		SessionService bean = BSGBeanFactory.getSessionServiceBean();  
		ValidateHmacHashResponse response = null;
		ValidateHmacHashRequest request = new ValidateHmacHashRequest();
		request.setSessionToken(sessionToken);
		request.setUrl(url);
		logRequest(request);
		try{
			response = bean.validateHmacHash(request);
		}catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);
		return response;
	}

	/* BSG ASYNCHRONOUS */	

	//Asynchronous implementation of Refine Properties using batches 
	public List<Integer> refinePropertiesBatching(List<Integer> propertyIdInput, PropertySearchCriteriaInput propertySearchCriteriaInput, LoginCredentials credentials) {
		
		logger.info("Refine batching called for recently sold [STARTED] ============ " + System.currentTimeMillis());
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		List<Response<RefinePropertiesResponse>> respList = new ArrayList<Response<RefinePropertiesResponse>>();
		RefinePropertiesResponse response = new RefinePropertiesResponse();
		List<Integer> pidResults = new ArrayList<Integer>();
		
		//create batches per 1000 pids
		Integer end = 0;
		Integer start = 0;
		while(end < propertyIdInput.size()) {
			start = end;
			if((end + 1000) > propertyIdInput.size()) {
				end = propertyIdInput.size();
			} else {
				end += 1000;
			}

			RefinePropertiesRequest req = new RefinePropertiesRequest();
			PropertyIdInput value = new PropertyIdInput();
			value.getPropertyIdList().addAll(propertyIdInput.subList(start, end));
			req.setPropertyIdInput(value);
			req.setPropertySearchCriteriaInput(propertySearchCriteriaInput);
			req.setSessionToken(sessionToken);
			req.setSortType(0);

			logRequest(req);

			Response<RefinePropertiesResponse> resp = bean.refinePropertiesAsync(req);
			respList.add(resp);
		}
		
		//wait for refineProperties to finish
		boolean isFinished = false;
		while(!isFinished){
			isFinished = true;
			for (Response<RefinePropertiesResponse> resp : respList){
				if(!resp.isDone()){
					isFinished = false;
					break;
				}
			}
		}
		//get resulting pids
		for (Response<RefinePropertiesResponse> resp : respList){
			try {
				response = resp.get();

				validateMessages(response);
				logResponse(response);
				
				pidResults.addAll(response.getPropertyIdList());
			} catch (Exception e) {
				logger.error(e);
				throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
			}
		}
		logger.info("Refine batching called for recently sold [ENDED] ============ " + System.currentTimeMillis());
		return pidResults;
	}

	/* Asynchronous GetPropertySummaryListResponse to get Summary List of Two PID lists */
	public List<GetPropertySummaryListResponse> getPropertySummaryListAsync(List<Integer> propertyIdInput1, List<Integer> propertyIdInput2, Integer sortType, LoginCredentials credentials) {
		
		List <GetPropertySummaryListResponse> responseList = new ArrayList<GetPropertySummaryListResponse>();
		
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetPropertySummaryListResponse response1 = null;
		GetPropertySummaryListResponse response2 = null;
		GetPropertySummaryListRequest request1 = new GetPropertySummaryListRequest();
		GetPropertySummaryListRequest request2 = new GetPropertySummaryListRequest();

		request1.setSortType(sortType);
		request1.setSessionToken(sessionToken);
		request1.setPropertyIdInput(BSGObjectsUtil.getPropertyIdInput(propertyIdInput1));

		request2.setSortType(sortType);
		request2.setSessionToken(sessionToken);
		request2.setPropertyIdInput(BSGObjectsUtil.getPropertyIdInput(propertyIdInput2));
		
		logRequest(request1, credentials);
		logRequest(request2, credentials);

		Response<GetPropertySummaryListResponse> resp1 = bean.getPropertySummaryListAsync(request1);
		Response<GetPropertySummaryListResponse> resp2 = bean.getPropertySummaryListAsync(request2);

		//wait for the processing to end
		while (!resp1.isDone() || !resp2.isDone()) {}
		
		try {
			response1 = resp1.get();
			logResponse(response1, credentials);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response1, e));
		}

		try {
			response2 = resp2.get();
			logResponse(response2);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response2, e));
		}
		
		validateMessages(response1);
		validateMessages(response2);
		
		responseList.add(response1);
		responseList.add(response2);
		
		return responseList;
	}
	
	/* Asynchronous Implementation of  GetOTMPropertyIdsByRadius & GetSalesPropertyIdsByRadius */	
	public OtmSalesPropertyByRadiusResponse getOtmSalesPropertyIdsByRadiusAsync(Double lat, Double lon, Double radius, LoginCredentials credentials) {
		OtmSalesPropertyByRadiusResponse list = new OtmSalesPropertyByRadiusResponse();
		OnTheMarketService bean1 = BSGBeanFactory.getOnTheMarketServiceBean();
		SalesService bean2 = BSGBeanFactory.getSalesServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		GetOTMPropertyIdsByRadiusResponse response1 = null; 
		GetSalesPropertyIdsByRadiusResponse response2 = null;
		GetOTMPropertyIdsByRadiusRequest request1 = new GetOTMPropertyIdsByRadiusRequest();
		GetSalesPropertyIdsByRadiusRequest request2 = new GetSalesPropertyIdsByRadiusRequest();

		if (lat==null && lon==null && radius==null){
			list.setOtmIdsByRadiusResponse(response1);
			list.setSalesPropertyIdsByRadiusResponse(response2);
			return list;
		}
		
		request1.setSessionToken(sessionToken);
		request1.setLatitude(Double.valueOf(lat));
		request1.setLongitude(Double.valueOf(lon));
		request1.setRadius(Double.valueOf(radius));
		
		request2.setSessionToken(sessionToken);
		request2.setLatitude(Double.valueOf(lat));
		request2.setLongitude(Double.valueOf(lon));
		request2.setRadius(Double.valueOf(radius));
				
		logRequest(request1);
		logRequest(request2);
		
		
		Response<GetOTMPropertyIdsByRadiusResponse> resp1 = null;
		Response<GetSalesPropertyIdsByRadiusResponse> resp2 = null;
		
		resp1 = bean1.getOTMPropertyIdsByRadiusAsync(request1);
		resp2 = bean2.getSalesPropertyIdsByRadiusAsync(request2);
		
		while (!resp1.isDone() || !resp2.isDone()) {}
	
		try {
			response1 = resp1.get();
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response1, e));
		}

		try {
			response2 = resp2.get();
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response2, e));
		}

		validateMessages(response1);
		validateMessages(response2);
		
		logResponse(response1);
		logResponse(response2);
		list.setOtmIdsByRadiusResponse(response1);
		list.setSalesPropertyIdsByRadiusResponse(response2);
		return list;
	}
	
	/*Asynchronous implementation for  getSuggestionList for (1)suburb and (2)others*/

	public GetSuggestionListResponse getSuggestionListAsync(String searchString, int maxSuggestionResults, List<Integer> searchCategories) {
		
		List<Integer> searchCategoriesSuburb = new ArrayList<Integer>();
		List<Integer> searchCategoriesOthers = new ArrayList<Integer>();
		
		for (int i=0; i<searchCategories.size(); i++){
			int categoryCode = Integer.valueOf(searchCategories.get(i));
			if(categoryCode==3)
				searchCategoriesSuburb.add(categoryCode);
			else
				searchCategoriesOthers.add(categoryCode);
		}
		
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		
		GetSuggestionListResponse responseSuburb = null;
		GetSuggestionListResponse responseOthers = null;
		
		GetSuggestionListRequest requestSuburb = new GetSuggestionListRequest();
		GetSuggestionListRequest requestOthers = new GetSuggestionListRequest();
		
		requestSuburb.setMaxSuggestionResults(maxSuggestionResults);
		requestOthers.setMaxSuggestionResults(maxSuggestionResults);
		
		requestSuburb.setSearchString(searchString);
		requestOthers.setSearchString(searchString);
		
		requestSuburb.getSearchCategories().addAll(searchCategoriesSuburb);
		requestOthers.getSearchCategories().addAll(searchCategoriesOthers);
		
		logRequest(requestSuburb);
		logRequest(requestOthers);
		
		Response<GetSuggestionListResponse> respAsyncSuburb = bean.getSuggestionListAsync(requestSuburb);
		Response<GetSuggestionListResponse> respAsyncOthers = bean.getSuggestionListAsync(requestOthers);
		
		
		while (!respAsyncSuburb.isDone() || !respAsyncOthers.isDone()) {}
		
		try {
			responseSuburb = respAsyncSuburb.get();
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, responseSuburb, e));
		}

		try {
			responseOthers = respAsyncOthers.get();
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, responseOthers, e));
		}
		
		logResponse(responseSuburb);
		logResponse(responseOthers);
		
		//combine them to make 1 response
		responseSuburb.getSuggestions().addAll(responseOthers.getSuggestions());
		
		//get the max Index
		int toIndex = maxSuggestionResults;
		if(responseSuburb.getSuggestions().size()<maxSuggestionResults){
			toIndex = responseSuburb.getSuggestions().size();
		}
		
		//fill the response with the required number of rows
		GetSuggestionListResponse response = new GetSuggestionListResponse();
		for (int i=0; i<toIndex; i++){
			response.getSuggestions().add(responseSuburb.getSuggestions().get(i));
		}	
		
		return response;
		
	}
	
	public GetPropertySummaryListResponse getPropertySummaryListAsync(List<Integer> propertyIdInput, Integer sortType, LoginCredentials credentials) {
		
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		List<Response<GetPropertySummaryListResponse>> respList = new ArrayList<Response<GetPropertySummaryListResponse>>();
		GetPropertySummaryListResponse response = new GetPropertySummaryListResponse();
		
		//create batches per 500 pids
		Integer end = 0;
		Integer start = 0;
		while(end < propertyIdInput.size()) {
			start = end;
			if((end + 500) > propertyIdInput.size()) {
				end = propertyIdInput.size();
			} else {
				end += 500;
			}

			GetPropertySummaryListRequest req = new GetPropertySummaryListRequest();
			PropertyIdInput value = new PropertyIdInput();
			value.getPropertyIdList().addAll(propertyIdInput.subList(start, end));
			req.setPropertyIdInput(value);
			req.setSessionToken(sessionToken);
			req.setSortType(sortType);

			logRequest(req);

			Response<GetPropertySummaryListResponse> resp = bean.getPropertySummaryListAsync(req);
			respList.add(resp);
		}
		
		//wait for refineProperties to finish
		boolean isFinished = false;
		while(!isFinished){
			isFinished = true;
			for (Response<GetPropertySummaryListResponse> resp : respList){
				if(!resp.isDone()){
					isFinished = false;
					break;
				}
			}
		}
		
		//get resulting pids
		for (Response<GetPropertySummaryListResponse> resp : respList){
			try {
				
				response.getPropertySummaryList().addAll(resp.get().getPropertySummaryList());
				
				validateMessages(response);
				logResponse(response);
			
			} catch (Exception e) {
				logger.error(e);
				throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
			}
		}
		
		return response;
		
	}
	
	public GetOtmPropertySummaryListResponse getOtmPropertySummaryListAsync(List<Integer> propertyIdInput, SortType sortType, LoginCredentials credentials) {
		
			OnTheMarketService bean = BSGBeanFactory.getOnTheMarketServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		List<Response<GetOtmPropertySummaryListResponse>> respList = new ArrayList<Response<GetOtmPropertySummaryListResponse>>();
		GetOtmPropertySummaryListResponse response = new GetOtmPropertySummaryListResponse();
		
		//create batches per 500 pids
		Integer end = 0;
		Integer start = 0;
		while(end < propertyIdInput.size()) {
			start = end;
			if((end + 500) > propertyIdInput.size()) {
				end = propertyIdInput.size();
			} else {
				end += 500;
			}

			GetOtmPropertySummaryListRequest req = new GetOtmPropertySummaryListRequest();
			PropertyIdInput value = new PropertyIdInput();
			value.getPropertyIdList().addAll(propertyIdInput.subList(start, end));
			req.setPropertyIdInput(value);
			req.setSessionToken(sessionToken);
			req.setSortType(sortType);

			logRequest(req);

			Response<GetOtmPropertySummaryListResponse> resp = bean.getOtmPropertySummaryListAsync(req);
			respList.add(resp);
		}
		
		//wait for refineProperties to finish
		boolean isFinished = false;
		while(!isFinished){
			isFinished = true;
			for (Response<GetOtmPropertySummaryListResponse> resp : respList){
				if(!resp.isDone()){
					isFinished = false;
					break;
				}
			}
		}
		
		//get resulting pids
		for (Response<GetOtmPropertySummaryListResponse> resp : respList){
			try {
				
				response.getOtmSummaryList().addAll(resp.get().getOtmSummaryList());
				
				validateMessages(response);
				logResponse(response);
			
			} catch (Exception e) {
				logger.error(e);
				throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
			}
		}
		
		return response; 
		
	}

	@Override
	public SearchResponse search(String featureKey,
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
			PropertyOTMCriteria propertyOTMRentalCriteria) {
		
		PropertySearchService bean = BSGBeanFactory.getPropertySearchServiceBean();		
		SearchResponse response = null;
		SearchRequest request = new SearchRequest();
		request.setFeatureKey(featureKey);
		request.setSearchAreaCriteria(searchAreaCriteria);
		request.setSearchRadiusCriteria(searchRadiusCriteria);
		request.setPropertyIdInput(BSGObjectsUtil.getPropertyIdInput(propertyIdInput));
		request.setSortBy(sortBy);
		request.setFetchProperties(fetchProperties);
		request.setPropertiesCriteria(propertiesCriteria);
		request.setFetchPropertySales(fetchPropertySales);
		request.setPropertySalesCriteria(propertySalesCriteria);
		request.setFetchPropertyRecentSales(fetchPropertyRecentSales);
		request.setPropertyRecentSalesCriteria(propertyRecentSalesCriteria);
		request.setFetchPropertyOTM(fetchPropertyOTM);
		request.setPropertyOTMCriteria(propertyOTMCriteria);
		request.setFetchPropertyOTMRental(fetchPropertyOTMRental);
		request.setPropertyOTMRentalCriteria(propertyOTMRentalCriteria);
		request.setSessionToken(getSessionToken());
				
		logRequest(request);
		
		try {
			response = bean.search(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);
		validateMessages(response);

		return response;	
	}	

	@Override
	public SearchResponse search(String featureKey, SearchAreaCriteria searchAreaCriteria, SearchRadiusCriteria searchRadiusCriteria, List<Integer> propertyIdInput,
			String sortBy, Boolean fetchProperties, PropertiesCriteria propertiesCriteria, Boolean fetchPropertySales, PropertySalesCriteria propertySalesCriteria, 
			Boolean fetchPropertyRecentSales, PropertySalesCriteria propertyRecentSalesCriteria, Boolean fetchPropertyOTM, PropertyOTMCriteria propertyOTMCriteria,
			Boolean fetchPropertyOTMRental, PropertyOTMCriteria propertyOTMRentalCriteria, LoginCredentials credentials) {
		
		PropertySearchService bean = BSGBeanFactory.getPropertySearchServiceBean();
		String sessionToken = getSessionTokenFromCredentials(credentials);
		SearchResponse response = null;
		SearchRequest request = new SearchRequest();
		request.setFeatureKey(featureKey);
		request.setSearchAreaCriteria(searchAreaCriteria);
		request.setSearchRadiusCriteria(searchRadiusCriteria);
		request.setPropertyIdInput(BSGObjectsUtil.getPropertyIdInput(propertyIdInput));
		request.setSortBy(sortBy);
		request.setFetchProperties(fetchProperties);
		request.setPropertiesCriteria(propertiesCriteria);
		request.setFetchPropertySales(fetchPropertySales);
		request.setPropertySalesCriteria(propertySalesCriteria);
		request.setFetchPropertyRecentSales(fetchPropertyRecentSales);
		request.setPropertyRecentSalesCriteria(propertyRecentSalesCriteria);
		request.setFetchPropertyOTM(fetchPropertyOTM);
		request.setPropertyOTMCriteria(propertyOTMCriteria);
		request.setFetchPropertyOTMRental(fetchPropertyOTMRental);
		request.setPropertyOTMRentalCriteria(propertyOTMRentalCriteria);
		request.setSessionToken(sessionToken);	
		
		logRequest(request, credentials);
		
		try {
			response = bean.search(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);
		validateMessages(response);

		return response;		
	}
	
	public SearchResponse search(SearchRequest request, LoginCredentials credentials) {
	       
		PropertySearchService bean = BSGBeanFactory.getPropertySearchServiceBean();
		SearchResponse response = null;
		String sessionToken = getSessionTokenFromCredentials(credentials);
		request.setSessionToken(getSessionToken());
		request.setSessionToken(sessionToken);	
	               
		logRequest(request, credentials);
		
		try {
			response = bean.search(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response, credentials);
		validateMessages(response);

		return response;
	}
	
	public SearchResponse search(SearchRequest request) {
	       
		PropertySearchService bean = BSGBeanFactory.getPropertySearchServiceBean();
		SearchResponse response = null;
		request.setSessionToken(getSessionToken());
	               
		logRequest(request);
	       
		try {
			response = bean.search(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);
		validateMessages(response);

		return response;
	}

	@Override
	public GetAllUserDetailsResponse getAllUserDetails(String sessionToken) {
		UserService bean = BSGBeanFactory.getUserServiceBean();
		GetAllUserDetailsResponse response = null;
		GetAllUserDetailsRequest request = new GetAllUserDetailsRequest();
		request.setSessionToken(sessionToken);
		logRequest(request);
		try {
			response = bean.getAllUserDetails(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);
		return response;
	}

	@Override
	public GetPropertyIdFromEPReferenceResponse getPropertyIdFromEPReferenceResponse(
			GetPropertyIdFromEPReferenceRequest request) {
		PropertyService bean = BSGBeanFactory.getPropertyServiceBean();
		request.setSessionToken(getSessionToken());
		GetPropertyIdFromEPReferenceResponse response = null;
		logRequest(request);

		try {
			response = bean.getPropertyIdFromEPReference(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}
	
	public GetPropertyProfileResponse getPropertyProfile(GetPropertyProfileRequest request) {
		ValuersService bean = BSGBeanFactory.getValuersServiceBean();
		GetPropertyProfileResponse response = null;
		request.setSessionToken(getSessionToken());
		logRequest(request);
		try {
			response = bean.getPropertyProfile(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);

		validateMessages(response);

		return response;
	}
	
	@Override
	public GetPropertyMatchResponse getPropertyMatch(GetPropertyMatchRequest request) {
	       
		PropertySearchService bean = BSGBeanFactory.getPropertySearchServiceBean();
		GetPropertyMatchResponse response = null;
		request.setSessionToken(getSessionToken());
	               
		logRequest(request);
	       
		try {
			response = bean.getPropertyMatch(request);
		} catch (Exception e) {
			logger.error(e);
			throw new BsgException(throwException(ErrorMessages.REMOTE_EXCEPTION, response, e));
		}
		logResponse(response);
		validateMessages(response);

		return response;
	}
}