package com.tooltwist.bsg.form;

import java.io.Serializable;

/**
 * @author Rae
 * 
 */
public class LoginCredentials implements Serializable {

	private static final long serialVersionUID = 5236599190255630700L;

	private String status;

	private String authenticationCode;

	private String customerId;

	private String username;

	private String message;

	private Boolean hasToken;

	private String deviceType = "iphone";

	private Boolean isAgentIpad = false;

	private Boolean isAgentIphone = false;

	private Boolean isCba = false;

	private Boolean isAsb = false;

	private Boolean isRpm3 = false;
	
	private Boolean isCbaAndroid = false;

	private Boolean hasError = false;

	public void setAuthenticationCode(String authenticationCode) {
		this.authenticationCode = authenticationCode;
	}

	public String getAuthenticationCode() {
		return authenticationCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setHasToken(Boolean hasToken) {
		this.hasToken = hasToken;
	}

	public Boolean getHasToken() {
		return hasToken;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * @return the isAgentIpad
	 */
	public Boolean getIsAgentIpad() {
		return isAgentIpad;
	}

	/**
	 * @param isAgentIpad
	 *            the isAgentIpad to set
	 */
	public void setIsAgentIpad(Boolean isAgentIpad) {
		this.isAgentIpad = isAgentIpad;
	}

	/**
	 * @return the isAgentIphone
	 */
	public Boolean getIsAgentIphone() {
		return isAgentIphone;
	}

	/**
	 * @param isAgentIphone
	 *            the isAgentIphone to set
	 */
	public void setIsAgentIphone(Boolean isAgentIphone) {
		this.isAgentIphone = isAgentIphone;
	}

	/**
	 * @return the isCba
	 */
	public Boolean getIsCba() {
		return isCba;
	}

	/**
	 * @param isCba
	 *            the isCba to set
	 */
	public void setIsCba(Boolean isCba) {
		this.isCba = isCba;
	}

	/**
	 * @return the isAsb
	 */
	public Boolean getIsAsb() {
		return isAsb;
	}

	/**
	 * @param isAsb
	 *            the isAsb to set
	 */
	public void setIsAsb(Boolean isAsb) {
		this.isAsb = isAsb;
	}

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

	public Boolean getIsRpm3() {
		return isRpm3;
	}

	public void setIsRpm3(Boolean isRpm3) {
		this.isRpm3 = isRpm3;
	}
	
	public String getAppType() {
		
		String appType = "UNKNOWN DEVICE";
		
		if (isAgentIpad) {
			appType = "IPAD";
		} else if (isAgentIphone) {
			appType = "IPHONE";
		} else if (isCba) {
			appType = "CBA";
		} else if (isCbaAndroid) {
			appType = "CBA-Android";
		} else if (isAsb) {
			appType = "ASB";
		} else if (isRpm3) {
			appType = "RPM3";
		}
		
		return appType;
	}

	public Boolean getIsCbaAndroid()
	{
		return isCbaAndroid;
	}

	public void setIsCbaAndroid(Boolean isCbaAndroid)
	{
		this.isCbaAndroid = isCbaAndroid;
	}
}
