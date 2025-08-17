// src/main/java/com/rentvideo/dtos/RegisterRequest.java

package com.rentvideo.dtos;

import com.rentvideo.entities.Role;
import lombok.Data;

@Data
public class RegisterRequest {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Role role;
}