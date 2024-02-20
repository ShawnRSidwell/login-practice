package com.practice.loginpractice.model;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class UserModel {


    private String name;
    private String email;
    private String address;
    private String password;
}
