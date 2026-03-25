package com.vti.backend.Repository;

import com.vti.entity.Department;
import com.vti.entity.User;
import com.vti.ultil.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository implements IDepartmentRepository  {
    public List<Department> DisplayDepartment() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "select *\n" +
                "from department";
        Statement saStatement = connection.createStatement();
        ResultSet resultSet = saStatement.executeQuery(sql);
        List<Department> departmentList = new ArrayList<>();
        while (resultSet.next()) {
            Department department = new Department();
            department.setDepartmentID(resultSet.getInt("departmentid"));
            department.setDepartmentName(resultSet.getString("DepartmentName"));
            departmentList.add(department);
        }
        connection.close();
        return departmentList;
    }

    public Department departmentfindById(int id) throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "select *\n" +
                "from department\n"+
                "where departmentid =?";
        PreparedStatement  preparedStatement =connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Department department = null;
        while (resultSet.next()) {
            department = new Department();
            department.setDepartmentID(resultSet.getInt("departmentid"));
            department.setDepartmentName(resultSet.getString("departmentname"));
            return department;
        }
        connection.close();
        return department;
    }

    public List<Department> departmnetFindByName(String name) throws SQLException {
        List<Department> departmentList = new ArrayList<>();
        Connection connection = JdbcUtils.getConnection();
        String sql = "select *\n" +
                "from department\n"+
                "where departmentname like ?";
        PreparedStatement preparedStatement =connection.prepareStatement(sql);
        preparedStatement.setString(1,"%"+name+"%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Department department = new Department();
            department.setDepartmentID(resultSet.getInt("departmentid"));
            department.setDepartmentName(resultSet.getString("departmentName"));
            departmentList.add(department);
        }
        connection.close();
        return departmentList;
    }
}
