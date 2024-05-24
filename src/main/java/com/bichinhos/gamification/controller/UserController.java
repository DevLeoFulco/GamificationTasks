package com.bichinhos.gamification.controller;


import com.bichinhos.gamification.dto.UserLoginRequest;
import com.bichinhos.gamification.entity.User;
import com.bichinhos.gamification.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caminho/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?>login(@RequestBody UserLoginRequest loginRequest){
        User user = userService.findByMatricula(loginRequest.getMatricula());
        if (user != null && user.getSenha().equals(loginRequest.getSenha())){
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais Invalidas");
    }

}
