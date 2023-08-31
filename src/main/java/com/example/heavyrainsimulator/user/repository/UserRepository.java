package com.example.heavyrainsimulator.user.repository;

import com.example.heavyrainsimulator.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserNickname(String userNickName);
}
