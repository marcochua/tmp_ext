package com.tooltwist.bsg.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.apache.log4j.Logger;

import tooltwist.misc.TooltwistConfigFile;
import tooltwist.misc.TtConfig;
import tooltwist.repository.RepositoryException;

import com.tooltwist.bsg.clientnz.OnTheMarketService;
import com.tooltwist.bsg.clientnz.OnTheMarketServiceService;
import com.tooltwist.bsg.clientnz.PropertyImageryService;
import com.tooltwist.bsg.clientnz.PropertyImageryServiceService;
import com.tooltwist.bsg.clientnz.PropertySearchService;
import com.tooltwist.bsg.clientnz.PropertySearchServiceService;
import com.tooltwist.bsg.clientnz.PropertyService;
import com.tooltwist.bsg.clientnz.PropertyServiceService;
import com.tooltwist.bsg.clientnz.PropertyStatisticsService;
import com.tooltwist.bsg.clientnz.PropertyStatisticsServiceService;
import com.tooltwist.bsg.clientnz.SalesService;
import com.tooltwist.bsg.clientnz.SalesServiceService;
import com.tooltwist.bsg.clientnz.SessionService;
import com.tooltwist.bsg.clientnz.SessionServiceService;
import com.tooltwist.bsg.clientnz.UserService;
import com.tooltwist.bsg.clientnz.UserServiceService;
import com.tooltwist.bsg.clientnz.ValuersService;
import com.tooltwist.bsg.clientnz.ValuersServiceService;
import com.tooltwist.bsg.exception.SystemException;
import com.tooltwist.bsg.util.BsgWSDLNZ;

public class BSGBeanFactoryNZ {

	private static final Logger logger = Logger.getLogger(BSGBeanFactoryNZ.class);

	private static OnTheMarketService onTheMarketServiceBean;
	private static PropertyImageryService propertyImageryServiceBean;
	private static PropertyService bsgPropertyServiceBean;
	private static PropertyStatisticsService propertyStatisticsServicesBean;
	private static SalesService salesServiceBean;
	private static SessionService sessionServiceBean;
	private static PropertySearchService propertySearchServiceBean;
	private static UserService userServiceBean = null;
	private static ValuersService valuersServiceBean = null;

	private static Properties bsgProperties;
	private static Properties bsgCredentialsProperties;
	private static Properties bsgErrorCodesProperties;
	
	protected static OnTheMarketService getOnTheMarketServiceBean() {
		if (onTheMarketServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDLNZ.ONTHEMARKET_SERVICE.getValue());
			} catch (MalformedURLException e) {
				logger.error("Error encountered while creating wsdl url. " + e.getMessage());
			}
			
