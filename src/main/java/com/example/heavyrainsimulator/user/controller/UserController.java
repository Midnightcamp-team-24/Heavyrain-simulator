package com.example.heavyrainsimulator.user.controller;

import com.example.heavyrainsimulator.user.dto.UserDTO;
import com.example.heavyrainsimulator.user.entity.User;
import com.example.heavyrainsimulator.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDTO request) {
        try {
            userService.registerUser(request.getUserNickname());

            return ResponseEntity.ok("회원가입 완료");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("회원가입 실패");
        }
    }


    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDTO loginData) {
        String userNickname = loginData.getUserNickname();

        User loggedInUser = userService.loginUser(userNickname);

        if (loggedInUser != null) {
            return ResponseEntity.ok("로그인 완료");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("로그인 실패");
        }
    }


}
