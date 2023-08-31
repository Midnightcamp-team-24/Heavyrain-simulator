//package com.example.heavyrainsimulator.login.controller;
//
//import com.example.heavyrainsimulator.user.dto.UserDTO;
//import com.example.heavyrainsimulator.user.entity.User;
//import com.example.heavyrainsimulator.user.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class LoginController {
//
//    private final UserService userService;
//
//    @Autowired
//    public LoginController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody UserDTO loginRequest) {
//
//        User user = userService.loginUser()
//    }
//}
