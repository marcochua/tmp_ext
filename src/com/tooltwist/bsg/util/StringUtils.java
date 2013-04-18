package com.tooltwist.bsg.util;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.collections.list.SetUniqueList;
import org.apache.commons.lang.ArrayUtils;
import org.apache.log4j.Logger;

import com.dinaa.data.XNodes;

public class StringUtils extends org.apache.commons.lang.StringUtils{
	
	private static final Logger logger = Logger.getLogger(StringUtils.class);
	
	public static String encriptBase64(String str){
		String encoded = new String(Base64.encodeBase64(str.getBytes()));				
		return encoded;
	}
	
	public static String encriptSHA(String str){
		String encoded = new String(DigestUtils.sha(str.getBytes()));
		return encoded;
	}
	
	public static String encriptShaHex(String str){
		return DigestUtils.shaHex(str);
	}
	
	public static String encriptMD5(String str){
		String encoded = new String(DigestUtils.md5(str.getBytes()));
		return encoded;
	}
	
	public static Integer[] getIntegerArr(int size, String str){
		Integer[] val = new Integer[size];
		int _val = (str!=null && !str.isEmpty()) ? Integer.valueOf(str) : -1;
		if (_val > 0){
			val[0] = _val;
		}else{
			val = null;
		}
		return val;
	}
	
	public static Integer[] getIntegerArr(int size, int _val){
		Integer[] val = new Integer[size];
		if (_val > 0){
			val[0] = _val;
		}else{
			val = null;
		}
		return val;
	}
	
	public static boolean isNumeric(String str){
		String regexp = "^-?[0-9]+([.][0-9]+)?$";
		Pattern pattern = Pattern.compile(regexp);
		Matcher m = pattern.matcher(str);
		if (m.matches()){
			return true;
		}
		return false;
	}
	
	public static boolean isValidPhone(String phone){
		String regexp = "^-?[0]+([0-9]+)?$";
		Pattern pattern = Pattern.compile(regexp);
		Matcher m = pattern.matcher(phone);
		if (m.matches()){
			return true;
		}
		return false;
	}
	
	public static boolean isValidEmail(String email){
		String regexp = "^[\\w-]+(?:\\.[\\w-]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(regexp);
		Matcher m = pattern.matcher(email);
		if (m.matches()){
			return true;
		}
		return false;
	}
	
	public static int[] getNumVal(XNodes nodes) {
		int num = nodes.getNumNodes();
		int[] categories = new int[num];
		for (int i = 0; nodes.next(); i++){
			String category_s = nodes.getText(".");
			int category = 0;
			try {
				category = Integer.parseInt(category_s.trim());
			} catch (NumberFormatException e) {
				categories = null;
				break;
			}
			categories[i] = category;
		}
		return categories;
	}
	
	public static Date getParseDate(String tmpDate) throws ParseException{		
		//SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy");		
		Date date = null;
		if (tmpDate!=null && !tmpDate.equals("")){
			//date = newFormat.parse(tmpDate);
			date = DateFormat.getDateInstance(DateFormat.MEDIUM).parse(tmpDate);
		}				
		return date;		
	}
	
	public static String getParseDate(Calendar tmpDate){
		SimpleDateFormat newFormat = new SimpleDateFormat("dd/MM/yyyy");
		String strdate = "";
		if (tmpDate != null) {
			strdate = newFormat.format(tmpDate.getTime());
		} 
		return strdate;
	}
	
