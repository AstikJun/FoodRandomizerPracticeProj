package com.example.demo.services;

import com.example.demo.entities.Dish;
import com.example.demo.enums.Category;
import com.example.demo.repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishServiceImpl implements DishService {
    @Autowired
    private DishRepository dishRepository;


    @Override
    public Dish addDish(Dish Dish) {
        return dishRepository.save(Dish);
    }

    @Override
    public Dish updateDish(Dish Dish) {
        return dishRepository.save(Dish);
    }

    @Override
    public void deleteDishById(Integer id) {
        dishRepository.deleteById(id);
    }

    @Override
    public void deleteAllDishes() {
        dishRepository.deleteAll();
    }

    @Override
    public Dish getDishById(Integer id) {
        return dishRepository.findById(id).get();
    }
    @Override
    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }
    @Override
    public List<Dish>getDishesByCategory(Category category){
        return dishRepository.getDishesByCategory(category);
    }
}
