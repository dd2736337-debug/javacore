package com.vti.backend.controller;

import com.vti.backend.service.IUserSevice;
import com.vti.backend.service.UserSevice;
import com.vti.entity.User;

import java.util.List;

public class UserController {
    IUserSevice userSevice=new UserSevice();
    public List<User> getUserByProjectId(int projectId){
        return userSevice.getUserByProjectId(projectId);
    }
}
