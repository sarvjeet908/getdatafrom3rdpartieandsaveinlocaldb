package com.example.Scenarioone.service;

import com.example.Scenarioone.model.Product;
import org.springframework.stereotype.Service;

@Service
public interface IproductService {
    public Product[] getAllProducts();
}
