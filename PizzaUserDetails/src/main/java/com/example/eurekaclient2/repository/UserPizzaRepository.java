package com.example.eurekaclient2.repository;

import com.example.eurekaclient2.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserPizzaRepository extends MongoRepository<User,String> {

    User findByEmail(String email);
}
