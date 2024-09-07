package com.quang.healthcare.dto.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequest {
    private long id;
    private String email;
    private String password;
    private String name;
}