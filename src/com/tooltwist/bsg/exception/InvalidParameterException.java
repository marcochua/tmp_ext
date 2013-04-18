package com.tooltwist.bsg.exception;

public class InvalidParameterException extends BaseBsgRuntimeException {
	private static final long serialVersionUID = 3585511412085706769L;
	
	public InvalidParameterException() {
		super();
	}
	
	public InvalidParameterException(String message) {
        super(message);
    }

    public InvalidParameterException(Throwable cause) {
        super(cause);
    }

    public InvalidParameterException(String message, Throwable cause) {
        super(message, cause);
    }

}
