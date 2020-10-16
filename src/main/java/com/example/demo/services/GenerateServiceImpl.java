package com.example.demo.services;

import com.example.demo.entities.Dish;
import com.example.demo.entities.User;
import com.example.demo.models.Generate;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class GenerateServiceImpl implements GenerateService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public Dish generate(Generate generate){
        User user = userRepository.getOne(generate.getUserId());
        List<Dish> userDishes = user.getDishes();
        Random r = new Random();
        Dish dish = userDishes.get(r.nextInt(userDishes.size()));
        return dish;
    }
}
