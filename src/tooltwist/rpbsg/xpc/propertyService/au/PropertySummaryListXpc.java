package tooltwist.rpbsg.xpc.propertyService.au;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.w3c.dom.Element;

import tooltwist.rpbsg.util.JsonToXml;
import tooltwist.rpbsg.util.StringUtils;

import com.dinaa.DinaaException;
import com.dinaa.data.XData;
import com.dinaa.data.XNodes;
import com.dinaa.xpc.XpcMethod;
import com.dinaa.xpc.XpcSecurity;
import com.google.gson.Gson;
import com.tooltwist.bsg.client.BsgPropertySummary;
import com.tooltwist.bsg.client.GetPropertySummaryListResponse;
import com.tooltwist.bsg.client.PropertiesCriteria;
import com.tooltwist.bsg.client.PropertyIdInput;
import com.tooltwist.bsg.client.SearchRequest;
import com.tooltwist.bsg.exception.BaseBsgRuntimeException;
import com.tooltwist.bsg.service.BsgServiceFactory;
import com.tooltwist.bsg.service.IBsgManager;
import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.Counter;
import com.yammer.metrics.core.MetricsRegistry;
import com.yammer.metrics.core.Timer;
import com.yammer.metrics.core.TimerContext;


public class PropertySummaryListXpc implements XpcMethod
{
	private static final Logger logger = Logger.getLogger(PropertySummaryListXpc.class);
	
	private static final MetricsRegistry REGISTRY = Metrics.defaultRegistry();
	private static final Counter PROPERTYSUMMARYLIST_COUNTER = REGISTRY.newCounter(SuggestionListXpc.class, "propertySummaryList-counter");
	private static final Timer PROPERTYSUMMARYLIST_RESPONSE_TIMER = REGISTRY.newTimer(SuggestionListXpc.class, "propertySummaryList-response-timer", TimeUnit.MILLISECONDS, TimeUnit.SECONDS);
	
	//Attrinutes
	public static final String ATTRIB_TOKENID = "tokenId";
	public static final String ATTRIB_PROPERTYID = "propertyId";
	public static final String ATTRIB_SEARCH_REQUEST_TIME = "requestTime";
	public static final String ATTRIB_SORT_TYPE = "sortType";
	
	@Override
	public XData runMethod(XpcSecurity credentials, Element elem) throws DinaaException
	{
		
		XData input = new XData(elem);
		String token = input.getText("//" + ATTRIB_TOKENID);
		String sortType = input.getText("//" + ATTRIB_SORT_TYPE);
		
		long requestTime = !input.getText("//"+ATTRIB_SEARCH_REQUEST_TIME).equals("")?Long.parseLong(input.getText("//"+ATTRIB_SEARCH_REQUEST_TIME)):0;
		Long individualRequestTime = null;

		List<Integer> propertyIds = new ArrayList<Integer>();
		XNodes idNodes = input.getNodes(ATTRIB_PROPERTYID);
		
		if(idNodes.getNumNodes() > 1) 
		{
			for(idNodes.first(); idNodes.next();) {
				int parseInt = Integer.parseInt(idNodes.getCurrentNodeValue());
				propertyIds.add(parseInt);
			}
			
		}
		else 
		{
			String currentNodeValue =  input.getText("//"+ATTRIB_PROPERTYID);
			if(!currentNodeValue.equals("")) 
			{
				propertyIds.add(Integer.parseInt(currentNodeValue));
			}
		}
		
		IBsgManager bsgManager = BsgServiceFactory.getBsgManager(requestTime,token);

		final TimerContext context = PROPERTYSUMMARYLIST_RESPONSE_TIMER.time();
		String convertJsonToXml = "";
		try {
			PROPERTYSUMMARYLIST_COUNTER.inc();
			
			SearchRequest request = new SearchRequest();
			//set property id input
			PropertyIdInput pidInput = new PropertyIdInput();
			pidInput.getPropertyIdList().addAll(propertyIds);
			request.setPropertyIdInput(pidInput);
			//set other search criteria
			request.setFetchProperties(true);
			//request.setFetchPropertySales(true);
			
			PropertiesCriteria propertiesCriteria = new PropertiesCriteria();
			propertiesCriteria.setPageNumber(-1);
			propertiesCriteria.setPageSize(-1);
			request.setPropertiesCriteria(propertiesCriteria);
			

			individualRequestTime = System.currentTimeMillis();
			GetPropertySummaryListResponse propertySummaryList = bsgManager.getPropertySummaryList(propertyIds, StringUtils.formatNumber(sortType, 0));
			String logSuccess = StringUtils.getBsgXpcLogSuccess(individualRequestTime, this.getClass().getName(), "GetPropertySummaryList", propertyIds.toString());
			logger.debug(logSuccess);
			
			List<BsgPropertySummary> propertySummaryListResult = propertySummaryList.getPropertySummaryList();
			
			Gson gson = new Gson();
			String propertySummaryListDetails = gson.toJson(propertySummaryListResult);
			convertJsonToXml = JsonToXml.convertJsonToXml(propertySummaryListDetails);
			
		} catch (BaseBsgRuntimeException e) {
			String logError = StringUtils.getBsgXpcLogError(individualRequestTime, this.getClass().getName(), "GetPropertySummaryList", propertyIds.toString(), e.getMessage());
			logger.debug(logError);
			throw e;
		} finally {
			context.stop();		
		}
		
		return new XData(convertJsonToXml);
	}
	


}
