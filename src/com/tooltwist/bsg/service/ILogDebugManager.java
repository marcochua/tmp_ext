package com.tooltwist.bsg.service;

import java.util.List;

import com.tooltwist.bsg.util.LogValue;

public interface ILogDebugManager {

	List<LogValue> getLogs(long timeOfRequest);

	void appendToLog(String service, long duration, long timeOfRequest, String logVal);

	void addError(String service, long timeOfRequest, String message);

	void clearLogs(long timeOfRequest);

	void init(String service, long timeOfRequest);
	
	void logJsonInput(Object input, String op);
	
	void logJsonOutput(Object output, String op);

	void logJsonInput(Object input, String op, String logIdentifier);
	
	void logJsonOutput(Object output, String op, String logIdentifier);
}
