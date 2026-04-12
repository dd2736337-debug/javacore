package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String productName;
    private double price;
    private  String description;
    private double rate;
    private Category category;
    private Manufacturer manufacturer;
}
