package com.example.Scenarioone.service;

import com.example.Scenarioone.model.Product;
import com.example.Scenarioone.repositories.FakeStoreProductRepositorise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductservice implements IproductService{
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    FakeStoreProductRepositorise fakeStoreProductRepositorise;
    @Override
    public Product[] getAllProducts() {
        Product[] reponse =
                restTemplate.getForObject("https://fakestoreapi.com/products", Product[].class);
        if(reponse!=null){
       for(Product product: reponse ){
           fakeStoreProductRepositorise.save(product);
       }
        }
        return reponse;
    }
}
