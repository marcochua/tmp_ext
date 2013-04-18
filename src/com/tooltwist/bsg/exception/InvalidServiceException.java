package com.tooltwist.bsg.exception;

public class InvalidServiceException extends BaseBsgRuntimeException {
	private static final long serialVersionUID = -5961080407730322873L;
	
	public InvalidServiceException() {
		super();
	}
	
	public InvalidServiceException(String message) {
        super(message);
    }

    public InvalidServiceException(Throwable cause) {
        super(cause);
    }

    public InvalidServiceException(String message, Throwable cause) {
        super(message, cause);
    }

}
