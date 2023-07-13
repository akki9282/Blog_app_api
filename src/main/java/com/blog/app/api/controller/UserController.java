package com.blog.app.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.blog.app.api.helper.ApiResponse;
import com.blog.app.api.payload.UserDTO;
import com.blog.app.api.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    
    @Autowired
    UserService userService;

    @PostMapping("/create-user")
    public ResponseEntity<ApiResponse> createUser(@RequestBody UserDTO userDTO)
    {
    	UserDTO createdUser = userService.createUser(userDTO);
    	
        ApiResponse response=new ApiResponse();
        response.setData(createdUser);
        response.setStatus(true);
        response.setMessage("User Created Successfully!");
        response.setStatus_code(HttpStatus.CREATED);
//        response.setStatus_code(HttpStatusCode.);
        
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }

}
