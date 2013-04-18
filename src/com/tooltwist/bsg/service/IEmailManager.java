package com.tooltwist.bsg.service;

import java.io.IOException;
import java.util.Vector;

import com.dinaa.DinaaException;
import com.dinaa.xpc.ICredentials;

public interface IEmailManager {

	void sendEmail(String email, byte[] pdfBytes, ICredentials credentials) ;

	void sendEmailToRecipient(String to, String[] cc, String emailTemplate, String[] bparams, ICredentials xpcSecurity)  throws DinaaException, IOException;

	void sendEmailToRecipient(String to, String emailTemplate, String[] bparams, Vector<String> attachments, ICredentials xpcSecurity) throws DinaaException, IOException;

	void sendEmailClg(String from, String[] bparams, String email, String templ_path, String strBcc, String strSubject, String pdfFilename, byte[] pdfBytes, ICredentials credentials);

	void sendEmailToRecipientClg(String from, String to, String strBcc, String emailTemplate, String strSubject, String[] bparams, Vector<String> attachments, ICredentials xpcSecurity) throws DinaaException, IOException;
}
