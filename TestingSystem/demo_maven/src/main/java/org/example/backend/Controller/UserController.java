package org.example.backend.Controller;


import org.example.backend.Service.IUserSevice;
import org.example.backend.Service.UserSevice;
import org.example.entity.User;

import java.util.List;

public class UserController {
    IUserSevice userSevice = new UserSevice();

    public List<User> DisplayUser() {
        return userSevice.DisplayUser();
    }

    public User findById(int id) {
        return userSevice.findById(id);
    }

    public List<User> findByUsernameOrEmail(String keyword) {
        return userSevice.findByUsernameOrEmail(keyword);
    }


    public boolean deteleUser(int id) {
        return userSevice.deteleUser(id);
    }

    public boolean addUser(User user) {
        return userSevice.createUser(user);
    }

    public boolean changePasswords(String email, String oldPasswords, String newPasswords) {
        return userSevice.changePasswords(email, oldPasswords, newPasswords);
    }

}
