package org.example.backend.repository;

import com.mysql.cj.jdbc.JdbcConnection;
import org.example.entity.Manufacturer;
import org.example.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManufacturerRepository implements IManufacturerRepository {

    @Override
    public Manufacturer getById(int id) throws SQLException {// 1
        String sql = "SELECT * FROM Manufacturer WHERE id = ?";
        Connection connection = JdbcUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            return new Manufacturer(resultSet.getInt("id"),
                    resultSet.getString("manufacturer_name"));
        }
        return null;

    }
}