package com.tooltwist.bsg.exception;

public class BsgException extends BaseBsgRuntimeException {
	private static final long serialVersionUID = 8640246243458685527L;
	
	public BsgException() {
		super();
	}
	
	public BsgException(String message) {
        super(message);
    }

    public BsgException(Throwable cause) {
        super(cause);
    }

    public BsgException(String message, Throwable cause) {
        super(message, cause);
    }

}
