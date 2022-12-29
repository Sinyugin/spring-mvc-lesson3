package com.example.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/getAllProduct")
    public String getAllProduct(Model model) {
        List<Product> products = productRepository.getAll();
        model.addAttribute("products", products);
        System.out.println(products.toString());
        return "getAllProducts";
    }

    @GetMapping("/add_product")
    public String add_product(){
        return "add_product_form";
    }

}
