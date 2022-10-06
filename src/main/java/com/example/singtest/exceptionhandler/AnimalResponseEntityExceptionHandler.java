package com.example.singtest.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.example.singtest.exception.AnimalException;
import com.example.singtest.vo.AnimalResponse;
import com.example.singtest.vo.ErrorRecordResponse;
import com.fasterxml.jackson.core.JsonProcessingException;

@ControllerAdvice
@RestController
public class AnimalResponseEntityExceptionHandler {

	@ExceptionHandler(AnimalException.class)
	public final ResponseEntity<AnimalResponse> handleAllExceptions(AnimalException ex, WebRequest request)
			throws JsonProcessingException {
		ErrorRecordResponse errorRecordResponse = new ErrorRecordResponse();
		errorRecordResponse.setErrorCode(ex.getErrorCode());
		errorRecordResponse.setErrorDescription(ex.getErrorDescription());
		return new ResponseEntity<>(new AnimalResponse(false, null, errorRecordResponse), HttpStatus.OK);

	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public final ResponseEntity<AnimalResponse> handleAllExceptions(MethodArgumentNotValidException ex,
			WebRequest request) throws JsonProcessingException {
		ErrorRecordResponse errorRecordResponse = new ErrorRecordResponse();
		errorRecordResponse.setErrorCode(ex.getMessage());
		errorRecordResponse.setErrorDescription(ex.getMessage());
		return new ResponseEntity<>(new AnimalResponse(false, null, errorRecordResponse), HttpStatus.OK);
	}
}
