package com.elderwood.co.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.elderwood.co.api.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class userController {

    private UserRepository userRepo;

    public userController(UserRepository userRepository){
        this.userRepo = userRepository;
    }

    @PostMapping("/login")
    public String postMethodName(@RequestHeader("Authorization")  String header) {
        return header;
    }

    @PostMapping("/auth")
    public String postJWTAuth(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    
}
