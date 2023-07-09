package com.blog.app.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
    private int userID;

	@Column(name = "first_name", nullable = false)
    private String firstName;

	@Column(name = "last_name",nullable = false)
    private String lastName;

	@Column(name="user_name", nullable = false,unique = true)
    private String userName;

	@Column(nullable = false,unique = true)
    private String email;

	@Column(nullable = false,unique = true)
    private String password;

    private String about;


}
