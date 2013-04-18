package com.tooltwist.bsg.service;

public class BsgServiceFactory {
	
	private static ILogDebugManager logDebugManager = null;
	private static IEmailManager emailManager = null;
	private static IPdfManager pdfManager = null;
	private static IJsonRequestManager jsonRequestManager = null;
	
	public static IBsgManager getBsgManager(long timeOfRequest) {
		return new BsgManager(timeOfRequest);
	}
	
	public static IBsgManager getBsgManager() {
		return getBsgManager(System.currentTimeMillis());
	}
	
	public static IBsgManager getBsgManager(long timeOfRequest, String sid) {
		return new BsgManager(timeOfRequest, sid);
	}
	
	public static IBsgManager getBsgManager(String sid) {
		return getBsgManager(System.currentTimeMillis(), sid);
	}

	public static ILogDebugManager getLogDebugManager() {
		if (logDebugManager == null)
			logDebugManager = new LogDebugManager();
		return logDebugManager;
	}

	public static IEmailManager getEmailManager() {
		if (emailManager == null)
			emailManager = new EmailManager();
		return emailManager;
	}

	public static IPdfManager getPdfManager() {
		if (pdfManager == null)
			pdfManager = new PdfManager();
		return pdfManager;
	}

	public static IJsonRequestManager getJsonRequestManager() {
		if (jsonRequestManager == null)
			jsonRequestManager = new JsonRequestManager();
		return jsonRequestManager;
	}
	
}
