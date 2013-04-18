package tooltwist.rpbsg.util;

import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

public class DateUtils {

	private static final Logger logger = Logger.getLogger(DateUtils.class);

	private static final String DAYS_KEYCHAR = "D";
	private static final String WEEKS_KEYCHAR = "W";
	private static final String MONTHS_KEYCHAR = "M";
	private static final Integer DAYS_WEEK = 7;

	public static String daysBetween(String dateOption) {
		
		String days = StringUtils.EMPTY;
		
		// Inputs are n#D, n#W and n#M
		String options[] = dateOption.split("#");
		
		if(options.length >= 2) {
			
		
			String dateNumber = options[0];
			String dateUnit = options[1];
	
			try {
				Integer n = Integer.parseInt(dateNumber);
		
				if(dateUnit.equalsIgnoreCase(DAYS_KEYCHAR)) {
					
					days = n.toString();
					
				} else if(dateUnit.equalsIgnoreCase(WEEKS_KEYCHAR)) {
		
					days = String.valueOf((n * DAYS_WEEK));			
		
				} else if(dateUnit.equalsIgnoreCase(MONTHS_KEYCHAR)) {
		
					Calendar currentDate = Calendar.getInstance();
			    	Calendar cutoffDate = Calendar.getInstance();
			    	cutoffDate.add(Calendar.MONTH, n);
			    	
			    	long d = daysBetween(currentDate.getTime(), cutoffDate.getTime());
			    	days = String.valueOf(d);
				}
			} catch (Exception e) {
				logger.error(e.getMessage());
				days = StringUtils.EMPTY;
			}
		}
		
		return days;
	}
	
	public static long daysBetween(Date d1, Date d2){
		 return ( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}
	
	public static Date getCalendar(int calendarType, int salesHistoryNo) {
		Calendar cal = Calendar.getInstance();
		if (calendarType == Calendar.YEAR) {
			cal.add(Calendar.YEAR, 0 - salesHistoryNo);
		} else {
			cal.add(Calendar.MONTH, 0 - salesHistoryNo);
		}
		return cal.getTime();
	}
}