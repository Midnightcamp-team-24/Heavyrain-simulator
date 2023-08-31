package com.example.heavyrainsimulator.user.service;

import com.example.heavyrainsimulator.user.entity.User;
import com.example.heavyrainsimulator.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

   @Autowired
    public UserService(UserRepository userRepository) {
       this.userRepository = userRepository;
   }

    public User registerUser(String userNickname) {
        User existingUser = userRepository.findByUserNickname(userNickname);
        if (existingUser != null) {

        }

        User newUser = new User();
        newUser.setUserNickname(userNickname);

        return userRepository.save(newUser);
    }

    public User loginUser(String userNickname) {

       User existingUser = userRepository.findByUserNickname(userNickname);

       if(existingUser != null && existingUser.getUserNickname().equals(userNickname)) {
           return existingUser;
       }

       return null;
    }
}
