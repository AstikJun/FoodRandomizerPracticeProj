package com.example.demo.models;

import com.example.demo.enums.Category;

public class GenerateByCategory {
private Integer userId;
private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
