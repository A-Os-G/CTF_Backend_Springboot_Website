package com.example.springboot.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByEmail(String email);
    User findByUsername(String userName);
    Optional<User> findByEmailIgnoreCase(String email);


}
