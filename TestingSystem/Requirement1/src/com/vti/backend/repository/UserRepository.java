package com.vti.backend.repository;


import com.vti.Util.JdbcUtil;
import com.vti.entity.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserRepository implements IUserRepository{
    @Override
    public List<User> getUserByProjectId(int projectId) {
        List<User> listUser=new ArrayList<>();
        // tim ra ds cac idemployees trong project do
        // dua ds tren vao cau id in ()
        String sql="Select  a.*, b.expInYear, c.projectId, c.proSkill\n" +
                "From user a\n" +
                "Left Join Manager b on a.id=b.user_id\n" +
                "LEFT JOIN employee c on a.id=c.user_id\n"+
                " WHERE a.id = (SELECT managerId FROM Project WHERE projectId = ?)\n" +
                "OR c.projectId = ?";
        try {
            Connection connection=JdbcUtil.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,projectId);
            preparedStatement.setInt(2,projectId);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String role=resultSet.getString("role");
                if("Manager".equalsIgnoreCase(role)){
                    Manager manager=new Manager();
                    manager.setId(resultSet.getInt("id"));
                    manager.setFullName(resultSet.getString("fullname"));
                    manager.setEmail(resultSet.getString("Email"));
                    manager.setPassword(resultSet.getString("Password"));
                    manager.setExpInYear(resultSet.getInt("expInYear"));
                    manager.setRole(Role.valueOf(resultSet.getString("role")));
                    listUser.add(manager);
                }else if("Employee".equalsIgnoreCase(role)){
                    Employee employee=new Employee();
                    employee.setId(resultSet.getInt("id"));
                    employee.setFullName(resultSet.getString("fullname"));
                    employee.setEmail(resultSet.getString("email"));
                    employee.setPassword(resultSet.getString("password"));
                    employee.setRole(Role.valueOf(resultSet.getString("role")));
                    Project project =new Project();
                    project.setId(resultSet.getInt("projectId"));
                    employee.setProject(project);
                    employee.setProSkill(resultSet.getString("ProSkill"));
                    listUser.add(employee);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi!không tìm thấy projectID!");
        }
        return listUser;
    }
}
