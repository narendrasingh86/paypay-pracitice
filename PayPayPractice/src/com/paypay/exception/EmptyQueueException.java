package com.paypay.exception;

public class EmptyQueueException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EmptyQueueException(String msg) {
		super(msg);
	}
}
