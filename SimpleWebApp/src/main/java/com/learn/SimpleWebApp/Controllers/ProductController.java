package com.learn.SimpleWebApp.Controllers;

import com.learn.SimpleWebApp.Model.Product;
import com.learn.SimpleWebApp.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService ps;

    @GetMapping("/products")
    public List<Product> getProducts()
    {
        System.out.println("Looking from Controller..!");
        return ps.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id)
    {
        return ps.getById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod)
    {
        System.out.println(prod.toString());
        ps.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod)
    {
        ps.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId)
    {
        ps.deleteProduct(prodId);
    }
}
