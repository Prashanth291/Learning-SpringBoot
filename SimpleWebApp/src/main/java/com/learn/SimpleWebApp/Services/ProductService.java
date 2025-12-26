package com.learn.SimpleWebApp.Services;

import com.learn.SimpleWebApp.Model.Product;
import com.learn.SimpleWebApp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(1,"iphone",100000),
//            new Product(2,"Realme",50000),
//            new Product(3,"oppo",10000))
//    );

    public List<Product> getProducts(){
        return repo.findAll() ;
    }


    public Product getById(int id)
    {
        return repo.findById(id).orElse(new Product());
    }

    public void addProduct(Product prod)
    {
//        products.add(prod);
        repo.save(prod);
        System.out.println("Product Added Successfully..!");

    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
