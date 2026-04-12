package org.example.backend.service;

import org.example.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll() ;

    boolean deleteById(int id);

    boolean addProduct(Product product);

}
