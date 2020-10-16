package com.example.demo.services;

import com.example.demo.entities.Dish;
import com.example.demo.entities.User;
import com.example.demo.enums.Category;
import com.example.demo.models.GenerateByCategory;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class GenerateByCategoryServiceImpl implements GenerateByCategoryService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Dish generateByCategory(GenerateByCategory generateByCategory) {
        Random r = new Random();
        User user = userRepository.getOne(generateByCategory.getUserId());
        List<Dish> userDishes = user.getDishes();
        Category category=generateByCategory.getCategory();
        List<Dish>listBySelectedCategory=new ArrayList<>();
        Dish generatedDish=null;
        for (Dish d:userDishes) {
            if(d.getCategory().equals(category)){
                listBySelectedCategory.add(d);
                generatedDish =listBySelectedCategory.get(r.nextInt(listBySelectedCategory.size()));
            }
        }
        return generatedDish;
    }
}
