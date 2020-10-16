package com.example.demo.controllers;

import com.example.demo.entities.Dish;
import com.example.demo.entities.User;
import com.example.demo.enums.Category;
import com.example.demo.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.DishService;

import java.util.List;

@RestController 
@RequestMapping("api/dish")
public class DishController {
    @Autowired
    private DishService dishService;

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDishById(@PathVariable Integer id) {
        try {
            this.dishService.deleteDishById(id);
            return new ResponseEntity<>("Successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.toString());
            return new ResponseEntity<>("Not deleted", HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/getByCategory/{category}")
    public List<Dish> getDishesByCategory(@PathVariable("category") Category category) {
        return dishService.getDishesByCategory(category);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Dish> getDishById(@PathVariable Integer id) {
        Dish Dish = this.dishService.getDishById(id);
        try {
            return new ResponseEntity<>(Dish, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Dish> saveDish(@RequestBody Dish Dish) {
        Dish Dish1 = this.dishService.addDish(Dish);
        try {
            return new ResponseEntity<>(Dish1, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/getAll")
    public List<Dish> getDishs() {
        return  dishService.getAllDishes();
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteAll() {
        try {
            this.dishService.deleteAllDishes();
            return new ResponseEntity<>("All Dishs deleted", HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.toString());
            return new ResponseEntity<>("Not deleted", HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("/update")
    public ResponseEntity<Dish> updateDish(@RequestBody Dish Dish) {
        Dish product1 = this.dishService.updateDish(Dish);
        try {
            return new ResponseEntity<>(product1, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
