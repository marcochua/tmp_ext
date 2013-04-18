package com.tooltwist.bsg.service;

public class BsgServiceFactoryNZ {
	
	private static ILogDebugManager logDebugManager;
	private static IEmailManager emailManager;
	private static IPdfManager pdfManager;
	private static IJsonRequestManager jsonRequestManager;
	
	public static IBsgManagerNZ getBsgManagerNZ(long timeOfRequest) {
		return new BsgManagerNZ(timeOfRequest);
	}
	
	public static IBsgManagerNZ getBsgManagerNZ() {
		return getBsgManagerNZ(System.currentTimeMillis());
	}
	
	public static IBsgManagerNZ getBsgManagerNZ(long timeOfRequest, String sid) {
		return new BsgManagerNZ(timeOfRequest, sid);
	}
	
	public static IBsgManagerNZ getBsgManagerNZ(String sid) {
		return getBsgManagerNZ(System.currentTimeMillis(), sid);
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
