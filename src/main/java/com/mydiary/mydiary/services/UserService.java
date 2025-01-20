/*
> Group 7:
    - 20248/2022    SERGE MUNEZA
    - 20486/2022    SAMUEL MURENGEZI
    - 20844/2022    GISELE MUKANTWARI MUNEZERO
> Interface: UserService
> Description: Provides services and business logic related to user operations.
> Instance Variable:
    - userRepository: Handles database operations for users.
> Methods:
    - createUser(SignupRequest request): Creates and saves a new user in the database.
    - findByUsername(String username): Retrieves a user by their username.
 */

package com.mydiary.mydiary.services;

import com.mydiary.mydiary.dto.SignupRequest;
import com.mydiary.mydiary.entities.User;

public interface UserService {
    User createUser(SignupRequest request);
}