			OnTheMarketServiceService service = new OnTheMarketServiceService(url);
			onTheMarketServiceBean = service.getOnTheMarketServiceSoap11();

			Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
			httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
			Map<String, Object> ctxt = ((BindingProvider) onTheMarketServiceBean).getRequestContext();
			ctxt.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);

			int connectTimeout = getTimeoutValue("bsg.connect.timeout");
			int requestTimeout = getTimeoutValue("bsg.request.timeout");

			ctxt.put("com.sun.xml.ws.connect.timeout", connectTimeout);
			ctxt.put("com.sun.xml.ws.request.timeout", requestTimeout);
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgNZ-2.0/ws/onTheMarketService/");
		}
		return onTheMarketServiceBean;
	}

	protected static PropertyImageryService getPropertyImageryServiceBean() {
		if (propertyImageryServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDLNZ.PROPERTYIMAGERY_SERVICE.getValue());
			} catch (MalformedURLException e) {
				logger.error("Error encountered while creating wsdl url. " + e.getMessage());
			}
			
			PropertyImageryServiceService service = new PropertyImageryServiceService(url);
			propertyImageryServiceBean = service.getPropertyImageryServiceSoap11();

			Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
			httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
			Map<String, Object> ctxt = ((BindingProvider) propertyImageryServiceBean).getRequestContext();
			ctxt.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);
			
			int connectTimeout = getTimeoutValue("bsg.connect.timeout");
			int requestTimeout = getTimeoutValue("bsg.request.timeout");

			ctxt.put("com.sun.xml.ws.connect.timeout", connectTimeout);
			ctxt.put("com.sun.xml.ws.request.timeout", requestTimeout);
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgNZ-2.0/ws/propertyImageryService/");
		}			
		return propertyImageryServiceBean;
	}

	protected static PropertyService getPropertyServiceBean() {
		if (bsgPropertyServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDLNZ.PROPERTY_SERVICE.getValue());
			} catch (MalformedURLException e) {
				logger.error("Error encountered while creating wsdl url. " + e.getMessage());
			}
			
			PropertyServiceService service = new PropertyServiceService(url);				
			bsgPropertyServiceBean = service.getPropertyServiceSoap11();

			Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
			httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
			Map<String, Object> ctxt = ((BindingProvider) bsgPropertyServiceBean).getRequestContext();
			ctxt.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);
			
			int connectTimeout = getTimeoutValue("bsg.connect.timeout");
			int requestTimeout = getTimeoutValue("bsg.request.timeout");

			ctxt.put("com.sun.xml.ws.connect.timeout", connectTimeout);
			ctxt.put("com.sun.xml.ws.request.timeout", requestTimeout);
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgNZ-2.0/ws/propertyService/");
		}			
		return bsgPropertyServiceBean;
	}

	protected static PropertyStatisticsService getPropertyStatisticsServicesBean() {
		if (propertyStatisticsServicesBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDLNZ.PROPERTYSTATISTICS_SERVICE.getValue());
			} catch (MalformedURLException e) {
				logger.error("Error encountered while creating wsdl url. " + e.getMessage());
			}
			
			PropertyStatisticsServiceService service = new PropertyStatisticsServiceService(url);
			propertyStatisticsServicesBean = service.getPropertyStatisticsServiceSoap11();

			Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
			httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
			Map<String, Object> ctxt = ((BindingProvider) propertyStatisticsServicesBean).getRequestContext();
			ctxt.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);

			int connectTimeout = getTimeoutValue("bsg.connect.timeout");
			int requestTimeout = getTimeoutValue("bsg.request.timeout");

			ctxt.put("com.sun.xml.ws.connect.timeout", connectTimeout);
			ctxt.put("com.sun.xml.ws.request.timeout", requestTimeout);
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgNZ-2.0/ws/propertyStatisticsService/");
		}			
		return propertyStatisticsServicesBean;
	}

	protected static SalesService getSalesServiceBean() {
		if (salesServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDLNZ.SALES_SERVICE.getValue());
			} catch (MalformedURLException e) {
				logger.error("Error encountered while creating wsdl url. " + e.getMessage());
			}
			
			SalesServiceService service = new SalesServiceService(url);
			salesServiceBean = service.getSalesServiceSoap11();

			Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
			httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
			Map<String, Object> ctxt = ((BindingProvider) salesServiceBean).getRequestContext();
			ctxt.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);

			int connectTimeout = getTimeoutValue("bsg.connect.timeout");
			int requestTimeout = getTimeoutValue("bsg.request.timeout");

			ctxt.put("com.sun.xml.ws.connect.timeout", connectTimeout);
			ctxt.put("com.sun.xml.ws.request.timeout", requestTimeout);
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgNZ-2.0/ws/salesService/");
		}
		return salesServiceBean;
	}

	protected static SessionService getSessionServiceBean() {
		if (sessionServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDLNZ.SESSION_SERVICE.getValue());
			} catch (MalformedURLException e) {
				logger.error("Error encountered while creating wsdl url. " + e.getMessage());
			}
			
			SessionServiceService service = new SessionServiceService(url);
			sessionServiceBean = service.getSessionServiceSoap11();

			Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
			httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
			Map<String, Object> ctxt = ((BindingProvider) sessionServiceBean).getRequestContext();
			ctxt.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);

			int connectTimeout = getTimeoutValue("bsg.connect.timeout");
			int requestTimeout = getTimeoutValue("bsg.request.timeout");

			ctxt.put("com.sun.xml.ws.connect.timeout", connectTimeout);
			ctxt.put("com.sun.xml.ws.request.timeout", requestTimeout);
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgNZ-2.0/ws/sessionService/");
		}
		return sessionServiceBean;
	}
	
	protected static PropertySearchService getPropertySearchServiceBean() {
		if (propertySearchServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDLNZ.PROPERTYSEARCH_SERVICE.getValue());
			} catch (MalformedURLException e) {
				logger.error("Error encountered while creating wsdl url. " + e.getMessage());
			}
			
			PropertySearchServiceService service = new PropertySearchServiceService(url);
			propertySearchServiceBean = service.getPropertySearchServiceSoap11();

			Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
			httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
			Map<String, Object> ctxt = ((BindingProvider) propertySearchServiceBean).getRequestContext();
			ctxt.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);
			
			int connectTimeout = getTimeoutValue("bsg.connect.timeout");
			int requestTimeout = getTimeoutValue("bsg.request.timeout");

			ctxt.put("com.sun.xml.ws.connect.timeout", connectTimeout);
			ctxt.put("com.sun.xml.ws.request.timeout", requestTimeout);
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgNZ-2.0/ws/propertySearchService");
		}
		return propertySearchServiceBean;		
	}

	
	protected static UserService getUserServiceBean() {
		if (userServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDLNZ.USER_SERVICE.getValue());
			} catch (MalformedURLException e) {
				logger.error("Error encountered while creating wsdl url. " + e.getMessage());
			}
			
			UserServiceService service = new UserServiceService(url);
			userServiceBean = service.getUserServiceSoap11();

			Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
			httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
			Map<String, Object> ctxt = ((BindingProvider) userServiceBean).getRequestContext();
			ctxt.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);			

			int connectTimeout = getTimeoutValue("bsg.connect.timeout");
			int requestTimeout = getTimeoutValue("bsg.request.timeout");

			ctxt.put("com.sun.xml.ws.connect.timeout", connectTimeout);
			ctxt.put("com.sun.xml.ws.request.timeout", requestTimeout);
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgNZ-2.0/ws/userService/");
		}
		return userServiceBean;	
	}
	
	protected static ValuersService getValuersServiceBean() {
		if (valuersServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDLNZ.VALUERS_SERVICE.getValue());
			} catch (MalformedURLException e) {
				logger.error("Error encountered while creating wsdl url. " + e.getMessage());
			}
			
			ValuersServiceService service = new ValuersServiceService(url);				
			valuersServiceBean = service.getValuersServiceSoap11();

			Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
			httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
			Map<String, Object> ctxt = ((BindingProvider) valuersServiceBean).getRequestContext();
			ctxt.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);			

			int connectTimeout = getTimeoutValue("bsg.connect.timeout");
			int requestTimeout = getTimeoutValue("bsg.request.timeout");

			ctxt.put("com.sun.xml.ws.connect.timeout", connectTimeout);
			ctxt.put("com.sun.xml.ws.request.timeout", requestTimeout);
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgNZ-2.0/ws/valuersService/");
		}			
		return valuersServiceBean;
	}
	
	protected static String getSessionToken() {
		return getSessionToken(false);
	}
	
	protected static String getSessionToken(boolean validateSessionToken) {
		String sessionToken = null;
		sessionToken = getBsgCredentialsProperties().getProperty("session.token").trim();
		return sessionToken;
	}
	
	protected static Properties getBsgCredentialsProperties() {
		if (bsgCredentialsProperties == null) {
			String propertiesFile = "";
			try {
				TooltwistConfigFile config = TtConfig.findConfigFile("conf", "bsg.credentials.properties");
				propertiesFile = config.getPath();
			} catch (RepositoryException e) {
				logger.error(e);
				throw new SystemException(e);
			}
			bsgCredentialsProperties = new Properties();
			File file = new File(propertiesFile);
			if (file.exists()) {
				try {
					FileInputStream fos = new FileInputStream(file);
					bsgCredentialsProperties.load(fos);
				} catch (IOException e) {
					logger.error(e);
					throw new SystemException(e);
				}
			}
		}
		return bsgCredentialsProperties;
	}
	
	protected static Properties getBsgCredentialsProperties(String tokenSource) {
		if (bsgCredentialsProperties == null) {
			String propertiesFile = "";
			try {
				TooltwistConfigFile config = TtConfig.findConfigFile("conf", tokenSource);
				propertiesFile = config.getPath();
			} catch (RepositoryException e) {
				logger.error(e);
				throw new SystemException(e);
			}
			bsgCredentialsProperties = new Properties();
			File file = new File(propertiesFile);
			if (file.exists()) {
				try {
					FileInputStream fos = new FileInputStream(file);
					bsgCredentialsProperties.load(fos);
				} catch (IOException e) {
					logger.error(e);
					throw new SystemException(e);
				}
			}
		}
		return bsgCredentialsProperties;
	}

	protected static Properties getBsgErrorCodesProperties() {
		if (bsgErrorCodesProperties == null) {
			String propertiesFile = "";
			try {
				TooltwistConfigFile config = TtConfig.findConfigFile("conf", "bsg.nz.error.codes.properties");
				propertiesFile = config.getPath();
			} catch (RepositoryException e) {
				logger.error(e);
				throw new SystemException(e);
			}
			bsgErrorCodesProperties = new Properties();
			File file = new File(propertiesFile);
			if (file.exists()) {
				try {
					FileInputStream fos = new FileInputStream(file);
					bsgErrorCodesProperties.load(fos);
				} catch (IOException e) {
					logger.error(e);
					throw new SystemException(e);
				}
			}
		}
		return bsgErrorCodesProperties;
	}
	
	protected static Properties getBsgProperties() {
		if (bsgProperties == null) {
			String propertiesFile = "";
			try {
				TooltwistConfigFile config = TtConfig.findConfigFile("conf", "bsg.properties");
				propertiesFile = config.getPath();
			} catch (RepositoryException e) {
				logger.error(e);
				throw new SystemException(e);
			}
			bsgProperties = new Properties();
			File file = new File(propertiesFile);
			if (file.exists()) {
				try {
					FileInputStream fos = new FileInputStream(file);
					bsgProperties.load(fos);
				} catch (IOException e) {
					logger.error(e);
					throw new SystemException(e);
				}
			}
		}
		return bsgProperties;
	}

	public static String getBsgProperty(String key) {
		return getBsgProperty(key, "");
	}
	
	public static int getTimeoutValue(String key) {
		try {
			String timeoutString = getBsgProperty(key, "").trim();;
			Integer timeout = Integer.parseInt(timeoutString);
			return timeout.intValue();
		} catch (Exception e) {
		}
		
		if (key.equalsIgnoreCase("bsg.connect.timeout")) {
			return 3000;
		} else if (key.equalsIgnoreCase("bsg.request.timeout")) {
			return 30000;			
		} else {
			return 0;
		}
	}
	
	public static String getBsgProperty(String key, String defaultValue) {
		String property = getBsgProperties().getProperty(key, defaultValue);
		if (key.equals("bsg.address"))
			logger.info("BSG address : " + property);
		return property;
	}
	
	protected static String getBsgErrorCode(String key) {
		return getBsgErrorCodesProperties().getProperty(key);
	}
	
	public static String getBsgErrorCode(String key, String defaultValue){
		String errorCode = getBsgErrorCode(key);
		return errorCode;
	}
	
	public static String getIntegratorId(String key){
		String integratorId = getBsgCredentialsProperties().getProperty(key).trim();
		return integratorId;
	}
	
}
