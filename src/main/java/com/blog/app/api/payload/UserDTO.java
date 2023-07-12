package com.blog.app.api.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter 
@Setter
public class UserDTO {

    private int userID;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String about;
}
