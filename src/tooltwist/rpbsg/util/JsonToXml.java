package tooltwist.rpbsg.util;

import org.apache.log4j.Logger;

import tooltwist.wbd.WbdCache;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import net.sf.json.xml.XMLSerializer;


public class JsonToXml {

		private static Logger logger = Logger.getLogger(JsonToXml.class);
		
		public static String convertJsonToXml (String stringObject) {
			String strShowLog = WbdCache.getProperty("logXmlResponse");
			boolean boolShowLog = false;
			if( strShowLog!=null &&  strShowLog.equals("true")){
				boolShowLog = true;
			}
			return convertJsonToXml(stringObject, boolShowLog);
		}
				
        public static String convertJsonToXml (String stringObject, boolean logXMLResponse) {
            logger.debug("convertJsonToXml() start...");
            String jsonData = stringObject;
            String xml = "";
			try {
				//jsonData = stringObject.indexOf("[") == 0? stringObject.substring(1, stringObject.length()-1): stringObject ;
				if(stringObject.indexOf("[") == 0) {
					jsonData = "{\"json\" :" + stringObject + "}";
				}
				XMLSerializer serializer = new XMLSerializer(); 
	            JSON json = JSONSerializer.toJSON( jsonData ); 
	            serializer.setRootName("select");
	            serializer.setTypeHintsEnabled(false);
	            xml = serializer.write( json );
	            if(logXMLResponse){
	            	System.out.println("XML response: "+xml);
	            }
			} catch (Exception e) {
				xml = "<error><Msg>Error: " + e.getMessage() + " -- " +stringObject + "</Msg></error>";
				logger.error("convertJsonToXml() " + e.fillInStackTrace());
			}
			logger.debug("convertJsonToXml() end...");
			//xml = XmlFormatter.format(xml);
			return xml;                       
				
        }
        
        public static String convertJsonToXml (String stringObject, String tableName) {
            logger.debug("convertJsonToXml() start...");
            String jsonData = stringObject;
            String xml = "";
            
            String strShowLog = WbdCache.getProperty("logXmlResponse");
			boolean logXMLResponse = false;
			if(strShowLog!=null  &&  strShowLog.equals("true")){
				logXMLResponse = true;
			}
			
			try {
				
				if(stringObject.indexOf("[") == 0) {
					jsonData = "{\""+tableName+"\""+":" + stringObject + "}";
				}
				XMLSerializer serializer = new XMLSerializer(); 
	            JSON json = JSONSerializer.toJSON( jsonData ); 
	            serializer.setRootName("select");
	            serializer.setTypeHintsEnabled(false);
	            xml = serializer.write( json );
	            
	            if(logXMLResponse){
	            	System.out.println("XML response: "+xml);
	            }
			} catch (Exception e) {
				xml = "<error><Msg>Error: " + e.getMessage() + " -- " +stringObject + "</Msg></error>";
				logger.error("convertJsonToXml() " + e.fillInStackTrace());
			}
			logger.debug("convertJsonToXml() end...");
			return xml;                       
				
        }
        
        public static void main(String...args) {
        	JsonToXml.convertJsonToXml("{\"Password\":\"123456\",\"TerritorialAuthorityId\":123,\"EmailAddress\":\"lovenisa@gmail.com\",\"FirstName\":\"Lovenisa\",\"IsSubscribedToNewsletter\":true,\"PrefersHtmlEmail\":true}");
        }
}