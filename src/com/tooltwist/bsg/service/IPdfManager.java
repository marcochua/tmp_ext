package com.tooltwist.bsg.service;

public interface IPdfManager {

	byte[] renderPrintOutput(String xmlString, String xslName);
	String saveFile(byte[] bytes);
	
	byte[] rpcon_renderPrintOutput(String xmlString, String xslName);
	String rpcon_saveFile(String filename, byte[] bytes);

}
