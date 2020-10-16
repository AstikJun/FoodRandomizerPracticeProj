package com.example.demo.services;

import com.example.demo.entities.Dish;
import com.example.demo.entities.User;
import com.example.demo.enums.Category;
import com.example.demo.repositories.DishRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DishRepository dishRepository;


    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


}
