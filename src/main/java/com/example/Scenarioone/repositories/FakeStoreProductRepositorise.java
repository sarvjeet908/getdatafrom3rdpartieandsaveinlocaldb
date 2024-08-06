package com.example.Scenarioone.repositories;

import com.example.Scenarioone.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FakeStoreProductRepositorise extends JpaRepository<Product,Long> {
}
