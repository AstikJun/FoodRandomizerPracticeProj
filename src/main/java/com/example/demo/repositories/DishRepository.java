package com.example.demo.repositories;

import com.example.demo.entities.Dish;
import com.example.demo.enums.Category;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish,Integer> {
//    @Query("select all from Dishes where category =:category")
    List<Dish> getDishesByCategory(Category category);
}
