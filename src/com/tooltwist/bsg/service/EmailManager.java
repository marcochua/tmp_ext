package com.tooltwist.bsg.service;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import org.apache.log4j.Logger;

import tooltwist.messaging.EmailTemplate;
import tooltwist.messaging.MailMessage;

import com.dinaa.DinaaException;
import com.dinaa.misc.AltLang;
import com.dinaa.xpc.ICredentials;
import com.tooltwist.bsg.exception.SystemException;

public class EmailManager implements IEmailManager {
	
	private MailMessage mm=null;
	private String templ_path;

	private static final Logger logger = Logger.getLogger(EmailManager.class);
	
	public void sendEmail(String email, byte[] pdfBytes, ICredentials credentials) {
		IPdfManager pdfManager = BsgServiceFactory.getPdfManager();
		String pdfFile = pdfManager.saveFile(pdfBytes);
		
		Vector<String> addedAttachFiles = new Vector<String>();
		addedAttachFiles.add(pdfFile);
		
		String[] bparam = new String[] { "PDF File" };
		
		sendEmailToRecipient(email, "pdf_request.email", bparam, addedAttachFiles, credentials);
		
	}
	
	public void sendEmailToRecipient(String to, String[] cc, String emailTemplate, String[] bparams, ICredentials xpcSecurity) {
		AltLang lang = xpcSecurity.getLang();
		//MailMessage mailMessage;
		
		EmailTemplate template;
		try {
		//	mailMessage = getMm();
			template = new EmailTemplate(emailTemplate, lang);
			template.setMessageParameters(bparams);
			
			StringBuilder ccRecipients = new StringBuilder();
			for (int x = 0; x < cc.length; x++) {
				if (!ccRecipients.toString().equals(""))
					ccRecipients.append(',');
				ccRecipients.append(cc[x]);
			}
			
			String body = template.getMessageBody();
			for (int i = 0; i < bparams.length; i++) {
				body = body.replaceAll("[{]" + i + "[}]", bparams[i]);
			}
			
			logger.info("Sending Email to : '" + to + "'");
			getMm().send(to, ccRecipients.toString(), template.getSubject(), body);
			logger.info("Sending Email success");
			
			StringBuilder message = new StringBuilder();
			message.append("\tSubject: ").append(template.getSubject()).append("\n");
			message.append("\tTo: ").append(to).append("\n");
			message.append("\tCc: ").append(ccRecipients).append("\n");
			message.append("\t").append(template.getMessageBody()).append("\n");
			logger.info("Email message : \n" + message);
		} catch (DinaaException e) {
			throw new SystemException(e);
		} catch (IOException e) {
			throw new SystemException(e);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			throw new SystemException(e);
		}
	}
	
	public void sendEmailToRecipient(String to, String emailTemplate, String[] bparams, Vector<String> attachments, ICredentials xpcSecurity) {
		AltLang lang = xpcSecurity.getLang();
		
		EmailTemplate template;
		try {
			//mm = getMm();
			template = new EmailTemplate(emailTemplate, lang);
			template.setMessageParameters(bparams);
			
			String body = template.getMessageBody();
			for (int i = 0; i < bparams.length; i++) {
				body = body.replaceAll("[{]" + i + "[}]", bparams[i]);
			}
			
			logger.info("Sending Emails to : '" + to + "'");
			getMm().send(to, template.getSubject(), body, attachments);
			logger.info("Sending Email success");
			
			StringBuilder message = new StringBuilder();
			message.append("\tSubject: ").append(template.getSubject()).append("\n");
			message.append("\tTo: ").append(to).append("\n");
			message.append("\t").append(template.getMessageBody()).append("\n");
			logger.info("Email message : \n" + message);
		} catch (DinaaException e) {
			throw new SystemException(e);
		} catch (IOException e) {
			throw new SystemException(e);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			throw new SystemException(e);
		}
	}

	
	// rpconlgen bcc
	public void sendEmailClg(String from, String[] bparams, String email, String templ_path, String strBcc, String strSubject, String pdfFilename, byte[] pdfBytes,  ICredentials credentials) {
		
		setTempl_path(templ_path);
		
		Vector<String> addedAttachFiles = new Vector<String>();
		String pdfFile = "";
		if(!("".equals(pdfFilename))) {
			IPdfManager pdfManager = BsgServiceFactory.getPdfManager();
			pdfFile = pdfManager.rpcon_saveFile(pdfFilename, pdfBytes);
			addedAttachFiles.add(pdfFile);
		}
		
		sendEmailToRecipientClg(from, email, strBcc, "homeloan.email", strSubject, bparams, addedAttachFiles, credentials);
		
		if(!("".equals(pdfFile))) {
			File f1 = new File(pdfFile);
			boolean success = f1.delete();
			if (success) logger.info(success);
		}
	}
	
	public void sendEmailToRecipientClg(String from, String to, String strBcc, String emailTemplate, String strSubject, String[] bparams, Vector<String> attachments, ICredentials xpcSecurity) {
		AltLang lang = xpcSecurity.getLang();
		EmailTemplate template;
		
		try {
			if(templ_path==null || templ_path.equals("")) {
				template = new EmailTemplate(emailTemplate, lang);
			}
			else {
				template = new EmailTemplate(emailTemplate, templ_path, lang);
			}
			//template.setMessageParameters(bparams);
			
			String body = template.getMessageBody();
			for (int i = 0; i < bparams.length; i++) {
				body = body.replaceAll("[{]" + i + "[}]", bparams[i]);
			}
			
			//logger.info("Sending Emails to : '" + to + "'");
			//logger.info("Sending Emails Bcc : '" + strBcc + "'");
			//mm.send(to, strBcc, strSubject, body, attachments);
			getMm().send(from, to, "", strBcc, strSubject, body, attachments);
			//logger.info("Sending Email success");
			
			StringBuilder message = new StringBuilder();
			message.append("\tSubject: ").append(strSubject).append("\n");
			message.append("\tTo: ").append(to).append("\n");
			message.append("\tBcc: ").append(strBcc).append("\n");
			message.append("\t").append(template.getMessageBody()).append("\n");
			logger.info("Email message : \n" + message);
		} catch (DinaaException e) {
			logger.info("Error Message: " + e.getMessage());
			logger.info("Error Code: " + e.getErrorCode());
			logger.info("Error Cause: " + e.getCause());
			throw new SystemException(e);
		} catch (IOException e) {
			logger.info("Error Message: " + e.getMessage());
			logger.info("Error Cause: " + e.getCause());
			throw new SystemException(e);
		}
		catch (Exception e){
			logger.info("Error Message: " + e.getMessage());
			logger.info("Error Cause: " + e.getCause());
			throw new SystemException(e);
		}
	}

	public MailMessage getMm() throws Exception
	{
		if(mm==null) {
			mm = new MailMessage();
		}
		return mm;
	}

	public void setTempl_path(String templ_path)
	{
		this.templ_path = templ_path;
	}

	public String getTempl_path()
	{
		return templ_path;
	}
}
