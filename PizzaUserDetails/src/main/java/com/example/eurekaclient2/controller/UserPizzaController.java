package com.example.eurekaclient2.controller;


import com.example.eurekaclient2.domain.User;
import com.example.eurekaclient2.exception.UserAlreadyExistsException;
import com.example.eurekaclient2.service.UserPizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class UserPizzaController {
private UserPizzaService userPizzaService;
private ResponseEntity<?> responseEntity;
@Autowired
    public UserPizzaController(UserPizzaService userPizzaService ) {
        this.userPizzaService = userPizzaService;

    }
    @PostMapping("/userdata")
    public ResponseEntity<?> registerUser(@RequestBody User user) {

        responseEntity =  new ResponseEntity<>(userPizzaService.registerUser(user), HttpStatus.CREATED);

     return responseEntity;

    }



}

