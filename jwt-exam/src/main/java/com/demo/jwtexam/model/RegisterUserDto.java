/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.jwtexam.model;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author 67112
 */
@Data
@Builder
public class RegisterUserDto {
    
    private String email;
    
    private String password;
    
    private String fullName;
}
