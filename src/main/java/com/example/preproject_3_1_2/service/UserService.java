package com.example.preproject_3_1_2.service;

import com.example.preproject_3_1_2.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void add(User user);

    void removeUserById(Long id);

    void edit(User user);

    User getUserById(Long id);
}
