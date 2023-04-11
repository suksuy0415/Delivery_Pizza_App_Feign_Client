package com.example.eurekaclient1.service;
import com.example.eurekaclient1.domain.User;
import com.example.eurekaclient1.exception.InvalidCredentialsException;
import com.example.eurekaclient1.exception.UserAlreadyExistsException;
import com.example.eurekaclient1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

private UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User saveUser(User user){

        return userRepository.save(user);
    }

    @Override
    public List<User> find() {

        return userRepository.findAll();
    }


//    @Override
//    public User findByEmailAndPassword(String email, String password) throws InvalidCredentialsException {
//        System.out.println("email"+email);
//        System.out.println("password"+password);
//        User loggedInUser = userRepository.findByEmailAndPassword(email,password);
//        System.out.println(loggedInUser);
//        if(loggedInUser == null)
//        {
//            throw new InvalidCredentialsException();
//        }
//
//        return loggedInUser;
//    }
}
