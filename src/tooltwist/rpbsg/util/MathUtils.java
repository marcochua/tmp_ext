package tooltwist.rpbsg.util;

public class MathUtils {

	public static Double round(Double value, Integer scale) {
		Double roundedValue = org.apache.commons.math.util.MathUtils.round(value, scale);
		return roundedValue;
	}
	
	public static Double getDistance(Double lon1, Double lat1, Double lon2, Double lat2) {
		Integer earthRadius = 6371; //km
		Double lat1Rad = Math.toRadians(lat1);
		Double lon1Rad = Math.toRadians(lon1);
		Double lat2Rad = Math.toRadians(lat2);
		Double lon2Rad = Math.toRadians(lon2);
        
		Double dlon = (lon2Rad - lon1Rad);
		Double dlat = (lat2Rad - lat1Rad);
		Double a = Math.pow(Math.sin(dlat / 2), 2) + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.pow(Math.sin(dlon / 2), 2);
		Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		Double dist = earthRadius * c;
        
 		return dist;
	}
}