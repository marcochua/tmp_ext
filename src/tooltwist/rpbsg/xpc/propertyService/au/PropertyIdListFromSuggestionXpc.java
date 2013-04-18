package tooltwist.rpbsg.xpc.propertyService.au;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.w3c.dom.Element;

import tooltwist.rpbsg.util.JsonToXml;
import tooltwist.rpbsg.util.StringUtils;
import com.dinaa.DinaaException;
import com.dinaa.data.XData;
import com.dinaa.xpc.XpcMethod;
import com.dinaa.xpc.XpcSecurity;
import com.google.gson.Gson;
import com.tooltwist.bsg.client.PropertyIdResponse;
import com.tooltwist.bsg.exception.BaseBsgRuntimeException;
import com.tooltwist.bsg.exception.WebServiceRequestException;
import com.tooltwist.bsg.service.BsgServiceFactory;
import com.tooltwist.bsg.service.IBsgManager;
import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.Counter;
import com.yammer.metrics.core.MetricsRegistry;
import com.yammer.metrics.core.Timer;
import com.yammer.metrics.core.TimerContext;

public class PropertyIdListFromSuggestionXpc implements XpcMethod
{
	private static final Logger logger = Logger.getLogger(PropertyIdListFromSuggestionXpc.class);
	private static IBsgManager bsgManager;

	private static final MetricsRegistry REGISTRY = Metrics.defaultRegistry();
	private static final Counter PROPERTYIDLISTFROMSUGGESTION_COUNTER = REGISTRY.newCounter(PropertyIdListFromSuggestionXpc.class, "propertyIdListFromSuggestion-counter");
	private static final Timer PROPERTYIDLISTFROMSUGGESTION_RESPONSE_TIMER = REGISTRY.newTimer(PropertyIdListFromSuggestionXpc.class, "propertyIdListFromSuggestion-response-timer", TimeUnit.MILLISECONDS, TimeUnit.SECONDS);
	
	//Attrinutes
	public static final String ATTRIB_TOKENID = "tokenId";
	public static final String ATTRIB_SEARCH_STRING = "searchString";
	public static final String ATTRIB_SEARCH_CATEGORY = "searchCategory";
	public static final String ATTRIB_SEARCH_REQUEST_TIME = "requestTime";
	/**
	 *  @param searchString, maxSuggestionResults, searchCategories, requestTime
	 *  @return List of address and categories
	 */
	@Override
	public XData runMethod(XpcSecurity credentials, Element elem) throws DinaaException
	{
		
		XData input = new XData(elem);
		String partnerSid = input.getText("//"+ATTRIB_TOKENID);
		String searchString = input.getText("//"+ATTRIB_SEARCH_STRING);
		int searchCategory = Integer.parseInt(input.getText("//"+ATTRIB_SEARCH_CATEGORY));
		long requestTime = Long.parseLong(input.getText("//"+ATTRIB_SEARCH_REQUEST_TIME));
		
		final TimerContext context = PROPERTYIDLISTFROMSUGGESTION_RESPONSE_TIMER.time();
		//set bsgManager
		bsgManager = BsgServiceFactory.getBsgManager(requestTime, partnerSid);
		
		try {
			PROPERTYIDLISTFROMSUGGESTION_COUNTER.inc();
			long requestSystemTime = System.currentTimeMillis();
			
			PropertyIdResponse response = bsgManager.getPropertyIdListFromSuggestion(searchString.toUpperCase().trim(), searchCategory);
			
			String logTime = StringUtils.getBsgXpcLogSuccess(requestSystemTime, this.getClass().getName(), "GetPropertyIdListFromSuggestion", searchString);
			logger.debug(logTime);	
			
			if (response == null) {
				throw new WebServiceRequestException("getPropertyIdListFromSuggestion returned null response");
			}
			//get ids from suggestions
			List<Integer> propertyIds = response.getPropertyIdList();
			if (propertyIds == null) {
				throw new WebServiceRequestException("getPropertyIdListFromSuggestion returned null or empty propertyId list");
			} else {
				
				Gson gson = new Gson();
				String json = gson.toJson(propertyIds);
				String convertJsonToXml = JsonToXml.convertJsonToXml(json);
				
				String logSuccess = StringUtils.getBsgXpcLogSuccess(requestTime, this.getClass().getName(), "GetPropertyIdListFromSuggestion", searchString);
				logger.debug(logSuccess);			
				return new XData(convertJsonToXml);
			}
		} catch(BaseBsgRuntimeException ex) {
			String logError = StringUtils.getBsgXpcLogError(requestTime, this.getClass().getName(), "GetPropertyIdListFromSuggestion", searchString, ex.getMessage());
			logger.debug(logError);
			throw ex;
		} finally {
			context.stop();		
		}
	
	}

}
