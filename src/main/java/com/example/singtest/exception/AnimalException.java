package com.example.singtest.exception;

import java.io.Serializable;

public class AnimalException extends Exception implements Serializable {

	/**
	 * Default serial version Id
	 */
	private static final long serialVersionUID = 1L;
	private final String errorCode;
	private final String errorDescription;
	private final String faultName;

	public AnimalException(String errCd, String errDesc, String expDesc) {
		super(errDesc);
		this.errorCode = errCd;
		this.errorDescription = errDesc;
		this.faultName = expDesc;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public String getFaultName() {
		return faultName;
	}

}
