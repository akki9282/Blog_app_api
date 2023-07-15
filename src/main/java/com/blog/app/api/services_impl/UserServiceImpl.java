package com.blog.app.api.services_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.app.api.entity.User;
import com.blog.app.api.payload.UserDTO;
import com.blog.app.api.repositories.UserRepo;
import com.blog.app.api.services.UserService;

@Service
public class UserServiceImpl implements UserService  {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
    	User checkUserPresent= userRepo.findByEmail(userDTO.getEmail());
    	
    	User user=userRepo.save(userDtoToUser(userDTO));
        return userToUserDto(user);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO, Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public UserDTO getUserById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    @Override
    public UserDTO getUserByUserName(String userName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserByUserName'");
    }

    @Override
    public UserDTO getUserByEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserByEmail'");
    }

    @Override
    public List<UserDTO> getAllUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllUser'");
    }

    @Override
    public void deleteUserByID(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUserByID'");
    }

    User userDtoToUser(UserDTO userDto)
    {
        User user=new User();
        user.setAbout(userDto.getAbout());
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(userDto.getPassword());
        user.setUserName(userDto.getUserName());
        user.setUserID(userDto.getUserID());

        return user;
    }

     UserDTO userToUserDto(User user)
    {
        UserDTO userDto=new UserDTO();
        userDto.setAbout(user.getAbout());
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setPassword(user.getPassword());
        userDto.setUserName(user.getUserName());
        userDto.setUserID(user.getUserID());

        return userDto;
    }
    
}
