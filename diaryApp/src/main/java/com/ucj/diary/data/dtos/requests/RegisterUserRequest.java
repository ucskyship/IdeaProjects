package com.ucj.diary.dtos.requests;

import lombok.Data;

@Data
public class RegisterUserRequest {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
}
