package com.brunoyam.service;

import com.brunoyam.dto.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);
}
