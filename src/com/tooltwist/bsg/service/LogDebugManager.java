package com.tooltwist.bsg.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.tooltwist.bsg.util.LogValue;

public class LogDebugManager implements ILogDebugManager {
	
	private static final Logger logger = Logger.getLogger(LogDebugManager.class);
	private Map<Long, List<LogValue>> logsMap = new HashMap<Long, List<LogValue>>();
	public void appendToLog(String service, long duration, long timeOfRequest, String logVal) {
		List<LogValue> logs = logsMap.get(timeOfRequest);
		if (logs == null)
			logs = new ArrayList<LogValue>();
		
		StringBuilder log = new StringBuilder();
		log.append("Called ");
		log.append(service);
		log.append(" --> ");
		log.append(duration);
		log.append(" ms");
		
		LogValue lv = new LogValue();
		lv.setLog(log.toString());
		lv.setValue(logVal);
		lv.setDuration(duration);
		
		logs.add(lv);
		logsMap.put(timeOfRequest, logs);
	}
	
	public void addError(String service, long timeOfRequest, String message) {
		List<LogValue> logs = logsMap.get(timeOfRequest);
		if (logs == null)
			logs = new ArrayList<LogValue>();
		
		StringBuilder log = new StringBuilder();
		log.append("Error encountered for \"").append(service).append("\" ---> ");
		log.append("(");
		log.append(message);
		log.append(")");
		
		LogValue lv = new LogValue();
		lv.setLog(log.toString());
		lv.setValue("");
		
		logs.add(lv);
		logsMap.put(timeOfRequest, logs);
	}
	
	public void init(String service, long timeOfRequest) {
		List<LogValue> logs = logsMap.get(timeOfRequest);
		if (logs == null)
			logs = new ArrayList<LogValue>();
		
		StringBuilder log = new StringBuilder();
		log.append("MSG Service : \"").append(service).append("\"");
		LogValue lv = new LogValue();
		lv.setLog(log.toString());
		lv.setValue("");
		
		logs.add(lv);
		logsMap.put(timeOfRequest, logs);
	}
	
	public List<LogValue> getLogs(long timeOfRequest) {
		return logsMap.get(timeOfRequest);
	}
	
	public void clearLogs(long timeOfRequest) {
		logsMap.remove(timeOfRequest);
	}
	
	public void logJsonInput(Object input, String op){
		if (isLogJson())
			logger.debug("JSON input MSG method: [" + op + "] ---> " + new Gson().toJson(input));
	}
	
	public void logJsonOutput(Object output, String op){
		if (isLogJson())
			logger.debug("JSON output MSG method: [" + op + "] ---> " + new Gson().toJson(output));
	}
	
	public void logJsonInput(Object input, String op, String logIdentifier){
		if (isLogJson())
			logger.debug(logIdentifier + "JSON input MSG method: [" + op + "] ---> " + new Gson().toJson(input));
	}
	
	public void logJsonOutput(Object output, String op, String logIdentifier){
		if (isLogJson())
			logger.debug(logIdentifier + "JSON output MSG method: [" + op + "] ---> " + new Gson().toJson(output));
	}
	
	private boolean isLogJson() {
		return Boolean.valueOf(BSGBeanFactory.getBsgProperty("log.msg.transactions"));
	}
	
}
