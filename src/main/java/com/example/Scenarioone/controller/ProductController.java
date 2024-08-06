package com.example.Scenarioone.controller;

import com.example.Scenarioone.model.Product;
import com.example.Scenarioone.service.FakeStoreProductservice;
import com.example.Scenarioone.service.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {



    IproductService productService;

    @Autowired
    public ProductController(@Qualifier("fakeStoreProductservice") IproductService productService){
        this.productService=productService;
    }
    @GetMapping("/products")
    public Product[] getAllProductAndSaveInDataBase(){
        Product[] products=productService.getAllProducts();
        return  products;
    }
}
