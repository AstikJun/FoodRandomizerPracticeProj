package com.example.demo.entities;

import com.example.demo.enums.Category;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;

@Entity
@Table(name = "dish_table")
@AllArgsConstructor
@NoArgsConstructor
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @Column(name = "dish_id")
    private int id;

    @Column(name = "dish_title")
    private String title;

    @Column(name = "dish_category")
    private Category category;

    @Column(name = "dish_recipe")
    private String recipe;

//    @Column(name= "price")
//    private double price;

//    public double getPrice() {
//        return price;
//    }

//    public void setPrice(double price) {
//        this.price = price;
//    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + category +
                ", recipe='" + recipe + '\'' +
//                ", price='" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Enum getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
