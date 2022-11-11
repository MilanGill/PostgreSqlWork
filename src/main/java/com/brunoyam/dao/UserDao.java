package com.brunoyam.dao;

import com.brunoyam.dto.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);
}
