package org.example.backend.repository;

import org.example.entity.Product;
import org.example.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface IProductRepository {
    List<Product> getAll() throws SQLException;

    boolean existsById(int id) throws SQLException;

    boolean deleteById(int id) throws SQLException;

    boolean existsByName(String name) throws SQLException;

    boolean  addProduct (Product product) throws SQLException;

}
