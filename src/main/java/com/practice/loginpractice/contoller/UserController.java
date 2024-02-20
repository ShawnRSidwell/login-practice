package com.practice.loginpractice.contoller;

import com.practice.loginpractice.entity.User;
import com.practice.loginpractice.model.UserModel;
import com.practice.loginpractice.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody UserModel user){
        return new ResponseEntity<>(service.createUser(user), HttpStatus.CREATED);
    }

}
