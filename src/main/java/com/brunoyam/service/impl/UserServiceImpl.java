package com.brunoyam.service.impl;

import com.brunoyam.dao.UserDao;
import com.brunoyam.dao.impl.UserDaoImpl;
import com.brunoyam.dto.User;
import com.brunoyam.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDaoImpl();
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }
}
