package com.example.demo.controllers;


import com.example.demo.models.AddDishToList;
import com.example.demo.services.AddDishToListService;
import com.example.demo.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/addDishToList")
public class AddDishToListController {
    @Autowired
    private AddDishToListService addDishToListService;
    @PostMapping()
    public ResponseEntity<String> addDishToList(@RequestBody AddDishToList addDishToList) {
        try {
            this.addDishToListService.addToDishes(addDishToList);
            return new ResponseEntity<>("Successfully Added", HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.toString());
            return new ResponseEntity<>("Not added", HttpStatus.BAD_REQUEST);
        }
    }

}
