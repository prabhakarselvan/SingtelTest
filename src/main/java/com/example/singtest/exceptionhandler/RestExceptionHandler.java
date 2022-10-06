package com.example.singtest.exceptionhandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.singtest.vo.AnimalResponse;
import com.example.singtest.vo.ErrorRecordResponse;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		ErrorRecordResponse errorRecordResponse = new ErrorRecordResponse();
		errorRecordResponse.setErrorCode("RE000");
		errorRecordResponse.setErrorDescription("Malformed request");
		return new ResponseEntity<>(new AnimalResponse(false, null, errorRecordResponse), HttpStatus.BAD_REQUEST);
	}

}
