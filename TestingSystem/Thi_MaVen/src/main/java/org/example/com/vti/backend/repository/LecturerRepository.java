package org.example.com.vti.backend.repository;

import org.example.com.vti.entity.Lecturer;
import org.example.com.vti.scannerutil.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LecturerRepository implements ILecturer {

    @Override
    public Lecturer findById(int lecturerId) throws SQLException {
        String sql = "SELECT * FROM Lecturer WHERE lecturer_id = ?";
        Connection connection=JdbcUtils.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,lecturerId);
        ResultSet resultSet=preparedStatement.executeQuery();
        if(resultSet.next()){
            Lecturer lecturer=new Lecturer();
            lecturer.setId(resultSet.getInt("lecturer_id"));
            lecturer.setFullName(resultSet.getString("full_name"));
            lecturer.setEmail(resultSet.getString("email"));
            lecturer.setDepartment(resultSet.getString("department"));
            return lecturer;
        }
        return null;
    }

    @Override
    public boolean existsById(int lecturerId) throws SQLException {
        String sql = "SELECT * FROM Lecturer WHERE lecturer_id = ?";
        Connection connection=JdbcUtils.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,lecturerId);
        ResultSet resultSet= preparedStatement.executeQuery();
        return resultSet.next();
    }
}
