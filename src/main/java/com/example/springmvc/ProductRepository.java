package com.example.springmvc;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> products;
    public List<Product> getAll() {
        List<Product> products = List.of(
                new Product("Хлеб", 40),
                new Product("Молоко", 70),
                new Product("Яйца", 65),
                new Product("Яблоки", 100),
                new Product("Картофель", 25)
        );
        return products;
    }
}
