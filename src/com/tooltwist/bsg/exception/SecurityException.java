package com.tooltwist.bsg.exception;

public class SecurityException extends BaseBsgRuntimeException {
	private static final long serialVersionUID = -8464278127818388264L;
	
	public SecurityException() {
		super();
	}
	
	public SecurityException(String message) {
        super(message);
    }

    public SecurityException(Throwable cause) {
        super(cause);
    }

    public SecurityException(String message, Throwable cause) {
        super(message, cause);
    }

}
