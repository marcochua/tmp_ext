package com.tooltwist.bsg.exception;

public class WebServiceRequestException extends BaseBsgRuntimeException {
	private static final long serialVersionUID = 2635771006125052922L;
	
	public WebServiceRequestException() {
		super();
	}
	
	public WebServiceRequestException(String message) {
        super(message);
    }

    public WebServiceRequestException(Throwable cause) {
        super(cause);
    }

    public WebServiceRequestException(String message, Throwable cause) {
        super(message, cause);
    }

}
