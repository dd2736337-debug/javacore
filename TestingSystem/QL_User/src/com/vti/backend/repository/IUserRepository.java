package com.vti.backend.Repository;

import com.vti.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    List<User> DisplayUser() throws SQLException;

    User findById(int id) throws SQLException;

    List<User> findByUsernameOrEmail(String keyword) throws SQLException;

    boolean deteleUser(int id) throws SQLException;

    boolean createUser(User user) throws SQLException;

    boolean changePasswords(String email, String oldPasswords, String newPasswords) throws SQLException;


}
