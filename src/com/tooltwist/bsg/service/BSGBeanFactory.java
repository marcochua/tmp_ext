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

import com.tooltwist.bsg.client.AuGovernmentStatisticsService;
import com.tooltwist.bsg.client.AuGovernmentStatisticsServiceService;
import com.tooltwist.bsg.client.OnTheMarketService;
import com.tooltwist.bsg.client.OnTheMarketServiceService;
import com.tooltwist.bsg.client.PropertyImageryService;
import com.tooltwist.bsg.client.PropertyImageryServiceService;
import com.tooltwist.bsg.client.PropertySearchService;
import com.tooltwist.bsg.client.PropertySearchServiceService;
import com.tooltwist.bsg.client.PropertyService;
import com.tooltwist.bsg.client.PropertyServiceService;
import com.tooltwist.bsg.client.PropertyStatisticsService;
import com.tooltwist.bsg.client.PropertyStatisticsServiceService;
import com.tooltwist.bsg.client.SalesService;
import com.tooltwist.bsg.client.SalesServiceService;
import com.tooltwist.bsg.client.SessionService;
import com.tooltwist.bsg.client.SessionServiceService;
import com.tooltwist.bsg.client.UserService;
import com.tooltwist.bsg.client.UserServiceService;
import com.tooltwist.bsg.client.ValuersService;
import com.tooltwist.bsg.client.ValuersServiceService;
import com.tooltwist.bsg.exception.SystemException;
import com.tooltwist.bsg.util.BsgWSDL;

public class BSGBeanFactory {

	private static final Logger logger = Logger.getLogger(BSGBeanFactory.class);

	private static AuGovernmentStatisticsService auGovernmentStatisticsServiceBean = null;
	private static OnTheMarketService onTheMarketServiceBean = null;
	private static PropertyImageryService propertyImageryServiceBean = null;
	private static PropertyService bsgPropertyServiceBean = null;
	private static PropertyStatisticsService propertyStatisticsServicesBean = null;
	private static SalesService salesServiceBean = null;
	private static SessionService sessionServiceBean = null;
	private static PropertySearchService propertySearchServiceBean = null;
	private static UserService userServiceBean = null;
	private static ValuersService valuersServiceBean = null;

	private static Properties bsgProperties = null;
	private static Properties bsgCredentialsProperties = null;
	private static Properties bsgErrorCodesProperties = null;
	

	protected static AuGovernmentStatisticsService getAuGovernmentStatisticsServiceBean() {
		if (auGovernmentStatisticsServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDL.AUGOVERMENT_SERVICE.getValue());
			} catch (MalformedURLException e) {
				logger.error("Error encountered while creating wsdl url. " + e.getMessage());
			}
			
			
			AuGovernmentStatisticsServiceService service = new AuGovernmentStatisticsServiceService(url);
			auGovernmentStatisticsServiceBean = service.getAuGovernmentStatisticsServiceSoap11();
			
			Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
			httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
			Map<String, Object> ctxt = ((BindingProvider) auGovernmentStatisticsServiceBean).getRequestContext();
			ctxt.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);
			
			int connectTimeout = getTimeoutValue("bsg.connect.timeout");
			int requestTimeout = getTimeoutValue("bsg.request.timeout");

			ctxt.put("com.sun.xml.ws.connect.timeout", connectTimeout);
			ctxt.put("com.sun.xml.ws.request.timeout", requestTimeout);
			 
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgAU-2.0/ws/auGovernmentStatisticsService/");
		}			
		return auGovernmentStatisticsServiceBean;
	}

	protected static OnTheMarketService getOnTheMarketServiceBean() {
		if (onTheMarketServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDL.ONTHEMARKET_SERVICE.getValue());
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

			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgAU-2.0/ws/onTheMarketService/");
		}
		return onTheMarketServiceBean;
	}

	protected static PropertyImageryService getPropertyImageryServiceBean() {
		if (propertyImageryServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDL.PROPERTYIMAGERY_SERVICE.getValue());
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
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgAU-2.0/ws/propertyImageryService/");
		}			
		return propertyImageryServiceBean;
	}

	protected static PropertyService getPropertyServiceBean() {
		if (bsgPropertyServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDL.PROPERTY_SERVICE.getValue());
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
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgAU-2.0/ws/propertyService/");
		}			
		return bsgPropertyServiceBean;
	}

	protected static PropertyStatisticsService getPropertyStatisticsServicesBean() {
		if (propertyStatisticsServicesBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDL.PROPERTYSTATISTICS_SERVICE.getValue());
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
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgAU-2.0/ws/propertyStatisticsService/");
		}			
		return propertyStatisticsServicesBean;
	}

	protected static SalesService getSalesServiceBean() {
		if (salesServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDL.SALES_SERVICE.getValue());
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
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgAU-2.0/ws/salesService/");
		}
		return salesServiceBean;
	}

	protected static SessionService getSessionServiceBean() {
		if (sessionServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDL.SESSION_SERVICE.getValue());
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
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgAU-2.0/ws/sessionService/");
		}
		return sessionServiceBean;
	}
	
	protected static PropertySearchService getPropertySearchServiceBean() {
		if (propertySearchServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDL.PROPERTYSEARCH_SERVICE.getValue());
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
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgAU-2.0/ws/propertySearchService");
		}
		return propertySearchServiceBean;		
	}

	protected static UserService getUserServiceBean() {
		if (userServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDL.USER_SERVICE.getValue());
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
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgAU-2.0/ws/userService/");
		}
		return userServiceBean;	
	}
	
	protected static ValuersService getValuersServiceBean() {
		if (valuersServiceBean == null){
			
			URL url = null;
			String bsgAddress = getBsgProperty("bsg.address").trim();
			try {
				url = new URL(bsgAddress + BsgWSDL.VALUERS_SERVICE.getValue());
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
			
			ctxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, bsgAddress + "/bsgAU-2.0/ws/valuersService/");
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

	protected static String getSessionToken(String key) {
		String sessionToken = null;
		sessionToken = getBsgCredentialsProperties().getProperty(key).trim();
		return sessionToken;
	}
	
	protected static Properties getBsgCredentialsProperties() {
		if (bsgCredentialsProperties == null) {
			String propertiesFile = "";
			try {
				//propertiesFile = TtConfig.cfgFilename("conf", "bsg.credentials.properties");
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
				//propertiesFile = TtConfig.cfgFilename("conf", tokenSource);
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
				//propertiesFile = TtConfig.cfgFilename("conf", "bsg.error.codes.properties");
				TooltwistConfigFile config = TtConfig.findConfigFile("conf", "bsg.error.codes.properties");
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
				//propertiesFile = TtConfig.cfgFilename("conf", "bsg.properties");
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
	
	protected static Properties getBsgProperties(String fileName) {
		if (bsgProperties == null) {
			String propertiesFile = "";
			try {
				//propertiesFile = TtConfig.cfgFilename("conf", "bsg.properties");
				TooltwistConfigFile config = TtConfig.findConfigFile("conf", fileName);
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
	
	public static String getBsgProperty(String fileName, String key, String defaultValue) {
		String property = getBsgProperties(fileName).getProperty(key, defaultValue);
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