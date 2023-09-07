package com.example.preproject_3_1_2.service;

import com.example.preproject_3_1_2.dao.UserDAO;
import com.example.preproject_3_1_2.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void removeUserById(Long id) {
        userDAO.removeUserById(id);
    }

    @Override
    @Transactional
    public void edit(User user) {
        userDAO.edit(user);
    }
}
