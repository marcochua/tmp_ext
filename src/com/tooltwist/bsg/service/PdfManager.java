package com.tooltwist.bsg.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.fop.apps.Driver;
import org.apache.fop.image.FopImageFactory;

import com.tooltwist.bsg.exception.SystemException;

import tooltwist.misc.TooltwistConfigFile;
import tooltwist.misc.TtConfig;
import tooltwist.repository.RepositoryException;


public class PdfManager implements IPdfManager {
	
	private static final String CONFIG_PATH = "xsl";
	
	@SuppressWarnings("deprecation")
	public byte[] renderPrintOutput(String xmlString, String xslName) {
		String xslFile;
		try {
			xslFile = TtConfig.cfgFilename(CONFIG_PATH, xslName);
		} catch (RepositoryException e) {
			throw new SystemException(e);
		}
		
		/* Reset FOP Image Cache */
		FopImageFactory.resetCache();
		
		/* Setup FOP */
		Driver driver = new Driver();
		driver.setRenderer(Driver.RENDER_PDF);
		
		/* Setup a buffer to obtain the content length */
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		driver.setOutputStream(out);
		
		/* Setup Transformer */
		Source xsltSrc = new StreamSource(new File(xslFile));
		TransformerFactory tfFactory = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = tfFactory.newTransformer(xsltSrc);
		} catch (TransformerConfigurationException e) {
			throw new SystemException(e);
		}
		
		/* Make sure the XSL transformation's result is piped through to FOP */
		Result result = new SAXResult(driver.getContentHandler());
		
		/* Setup input */
		Source streamSrc;
		try {
			streamSrc = new StreamSource(new ByteArrayInputStream(xmlString.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			throw new SystemException(e);
		}
		
		/* Start the transformation and rendering process */
		try {
			transformer.transform(streamSrc, result);
		} catch (TransformerException e) {
			throw new SystemException(e);
		}
		
		return out.toByteArray();
	}
	
	public String saveFile(byte[] bytes) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy_HH.mm.ss");
			TooltwistConfigFile config = TtConfig.findConfigFile("conf-local", "");
			String defaultPath = config.getPath();
			String fileName = defaultPath + "/local-data/generated-pdf/rp-" + format.format(new Date()) + ".pdf";
			FileOutputStream fo = new FileOutputStream(fileName);
			fo.write(bytes);
			fo.close();

			return fileName;
		} catch (RepositoryException e) {
			throw new SystemException(e);
		} catch (FileNotFoundException e) {
			throw new SystemException(e);
		} catch (IOException e) {
			throw new SystemException(e);
		}
	}
	
	
	// Rpconlgen class
	
	public byte[] rpcon_renderPrintOutput(String xmlString, String xslFilePathName) {
		
		/* Reset FOP Image Cache */
		FopImageFactory.resetCache();
		
		/* Setup FOP */
		Driver driver = new Driver();
		driver.setRenderer(Driver.RENDER_PDF);
		
		/* Setup a buffer to obtain the content length */
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		driver.setOutputStream(out);
		
		/* Setup Transformer */
		Source xsltSrc = new StreamSource(new File(xslFilePathName));
		TransformerFactory tfFactory = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = tfFactory.newTransformer(xsltSrc);
		} catch (TransformerConfigurationException e) {
			throw new SystemException(e);
		}
		
		/* Make sure the XSL transformation's result is piped through to FOP */
		Result result = new SAXResult(driver.getContentHandler());
		
		/* Setup input */
		Source streamSrc;
		try {
			streamSrc = new StreamSource(new ByteArrayInputStream(xmlString.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			throw new SystemException(e);
		}
		
		/* Start the transformation and rendering process */
		try {
			transformer.transform(streamSrc, result);
		} catch (TransformerException e) {
			throw new SystemException(e);
		}
		
		return out.toByteArray();
	}	

	public String rpcon_saveFile(String filename, byte[] bytes) {
		try {
			TooltwistConfigFile config = TtConfig.findConfigFile("conf-local", "");
			String defaultPath = config.getPath();
			String fileName = defaultPath + "/local-data/generated-pdf/" + filename + ".pdf";
			FileOutputStream fo = new FileOutputStream(fileName);
			fo.write(bytes);
			fo.close();

			return fileName;
		} catch (RepositoryException e) {
			throw new SystemException(e);
		} catch (FileNotFoundException e) {
			throw new SystemException(e);
		} catch (IOException e) {
			throw new SystemException(e);
		}
	}	

}
