package com.example.demo.services;

import com.example.demo.entities.Dish;
import com.example.demo.models.Generate;

public interface GenerateService {
    Dish generate(Generate generate);
}
