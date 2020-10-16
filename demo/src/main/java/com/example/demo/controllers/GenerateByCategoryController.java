package com.example.demo.controllers;

import com.example.demo.entities.Dish;
import com.example.demo.models.Generate;
import com.example.demo.models.GenerateByCategory;
import com.example.demo.services.GenerateByCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/generateByCategory")
public class GenerateByCategoryController {
    @Autowired
    private GenerateByCategoryService generateByCategoryService;

    @PostMapping
    public ResponseEntity<Dish> generateDishByCategory(@RequestBody GenerateByCategory generateByCategory) {
        Dish dish = this.generateByCategoryService.generateByCategory(generateByCategory);
        try {
            return new ResponseEntity<>(dish, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
