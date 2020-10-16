package com.example.demo.services;

import com.example.demo.entities.Dish;
import com.example.demo.entities.User;
import com.example.demo.models.AddDishToList;
import com.example.demo.repositories.DishRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddDishToListServiceImpl implements AddDishToListService {
   @Autowired
    UserRepository userRepository;
   @Autowired
    DishRepository dishRepository;

   @Override
   public List<Dish>addToDishes(AddDishToList addDishToList){
       User user = userRepository.getOne(addDishToList.getUserId());
       Dish dish = dishRepository.getOne(addDishToList.getDishId());

       List<Dish>userDishList = user.getDishes();
       userDishList.add(dish);

       user.setDishes(userDishList);
       userRepository.save(user);
       return user.getDishes();
   }


}
