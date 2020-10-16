package com.example.demo.repositories;

import com.example.demo.entities.Dish;
import com.example.demo.entities.User;

import com.example.demo.enums.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
