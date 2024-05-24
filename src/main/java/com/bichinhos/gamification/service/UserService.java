package com.bichinhos.gamification.service;

import com.bichinhos.gamification.entity.User;
import com.bichinhos.gamification.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByMatricula (String matricula){
        return userRepository.findByMatricula(matricula).orElse(null);
    }
}
