package com.blog.app.api.services;

import java.util.List;

import com.blog.app.api.payload.UserDTO;

public interface UserService {
  
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO,Integer id);
    UserDTO getUserById(Integer id);
    UserDTO getUserByUserName(String userName);
    UserDTO getUserByEmail(String email);
    List<UserDTO> getAllUser();

    void deleteUserByID(Integer id);

    
}
