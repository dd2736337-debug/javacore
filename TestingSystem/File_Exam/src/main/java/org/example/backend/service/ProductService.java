package org.example.backend.service;

import org.example.backend.repository.IProductRepository;
import org.example.backend.repository.ProductRepository;
import org.example.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    IProductRepository productRepository=new ProductRepository();

    @Override
    public List<Product> getAll() {
       try {
           return productRepository.getAll();
       } catch (Exception e) {
           e.printStackTrace();
           System.out.println("Lỗi lấy danh sách!");
           return new ArrayList<>();
       }
    }

    public boolean deleteById(int id){
        try {
            if (!productRepository.existsById(id)){
                System.out.println("Id không tồn tại");
                return false;
            }
            boolean result= productRepository.deleteById(id);
            if (result){
                System.out.println("Xóa thành công");
            }else {
                System.out.println("Xóa thất bại");
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi!");
            return false;
        }

    }

    @Override
    public boolean addProduct(Product product) {
        try {
            //Check trùng
            if (productRepository.existsByName(product.getProductName())){
                System.out.println("Tên sản phẩm đã tồn tại!");
            }

            //Check object
            if(product.getCategory()==null||product.getManufacturer()==null){
                System.out.println("Không được null");
                return false;
            }
            boolean result=productRepository.addProduct(product);

            return result;
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Lỗi Database: "+e.getMessage());
            return false;
        }
    }
}
