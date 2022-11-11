package com.brunoyam;

import com.brunoyam.dto.User;
import com.brunoyam.service.UserService;
import com.brunoyam.service.impl.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        List<User> users = userService.getAllUsers();
        System.out.println("All Users: " + users);

        User user = new User();
        user.setName("Милан");
        user.setAge(20);

        userService.addUser(user);
    }
}
