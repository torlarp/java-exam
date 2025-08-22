/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/Repository.java to edit this template
 */
package com.demo.jwtexam.en.repositories;

import com.demo.jwtexam.en.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 67112
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    
    public Optional<User> findByEmail(String email);
    
}
