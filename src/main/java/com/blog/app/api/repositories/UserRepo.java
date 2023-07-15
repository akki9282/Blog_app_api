package com.blog.app.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.app.api.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
  
	User findByEmail(String email);
	User findByUserName(String userName);
}
