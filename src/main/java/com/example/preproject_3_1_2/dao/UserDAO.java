package com.example.preproject_3_1_2.dao;

import com.example.preproject_3_1_2.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void add(User user);

    void removeUserById(Long id);

    User getUserById(Long id);

     void edit(User user);
}
