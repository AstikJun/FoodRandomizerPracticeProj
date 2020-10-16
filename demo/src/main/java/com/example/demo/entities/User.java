package com.example.demo.entities;//package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user1")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "dish_id")
//    private List<Dish>dishes;
//    //private Dish dish;
    @OneToMany
    private List<Dish> dishes;

    @Override
    public String toString() {
        return "User: id: "+id+" dishList: "+dishes+" name: "+name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Dish getDishList() {
//        return dish;
//    }

//    public void setDishList(Dish dishList) {
//        this.dish = dishList;
//    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
