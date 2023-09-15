package com.example.railway.controller;

import com.example.railway.dto.UserDto;
import com.example.railway.entity.User;
import com.example.railway.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUsers() {

        List<User> allUsers = userRepository.findAll();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(allUsers);
    }
}
