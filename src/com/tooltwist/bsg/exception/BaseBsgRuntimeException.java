package com.tooltwist.bsg.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

public class BaseBsgRuntimeException extends RuntimeException {
	private static final long serialVersionUID = 8346104493062943208L;
	
	private Throwable cause;

	public BaseBsgRuntimeException() {
		super();
	}

	public BaseBsgRuntimeException(String message) {
		super(message);
	}

	public BaseBsgRuntimeException(Throwable t) {
		super(t.getMessage());
		try {
			initCause(t);
		} catch (Throwable e) {
		}
	}

	public BaseBsgRuntimeException(String message, Throwable t) {
		super(message);
		try {
			initCause(t);
		} catch (Throwable e) {
		}
	}

	public Throwable initCause(Throwable t) throws IllegalArgumentException, IllegalStateException {
		cause = t;
		return this;
	}

	public Throwable getCause() {
		return cause;
	}

	public void printStackTrace(PrintStream ps) {
		if (null != cause) {
			cause.printStackTrace(ps);
		}
		super.printStackTrace(ps);
	}

	public void printStackTrace(PrintWriter pw) {
		if (null != cause) {
			cause.printStackTrace(pw);
		}
		super.printStackTrace(pw);
	}

	public void printStackTrace() {
		printStackTrace(System.err);
	}

}
