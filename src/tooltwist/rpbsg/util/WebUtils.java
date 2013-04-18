package tooltwist.rpbsg.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import tooltwist.misc.JspHelper;
import tooltwist.wbd.WbdCache;

import com.dinaa.DinaaException;
import com.dinaa.ui.UimData;
import com.dinaa.ui.UimHelper;

public class WebUtils {
	private static final Logger logger = Logger.getLogger(WebUtils.class);

	private static HttpServletRequest staticRequest = null;
	private static HttpServletResponse staticResponse = null;

	private static String SCHEME_HTTPS = "https:";
	private static String SCHEME_HTTP = "http:";
	private static String COLON = ":";
	
	public static String getParam(HttpServletRequest request, SessionVariables var, String defaultValue) {
		String paramName = var.getName();
		String value = request.getParameter(paramName);
		if (value != null) {
			value = value.trim();
		}
		return (StringUtils.isEmpty(value)) ? defaultValue : value;
	}
	
	public static String getParam(HttpServletRequest request, String paramName, String defaultValue) {
		String value = request.getParameter(paramName);
		if (value != null) {
			value = value.trim();
		}
		return (StringUtils.isEmpty(value)) ? defaultValue : value;
	}

	public static void setAttribute(HttpServletRequest request, SessionVariables var, Object paramValue) {
		try {
			String paramName = var.getName();
			request.getSession().setAttribute(paramName, paramValue);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
	}

	public static void setAttributeString(HttpServletRequest request, SessionVariables var, String paramValue) {
		try {
			String paramName = var.getName();
			request.getSession().setAttribute(paramName, paramValue);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
	}

	public static void removeAttribute(HttpServletRequest request, SessionVariables var) {
		try {
			String paramName = var.getName();
			request.getSession().removeAttribute(paramName);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
	}

	public static Object getAttribute(HttpServletRequest request, SessionVariables var) {
		try {
			String paramName = var.getName();
			return request.getSession().getAttribute(paramName);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
		return null;
	}

	public static String getAttribute(HttpServletRequest request, SessionVariables var, String defaultValue) {
		try {
			String paramName = var.getName();
			Object obj = request.getSession().getAttribute(paramName);
			if (obj != null) {
				return String.valueOf(obj);
			} else {
				return defaultValue;
			}
		} catch (Exception ex) {
			return defaultValue;
		}
	}

	public static HttpServletResponse getHttpServletResponse(UimData ud) {
		if (ud == null) {
			return staticResponse;
		}
		else if (ud instanceof UimHelper) {
			return ((UimHelper) ud).getResponse();
		}
		else if (ud instanceof JspHelper) {
			return ((JspHelper) ud).getResponse();
		}
		else {
			return null;
		}
	}

	public static HttpServletRequest getHttpServletRequest(UimData ud) {
		if (ud == null) {
			return staticRequest;
		}
		else if (ud instanceof UimHelper) {
			return ((UimHelper) ud).getRequest();
		}
		else if (ud instanceof JspHelper) {
			return ((JspHelper) ud).getRequest();
		}
		else {
			return null;
		}
	}
	
	public static String getWbdProperty(String propertyName, String defaultValue) {
		String propertyValue = StringUtils.EMPTY;
		try {
			WbdCache.initialiseIfNecessary_minimal();
			propertyValue = WbdCache.getProperty(propertyName);
			if (StringUtils.isNotEmpty(propertyValue)) {
				propertyValue = propertyValue.trim();
			}
			return propertyValue;
		} catch (DinaaException ex) {
			logger.error(ex.getMessage());
			return defaultValue;
		}
	}
	
	public static String changeSchemeToHttp(String url) {
		String urlNoScheme = url;
		if (url.startsWith(SCHEME_HTTPS)) {
			int colonIndex = url.indexOf(COLON) + 1;
			urlNoScheme = SCHEME_HTTP + url.substring(colonIndex);
		}
		
		return urlNoScheme;
	}
}
