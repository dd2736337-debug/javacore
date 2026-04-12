package org.example.backend.controller;

import org.example.backend.service.IProductService;
import org.example.backend.service.ProductService;
import org.example.entity.Product;

import java.util.List;

public class ProductController {
    IProductService productService=new ProductService();

    public List<Product> getAll(){
        return  productService.getAll();
    }

    public boolean deleteById(int id){
        return productService.deleteById(id);
    }

    public boolean addProduct(Product product){
        return productService.addProduct(product);
    }
}