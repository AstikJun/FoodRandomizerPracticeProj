package com.example.demo.services;

import com.example.demo.entities.Dish;
import com.example.demo.entities.User;
import com.example.demo.enums.Category;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User updateUser(User user);
    void deleteUserById(Integer id);
    void deleteAllUsers();
    User getUserById(Integer id);
    List<User> getAllUsers();
}
