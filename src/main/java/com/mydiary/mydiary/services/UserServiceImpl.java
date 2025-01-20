package com.mydiary.mydiary.services;

import com.mydiary.mydiary.dto.SignupRequest;
import com.mydiary.mydiary.entities.User;
import com.mydiary.mydiary.repository.UserRepository;
import com.mydiary.mydiary.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(SignupRequest request) {
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email already exists.");
        }
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        return userRepository.save(user);
    }
}
