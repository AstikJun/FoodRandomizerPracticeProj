package com.example.demo.services;

import com.example.demo.entities.Dish;
import com.example.demo.entities.Dish;
import com.example.demo.enums.Category;

import java.util.List;

public interface DishService  {
    Dish addDish(Dish Dish);
    Dish updateDish(Dish Dish);
    void deleteDishById(Integer id);
    void deleteAllDishes();
    Dish getDishById(Integer id);
    List<Dish> getAllDishes();
    List<Dish> getDishesByCategory(Category category);


}
