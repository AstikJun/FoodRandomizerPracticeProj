package com.example.demo.services;


import com.example.demo.entities.Dish;
import com.example.demo.models.AddDishToList;

import java.util.List;

public interface AddDishToListService {
    List<Dish>addToDishes(AddDishToList addDishToList);
}
