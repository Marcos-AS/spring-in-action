package com.example.pizzamania.entities;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Data;

@Data
public class RegistrationForm {
    private String username;
    private String password;
    private String fullname;
    private String street;
    private String city;
    private String province;
    private String cp;
    private String phonenumber;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(
            username, passwordEncoder.encode(password), fullname,
            street, city, province, cp, phonenumber
        );
    }
}
