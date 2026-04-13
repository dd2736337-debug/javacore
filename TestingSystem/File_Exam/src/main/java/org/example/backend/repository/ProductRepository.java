package org.example.backend.repository;

import org.example.entity.Category;
import org.example.entity.Manufacturer;
import org.example.entity.Product;
import org.example.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{

    @Override
    public List<Product> getAll() throws SQLException {// cau 2
        List<Product> list=new ArrayList<>();
        String sql="Select a.*,b.manufacturer_name\n" +
                "from Product a\n" +
                "Join Manufacturer b on a.manufacturer_id = b.id";
        Connection connection= JdbcUtils.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            Product product=new Product();
            product.setId(resultSet.getInt("id"));
            product.setProductName(resultSet.getString("product_name"));
            product.setPrice(resultSet.getDouble("price"));
            product.setDescription(resultSet.getString("description"));
            product.setRate(resultSet.getDouble("rate"));
            Manufacturer manufacturer=new Manufacturer();
            manufacturer.setManufacturerName(resultSet.getString("manufacturer_name"));
            product.setManufacturer(manufacturer);
            list.add(product);
        }
        return list;
    }

    @Override
    public boolean existsById(int id) throws SQLException {
        String sql="select *from product\n" +
                "where id=?";
        Connection connection=JdbcUtils.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        ResultSet resultSet=preparedStatement.executeQuery();
        return resultSet.next();
    }

    @Override
    public boolean deleteById(int id) throws SQLException {
        if (!existsById(id)){
            return  false;
        }
        String sql="DELETE FROM product WHERE id = ?";
        Connection connection =JdbcUtils.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean existsByName(String name) throws SQLException {
        String sql="SELECT * FROM product WHERE  product_name = ?";
        Connection connection=JdbcUtils.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,name);
        ResultSet resultSet=preparedStatement.executeQuery();
        return resultSet.next();
    }

    @Override
    public boolean addProduct(Product product) throws SQLException {
        String sql="Insert into product( product_name, price, description, rate, category_id, manufacturer_id)\n" +
                "values(?,?,?,?,?,?)";
        Connection connection=JdbcUtils.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,product.getProductName());
        preparedStatement.setDouble(2,product.getPrice());
        preparedStatement.setString(3,product.getDescription());
        preparedStatement.setDouble(4,product.getRate());
        preparedStatement.setInt(5,product.getCategory().getId());
        preparedStatement.setInt(6,product.getManufacturer().getId());
        return preparedStatement.executeUpdate()>0;
    }

    public void demo() {
    
    }
}
