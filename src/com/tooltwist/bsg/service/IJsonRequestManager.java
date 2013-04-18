package com.tooltwist.bsg.service;

import javax.servlet.http.HttpServletRequest;

import com.tooltwist.bsg.json.JsonRequest;

public interface IJsonRequestManager {

	JsonRequest getJsonRequest(HttpServletRequest request, boolean debug);

	JsonRequest getJsonRequestDebug(HttpServletRequest request);

	JsonRequest getJsonUploadRequest(HttpServletRequest request, boolean debug);

}
