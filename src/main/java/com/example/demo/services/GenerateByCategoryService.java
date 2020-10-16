package com.example.demo.services;

import com.example.demo.entities.Dish;
import com.example.demo.enums.Category;
import com.example.demo.models.GenerateByCategory;

public interface GenerateByCategoryService {
     Dish generateByCategory(GenerateByCategory generateByCategory);


}
