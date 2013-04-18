package com.tooltwist.bsg.util;

import java.util.Enumeration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@SuppressWarnings("unchecked")
public class RequestUtils {

	private static final Logger logger = Logger.getLogger(RequestUtils.class);

	public static int getParam(HttpServletRequest request, String param, int defaultValue) {
		try {
			String value = request.getParameter(param);
			return Integer.parseInt(value);
		} catch (Exception e) {
		}
		return defaultValue;
	}
	
	public static Long getLongParam(HttpServletRequest req, String param, int defaultValue) {
		try {
			String value = req.getParameter(param);
			return new Long(value);
		} catch (Exception e) {
		}
		return new Long(defaultValue);
	}
	
	public static double getParam(HttpServletRequest request, String param, double defaultValue) {
		try {
			String value = request.getParameter(param);
			return Double.valueOf(value);
		} catch (Exception e) {
		}
		return defaultValue;
	}

	public static String getParam(HttpServletRequest request, String param, String defaultValue) {
		String value = request.getParameter(param);
		if (value != null) {
			value = value.trim();
		}
		return (StringUtils.isEmpty(value)) ? defaultValue : value;
	}
	
	public static String[] getParamValues(HttpServletRequest request, String param) {
		return request.getParameterValues(param);
	}
	
	public static Integer[] getParamValuesInt(HttpServletRequest request, String param) {
		String[] values = getParamValues(request, param);
		Integer[] intValues = new Integer[0];
		if (values != null) {
			intValues = new Integer[values.length];
			for (int i = 0; i < values.length; i++) {
				int val = 0;
				try {
					val = Integer.parseInt(values[i]);
				} catch (NumberFormatException e) {
				}
				intValues[i] = val;
			}
		}
		return intValues;
	}

	/**
	 * get cookie specified by name
	 * @param request
	 * @param cookieName
	 * @return
	 */
	public static Cookie getCookie(HttpServletRequest request, String name) {
		logger.info("Entering RequestUtils.getCookie...");
		logger.info("name : [" + name + "]");
		
		Cookie[] cookies = request.getCookies();
		
		if (cookies == null) {
			logger.info("cookies is null");
			return new Cookie(name, "");
		}
		
		logger.info("cookies is not null");
		Cookie theCookie = null;
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals(name)) {
				logger.info("Found cookie : " + cookies[i].toString());
				theCookie = cookies[i];
				break;
			}
		}
		if (theCookie == null) {
			logger.info("did not find cookie...");
			theCookie = new Cookie(name, "");
		}

		return theCookie;
	}

	public static void addCookie(HttpServletResponse response, String name, String value) {
		Cookie cookie = new Cookie(name, value);
		//-1 means it will be invalid where browser is close
		cookie.setMaxAge(-1);
		cookie.setPath("/");
		response.addCookie(cookie);
	}

	public static void addCookie(HttpServletResponse response, String name, String value, int age) {
		Cookie cookie = new Cookie(name, value);
		//-1 means it will be invalid where browser is close
		cookie.setMaxAge(age);
		cookie.setPath("/");
		response.addCookie(cookie);
	}

	public static void delCookie(HttpServletResponse response, String name) {
		Cookie cookie = new Cookie(name, null);
		//0 means it will be delete
		cookie.setMaxAge(0);
		cookie.setPath("/");
		response.addCookie(cookie);
	}
	
	public static int getAttribute(HttpServletRequest req, String param, int defaultValue) {
		try {
			Object obj = req.getAttribute(param);
			if (obj != null) {
				return (Integer) obj;
			} else {
				return defaultValue;
			}
		} catch (Exception e) {
			return defaultValue;
		}
	}
	
	public static void dumpHeaders(HttpServletRequest request) {
		Enumeration<String> headers = request.getHeaderNames();
		logger.info("hasHeaders : " + headers.hasMoreElements());
		while (headers.hasMoreElements()) {
			String header = headers.nextElement();
			logger.info("header : " + header + ", value : " + request.getHeader(header));
		}
	}
	
}
