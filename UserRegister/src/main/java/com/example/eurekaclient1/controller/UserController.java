package com.example.eurekaclient1.controller;


import com.example.eurekaclient1.domain.User;
import com.example.eurekaclient1.exception.InvalidCredentialsException;
import com.example.eurekaclient1.exception.UserAlreadyExistsException;
import com.example.eurekaclient1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/user")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user),HttpStatus.CREATED);
    }

    @GetMapping("/login")
    public List<User> getUsers() {
        return (List<User>)userService.find();
    }
//    @PostMapping("/login")
//    public ResponseEntity<?> loginUser(@RequestBody User user) throws InvalidCredentialsException
//    {
//        User retrievedUser = userService.findByEmailAndPassword(user.getEmail(),user.getPassword());
//
//        if(retrievedUser==null)
//        {
//            throw new InvalidCredentialsException();
//        }
//        return new ResponseEntity<>(user,HttpStatus.OK);
//    }
}
