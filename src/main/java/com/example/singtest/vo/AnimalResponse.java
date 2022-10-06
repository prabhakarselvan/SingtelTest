package com.example.singtest.vo;

public class AnimalResponse {

	private String status;

	private String code;

	private Object response;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

	public AnimalResponse() {
		this.status = "SUCCESS";
		this.code = "200";
		this.response = "";
	}

	public AnimalResponse(String status, String code, Object response) {
		this.status = status;
		this.code = code;
		this.response = response;
	}

	public AnimalResponse(boolean isSuccessful, String code, Object response) {
		this.status = isSuccessful ? "SUCCESS" : "FAILURE";
		this.code = code;
		this.response = response;
	}
}
