package com.example.springmvc;

public class Product {

    public int getCost() {
        return cost;
    }

    private Long id = 1L;
    private String title;
    private int cost;

    public Product(String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }
}
