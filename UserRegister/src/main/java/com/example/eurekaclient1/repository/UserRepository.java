package com.example.eurekaclient1.repository;



import com.example.eurekaclient1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
//User findByEmailAndPassword(String email, String password);
}
