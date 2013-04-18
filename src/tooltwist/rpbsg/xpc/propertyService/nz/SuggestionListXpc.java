package tooltwist.rpbsg.xpc.propertyService.nz;

import java.util.ArrayList;
import java.util.HashMap;
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
import com.tooltwist.bsg.clientnz.GetSuggestionListResponse;
import com.tooltwist.bsg.exception.BaseBsgRuntimeException;
import com.tooltwist.bsg.service.BsgServiceFactoryNZ;
import com.tooltwist.bsg.service.IBsgManagerNZ;
import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.Counter;
import com.yammer.metrics.core.MetricsRegistry;
import com.yammer.metrics.core.Timer;
import com.yammer.metrics.core.TimerContext;

public class SuggestionListXpc implements XpcMethod
{
	private static final Logger LOGGER = Logger.getLogger(SuggestionListXpc.class);

	private static final MetricsRegistry REGISTRY = Metrics.defaultRegistry();
	private static final Counter SUGGESTIONLIST_COUNTER = REGISTRY.newCounter(SuggestionListXpc.class, "suggestionList-counter");
	private static final Timer SUGGESTIONLIST_RESPONSE_TIMER = REGISTRY.newTimer(SuggestionListXpc.class, "suggestionList-response-timer", TimeUnit.MILLISECONDS, TimeUnit.SECONDS);
	
	//Attrinutes
	public static final String ENTITY_NAME = "rpbsg.propertyService";
	public static final String METHOD_NAME = "getSuggestionListNZ";
	
	public static final String ATTRIB_SEARCH_STRING = "searchString";
	public static final String ATTRIB_MAX_SUGGESTION_LIST = "maxSuggestionResults";
	public static final String ATTRIB_SEARCH_CATEGORIES = "searchCategories";
	public static final String ATTRIB_REQUEST_TIME = "requestTime";
	
	/**
	 *  @param searchString, maxSuggestionResults, searchCategories, requestTime
	 *  @return List of address and categories
	 */
	@Override
	public XData runMethod(XpcSecurity credentials, Element elem) throws DinaaException
	{
		XData input = new XData(elem);
		String searchString = input.getText("//"+ATTRIB_SEARCH_STRING);
		int maxSuggestionResults = Integer.parseInt(input.getText("//"+ATTRIB_MAX_SUGGESTION_LIST));
		String searchCategories = input.getText("//"+ATTRIB_SEARCH_CATEGORIES);
		long requestTime = Long.parseLong(input.getText("//"+ATTRIB_REQUEST_TIME));
		
		IBsgManagerNZ bsgManager = BsgServiceFactoryNZ.getBsgManagerNZ(requestTime);
		List<HashMap<String, String>> tmpList = new ArrayList<HashMap<String, String>>();
		Long individualRequestTime = null;
		for (String searchCategory : searchCategories.split(",")) {
			List<Integer> categories = StringUtils.getCategories(searchCategory);
			if (maxSuggestionResults != 0) {
				final TimerContext context = SUGGESTIONLIST_RESPONSE_TIMER.time();
				try {
					SUGGESTIONLIST_COUNTER.inc();

					individualRequestTime = System.currentTimeMillis();
					GetSuggestionListResponse suggestions = bsgManager.getSuggestionList(searchString, maxSuggestionResults, categories);
					
					String logSuccess = StringUtils.getBsgXpcLogSuccess(individualRequestTime, this.getClass().getName(), "GetSuggestionList", searchString);
					LOGGER.debug(logSuccess);
					
					if (suggestions != null && suggestions.getSuggestions() != null) {
						if (suggestions.getSuggestions().size() > 0) {
							for (String suggestion : suggestions.getSuggestions()) {
								String[] address = suggestion.split(" ");
								if (address[0] != null) {
									if (searchCategory.equals("1")) {
										if (address[0].equals("9999") || address[0].equals("99999")) {
											continue;
										}
									}
								}
								
								HashMap<String, String>tmp = new HashMap<String, String>();
								tmp.put("key", StringUtils.formatText(searchCategory));
								tmp.put("value", StringUtils.formatText(suggestion));
								tmpList.add(tmp);
								maxSuggestionResults--;
							}
						}
					}
				} catch (BaseBsgRuntimeException e){
					String logError = StringUtils.getBsgXpcLogError(individualRequestTime, this.getClass().getName(), "GetSuggestionList", searchString, e.getMessage());
					LOGGER.debug(logError);
					throw e;
				} finally {
					context.stop();		
				}

			} else {
				break;
			}
	
		}
		Gson gson = new Gson();
		String out = gson.toJson(tmpList);
		String convertJsonToXml = JsonToXml.convertJsonToXml(out,"address");
		return new XData(convertJsonToXml);
	}

}
