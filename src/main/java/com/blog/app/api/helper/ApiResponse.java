package com.blog.app.api.helper;

import lombok.Getter;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import lombok.*;

@Getter 
@Setter
@NoArgsConstructor
public class ApiResponse {
boolean status;
String message;
Object data;
}

//@NoArgsConstructor
//@Getter
//@Setter
//class FaildApiResponse{
//	boolean status;
//	String error_msg;
//	HttpStatus http_status;
//	HttpStatusCode status_code;
//}
