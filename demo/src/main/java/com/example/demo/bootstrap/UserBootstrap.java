package com.example.demo.bootstrap;

import com.example.demo.entities.Dish;
//import com.example.demo.entities.User;
import com.example.demo.entities.User;
import com.example.demo.enums.Category;
import com.example.demo.repositories.DishRepository;
//import com.example.demo.repositories.UserRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserBootstrap implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DishRepository dishRepository;


    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("AStan");
        userRepository.save(user);
        System.out.println(user);

        Dish dish = new Dish();
        dish.setCategory(Category.Завтрак);
        dish.setTitle("Яичница");
        dish.setRecipe("Яйца,масло");
//        dish.setPrice(100.0);
        dishRepository.save(dish);
        System.out.println(dish);

        List<Dish> userDishes = user.getDishes();
        user.setDishes(userDishes);
        userRepository.save(user);
        System.out.println(user.getDishes());


    }
}
