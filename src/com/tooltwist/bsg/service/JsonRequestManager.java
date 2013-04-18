package com.tooltwist.bsg.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.tooltwist.bsg.exception.InvalidParameterException;
import com.tooltwist.bsg.exception.SystemException;
import com.tooltwist.bsg.json.JsonRequest;
import com.tooltwist.bsg.util.RequestUtils;

@SuppressWarnings("unchecked")
public class JsonRequestManager implements IJsonRequestManager {
	
	private static final Logger logger = Logger.getLogger(JsonRequestManager.class);
	
	public JsonRequest getJsonRequestDebug(HttpServletRequest request) {
		logger.info("Parsing request parameters to JSON (DEBUG)");
		RequestUtils.dumpHeaders(request);
		
		JsonRequest jsonRequest = new JsonRequest();
		jsonRequest.setService(RequestUtils.getParam(request, "op", ""));
		jsonRequest.setUserId(RequestUtils.getParam(request, "uid", ""));
		
		Enumeration<String> names = request.getParameterNames();
		logger.info("hasParameters : " + names.hasMoreElements());
		
		JsonObject jsonObject = new JsonObject();
		String  strRequestElement = "";
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String value = RequestUtils.getParam(request, name, "");
			logger.info("param name : " + name + "; value : " + value);
			jsonObject.addProperty(name, value);
			strRequestElement = strRequestElement + (name + ":"+ (value.trim().length() <= 0 ? "<empty>" : value)) +",";
		}
		jsonRequest.setJsonObject(jsonObject);
		jsonRequest.setStringElement(strRequestElement);
		
		return jsonRequest;
	}
	
	public JsonRequest getJsonRequest(HttpServletRequest request, boolean debug) {
		if (debug)
			return getJsonRequestDebug(request);
		
		logger.info("Parsing request parameters to JSON");
		RequestUtils.dumpHeaders(request);
		
		BufferedReader reader;
		try {
			reader = request.getReader();
		} catch (IOException e) {
			logger.error(e);
			throw new SystemException();
		}
		
		if (reader == null) {
			logger.error("BufferedReader from HttpServletRequest is null");
			throw new InvalidParameterException("\"No parameter stream was found in the body of the request.  Please encode your parameter and submit it through the body.\"");
		}
		
		StringBuilder inputString = new StringBuilder();
		try {
			String input;
			while((input = reader.readLine()) != null)
				inputString.append(input);
		} catch (IOException e) {
			logger.error(e);
			throw new SystemException();
		}
		String jsonString = inputString.toString();
		logger.info("JSON : " + jsonString);
		
		if (jsonString.length() <= 0) {
			logger.error("input string is empty");
			throw new InvalidParameterException("\"You seem to have submitted an empty parameter string.  Please make sure your input string is not empty.\"");
		}
		
		JsonObject jsonObject = null;
		try {
			jsonObject = (JsonObject) new JsonParser().parse(jsonString);
		} catch (JsonParseException e) {
			logger.error(e);
			throw new InvalidParameterException("\"The JSON attachment is invalid or cannot be parsed into a JSON object.  Please make sure you send a valid JSON attachment.\"");
		}
		
		return new JsonRequest(jsonObject);
	}
	
	public JsonRequest getJsonUploadRequest(HttpServletRequest request, boolean debug) {
		if (debug)
			return getJsonRequestDebug(request);
		
		Enumeration<String> headers = request.getHeaderNames();
		boolean hasHeaders = headers.hasMoreElements();
		logger.info("hasHeaders : " + hasHeaders);
		while (headers.hasMoreElements()) {
			String header = headers.nextElement();
			String headerValue = request.getHeader(header);
			logger.info("header : " + header + ", value : " + headerValue);
		}
		
		JsonRequest jsonRequest;
		if (ServletFileUpload.isMultipartContent(request)) {
			FileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			List<FileItem> items;
			try {
				items = upload.parseRequest(request);
			} catch (FileUploadException e) {
				logger.error(e);
				throw new SystemException(e);
			}
			
			jsonRequest = new JsonRequest();
			
			Iterator<FileItem> i = items.iterator();
			while (i.hasNext()) {
				FileItem item = i.next();
				String fieldName = item.getFieldName();
				String fieldValue = item.getString();
				logger.info("parameter fieldName : " + fieldName + "; fieldValue : " + fieldValue);
				if (item.isFormField() && !fieldValue.equals("")) {
					if (fieldName.equals("op"))
						jsonRequest.setService(fieldValue);
					else if (fieldName.equals("uid"))
						jsonRequest.setUserId(fieldValue);
					
				} else {
					logger.info("file attachment found");
					
					String jsonString = new String(item.get());
					logger.info("attachment content : " + jsonString + "");
					
					JsonParser parser = new JsonParser();
					JsonObject jsonObject;
					try {
						jsonObject = (JsonObject) parser.parse(jsonString);
					} catch (JsonParseException e) {
						logger.error(e);
						throw new InvalidParameterException("\"The JSON attachment is invalid or cannot be parsed into a JSON object.  Please make sure you send a valid JSON attachment.\"");
					}
					jsonRequest.setJsonObject(jsonObject);
				}
			}
		} else {
			logger.error("The submitted request is not multipart/form-data.");
			throw new InvalidParameterException("\"Expecting a JSON attachment but we got a POSTED parameter.  Please try with a JSON attachment.\"");
		}
		return jsonRequest;
	}
	
}
