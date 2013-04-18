package tooltwist.rpbsg.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

import com.tooltwist.bsg.client.BsgPropertyAttributes;
import com.tooltwist.bsg.clientnz.PropertyAttributes;

public class StringUtils extends org.apache.commons.lang.StringUtils {
	private static final Logger logger = Logger.getLogger(StringUtils.class);
	
	public static String getWebappPrefix() {
		String webappPrefix = WebUtils.getWbdProperty(DataBlockUtil.WEBAPP_PREFIX_FIELD, StringUtils.EMPTY);
		if (StringUtils.isEmpty(webappPrefix)) {
			webappPrefix = DataBlockUtil.DEFAULT_WEBAPP_PREFIX;
		}
		return webappPrefix;
	}
	
	public static String trimResponseStartsWith(String jsonResponse ,String nodeName) {
		String trimmedResponse = StringUtils.EMPTY;
		if (StringUtils.isNotEmpty(jsonResponse) &&
				jsonResponse.contains(nodeName)) {
			
			char brace = '{';
			char block = '[';
			Integer startIndex = jsonResponse.indexOf(nodeName) + nodeName.length();
			for (Integer loopCounter = startIndex; loopCounter <= jsonResponse.length(); loopCounter++) {
				if (jsonResponse.charAt(loopCounter) == brace ||
						jsonResponse.charAt(loopCounter) == block) {
					startIndex = loopCounter;
					break;
				}
			}
			if (jsonResponse.charAt(startIndex) == brace ||
					jsonResponse.charAt(startIndex) == block) {
				
				String openTag = "{";
				String closeTag = "}";
				Integer skipCount = 0;
				if (jsonResponse.charAt(startIndex) == block) {
					openTag = "[{";
					closeTag = "}]";
				}
				Integer endIndex = startIndex + openTag.length();
				while (endIndex < jsonResponse.length()) {
					Integer openTagIndex = jsonResponse.indexOf(openTag, endIndex);
					Integer closeTagIndex = jsonResponse.indexOf(closeTag, endIndex);
					if (openTagIndex >= 0 && openTagIndex < closeTagIndex) {
						endIndex = openTagIndex + openTag.length();
						skipCount++;
					} else if (skipCount == 0) {
						endIndex = closeTagIndex + closeTag.length();
						break;
					} else {
						endIndex = closeTagIndex + closeTag.length();
						skipCount--;
					}
				}
				trimmedResponse = jsonResponse.substring(startIndex, endIndex);
			}
		}
		return trimmedResponse;
	}
	
	public static String getLandArea(String landArea) throws Exception {
		Boolean isHectare = false;
		if (!StringUtils.isEmpty(landArea) && StringUtils.isNumeric(landArea)
				&& landArea.length() > 4) {
			
			Double area = Double.parseDouble(landArea);
			Integer decimalPointIndex = area.toString().indexOf(".");
			if (decimalPointIndex > 4) {
				area = area / 10000;
				isHectare = true;
			}
			decimalPointIndex = area.toString().indexOf(".");
			area = MathUtils.round(area, (4 - decimalPointIndex));
			landArea = area.toString();
		}
		if (isHectare) {
			landArea = landArea.concat("Ha");
		} else {
			landArea = landArea.concat("m<sup>2</sup>");
		}
		
		return landArea;
	}
	
	public static String formatString(String value, String defaultValue) {
		if (StringUtils.isEmpty(value)) {
			return defaultValue;
		}
		return value;
	}
	
	public static Integer formatNumber(String number, Integer defaultValue) {
		if (StringUtils.isNotEmpty(number)
				&& StringUtils.isNumeric(number)) {
			return Integer.parseInt(number);
		}
		return defaultValue;
	}
	
