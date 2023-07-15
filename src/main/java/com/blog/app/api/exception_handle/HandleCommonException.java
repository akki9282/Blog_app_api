package com.blog.app.api.exception_handle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleCommonException {

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public Map<String,Object> handleAllTypeException(Exception ex)
	{
		Map<String,Object> errorMap=new HashMap<>();
		errorMap.put("status",false);
		errorMap.put("errMsg","Something went wrong at server side, please"
				+ " try again later");
		errorMap.put("status_code", 500);
//		errorMap.put("msg", ex.getMessage());
//		errorMap.compute(key, remappingFunction)
		return errorMap;	
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public Map<String,Object> handleRequestMethodException(HttpRequestMethodNotSupportedException ex)
	{
		Map<String,Object> errorMap=new HashMap<>();
		errorMap.put("status", false);
		errorMap.put("errMsg", ex.getMessage());
		
		return errorMap;
	}
	
}
