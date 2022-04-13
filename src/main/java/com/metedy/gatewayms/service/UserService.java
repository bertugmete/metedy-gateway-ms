package com.metedy.gatewayms.service;

import com.metedy.gatewayms.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    List<User> findAllUsers();
}
