package com.example.heavyrainsimulator.user.service;

import com.example.heavyrainsimulator.user.dto.UserDTO;
import com.example.heavyrainsimulator.user.entity.User;
import com.example.heavyrainsimulator.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;

   @Autowired
    public UserService(UserRepository userRepository) {
       this.userRepository = userRepository;
   }

    public User registerUser(String userNickname, String userPassword) {
        User existingUser = userRepository.findByUserNickname(userNickname);
        if (existingUser != null) {

        }

        User newUser = new User();
        newUser.setUserNickname(userNickname);
        newUser.setUserPassword(userPassword);

        return userRepository.save(newUser);
    }
}
