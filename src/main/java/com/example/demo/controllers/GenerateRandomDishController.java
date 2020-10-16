package com.example.demo.controllers;

import com.example.demo.entities.Dish;
import com.example.demo.entities.User;
import com.example.demo.models.Generate;
import com.example.demo.services.GenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/generate")
public class GenerateRandomDishController {
    @Autowired
    private GenerateService generateService;

//    @GetMapping
//    public ResponseEntity<String> deleteDishById(@RequestBody Generate generate) {
//        try {
//            this.generateService.generate(generate);
//            return new ResponseEntity<>("Successfully generated", HttpStatus.OK);
//        } catch (Exception e) {
//            System.out.println(e.toString());
//            return new ResponseEntity<>("Not deleted", HttpStatus.BAD_REQUEST);
//        }
//    }
    @PostMapping
    public ResponseEntity<Dish> generateDish(@RequestBody Generate generate) {
        Dish dish = this.generateService.generate(generate);
        try {
            return new ResponseEntity<>(dish, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
