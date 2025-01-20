/*
> Group 7:
    - 20248/2022    SERGE MUNEZA
    - 20486/2022    SAMUEL MURENGEZI
    - 20844/2022    GISELE MUKANTWARI MUNEZERO
> Class: AuthController
> Description: This class handles the user authentication specifically registration actions or sign-up.
> Instance Variables:
       - userService: A service for managing user-related operations such as creation.
> Methods:
    - signup(SignupRequest request): Registers a new user and returns a success message along with the created user.
 */
package com.mydiary.mydiary.controller;

import com.mydiary.mydiary.dto.SignupRequest;
import com.mydiary.mydiary.entities.User;
import com.mydiary.mydiary.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<Map<String, Object>> signup(@RequestBody SignupRequest request) {
        User user = userService.createUser(request);

        Map<String, Object> response = new HashMap<>();
        response.put("message", "User created successfully");
        response.put("user", user);

        return ResponseEntity.ok(response);
    }
}
