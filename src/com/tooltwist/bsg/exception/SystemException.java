package com.tooltwist.bsg.exception;

public class SystemException extends BaseBsgRuntimeException {
	private static final long serialVersionUID = 6157780184248757047L;
	
	public SystemException() {
		super();
	}
	
	public SystemException(String message) {
        super(message);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

}