	public static String formatDate(String date, String dateFormat, String defaultValue) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		
		date = (StringUtils.isNotEmpty(date) ? date : defaultValue);
		if (StringUtils.isNotEmpty(date)) {
			Date convertedDate = format.parse(date);
			return format.format(convertedDate);
		}
		return StringUtils.EMPTY;
	}
	
	public static String formatPrice(String price, Double defaultValue) {
		DecimalFormat formatOutput = new DecimalFormat("###,###,##0");
		if (StringUtils.isNotEmpty(price)
				&& !price.equalsIgnoreCase("null")) {
			return "$" + formatOutput.format(Double.parseDouble(price));
		}
		return "$" + formatOutput.format(defaultValue);
	}
	
	public static InputStream parseStringToIS(String content){
		if (content == null) {
			return null;
		}
		content = content.trim();
		InputStream in = null;
		try {
			in = new ByteArrayInputStream(content.getBytes("UTF-8"));
		} catch(Exception ex) {
			logger.error(ex.getMessage());
		}
		return in;
	}
	
	public static String parseISToString(String fileName) {
		BufferedReader bufferedReader = null;
		StringBuffer sb = new StringBuffer();
		try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
            	sb.append(line);
            }
        } catch (FileNotFoundException ex) {
        	logger.error(ex.getMessage());
        } catch (IOException ex) {
        	logger.error(ex.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
            	logger.error(ex.getMessage());
            }
        }
		return sb.toString();
	}
	
	public static String formatRPID(String referenceId) {
		String rpid = StringUtils.EMPTY;
		int idx = referenceId.indexOf(":");
		String state = referenceId.substring(0, idx);

		String[] split = referenceId.split("-");
		rpid = state + ":" + split[1];
		return rpid;
	}

	public static String formatRunDate(String runDate) {
		int idx = runDate.indexOf("T");
		String date = runDate.substring(0, idx);
		SimpleDateFormat df = new SimpleDateFormat(DataBlockUtil.DB_DATE_FORMAT);
	    try {
            Date parsed = df.parse(date);
    		SimpleDateFormat df2 = new SimpleDateFormat(DataBlockUtil.RPM_DATE_FORMAT);
            return df2.format(parsed);
        } catch (ParseException pe) {
        	return StringUtils.EMPTY;
        }
	}
	
	public static String formatDistance(Double distance) {
		if (distance >= 0.005 && distance < 0.1) {
			distance = 0.1;
		}
		
		DecimalFormat formatOutput = new DecimalFormat("#0.00");
		DecimalFormat format = new DecimalFormat("#0.0###");
		String decimalPart = format.format(distance * 10).split("\\.")[1];
		Double decimal = Double.parseDouble(decimalPart);

		if (decimal > 5.0) {
			formatOutput.setRoundingMode(RoundingMode.UP);
		} else {
			formatOutput.setRoundingMode(RoundingMode.DOWN);
		}
		return formatOutput.format(distance);
	}

	public static String formatDate(XMLGregorianCalendar xmlCal) {
		if (xmlCal != null) {
			int idx = xmlCal.toString().indexOf("T");
			String date = xmlCal.toString().substring(0, idx);
			SimpleDateFormat df = new SimpleDateFormat(DataBlockUtil.DB_DATE_FORMAT);
		    try {
	            Date parsed = df.parse(date);
	    		SimpleDateFormat df2 = new SimpleDateFormat(DataBlockUtil.DATE_FORMAT2);
	            return df2.format(parsed);
	        } catch (ParseException pe) {
	        	return StringUtils.EMPTY;
	        }
		} else {
			return StringUtils.EMPTY;
		}
	}
	
	public static String formatDate(XMLGregorianCalendar xmlCal, String format) {
		if (xmlCal != null) {
			int idx = xmlCal.toString().indexOf("T");
			String date = xmlCal.toString().substring(0, idx);
			SimpleDateFormat df = new SimpleDateFormat(DataBlockUtil.DB_DATE_FORMAT);
		    try {
	            Date parsed = df.parse(date);
	    		SimpleDateFormat df2 = new SimpleDateFormat(format);
	            return df2.format(parsed);
	        } catch (ParseException pe) {
	        	return StringUtils.EMPTY;
	        }
		} else {
			return StringUtils.EMPTY;
		}
	}
	
	public static List<Integer> getCategories(String values) {
		List<Integer> categories = new ArrayList<Integer>();
		int category = 0;
		try {
			category = Integer.parseInt(values);
		} catch (NumberFormatException ex) {
			logger.error(ex.getMessage());
		}
		categories.add(category);
		return categories;
	}
	
	public static Date parseDate(String date, String format) {
		DateFormat dateFormat = new SimpleDateFormat(DataBlockUtil.DATE_TIME_FORMAT);
		DateFormat sourceFormat = new SimpleDateFormat(format);
		try {
			return dateFormat.parse(dateFormat.format(sourceFormat.parse(date + ":00")));
		} catch (ParseException ex) {
			logger.error(ex.getMessage());
		}
		return null;
	}
	
	public static Calendar parseCalendar(String date, String format) {
		Calendar cal = Calendar.getInstance();
	    Date parseDate = parseDate(date, format);
	    cal.setTime(parseDate);
	    return cal;
	}
	
	public static XMLGregorianCalendar parseXMLGregorianCalendar(Calendar cal) throws DatatypeConfigurationException {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.set(year, month, day, 0, 0, 0);
		XMLGregorianCalendar xmlCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
		return xmlCal;
	}
	
	public static String formatNumber(Object obj) {
		return (obj == null ? "0" : obj.toString());
	}
	
	public static String formatPrice(Double price) {
		if (price == null || price < 0) {
			price = 0.0;
		}
		DecimalFormat formatOutput = new DecimalFormat("###,###,##0");
		return "$" + formatOutput.format(price);
	}
	
	public static String formatPrice(Integer price) {
		if (price == null || price < 0) {
			price = 0;
		}
		DecimalFormat formatOutput = new DecimalFormat("###,###,##0");
		return "$" + formatOutput.format(price);
	}
	
	public static String formatLotPlan(String lotPlan) {
		if (lotPlan != null) {
			int separatorLotPlan = lotPlan.indexOf(" ");
			if (separatorLotPlan > -1) {
				lotPlan = "L" + lotPlan.substring(0, separatorLotPlan);	
			} else {
				lotPlan = "L" + lotPlan;	
			}
		} else {
			lotPlan = StringUtils.EMPTY;	
		}
		return lotPlan;
	}
	
	public static String getBsgXpcLogSuccess(Long timeOfRequest, String xpcName, String webServiceName, String parameters) {
		//|BSG-call-log|xpc-name|webservice-name|timeinMS|parameters(optional)|
		String logFormat = "|BSG-call-log|%s|%s|%s|%s|";
		Long endTimeOfRequest = System.currentTimeMillis();
		Long totalTime = endTimeOfRequest - timeOfRequest;
		String log = String.format(logFormat, xpcName, webServiceName, totalTime, parameters);
		
		return log;
	}
	
	public static String getBsgXpcLogError(Long timeOfRequest, String xpcName, String webServiceName, String parameters, String errorMessage) {
		//|BSG-call-log|xpc-name|webservice-name|timeinMS|parameters(optional)|errorMessage|
		String logFormat = "|BSG-call-log|%s|%s|%s|%s|%s|";
		Long endTimeOfRequest = System.currentTimeMillis();
		Long totalTime = endTimeOfRequest - timeOfRequest;
		String log = String.format(logFormat, xpcName, webServiceName, totalTime, parameters, errorMessage);
		
		return log;	
	}
	
	public static String formatText(String text) {
		return (text == null ? StringUtils.EMPTY : text);
	}
	
	public static String formatText(Boolean value) {
		return (value == true ? "true" : "false");
	}
	
	public static String formatPropertyAttributes(PropertyAttributes propertyAttributes) {
		StringBuffer attributes = new StringBuffer();
		if (propertyAttributes != null) {
			if (propertyAttributes.getBedrooms() != null) {
				attributes.append(propertyAttributes.getBedrooms()).append(" BED");
			}
			if (propertyAttributes.getBathrooms() != null) {
				attributes.append(", ").append(propertyAttributes.getBathrooms()).append(" BATH");
			}
			if (propertyAttributes.getCarSpaces() != null) {
				attributes.append(", ").append(propertyAttributes.getCarSpaces()).append(" CAR");
			}
			if (propertyAttributes.getLockUpGarage() != null) {
				attributes.append(", ").append(propertyAttributes.getLockUpGarage()).append(" LUG");
			}
		}
		return attributes.toString().trim();
	}
	
	public static String formatPropertyAttributes(BsgPropertyAttributes propertyAttributes) {
		StringBuffer attributes = new StringBuffer();
		if (propertyAttributes != null) {
			if (propertyAttributes.getBedrooms() != null) {
				attributes.append(propertyAttributes.getBedrooms()).append(" BED");
			}
			if (propertyAttributes.getBathrooms() != null) {
				attributes.append(", ").append(propertyAttributes.getBathrooms()).append(" BATH");
			}
			if (propertyAttributes.getCarSpaces() != null) {
				attributes.append(", ").append(propertyAttributes.getCarSpaces()).append(" CAR");
			}
			if (propertyAttributes.getLockUpGarage() != null) {
				attributes.append(", ").append(propertyAttributes.getLockUpGarage()).append(" LUG");
			}
		}
		return attributes.toString().trim();
	}
	
}