	public String[] splitString(String source, String flg) {

		StringTokenizer st = new StringTokenizer(source, flg);
		String[] arry = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens()) {
			arry[i] = st.nextToken();
			i++;
		}
		return arry;
	}

	public boolean checkContain(String str, String[] arr) {
		boolean flg = false;
		for (int i = 0; i < arr.length; i++) {
			String tempStr = arr[i];
			if (str.equals(tempStr)) {
				flg = true;
				break;
			}
		}
		return flg;
	}
	
	public static boolean containsListStr(List<String> list, String str){
		boolean flg = false;
		for (int i=0; i < list.size(); i++){
			if (list.get(i).equals(str)){
				flg = true;
				break;
			}
		}
		return flg;
	}

	/**
	 * change the date show order.
	 * In Australia the date format is DD/MM/YYYY.
	 * Ensure that the date format is for Australia.
	 * 
	 * @param dateStr
	 * @return
	 */
	public static String changeDateOrder(String dateStr) {
		if (dateStr == null) {
			return null;
		}
		String[] arrayStr = dateStr.split("/");
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < arrayStr.length; i++) {
			if (i > 0) {
				buffer.append("/");
			}
			buffer.append(arrayStr[arrayStr.length - 1 - i]);
		}
		return buffer.toString();
	}

	/**
	 * Check if String value is number
	 * 
	 * @param str
	 *  str is a check value
	 *  
	 * @return
	 *  If the str parameter is number then return true, else return false
	 */
	public static Boolean checkIsNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	/**
	 * Get byte value of String type
	 * 
	 * @param str
	 *  str is conver value type
	 *  
	 * @return
	 *  If get is ok then return a byte value, else return null
	 */
	public static byte[] getByte(String str) {
		if (str != null && str.equals("")) {
			return str.getBytes();
		} else {
			return null;
		}
	}

	/**
	 * 
	 * @param dSource
	 * @param scale
	 * @return
	 */
	public static double getRound(double dSource, int scale) {
		BigDecimal bd = new BigDecimal(dSource);
		double dRound = bd.setScale(scale, BigDecimal.ROUND_HALF_UP).doubleValue();
		return dRound;
	}

	/**
	 * Convert first letter to uppercase.
	 * 
	 * @param str
	 *  str is conver string 
	 *  
	 * @return
	 *  If get is ok return string type, else return null
	 */
	public static String beginUpper(String str) {
		if (StringUtils.isEmpty(str)) {
			return "";
		}
		if (str.length() < 2) {
			try {
				return String.valueOf(str.toUpperCase().charAt(0));
			} catch (Exception _e) {
				return null;
			}
		} else if (str.indexOf(" ") > -1) {
			String[] arrStr = str.split(" ");
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < arrStr.length; i++) {
				if (i > 0) {
					buffer.append(" ");
				}
				if (arrStr[i] != null && arrStr[i].length() > 0) {
					buffer.append(Character.toUpperCase(arrStr[i].charAt(0)));
				}
				if (arrStr[i].length() > 0) {
					buffer.append(arrStr[i].toLowerCase().substring(1, arrStr[i].length()));
				}
			}
			return buffer.toString();
		} else {
			return Character.toUpperCase(str.charAt(0))
			+ str.toLowerCase().substring(1, str.length());
		}
	}

	/**
	 * Convert all string first letter to uppercase.
	 * 
	 * @param str
	 *  str is conver string 
	 *  
	 * @return
	 *  If get is ok return string type, else return null
	 */
	public static String allBeginUpper(String str) {
		if (str == null) {
			return "";
		}
		String[] arrStr = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for (String tmp : arrStr) {
			if (tmp.equals("VIC") || tmp.equals("NSW") || tmp.equals("ACT") 
					|| tmp.equals("QLD") || tmp.equals("SA") || tmp.equals("WA")
					|| tmp.equals("NT") || tmp.equals("TAS")) {
				sb.append(tmp).append(" ");
			}else {
				sb.append(beginUpper(tmp)).append(" ");
			}			
		}
		String allStr = null;
		if (sb.length() > 0) {
			allStr = sb.substring(0, sb.length() - 1);
		} else {
			allStr = sb.toString();
		}
		sb.delete(0, sb.length());
		return allStr;
	}

	/**
	 * inserting a slash after every 3rd character in the user id string.
	 * Eg user id 12357 would be 123/57
	 * @param UserId
	 * @return
	 */
	public static String formatUserId(int UserId) {
		String strUserId = String.valueOf(UserId);
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < strUserId.length(); i++) {
			if (i % 3 == 0 && i != 0) {
				result.append("/");
			}
			result.append(strUserId.charAt(i));
		}
		return result.toString();
	}

	/**
	 * change the new line sign(\n) to the new line sign of HTML(<br/>)
	 * 
	 * @param source
	 *         the source string contain (\n)
	 *         
	 * @return
	 *         the result of change
	 */
	public static String changeNewlineSign(String source) {
		String temp = source;
		if (temp != null && "".equalsIgnoreCase(temp)) {
			temp = temp.replaceAll("\\n", "<br/>");
		}
		return temp;
	}

	/**
	 * 
	 * @param value
	 * @param isExact
	 * @return
	 */
	public static String formatSQLCondition(String value, boolean isExact) {
		String temp = value;
		if (temp == null) {
			return null;
		}
		if (temp.indexOf("'") > -1) {
			temp = temp.replaceAll("'", "''");
		}
		if (!isExact) {
			if (temp.indexOf("/") > -1) {
				temp = temp.replaceAll("/", "//");
			}
			if (temp.indexOf("%") > -1) {
				temp = temp.replaceAll("%", "/%");
			}
		}
		return temp;
	}
	
	public String[] ListToArr(){
		List<String> unitList = new ArrayList<String>();
		String[] uList = unitList.toArray(new String[0]);
		return uList;
	}
	
	@SuppressWarnings({ "unchecked", "serial" })
	public static <T> List getDuplicate(Integer[] list1, Integer[] list2) { 
		Collection<T> list = (Collection<T>) new ArrayList<Integer>(Arrays.asList(list1));
		Collection<T> _list = (Collection<T>) new ArrayList<Integer>(Arrays.asList(list2));
		List result = new ArrayList<T>();
		list.addAll(_list);	
    	final List<T> duplicatedObjects = new ArrayList<T>();
    	Set<T> set = new HashSet<T>() {
    		@Override
    		public boolean add(T e) {
        		if (contains(e)) {
            		duplicatedObjects.add(e);
        		}
        		return super.add(e);
    		}
    	};
   		for (T t : list) {
        	set.add(t);
   		}
   		
   		ArrayList _set = new ArrayList(set);
   		result.add(duplicatedObjects);
   		result.add(_set);
    	return result;
	}
	
	@SuppressWarnings("unchecked")
	public static List getDuplicateList(Integer[] list1, Integer[] list2){
		List objArr1 = new ArrayList<Integer>(Arrays.asList(list1));
		List objArr2 = new ArrayList<Integer>(Arrays.asList(list2));
		objArr1.addAll(objArr2);
		SetUniqueList.decorate(objArr1);
		return objArr1;
	}
	
	public static List<Integer> getDuplicateList(List<Integer> list1, List<Integer> list2){
		list1.addAll(list2);
		SetUniqueList.decorate(list1);
		return list1;
	}	
	
	@SuppressWarnings("unchecked")
	public static List getDuplicateListArr(Integer[] list1, Integer[] list2){
		boolean isEmptyList1 = list1 == null || list1.length <= 0;
		boolean isEmptyList2 = list2 == null || list2.length <= 0;
		
		if (isEmptyList1 && isEmptyList2){
			return new ArrayList<Integer>(32);
		} else if (isEmptyList1 && !isEmptyList2) {
			return new ArrayList<Integer>(Arrays.asList(list2));
		} else if (isEmptyList2 && !isEmptyList1) {
			return new ArrayList<Integer>(Arrays.asList(list1));
		}
		List<Integer> objArr1 = new ArrayList<Integer>(Arrays.asList(list1));
		List<Integer> objArr2 = new ArrayList<Integer>(Arrays.asList(list2));
		
		List<Integer> result = new ArrayList<Integer>();
		result.addAll(objArr1);
		
		for (Integer pid : objArr2){
			if (result.contains(pid)){
				result.remove(pid);
			}
		}
		return result;
	}
	
	public static List<Integer> getDuplicateListArr(List<Integer> list1, List<Integer> list2){
		boolean isEmptyList1 = (list1 == null || list1.size() <= 0);
		boolean isEmptyList2 = (list2 == null || list2.size() <= 0);		
		if (isEmptyList1 && isEmptyList2){
			return new ArrayList<Integer>();
		} else if (isEmptyList1 && !isEmptyList2) {
			return list2;
		} else if (isEmptyList2 && !isEmptyList1) {
			return list1;
		}		
		List<Integer> result = new ArrayList<Integer>();
		result.addAll(list1);		
		for (Integer pid : list2){
			if (result.contains(pid)){
				result.remove(pid);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public static List sortObject(List list, Object objToCompare){
		BeanComparator comp = new BeanComparator(objToCompare.toString());		
		Collections.sort(list, Collections.reverseOrder(comp));
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public static Object[] sortObject(Object[] obj, Object objToCompare){
		BeanComparator comp = new BeanComparator(objToCompare.toString());
		List objArr = new ArrayList<Object>(Arrays.asList(obj));
		Collections.sort(objArr, Collections.reverseOrder(comp));
		return obj;
	}
	
	
	@SuppressWarnings("unchecked")
	public static String dedup(String str){
		String[] strArr = str.split(",");
		int intArr[] = new int[strArr.length]; 
		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i].trim());
		}
		Integer[] objectArray = ArrayUtils.toObject(intArr);
		List objArr = new ArrayList<Integer>(Arrays.asList(objectArray));
		
		HashSet hashSet = new HashSet(objArr);
		ArrayList arrayList2 = new ArrayList(hashSet);		    
		Collections.sort(arrayList2);
		
        return arrayList2.toString();
	}
	
	public static String concatAdd(String unitNum, String streetNo, String streetName, String streetExt, String streetDirection){
		String address = "";
		
		if (unitNum != null && !unitNum.equals("")){
			address = address + unitNum + "/";
		}
		
		if (streetNo != null && !streetNo.equals("")){
			address = address + streetNo;
		}	
		
		if (streetName != null && !streetName.equals("")){
			address = address + " " + streetName;
		}
		
		if (streetExt != null && !streetExt.equals("")){
			address = address + " " + streetExt;
		}
		
		if (streetDirection != null && !streetDirection.equals("")){
			address = address + " " + streetDirection;
		}
		
		return address.trim(); 
	}
	
	public static String concatAdd(String unitNum, String streetNo, String streetName, String streetExt){
		String address = "";
		
		if (unitNum != null && !unitNum.equals("")){
			address = address + unitNum + "/";
		}
		
		if (streetNo != null && !streetNo.equals("")){
			address = address + streetNo;
		}	
		
		if (streetName != null && !streetName.equals("")){
			address = address + " " + streetName;
		}
		
		if (streetExt != null && !streetExt.equals("")){
			address = address + " " + streetExt;
		}
		
		return address.trim(); 
	}
	
	public static List<Integer> convertStrToList(String str) {
		str = str.replaceAll("\\[", "");
		str = str.replaceAll("\\]", "");
		String[] split = str.split(","); 
		int length = split.length;
		List<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			String _num = split[i];
			if (StringUtils.isEmpty(_num))
				continue;
			try {
				num.add(Integer.parseInt(_num.trim()));
			} catch (NumberFormatException e) {
				logger.error("NumberFormatException encountered when parsing property Id : \"" + _num + "\" to int.");
			}
		}
		return num;
	}
	
	public static Integer[] convertUnitsList(String _units) {
		_units = _units.replaceAll("\\[", "");
		_units = _units.replaceAll("\\]", "");
		String[] split = _units.split(",");
		int length = split.length;
		Integer[] units = new Integer[length];
		for (int i = 0; i < length; i++) {
			String unit = split[i];
			if (StringUtils.isEmpty(unit))
				continue;
			try {
				units[i] = Integer.parseInt(unit.trim());
			} catch (NumberFormatException e) {
				logger.error("NumberFormatException encountered when parsing unit : \"" + unit + "\" to int.");
			}
		}
		return units;
	}
	
	public static String formatErrorMessage(String errorMessage) {
		String newError = "";
		if (isEmpty(errorMessage))
			return newError;
		
		newError = errorMessage.toLowerCase().trim();
		newError = newError.replaceAll(" ", ".");
		newError = newError.replaceAll("\n", ".");
		newError = newError.replaceAll("\r", ".");
		newError = newError.replaceAll("\t", ".");
		
		return newError;
	}
	
	public static String[] getErrorDetails(String message){
		String result[] = new String[2];
		String errorCode = message.substring(0, 6);
		String description = message.replace(errorCode, "");
		errorCode = errorCode.replace("[", "").replace("]", "");
		result[0] = errorCode.trim();
		result[1] = description.trim();
		return result;		
	}
	
	@SuppressWarnings("unchecked")
	public static Collection GetNonOverlapping(Collection coll1, Collection coll2) {
	    Collection result = Union(coll1, coll2);
	    result.removeAll(Intersect(coll1, coll2));
	    return result;
	}
	
	@SuppressWarnings("unchecked")
	public static Collection Subtract(Collection coll1, Collection coll2) {
	    Collection result = new ArrayList(coll1);
	    result.removeAll(coll2);
	    return result;
	}
	
	@SuppressWarnings("unchecked")
	public static Collection Union(Collection coll1, Collection coll2){
	    Set union = new HashSet(coll1);
	    union.addAll(new HashSet(coll2));
	    return new ArrayList(union);
	}
	
	@SuppressWarnings("unchecked")
	public static Set Intersect(Collection set1, Collection set2) {
	    Set intersection = new HashSet(set1);
	    intersection.retainAll(new HashSet(set2));
	    return intersection;
	}
	
	public static String[] getBSGErrorDetails(String message){
		String result[] = new String[2];
		String errorCode = message.substring(message.indexOf("errorNo") + 9, message.length());
		String description = message.substring(message.indexOf("message") + 10, message.indexOf("errorNo") - 3);
		result[0] = errorCode.trim();
		result[1] = description.trim();
		return result;		
	}


}
