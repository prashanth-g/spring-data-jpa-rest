package com.prashanth.spring.jpa.gs.model;

public class PriceCategoryDto {

    private int price;

    private String categoryName;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
