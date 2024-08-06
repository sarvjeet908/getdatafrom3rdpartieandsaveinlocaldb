package com.example.Scenarioone.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@Entity
public class Product {
   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int price;
    private String description;
    private  String category;
    private String image;*/
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(nullable = false, length = 2000) // Adjust the length to fit longer descriptions
    private String description;

    private Double price;

    @Column(nullable = false, length = 255)
    private String category;

    @Column(nullable = false, length = 512) // Adjust the length to fit longer image URLs
    private String image;

}
