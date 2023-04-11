package com.example.eurekaclient1.service;


import com.example.eurekaclient1.domain.User;
import com.example.eurekaclient1.exception.InvalidCredentialsException;
import com.example.eurekaclient1.exception.UserAlreadyExistsException;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    List<User> find();
    //user name and pwd is in db ot not, if not save
  //  User findByEmailAndPassword(String email,String password) throws InvalidCredentialsException;



}
