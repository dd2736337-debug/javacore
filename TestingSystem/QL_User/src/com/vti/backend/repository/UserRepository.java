package com.vti.backend.Repository;

import com.vti.entity.Department;
import com.vti.entity.User;
import com.vti.ultil.JdbcUtils;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {



    public List<User> DisplayUser() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "select a.*,b.departmentname\n" +
                "from account a\n" +
                "join department b on a.departmentid=b.departmentid";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<User> data = new ArrayList<>();
        User user = null;
        while (resultSet.next()) {
            user = new User();
            user.setId(resultSet.getInt("accountid"));
            user.setUserName(resultSet.getString("username"));
            user.setEmail(resultSet.getString("email"));

            Department department = new Department();
            department.setDepartmentID(resultSet.getInt("departmentid"));
            department.setDepartmentName(resultSet.getString("departmentname"));
            user.setDepartment(department);
            data.add(user);
        }
        connection.close();
        return data;
    }

    public User findById(int id) throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "SELECT a.*, b.departmentname " +
                "FROM account a " +
                "JOIN department b ON a.departmentid = b.departmentid " +
                "WHERE a.accountid = ?";
        PreparedStatement preparedStatement =connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        User user = null;
        if (resultSet.next()) {
            user=new User();
            user.setId(resultSet.getInt("accountid"));
            user.setUserName(resultSet.getString("username"));
            user.setEmail(resultSet.getString("email"));
            Department department = new Department();
            department.setDepartmentID(resultSet.getInt("departmentid"));
            department.setDepartmentName(resultSet.getString("DepartmentName"));
            user.setDepartment(department);

            return user;
        }
        connection.close();
        return user;
    }

    public List<User> findByUsernameOrEmail(String keyword) throws SQLException {
        keyword="%"+keyword+"%";
        Connection connection = JdbcUtils.getConnection();
        String sql = "select a.*,b.departmentname\n" +
                "from account a\n" +
                "join department b on a.departmentid=b.departmentid\n" +
                "where  a.username like ? or a.email like ?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1, keyword);
        preparedStatement.setString(2, keyword);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<User> userList = new ArrayList<>();
        while (resultSet.next()) {
            User user=new User();
            user.setId(resultSet.getInt("accountid"));
            user.setUserName(resultSet.getString("username"));
            user.setEmail(resultSet.getString("email"));
            Department department = new Department();
            department.setDepartmentID(resultSet.getInt("departmentid"));
            department.setDepartmentName(resultSet.getString("DepartmentName"));
            user.setDepartment(department);
            userList.add(user);
        }
        connection.close();
        return userList;
    }

    public boolean deteleUser(int id) throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        //kiem tra xem account do ton tai ko'

        //truoc khi xoa account theo id, thi phai chuyen nhung doi tuong co co khoa ngoai lien quan den account do ra acc noname(id=11)
        String sql = "delete from account where accountid = ?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int  resultSet = preparedStatement.executeUpdate();
        connection.close();
        return resultSet>0;//nếu lớn 0 thì xóa thành công
    }

}


