package com.vti.backend.Service;

import com.vti.entity.User;

import java.util.List;

public interface IUserSevice {
    List<User> DisplayUser();

    User findById(int id);

    List<User> findByUsernameOrEmail(String keyword);

    boolean deteleUser(int id);

    boolean createUser(User user);

    public boolean changePasswords(String email, String oldPasswords, String newPasswords);

}
