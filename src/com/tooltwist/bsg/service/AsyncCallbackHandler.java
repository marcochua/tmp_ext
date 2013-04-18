package com.tooltwist.bsg.service;

import java.util.concurrent.ExecutionException;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class AsyncCallbackHandler<T> implements AsyncHandler<T>{
	
	private T output;
	
	@Override
	public void handleResponse(Response<T> response)	{
		try {
            output = response.get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}	
	
	T getResponse(){
        return output;
    }
	
}
